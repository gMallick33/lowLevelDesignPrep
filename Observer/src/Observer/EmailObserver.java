package Observer;

import Observable.Observable;

public class EmailObserver implements NotificationObserver{
    public Observable observable;
    public String email;

    public EmailObserver(Observable observalbe, String email) {
        this.observable = observalbe;
        this.email = email;
    }
    @Override
    public void update() {
        sendEmail();
    }

    public void sendEmail() {
        System.out.println("sent text to: " + this.email);
    }
}
