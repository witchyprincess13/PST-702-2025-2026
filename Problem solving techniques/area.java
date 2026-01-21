import java.util.*;
import static java.lang.Math.*;
public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    float r=0.0f;
        System.out.print("enter the radius of a circle:");
        r=sc.nextFloat();
         float area=(float)(Math.PI*r*r);
         System.out.println(area);
        sc.close();
    }
}
