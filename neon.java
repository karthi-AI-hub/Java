import java.util.Scanner;

public class neon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int square = num * num;
        int sum = 0;        
        git branch -M main
        git push -u origin main
//9 -> 9*9 =  81;
//81 -> 8+1 = 9;
        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }

        if (num == sum) {
            System.out.println(num + " is a neon number.");
        } else {
            System.out.println(num + " is not a neon number.");
        }

        in.close();
    }
}