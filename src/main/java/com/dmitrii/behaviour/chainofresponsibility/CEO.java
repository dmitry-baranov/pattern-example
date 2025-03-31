package com.dmitrii.behaviour.chainofresponsibility;

public class CEO extends Approver{
    public CEO(String name) {
        super(name);
    }

    @Override
    public String handleRequest(PurchaseRequest request) {
        if(request.getAmount() <= 50000){
            return "Approved by CEO " + name;
        } else if(next != null){
            return next.handleRequest(request);
        } else {
            return "Request denied: no approver available";
        }
    }
}
