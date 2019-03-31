package com.gysoft.listen;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
    int  count =0;
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        count++;
        servletContextEvent.getServletContext().setAttribute("count",count);
        System.out.println(count);
        System.out.println("session创建"+servletContextEvent.getServletContext().getServerInfo());

    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        count--;
        System.out.println(count);
        servletContextEvent.getServletContext().setAttribute("count",count);
        System.out.println("session创建"+servletContextEvent.getServletContext().getServerInfo());

    }
}
