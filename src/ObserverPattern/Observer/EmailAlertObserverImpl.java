package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(StockObservable observable, String emailId){
        this.observable=observable;
        this.emailId=emailId;
    }


    @Override
    public void update() {

        sendEmail(emailId,"Product is in stock Hurry up..!");

    }

    private void sendEmail(String emailId, String s) {

        System.out.println("Email sent to"+emailId);
    }
}
