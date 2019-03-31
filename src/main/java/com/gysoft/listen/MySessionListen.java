package com.gysoft.listen;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListen  implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

        System.out.println("session创建了"+httpSessionEvent.getSession().getId());
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("session销毁了"+httpSessionEvent.getSession().getId());
    }
    }

