package com.gysoft.listen;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ListenDemo  extends HttpServlet
{

  /*  Servlet是一个java程序，必须实现java指定的servlet规范，由服务器在特定情况下管理对象的创建以及销毁和方法的调用
 * 		每个Servlet都是一个小程序，tomcat服务器是servlet容器中的一个，一个项目中可以使用多个Servlet，一个服务器可以管理多个Servlet
 * Servlet的创建步骤：
        * 	1、创建一个java类实现Servlet接口
 * 	2、实现Servlet接口的方法，并在service方法中处理请求
 * 	3、在web.xml中配置servlet[重要]
        * 		- 访问servlet的虚拟路径
 * 		- 告诉服务器Servlet的全类名
 *
         *	由于Servlet是java程序，不能再浏览器中运行，服务器又希望通过servlet动态处理请求
 *	当用户提交请求访问Servlet时，服务器可以负责servlet代码的执行，servlet执行后，服务器可以将执行结果解析为响应报文再交给浏览器
 *		- 浏览器向服务器发起的请求有可能直接访问的是静态页面，如果浏览器的请求需要服务器动态处理，请求应该交给服务器中的Servlet
 *		- servlet可以在web.xml中映射一个虚拟的访问路径*/
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
