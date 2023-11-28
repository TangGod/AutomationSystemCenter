package tanggod.github.io.webdriver.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by TangGod on 2018/10/16.
 */
public interface ThreadCache {

    List<Thread> threadList = new ArrayList<>();

    static void addThread(Thread thread) {
        threadList.add(thread);
    }

    static void task() {
        List<Thread> filterThreadList = filterThread(threadList);

        filterThreadList.stream().forEach(thread -> {
            System.out.println("任务线程 ： " + thread.getName() + " - - - > 正在启动 . . .");
            thread.start();
            System.out.println("任务线程 ： " + thread.getName() + " - - - > 启动完毕 . . .");
        });
    }

    static List<Thread> filterThread(List<Thread> threads) {
        return threads.stream().filter(thread -> {
            //filter logic
            if (thread.isAlive())
                return false;
            return true;
        }).collect(Collectors.toList());
    }


}
