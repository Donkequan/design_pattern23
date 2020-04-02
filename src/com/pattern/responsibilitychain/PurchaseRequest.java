package com.pattern.responsibilitychain;

public class PurchaseRequest {

    private int type = 0;
    private int price = 0;

    public PurchaseRequest(int type, int price) {
        this.type = type;
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
