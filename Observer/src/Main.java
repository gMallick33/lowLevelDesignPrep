import Observable.Observable;
import Observer.MobileObserver;
import Observer.NotificationObserver;
import Observable.IphoneObservable;
import Observer.EmailObserver;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {

        Observable iphoneObservable = new IphoneObservable();

        NotificationObserver mobileObserver = new MobileObserver(iphoneObservable, "8282");
        NotificationObserver emailObserver = new EmailObserver(iphoneObservable, "myEmail");
        iphoneObservable.add(mobileObserver);
        iphoneObservable.add(emailObserver);

        iphoneObservable.setCount(10);
    }
}