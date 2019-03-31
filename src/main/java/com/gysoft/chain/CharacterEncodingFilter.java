package com.gysoft.chain;

public class CharacterEncodingFilter implements  Filter {
    public void doFilter(String request, String response, FilterChain filterChain) {
        System.out.println("拿到编码过滤请求");
        filterChain.doFilter(request,response);
        System.out.println("请求响应");;

    }
}
