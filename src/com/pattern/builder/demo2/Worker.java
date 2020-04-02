package com.pattern.builder.demo2;

public class Worker extends Builder{

    private Product product;

    public Worker(){
        product = new Product();
    }

    @Override
    Builder buildA(String a) {
        product.setBuildA(a);
        return this;
    }

    @Override
    Product build() {
        return product;
    }

    @Override
    Builder buildB(String b) {
        product.setBuildB(b);
        return this;
    }

    @Override
    Builder buildC(String c) {
        product.setBuildC(c);
        return this;
    }
}
