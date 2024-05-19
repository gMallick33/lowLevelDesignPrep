public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(1, "I am info");
        logProcessor.log(2, "I am debug");
        logProcessor.log(3, "i am error");
        logProcessor.log(4, "i am default");
    }
}