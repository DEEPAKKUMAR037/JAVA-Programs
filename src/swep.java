import java.util.Scanner;

public class swep {
    public static void main(String[] args) {
//        Scanner obj=new Scanner(System.in);
        int a=9,b=5;
//        System.out.print("Enter first number :");
//        a=obj.nextInt();
//        System.out.print("Enter second number :");
//        b=obj.nextInt();
       a=a-b;
       b=a+b;
       a=b-a;
        System.out.print("Swap of 'A' ="+a+"\nSwap of 'B' ="+b);
    }
}
