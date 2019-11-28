package edu.ustc.Controller;

import edu.ustc.domain.Account;
import edu.ustc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author USTC_WZH
 * @create 2019-11-22 15:14
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    /**
     * 请求数据绑定入门
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username,String password){

        System.out.println("执行了...");
        System.out.println("用户名："+ username + ",密码："+ password);
        return "success";
    }

    /**
     * 请求数据绑定把数据封装到JavaBean的类中
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){

        System.out.println("执行了...");
        System.out.println(account);

        return "success";
    }

    /**
     * 请求数据绑定把数据封装到JavaBean的类中
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(User user){

        System.out.println("执行了...");
        System.out.println(user);

        return "success";
    }

    /**
     * 测试原生的Servlet的API
     * @return
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){

        System.out.println("执行了...");

        System.out.println(request);

        HttpSession session = request.getSession();
        System.out.println(session);

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        System.out.println(response);

        return "success";
    }
}
