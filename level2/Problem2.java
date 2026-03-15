import java.util.Scanner;

class Problem2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User inputs
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        double bonus;

        if (years > 5) {
            bonus = salary * 0.05;
        } else {
            bonus = 0;
        }

        System.out.println("Bonus Amount = " + bonus);

        input.close();
    }
}