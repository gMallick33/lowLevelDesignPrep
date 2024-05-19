public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int logLevel, String message) {
        if(logLevel == LogProcessor.INFO) {
            System.out.println("INFO: " + message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
