package com.gysoft.chain;

public class SaveServlet implements  Servlet {
    public void serrvice(String req, String response) {

        //等到前面的过滤循环执行完了，在执行这个保存操作，可以理解为web开发中的业务。
        System.out.println("执行了保存请求操作");
    }
}
