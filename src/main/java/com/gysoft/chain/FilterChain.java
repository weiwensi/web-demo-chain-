package com.gysoft.chain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

       private Servlet servlet;

       //通过递归的方式，循环处理不同的过滤器
    List<Filter> filters = new ArrayList<Filter>();

    public void setServlet(Servlet servlet) {
        this.servlet = servlet;
    }

    int index = 0;

    public void doFilter(String request, String response) {
        if (index < filters.size()) {
            filters.get(index++).doFilter(request, response, this);
        } else {
            servlet.serrvice(request, response);
        }
    }
}
