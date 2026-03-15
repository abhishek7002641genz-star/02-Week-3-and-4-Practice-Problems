import java.util.Scanner;

class Problem1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid number. Enter a natural number.");
            System.exit(0);
        }

        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }

        input.close();
    }
}