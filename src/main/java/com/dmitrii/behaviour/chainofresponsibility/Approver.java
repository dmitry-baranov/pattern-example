package com.dmitrii.behaviour.chainofresponsibility;

public abstract class Approver {
    protected Approver next;
    protected String name;


    public Approver(String name) {
        this.name = name;
    }

    public abstract String handleRequest(PurchaseRequest request);

    public void setNext(Approver next) {
        this.next = next;
    }
}


