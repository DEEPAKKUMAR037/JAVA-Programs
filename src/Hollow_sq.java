import java.util.*;
public class Hollow_sq {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter side : ");
        n = ob.nextInt();
        for (i=n;i>=1;i--){
            for (j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                System.out.print("* ");}
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
