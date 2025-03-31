package com.dmitrii.behaviour.chainofresponsibility;

public class TeamLead extends Approver{
    public TeamLead(String name) {
        super(name);
    }

    @Override
    public String handleRequest(PurchaseRequest request) {
        if(request.getAmount() <= 1000){
            return "Approved by TeamLead " + name;
        } else if(next != null){
            return next.handleRequest(request);
        } else {
            return "Request denied: no approver available";
        }
    }
}
