package edu.ustc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author USTC_WZH
 * @create 2019-11-21 23:15
 */
//控制器类
@Controller
@RequestMapping("/user")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello() {

        System.out.println("hello SpringMvc");
        return "success";
    }
}
