package com.gysoft.chain;

public class PermissionFilter  implements   Filter {
    public void doFilter(String request, String response, FilterChain filterChain) {
        System.out.println("拿到许可过滤请求");
        filterChain.doFilter(request,response);
        System.out.println("许可过滤请求响应");
    }
}
