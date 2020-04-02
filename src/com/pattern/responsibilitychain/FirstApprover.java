package com.pattern.responsibilitychain;

//小于5000
public class FirstApprover extends Approver {

    public FirstApprover(String name) {
        super(name);
    }

    @Override
    void process(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice()<=5000){
            System.out.println(this.getName());
        }else{
            getApprover().process(purchaseRequest);
        }
    }

}
