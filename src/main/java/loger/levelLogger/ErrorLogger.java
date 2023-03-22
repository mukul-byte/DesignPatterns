package loger.levelLogger;

import loger.LogLevel;

public class ErrorLogger extends Logger {

    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if (logLevel == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            nextLogger.log(logLevel, message);
        }
    }
}
