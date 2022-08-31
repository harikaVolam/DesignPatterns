package BridgePattern.Abstraction;

import BridgePattern.Implementor.IPaymentSystem;

public abstract class Payment {

  public IPaymentSystem iPaymentSystem;

 public abstract void makePayment();
}
