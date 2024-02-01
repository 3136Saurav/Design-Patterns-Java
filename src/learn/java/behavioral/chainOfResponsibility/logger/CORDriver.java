package learn.java.behavioral.chainOfResponsibility.logger;

import static learn.java.behavioral.chainOfResponsibility.logger.LogProcessor.*;

public class CORDriver {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(INFO, "This is from Info logger");
        logProcessor.log(DEBUG, "This is from Debug logger");
        logProcessor.log(ERROR, "This is from Error logger");


    }
}
