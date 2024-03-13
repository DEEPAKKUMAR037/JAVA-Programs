import java.util.Scanner;
public class division {
    public division() {
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a divident number :");
        float a = obj.nextFloat();
        System.out.print("Enter a diviser number :");
        float b = obj.nextFloat();
        System.out.print("Division :" + a / b);
    }
}
