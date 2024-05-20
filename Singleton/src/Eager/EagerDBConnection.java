package Eager;

public class EagerDBConnection {
    private static EagerDBConnection eagerDBConnection = new EagerDBConnection();
    public static EagerDBConnection getEagerDBConnection() {
        return eagerDBConnection;
    }
}
