package BridgePattern;

import BridgePattern.Abstraction.Payment;
import BridgePattern.ConcreteImplementer.CitiPaymentSystem;
import BridgePattern.ConcreteImplementer.IDBIPaymentSystem;
import BridgePattern.RefinedAbstraction.CardPayment;
import BridgePattern.RefinedAbstraction.NetBankingPayment;


//https://medium.com/coding-becomes-easy/bridge-pattern-48150246e552
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
