import java.util.Scanner;

class Problem1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (year < 1582) {
            System.err.println("Year must be 1582 or later.");
            System.exit(0);
        }

        boolean leapYear;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            leapYear = true;
        } else {
            leapYear = false;
        }

        if (leapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        input.close();
    }
}