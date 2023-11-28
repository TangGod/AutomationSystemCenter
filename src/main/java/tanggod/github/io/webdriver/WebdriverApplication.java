package tanggod.github.io.webdriver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import tanggod.github.io.webdriver.excel.Joom;
import tanggod.github.io.webdriver.excel.POIUtil;
import tanggod.github.io.webdriver.excel.ResponseResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

//@SpringBootApplication(scanBasePackages = {"cn.xchats","tanggod"})
@SpringBootApplication(scanBasePackages = {"cn.xchats.onlinetraffic", "tanggod"})
@Controller
public class WebdriverApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebdriverApplication.class, args);
    }


  /*  @RequestMapping("/upload/wish->joom")
    @ResponseBody
    public Object excel(@RequestParam(value = "file",required = false) MultipartFile file,HttpServletRequest request, HttpServletResponse response)throws Exception{

        ResponseResult responseResult =new ResponseResult();
        responseResult.setName("1");
        responseResult.setUrl("2");

        List<String[]> strings = POIUtil.readExcel(file);

        Joom joom = new Joom();
        Joom.convertWishExport(strings);
        return responseResult;
    }*/

}
