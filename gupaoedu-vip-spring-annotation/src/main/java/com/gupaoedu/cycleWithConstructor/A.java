package com.gupaoedu.cycleWithConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    @Autowired
    B b;
    A(B b)
    {
        System.out.println("A实例化了");
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        System.out.println("A ==inject==> B");
        this.b = b;
    }
}
