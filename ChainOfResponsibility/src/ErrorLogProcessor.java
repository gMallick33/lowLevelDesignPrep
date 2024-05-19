public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == LogProcessor.ERROR) {
            System.out.println("ERROR: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
