package com.dmitrii.behaviour.chainofresponsibility;

public class Director extends Approver{
    public Director(String name) {
        super(name);
    }

    @Override
    public String handleRequest(PurchaseRequest request) {
        if(request.getAmount() <= 10000){
            return "Approved by Director " + name;
        } else if(next != null){
            return next.handleRequest(request);
        } else {
            return "Request denied: no approver available";
        }
    }
}
