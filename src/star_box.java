import java.util.*;
public class star_box {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no. of rows :");
        int r=obj.nextInt();
        System.out.print("Enter no. of column :");
        int c=obj.nextInt();
        for (int i=r;i>=1;i--){
            for (int j=c;j>=1;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
