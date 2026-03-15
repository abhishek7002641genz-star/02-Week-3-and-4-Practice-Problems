import java.util.Scanner;

class Problem1 {

    public static void main(String[] args) {

        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Boolean expression
        boolean divisible = (number % 5 == 0);

        // Display result
        System.out.println("Is the number " + number + " divisible by 5? " + divisible);

        input.close();
    }
}