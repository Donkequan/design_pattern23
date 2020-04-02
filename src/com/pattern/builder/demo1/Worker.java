package com.pattern.builder.demo1;

public class Worker extends Builder {

    private Product product;

    public Worker(){
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("1");
    }

    @Override
    void buildB() {
        product.setBuildB("2");
    }

    @Override
    void buildC() {
        product.setBuildC("3");
    }

    @Override
    Product geProduct() {
        return product;
    }
}
