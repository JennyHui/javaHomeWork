package jdkproxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class<?> proxyClass= Proxy.getProxyClass(ProxyTest.class.getClassLoader(), Hello.class);
        final Constructor<?> cons = proxyClass.getConstructor(InvocationHandler.class);
        final InvocationHandler ih = new MyInvocationHandler(new HelloIml());
        Hello helloWorld= (Hello)cons.newInstance(ih);
        helloWorld.sayHello();
    }
}
