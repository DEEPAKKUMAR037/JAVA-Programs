import java.util.Scanner;
public class char_pattern {
    public static void main(String[] args) {
        int c=65;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n= obj.nextInt();
        int x=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if(c==91)
                {
                    x=1;
                    break;
                }
                System.out.print((char)c+" ");
                c=c+1;
            }
            if(x==1)
            {
                break;
            }
            System.out.print("\n");
        }
    }
}
