package BridgePattern.ConcreteImplementer;

import BridgePattern.Implementor.IPaymentSystem;

public class IDBIPaymentSystem implements IPaymentSystem {
    @Override
    public void processPayment(String paymentSystem) {
        System.out.println("Using IDBI gateway for paymentSytem: "+paymentSystem);
    }
}
