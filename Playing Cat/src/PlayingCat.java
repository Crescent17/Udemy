public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            if (temperature <= 45 && temperature >= 25) {
                return true;
            }
        } else {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
        }
        return false;
    }
}
