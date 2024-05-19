package Observable;

import Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable{
    int count = 0;
    List<NotificationObserver> observerList = new ArrayList<>();

    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(NotificationObserver observer: observerList) {
            observer.update();
        }
    }

    @Override
    public void setCount(int newCount) {
        if(count == 0) {
            notifyObserver();
        }
        count = newCount;
    }

    @Override
    public int getCount() {
        return count;
    }
}
