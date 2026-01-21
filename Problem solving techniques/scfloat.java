import java.util.*;
public class  scfloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    float a=0.0f;
    float b=0.0f;
        System.out.print("enter the value for a:");
        a=sc.nextFloat();
         System.out.print("enter the value for b:");
         b=sc.nextFloat();
         float sum=a+b;
         System.out.println(sum);
        sc.close();
    }
}
