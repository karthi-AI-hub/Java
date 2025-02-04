import java.util.Scanner;

public class lop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Total Salary : ");
        int salary = sc.nextInt();
        System.out.println("Enter your Total Leave taken : ");
        int leave = sc.nextInt();
        double lop = leave*833.25;
        int total = salary - (int)lop;
        System.out.println("Your Credited Salary is : " + total);
        sc.close();
    }
}