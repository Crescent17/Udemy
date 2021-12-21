public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        String formattedA = "" + a;
        String formattedB = "" + b;
        if (formattedA.length() < 4 || formattedB.length() < 4) {
            return formattedA.substring(0, formattedA.length()).equals(formattedB.substring(0, formattedB.length()));
        }
        return formattedA.substring(0, 5).equals(formattedB.substring(0, 5));
    }
}