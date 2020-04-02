package com.pattern.responsibilitychain;

public class ThirdApprover extends Approver {

    public ThirdApprover(String name) {
        super(name);
    }

    @Override
    void process(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice()>10000){
            System.out.println(this.getName());
        }
    }
}
