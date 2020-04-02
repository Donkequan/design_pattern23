package com.pattern.responsibilitychain;

public abstract class Approver {

    private Approver approver;  //下一个处理者
    private String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public Approver getApprover() {
        return approver;
    }

    public String getName() {
        return name;
    }

    abstract void process(PurchaseRequest purchaseRequest);

}
