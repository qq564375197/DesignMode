package org.Pattern.mediator;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/2/19
 * @description 抽象同事类
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

}
