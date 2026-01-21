import java.util.*;
public class Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a,b;
        System.out.print("enter the value for a:");
        a=sc.nextInt();
         System.out.print("enter the value for b:");
         b=sc.nextInt();
         int sum=a+b;
         int sub=a-b;
         int prod=a*b;
         int quot=a/b;
         System.out.println(sum);
          System.out.println(sub);
           System.out.println(prod);
            System.out.println(quot);
        sc.close();
    }
}
