package com.gupaoedu.cycleWithAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class A {
    @Autowired
    B b;
    A()
    {
        System.out.println("A实例化了");
    }

    public B getB() {
        return b;
    }

    @Log
    public void setB(B b) {
        System.out.println("A ==inject==> B");
        this.b = b;
    }

//    @Transactional
    @Log
    public void print1()
    {
        System.out.println("print1 in A");
    }
}
