package loger.levelLogger;

import loger.LogLevel;

public abstract class Logger {
    public Logger nextLogger;

    public Logger(Logger logger) {
        nextLogger = logger;
    }

    public abstract void log(LogLevel logLevel, String message);
}
