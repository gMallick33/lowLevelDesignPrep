package Observer;

import Observable.Observable;

public class MobileObserver implements NotificationObserver{

    public Observable observable;
    public String mobileNo;

    public MobileObserver(Observable observalbe, String mobileNo) {
        this.observable = observalbe;
        this.mobileNo = mobileNo;
    }
    @Override
    public void update() {
        sendText();
    }

    public void sendText() {
        System.out.println("sent text to: " + this.mobileNo);
    }
}
