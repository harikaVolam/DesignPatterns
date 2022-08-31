package BridgePattern.RefinedAbstraction;

import BridgePattern.Abstraction.Payment;

public class CardPayment extends Payment {

    @Override
    public void makePayment() {
        iPaymentSystem.processPayment("Card Payment");
    }
}
