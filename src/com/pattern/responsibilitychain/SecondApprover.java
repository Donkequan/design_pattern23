package com.pattern.responsibilitychain;

public class SecondApprover extends Approver {

    public SecondApprover(String name) {
        super(name);
    }

    @Override
    void process(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice()>5000 && purchaseRequest.getPrice()<=10000){
            System.out.println(this.getName());
        }else{
            getApprover().process(purchaseRequest);
        }
    }
}
