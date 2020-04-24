import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, input: ");

        for (int i = 0; i < 3; i++) {
            try {
                int b = scanner.nextInt();
                if (b > 0 && b <= 10) {
                    System.out.println("Input correct: " + b);

                } else {
                    System.err.println("Error: " + b);
                    i--;
                    throw new NumberFormatException();
                }

            } catch (Exception e) {
                System.err.println("Need to enter a number 0 - 10 : " + e);


            }
        }
    }
}
