package BridgePattern.ConcreteImplementer;

import BridgePattern.Implementor.IPaymentSystem;

public class CitiPaymentSystem implements IPaymentSystem {
    @Override
    public void processPayment(String paymentSystem) {
        System.out.println("Using citiBank gateway for paymentSytem: "+paymentSystem);
    }
}
