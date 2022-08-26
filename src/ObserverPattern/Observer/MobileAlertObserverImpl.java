package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable){
        this.userName=userName;
        this.observable=observable;
    }

    @Override
    public void update() {
       sendMsgOnMobile(userName,"Stock is available Hurry up");
    }

    private void sendMsgOnMobile(String userName, String message) {
        System.out.println("Message sent to user"+userName);
    }
}
