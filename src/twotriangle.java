import java.util.*;
public class twotriangle {
    public static void main(String[] args) {
        int i,j,k,n;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter no. lines :");
         n = ob.nextInt();

        for( i = n; i >= 1; --i) {
            for( j = 1; j <= n - i; ++j) {
                System.out.print("  ");
            }

            for( k = 1; k <= i; ++k) {
                System.out.print("*   ");
            }
            System.out.print("\n");

        }
        for ( i = 2; i <=n ; i++) {
            for (j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (k=1;k<=i;k++){
                System.out.print("*   ");
            }
            System.out.print("\n");
        }

    }
}
