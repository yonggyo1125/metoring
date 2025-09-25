package org.sparta.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyCalculator implements InvocationHandler {

    private Object instance;

    public ProxyCalculator(Object instance) {
        this.instance = instance;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long stime = System.nanoTime(); // 공통 기능
        try {

            Object result = method.invoke(instance, args); // 핵심 기능을 대신 수행

            return result;
        } finally { // 공통 기능
            long etime = System.nanoTime();
            System.out.printf("걸린시간: %d%n", etime - stime);
        }
    }
}
