public class UC6 {

    // Static method to build pattern for letter O
    public static String[] getOPattern() {
        return new String[]{
                " ***   ",
                "*   *  ",
                "*   *  ",
                "*   *  ",
                "*   *  ",
                "*   *  ",
                " ***   "
        };
    }

    // Static method to build pattern for letter P
    public static String[] getPPattern() {
        return new String[]{
                "****   ",
                "*   *  ",
                "*   *  ",
                "****   ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Static method to build pattern for letter S
    public static String[] getSPattern() {
        return new String[]{
                " ****  ",
                "*      ",
                "*      ",
                " ***   ",
                "    *  ",
                "    *  ",
                "****   "
        };
    }

    public static void main(String[] args) {

        // Get patterns using helper methods
        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Create banner lines array (7 rows)
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join(" ", O[i], O[i], P[i], S[i]);
        }

        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
