import java.util.*;
public class greatest
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int a,b,c;
	System.out.print("enter the first number :");
     a = sc.nextInt();
	System.out.print("enter the second number :");
	 b = sc.nextInt();
	System.out.print("enter the third number :");
	 c = sc.nextInt();
	if (a>b&&a>c)
	System.out.println("the greatest number is a ="+a);
	else if (b>a&&b>c)
		System.out.println("the greatest number is b = "+b);
		else
			System.out.println("the greatest number is c = "+c);
		sc.close();
	}
}