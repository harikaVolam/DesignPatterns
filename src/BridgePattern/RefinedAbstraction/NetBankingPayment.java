package BridgePattern.RefinedAbstraction;

import BridgePattern.Abstraction.Payment;

public class NetBankingPayment extends Payment {

    @Override
    public void makePayment() {
         iPaymentSystem.processPayment("NetBanking Payment");
    }
}
