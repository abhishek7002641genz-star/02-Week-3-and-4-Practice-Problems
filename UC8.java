import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8
 * Uses HashMap for storing character patterns
 * and renders the banner using a function.
 */
public class UC8 {

    /**
     * Creates and returns a map of character patterns.
     */
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for O
        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for P
        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        // Pattern for S
        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    /**
     * Renders banner for given message.
     */
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    builder.append(pattern[row]).append("  ");
                }
            }

            System.out.println(builder);
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner("OOPS", patternMap);
    }
}