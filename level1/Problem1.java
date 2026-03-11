// Program to check whether a number is divisible by 5

import java.util.Scanner;

class Problem1 {

    public static void main(String[] args) {

        // Create scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Boolean expression to check divisibility
        boolean isDivisible = (number % 5 == 0);

        // Display result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        // Close scanner
        input.close();
    }
}