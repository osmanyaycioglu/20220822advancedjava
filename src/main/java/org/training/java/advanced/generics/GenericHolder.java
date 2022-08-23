package org.training.java.advanced.generics;

public class GenericHolder<A> {

    private A value;

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }
}
