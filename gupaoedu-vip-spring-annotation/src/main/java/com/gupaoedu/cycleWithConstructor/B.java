package com.gupaoedu.cycleWithConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    @Autowired
    A a;

    B(A a)
    {
        System.out.println("B实例化了");
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        System.out.println("B ==inject==> A");
        this.a = a;
    }
}
