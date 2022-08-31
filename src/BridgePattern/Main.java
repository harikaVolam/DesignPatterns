package BridgePattern;

import BridgePattern.Abstraction.Payment;
import BridgePattern.ConcreteImplementer.CitiPaymentSystem;
import BridgePattern.ConcreteImplementer.IDBIPaymentSystem;
import BridgePattern.RefinedAbstraction.CardPayment;
import BridgePattern.RefinedAbstraction.NetBankingPayment;

public class Main {

    public static void main(String[] args) {
        Payment order = new CardPayment();
        order.iPaymentSystem= new CitiPaymentSystem();
        order.makePayment();

        order.iPaymentSystem=new IDBIPaymentSystem();
        order.makePayment();

        order= new NetBankingPayment();
        order.iPaymentSystem=new CitiPaymentSystem();
        order.makePayment();
    }
}
