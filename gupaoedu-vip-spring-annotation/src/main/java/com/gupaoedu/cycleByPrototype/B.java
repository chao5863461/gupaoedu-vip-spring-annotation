package com.gupaoedu.cycleByPrototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class B {
    @Autowired
    A a;

    B()
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
