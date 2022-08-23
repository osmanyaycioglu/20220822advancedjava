package org.training.java.advanced.generics;

public class GenericCharHolder<A extends CharSequence> {

    private A value;

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }
}
