package com.gysoft.chain;

public class TokenFilter  implements  Filter {
    public void doFilter(String request, String response, FilterChain filterChain) {
        System.out.println("拿到token过滤");
        filterChain.doFilter(request,response);
        System.out.println("toke请求响应");
    }
}
