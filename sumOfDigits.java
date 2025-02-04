import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n\n\n\nEnter the number: ");
        int num = in.nextInt();
        int sum = 0;
        System.out.println("Entered number is : " + num);

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of the digits is: " + sum);
        in.close();
    }
}
