package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StockObservable observable = new IphoneObservableImpl();

        NotificationAlertObserver notificationAlertObserver1 = new EmailAlertObserverImpl(observable,"xyz@gmail.com");
        NotificationAlertObserver notificationAlertObserver2 = new EmailAlertObserverImpl(observable,"xyz1@gmail.com");
        NotificationAlertObserver notificationAlertObserver3 = new MobileAlertObserverImpl("xyz1@gmail.com",observable);

        observable.add(notificationAlertObserver1);
        observable.add(notificationAlertObserver2);
        observable.add(notificationAlertObserver3);

        observable.setStockCount(30);


    }
}
