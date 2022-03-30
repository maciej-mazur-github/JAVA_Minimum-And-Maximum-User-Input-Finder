import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int minimumValue = Integer.MAX_VALUE;
        int maximumValue = Integer.MIN_VALUE;
        int currentNumber;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number: ");

            if (scanner.hasNextInt()) {
                currentNumber = scanner.nextInt();

                if (currentNumber <= minimumValue) {
                    minimumValue = currentNumber;
                } else if (currentNumber >= maximumValue) {
                    maximumValue = currentNumber;
                }
            } else {
                break;
            }
        }

        System.out.println("Invalid number has been entered. Breaking the loop now. \n" +
                "Minimum value was: " + minimumValue +
                "\nMaximum value was: " + maximumValue);

        scanner.close();
    }
}
