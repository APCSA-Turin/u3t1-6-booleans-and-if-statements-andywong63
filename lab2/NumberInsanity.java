import java.util.Scanner;

public class NumberInsanity {

    public NumberInsanity() {
    }

    public void go() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = myScanner.nextInt();
        String msg = result(num); // call helper method and store result
        System.out.println(msg);
    }

    // helper method that returns string containing message to be printed
    private String result(int num) {
        if (num > 0) {
            // Positive number
            if (num % 2 == 0) {
                // Even number
                if (num >= 100) {
                    return "Big even number!";
                } else if (num < 50) {
                    return "Small even number!";
                } else {
                    return "Medium even number!";
                }
            } else {
                boolean divisibleBy5 = num % 5 == 0;
                boolean divisibleBy7 = num % 7 == 0;
                if (divisibleBy5 && divisibleBy7) {
                    return "Divisible by both 5 and 7!";
                } else if (divisibleBy5) {
                    return "Divisible by 5!";
                } else if (divisibleBy7) {
                    return "Divisible by 7!";
                } else {
                    return "Not divisible by 5 or 7!";
                }
            }
        } else {
            // Not positive number
            return "That's not positive!";
        }
    }
}