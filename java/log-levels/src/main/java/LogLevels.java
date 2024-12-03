public class LogLevels {
    
    public static String message(String logLine) {

        String[] list = logLine.split(":");
        return list[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] list = logLine.split(":");
        return list[0].trim().replaceAll("[\\[\\]]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " " + "(" + logLevel(logLine) + ")";
    }
}
