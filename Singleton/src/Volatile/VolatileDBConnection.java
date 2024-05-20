package Volatile;

import DoubleLocking.DLDBConnection;

public class VolatileDBConnection {
    private static volatile VolatileDBConnection volatileDBConnection;
    public static VolatileDBConnection getConnection() {
        if(volatileDBConnection == null) {
            synchronized (DLDBConnection.class) {
                if(volatileDBConnection == null) {
                    volatileDBConnection = new VolatileDBConnection();
                }
            }
        }
        return volatileDBConnection;
    }
}
