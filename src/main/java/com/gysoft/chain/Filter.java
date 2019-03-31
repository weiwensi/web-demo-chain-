package com.gysoft.chain;


public interface Filter {


  void  doFilter(String request, String response, FilterChain filterChain);

}
