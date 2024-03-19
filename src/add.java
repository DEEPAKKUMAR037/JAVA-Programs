import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        int sum=0,r,i;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number :");
        int n=obj.nextInt();
        while(n>0)
        {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
            System.out.print("sum :"+(sum));

    }
}
