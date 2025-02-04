import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        System.err.println("\nEnter the number of times you want to loop : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        System.err.println("\n\nFor Loop : ");
        for (i = 1; i < n; i++) {
            System.out.println(i);
        }
        i = 1;
        System.err.println("\n\nWhile Loop : ");
        while (i < n) {
            System.out.println(i);
            i++;
        }
        System.err.println("\n\nDo-While Loop : ");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < n);

        in.close();
    }
}
