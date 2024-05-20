package DoubleLocking;

public class DLDBConnection {
    private static DLDBConnection dldbConnection;
    public static DLDBConnection getConnection() {
        if(dldbConnection == null) {
            synchronized (DLDBConnection.class) {
                if(dldbConnection == null) {
                    dldbConnection = new DLDBConnection();
                }
            }
        }
        return dldbConnection;
    }
}
