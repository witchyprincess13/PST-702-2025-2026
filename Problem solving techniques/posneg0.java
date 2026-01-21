import java.util.*;
public class posneg0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number:");
        num=sc.nextInt();
        if(num>0)
        System.out.println("The given number"+num+"is positive");
         else if(num<0)
        System.out.println("The given number"+num+"is negative");
        else 
         System.out.println("The given number is zero");
         sc.close();
    }
}
