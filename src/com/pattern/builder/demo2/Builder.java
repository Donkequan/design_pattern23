package com.pattern.builder.demo2;

public abstract class Builder {

    abstract Builder buildA(String a);
    abstract Builder buildB(String a);
    abstract Builder buildC(String b);
    abstract Product build();
}
