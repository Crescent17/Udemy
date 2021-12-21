public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(135, 42));
        System.out.println(getDurationString(3632));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid value";
        }
        if (seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        String duration = minutes / 60 + "h " + minutes % 60 + "m " + seconds + "s";
        return duration;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        String duration = seconds / 60 + "m " + seconds % 60 + "s";
        return duration;
    }
}