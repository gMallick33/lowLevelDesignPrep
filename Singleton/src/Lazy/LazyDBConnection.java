package Lazy;

public class LazyDBConnection {
    private static LazyDBConnection lazyDBConnection;

    public static LazyDBConnection getLazyDBConnection() {
        if(lazyDBConnection == null) {
            lazyDBConnection = new LazyDBConnection();
        }
        return lazyDBConnection;
    }
}
