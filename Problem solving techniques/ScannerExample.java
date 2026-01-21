import java.util.*;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a,b;
        System.out.print("enter the value for a:");
        a=sc.nextInt();
         System.out.print("enter the value for b:");
         b=sc.nextInt();
         int sum=a+b;
         System.out.println(sum);
        sc.close();
    }
}
