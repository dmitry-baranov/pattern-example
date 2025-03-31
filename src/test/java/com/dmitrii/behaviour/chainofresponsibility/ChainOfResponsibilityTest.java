package com.dmitrii.behaviour.chainofresponsibility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChainOfResponsibilityTest {

    private Approver chain;

    @BeforeEach
    void setUp() {
        Approver teamLead = new TeamLead("Alice");
        Approver director = new Director("Carol");
        Approver ceo = new CEO("Diana");

        teamLead.setNext(director);
        director.setNext(ceo);

        chain = teamLead;

    }

    @Test
    public void testSmallPurchase() {
        Assertions.assertEquals("Approved by TeamLead Alice", chain.handleRequest(new PurchaseRequest(500, "Office snacks")));
    }

    @Test
    public void testMediumPurchase() {
        Assertions.assertEquals("Approved by Director Carol", chain.handleRequest(new PurchaseRequest(7000, "Office snacks")));
    }

    @Test
    public void testLargePurchase() {
        Assertions.assertEquals("Approved by CEO Diana", chain.handleRequest(new PurchaseRequest(45000, "Office snacks")));
    }

}