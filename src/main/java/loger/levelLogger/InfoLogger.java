package loger.levelLogger;

import loger.LogLevel;

public class InfoLogger extends Logger {
    public InfoLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if (logLevel == LogLevel.INFO) {
            System.out.println("LOG: " + message);
        } else {
            nextLogger.log(logLevel, message);
        }
    }
}
