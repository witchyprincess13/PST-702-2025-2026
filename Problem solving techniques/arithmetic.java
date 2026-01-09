import java.util.*;
public class arithmetic
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int a,b;
	System.out.print("enter the first number :");
     a = sc.nextInt();
	System.out.print("enter the second number :");
	 b = sc.nextInt();
	int sum=a+b;
	int	sub=a-b;
	int mul=a*b;
	int div=a/b;
	int mod=a%b;
	System.out.println("Addition of a and b ="+sum);
		System.out.println("Subtraction of a and b ="+sub);
			System.out.println("Multiplication of a and b ="+mul);
				System.out.println("Division of a and b ="+div);
					System.out.println("modulous of a and b ="+mod);
					sc.close();
	}
}
