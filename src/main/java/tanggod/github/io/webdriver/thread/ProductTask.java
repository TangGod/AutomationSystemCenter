package tanggod.github.io.webdriver.thread;

import cn.xchats.onlinetraffic.jooq.frame.JooqBaseService;
import org.springframework.stereotype.Component;
import tanggod.github.io.config.database.repository.wish.tables.CategoryData;
import tanggod.github.io.config.database.repository.wish.tables.Productinfo;
import tanggod.github.io.webdriver.dto.CategoryDataDto;
import tanggod.github.io.webdriver.dto.ProductinfoDto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by TangGod on 2018/10/31.
 */
@Component
public class ProductTask extends JooqBaseService {

    public static final String imageListPath = "/Users/tanggod/file/";

    public static final BlockingQueue<CategoryDataDto> productQueue = new ArrayBlockingQueue<>(10000);
    public static final BlockingQueue<ProductinfoDto> productInfoQueue = new ArrayBlockingQueue<>(30000);
    public static final BlockingQueue<String> flowQueue = new ArrayBlockingQueue<>(1000);


    public ProductTask() {
        ThreadCache.addThread(productTaskThread);
        ThreadCache.addThread(productInfoTaskThread);
        ThreadCache.addThread(flowTaskThread);
    }

    private CyclicThread productTaskThread = new CyclicThread() {
        @Override
        public void work() throws InterruptedException {
            try {
                CategoryDataDto categoryDataDto = productQueue.take();

                //校验数据库中是否已有这条数据
                List<CategoryDataDto> categoryDataDtoList = jooqStorage.listByCondition(CategoryData.CATEGORY_DATA, CategoryDataDto.class, CategoryData.CATEGORY_DATA.PRODUCTID.eq(categoryDataDto.getProductid()));
                if (categoryDataDtoList.size() == 0) {
                    //添加进数据库
                    jooqStorage.create(CategoryData.CATEGORY_DATA, CategoryDataDto.class, categoryDataDto);
                }

                System.out.println("create productTask . . . .");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    };

    private CyclicThread productInfoTaskThread = new CyclicThread() {
        @Override
        public void work() throws InterruptedException {
            try {
                ProductinfoDto productinfoDto = productInfoQueue.take();

                jooqStorage.create(Productinfo.PRODUCTINFO, ProductinfoDto.class, productinfoDto);

                System.out.println("create productInfoTaskThread . . . .");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    };

    private Set<String> productIdList = new HashSet<>(150);

    private CyclicThread flowTaskThread = new CyclicThread() {
        @Override
        public void work() throws InterruptedException {
            try {
                synchronized (ProductTask.class) {
                    String productId = flowQueue.take();
                    productIdList.add(productId);

                    //size > 100 批量修改
                    if (productIdList.size() > 100) {
                        long startTime = System.currentTimeMillis();
                        System.out.println("create flow wait size > 100 任务已启动 . . .");
                        List<CategoryDataDto> categoryDataDtoList = jooqStorage.dslSelect(dsl -> dsl.select()
                                        .from(CategoryData.CATEGORY_DATA)
                                        .where(CategoryData.CATEGORY_DATA.PRODUCTID.in(productIdList))
                                , CategoryDataDto.class);

                        // clear
                        productIdList.clear();

                        //update
                        for (int i = 0; i < categoryDataDtoList.size(); i++) {
                            CategoryDataDto categoryDataDto = categoryDataDtoList.get(i);
                            if (categoryDataDto.getFlow() == null) {
                                categoryDataDto.setFlow(0L);
                            }

                            categoryDataDto.setFlow(categoryDataDto.getFlow() + 1L);
                        }

                        //ok
                        jooqStorage.batchModify(CategoryData.CATEGORY_DATA, categoryDataDtoList);

                        System.out.println("create flow wait size > 100 任务已结束 . . . for system time :" + (System.currentTimeMillis() - startTime) / 1000 + "/s");

                    } else {
                        if (productIdList.size() % 10 == 0)
                            System.out.println("create flow wait :" + productIdList.size());
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    };

}
