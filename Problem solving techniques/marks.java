import java.util.*;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int m1,m2,m3;
    double total=0.0d;
     double avg=0.0d;
        System.out.print("enter the m1 mark:");
        m1=sc.nextInt();
         System.out.print("enter the m2 mark:");
         m2=sc.nextInt();
          System.out.print("enter the m3 mark:");
         m3=sc.nextInt();
         total=m1+m2+m3;
         avg=total/3;
         System.out.println(total);
         System.out.println(avg);
        sc.close();
    }
}
