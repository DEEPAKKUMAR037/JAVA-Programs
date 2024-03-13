import java.util.*;
public class Ascii2 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter a string :");
        String str=ob.nextLine();
        for (int i=0;i<=str.length();i++){
           char a=str.charAt(i);
            int b=(char)a;
            System.out.printf("ASCII value of %c is %d\n",a,b);
        }
    }
}
