public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == LogProcessor.DEBUG) {
            System.out.println("DEBUG: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
