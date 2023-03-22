package loger.levelLogger;

import loger.LogLevel;

public class DebugLogger extends Logger {

    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if (logLevel == LogLevel.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            nextLogger.log(logLevel, message);
        }
    }
}
