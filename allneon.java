import java.util.Scanner;

public class allneon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range (e.g., 1000): ");
        int range = in.nextInt();
        
        System.out.println("Neon numbers between 1 and " + range + ":");
        for (int num = 1; num <= range; num++) {
            int square = num * num;
            int sum = 0;

            while (square > 0) {
                int digit = square % 10;
                sum += digit;
                square /= 10;
            }

            if (num == sum) {
                System.out.println(num);
            }
        }

        in.close();
    }
}