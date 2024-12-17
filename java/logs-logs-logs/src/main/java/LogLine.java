public class LogLine 
{
    String logLevel;
    String mensagem;

    public LogLine(String logLine) 
    {
        logLevel = logLine.replaceAll(".*\\[(.*?)\\].*", "$1");
        mensagem = logLine.replaceAll(".*:\\s*", "");
    }

    public LogLevel getLogLevel() 
    {
        switch (logLevel) 
        {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        return getLogLevel().getNumberOfLevel() + ":" + mensagem;
    }
}
