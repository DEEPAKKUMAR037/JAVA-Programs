import java.util.*;
public class Right_angle_star {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter lines of patterns :");
        int n = obj.nextInt();
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
