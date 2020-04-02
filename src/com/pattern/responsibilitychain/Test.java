package com.pattern.responsibilitychain;

public class Test {

    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 60000);

        FirstApprover fisrt = new FirstApprover("first");
        SecondApprover secondApprover = new SecondApprover("second");
        ThirdApprover thirdApprover = new ThirdApprover("third");

        fisrt.setApprover(secondApprover);
        secondApprover.setApprover(thirdApprover);

        fisrt.process(purchaseRequest);

    }
}
