package com.gysoft.chain;

public class Client {


    public static void main(String[] args) {
        Filter encodingFilter = new CharacterEncodingFilter();
        Filter permissionFilter = new PermissionFilter();
        Filter tokenFilter = new TokenFilter();

        FilterChain chain = new FilterChain();
        chain.filters.add(encodingFilter);
        chain.filters.add(permissionFilter);
        chain.filters.add(tokenFilter);
        chain.setServlet(new SaveServlet());
        chain.doFilter("", "");
    }
}
