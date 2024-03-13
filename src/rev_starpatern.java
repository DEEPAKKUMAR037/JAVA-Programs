import java.util.Scanner;
public class rev_starpatern {
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            int i,j,k,n;
            System.out.print("Enter no. of lines :");
            n=obj.nextInt();
            for ( i = n; i >=1 ; i--) {
                for (j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for (k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }


