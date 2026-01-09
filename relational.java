import java.util.*;
public class relational
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int a,b;
	System.out.print("enter the first number :");
     a = sc.nextInt();
	System.out.print("enter the second number :");
	 b = sc.nextInt();
if(a==b)
System.out.println("a is equal to b");
else 
System.out.println("a is not equal to b");
if (a>b)
System.out.println("a is greater ");
else
			System.out.println("b is greater");
			if (a<b)
System.out.println("a is lesser ");
else
			System.out.println("b is lesser");
			if (a>=b)
System.out.println("a is greater ");
else
			System.out.println("b is greater");
			if (a<=b)
System.out.println("a is lesser ");
else
			System.out.println("b is lesser");
			sc.close();
	}
}