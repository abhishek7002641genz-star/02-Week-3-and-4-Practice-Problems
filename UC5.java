public class UC5 {

    public static void main(String[] args) {

        // UC5: Inline Array Initialization using String.join()
        String[] banner = {
                String.join("", " *****   ", " *****   ", " *****   ", " *****   "),
                String.join("", "*     *  ", "*     *  ", "*     *  ", "*     *  "),
                String.join("", "*     *  ", "*     *  ", "*     *  ", "*     *  "),
                String.join("", "*     *  ", " *****   ", "*     *  ", " *****   "),
                String.join("", "*     *  ", "*        ", "*     *  ", "*        "),
                String.join("", "*     *  ", "*        ", "*     *  ", "*        "),
                String.join("", " *****   ", "*        ", " *****   ", "*        ")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
