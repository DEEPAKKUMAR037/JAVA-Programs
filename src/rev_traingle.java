import java.util.Scanner;
public class rev_traingle {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter no. lines :");
        int n = ob.nextInt();

        for(int i = n; i >= 1; --i) {
            for(int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; ++k) {
                System.out.print(" *");
            }

            System.out.print("\n");
        }

    }
}
