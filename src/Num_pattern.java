import java.util.*;
public class Num_pattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter number :");
        n = obj.nextInt();
        int x=1;
        for (i=1;i<=n;i++){
            for(j=1;j<=i;j++){

                System.out.print(x+" ");
                x=x+1;

            }
            System.out.print("\n");
        }
    }
}
