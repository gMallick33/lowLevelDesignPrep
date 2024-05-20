package Synchronized;

public class SynchronizedDBConnection {
    private static SynchronizedDBConnection synchronizedDBConnection;

    synchronized static SynchronizedDBConnection getSynchronizedDBConnection() {
        if(synchronizedDBConnection == null) {
            synchronizedDBConnection = new SynchronizedDBConnection();
        }
        return synchronizedDBConnection;
    }
}
