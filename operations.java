import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        int num2 = 0;
        System.out.println("Enter num 1 : ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Enter num 2 : ");
        try{
        num2 = in.nextInt();
        }catch(Exception e){
            System.out.println("Please enter a valid number : " + e);
        }
        int Sum = num1 + num2;
        System.out.println("Sum is : " + Sum);                                       
        operate(Sum, in);
                in.close();
            }
        private static void operate(int Sum, Scanner in) {
            if(check(Sum)){
                System.out.println("Sum is less than or equal to 10");
                System.out.println("Are you want to increase your sum :(Y/N) ");
                String ans = in.next();
                if (ans.equals("y") || ans.equals("yes") || ans.equals("Y") || ans.equals("Yes")) {
                    System.out.println("Enter new num : ");
                    int num3 = in.nextInt();
                    Sum += num3;
                    System.out.println("New Sum is : " + Sum);
                    operate(Sum, in);
                }else {
                    System.out.println("Thank you");
                }
            }else {
                System.out.println("Sum is greater than or equal to 10");
            }
        }
            public static boolean check(int sum){
        return sum <= 10;
    }    
}
