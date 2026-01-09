import java.util.*;
public class assignment
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
 int a = 10;
        int b = 5;

        System.out.println("Initial values: a = " + a + ", b = " + b);
        a = b; 
        System.out.println("After simple assignment (a = b): a = " + a);

        a += b; 
        System.out.println("After addition assignment (a += b): a = " + a);

        a -= b; 
        System.out.println("After subtraction assignment (a -= b): a = " + a);

        a *= b; 
        System.out.println("After multiplication assignment (a *= b): a = " + a);

        a /= b; 
        System.out.println("After division assignment (a /= b): a = " + a);

        a %= b; 
        System.out.println("After modulus assignment (a %= b): a = " + a);
        sc.close();
    }
}