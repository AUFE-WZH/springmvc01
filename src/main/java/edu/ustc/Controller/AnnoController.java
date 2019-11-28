package edu.ustc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

/**
 * 学习常用注解
 * @author USTC_WZH
 * @create 2019-11-22 16:36
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"})     //SessionAttributes注解,将msg=美美存入到session域中
public class AnnoController {

    /**
     * RequestParam 页面的请求参数与接收参数不同
     * @param username
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){

        System.out.println("执行了...");
        System.out.println(username);

        return "success";
    }


    /**
     * RequestBody 获取到请求体的内容
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){

        System.out.println("执行了...");
        System.out.println(body);

        return "success";
    }

    /**
     *PathVariable  绑定url中的占位符，使用restful的风格的URL(同样的URL但是不同的请求方式和占位符)
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id){

        System.out.println("执行了...");
        System.out.println(id);

        return "success";
    }

    /**
     * RequestHeader 获取请求头信息
     * @param header
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header){

        System.out.println("执行了...");
        System.out.println(header);

        return "success";
    }


    /**
     * CookieValue 获取到Cookie的值
     * @param cookieValue
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue){

        System.out.println("执行了...");
        System.out.println(cookieValue);

        return "success";
    }

//    /**
//     * ModelAttribute 测试有返回值的方法
//     * @param user
//     * @return
//     */
//    @RequestMapping("/testModelAttribute1")
//    public String testModelAttribute1(User user){
//
//        System.out.println("testModelAttribute1执行了...");
//        System.out.println(user);
//
//        return "success";
//    }
//
//    /**
//     * ModelAttribute 该方法会先于其他方法执行，目的是可以获取数据后先一步查询后操作数据库等
//     * @param uname
//     * @return
//     */
//    @ModelAttribute
//    public User showUser1(String username){
//
//        System.out.println("showUser1执行了...");
//
//        //先获得提交的数据进行处理然后传给请求的控制器再进行处理
//        User user = new User();
//        user.setUname(uname);
//        user.setAge(20);
//        user.setDate(new Date());
//        return user;
//    }

//    /**
//     * ModelAttribute 测试无返回值的方法
//     * @param user
//     * @return
//     */
//    @RequestMapping("/testModelAttribute2")
//    public String testModelAttribute2(@ModelAttribute(value = "abc") User user){
//
//        System.out.println("testModelAttribute2执行了...");
//        System.out.println(user);
//
//        return "success";
//    }
//
//    /**
//     * ModelAttribute 该方法会先于其他方法执行，目的是可以获取数据后先一步查询后操作数据库等
//     * @param username
//     * @param map
//     */
//    @ModelAttribute
//    public void showUser2(String username, Map<String,User> map){
//
//        System.out.println("showUser2执行了...");
//
//        //先获得提交的数据进行处理然后传给请求的控制器再进行处理
//        User user = new User();
//        user.setUname(username);
//        user.setAge(20);
//        user.setDate(new Date());
//
//        map.put("abc",user);
//    }

    /**
     * SessionAttributes注解
     * @param model
     * @return
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){

        System.out.println("testSessionAttributes...");

        //底层会存储到request域对象中
        model.addAttribute("msg","美美");

        return "success";
    }


    /**
     * getSessionAttributes 获取Session域
     * @param modelMap
     * @return
     */
    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap){

        System.out.println("getSessionAttributes...");

        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }

    /**
     * delSessionAttributes 删除session域中值
     * @param status
     * @return
     */
    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){

        System.out.println("delSessionAttributes...");

        status.setComplete();
        return "success";
    }


}
