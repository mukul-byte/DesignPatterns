package loger;

import loger.levelLogger.DebugLogger;
import loger.levelLogger.ErrorLogger;
import loger.levelLogger.InfoLogger;
import loger.levelLogger.Logger;

public class LoggerApplication {
    public static void main(String[] args) {
        Logger applicationLogger = new DebugLogger(new InfoLogger(new ErrorLogger(null)));
        applicationLogger.log(LogLevel.INFO, "This is for info log");
        applicationLogger.log(LogLevel.ERROR, "This is for error log");
        applicationLogger.log(LogLevel.DEBUG, "This is for debug log");
    }
}
