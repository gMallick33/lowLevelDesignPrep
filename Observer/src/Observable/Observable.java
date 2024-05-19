package Observable;

import Observer.NotificationObserver;

public interface Observable {
    public void add(NotificationObserver observer);
    public void remove(NotificationObserver observer);
    public void notifyObserver();
    public void setCount(int newCount);
    public int getCount();
}
