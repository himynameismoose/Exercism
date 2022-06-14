public class LogLevels {

    public static String[] levels = { "[INFO]:", "[WARNING]:", "[ERROR]:" };
    
    public static String message(String logLine) {

        for (int i = 0; i < levels.length; i++) {
            if (logLine.contains(levels[i])) {
                return logLine.replace(levels[i], "").trim();
            }
        }

        return "";
    }

    public static String logLevel(String logLine) {

        for (int i = 0; i < levels.length; i++) {
            if (logLine.contains(levels[i])) {
                return levels[i].substring(1, levels[i].length() - 2).toLowerCase();
            }
        }

        return "";
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = logLevel(logLine);

        return message + " (" + level + ")";
    }
}
