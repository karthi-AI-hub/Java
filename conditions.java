import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int regno;
        long phno;
        int totalSub = 6;
        int pass = 0;
        int fail = 0;
        int equ = 0;
        int[] marks = new int[totalSub];
        System.out.println("\nEnter your Name : ");
        name = in.nextLine();
        System.out.println("\nEnter your RegNo :");
        regno = in.nextInt();
        System.out.println("\nEnter your PhNo :");
        phno = in.nextLong();
        for(int i=1;i<=totalSub;i++){
            System.out.println("\nEnter mark" + i);
            marks[i-1] = in.nextInt();
        }
        System.out.println("\n\n\nName : " + name + "\n" + "RegNo : " + regno + "\n" + "PhNo : " + phno);
        for(int i=0;i<totalSub;i++){
            if(marks[i-1]<40){
                fail+=1;
            }else if(marks[i-1]==40){
                equ +=1;
            }else{
                pass+=1;
            }
        }

        System.out.println("\n\n");
        for(int i=0;i<totalSub;i++){
            System.out.println("Mark " + i + "=" + marks[i-1]);
        }
        System.out.println("\n\n\nYou have PASSED in " + pass + " subjets");
        System.out.println("\nYou have FAILED in " + fail + " subjets");
        System.out.println("\nYou have BORDER PASS in " + equ + " subjets\n");

        in.close();
    }
}
