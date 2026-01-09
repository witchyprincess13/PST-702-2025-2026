import java.util.*;
public class logical
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int a,b;
	System.out.print("enter the first number :");
     a = sc.nextInt();
	System.out.print("enter the second number :");
	 b = sc.nextInt();
	int AND=a&b;
	int	OR=a|b;
	int NOT=a^b;

	System.out.println("AND of a and b ="+AND);
		System.out.println("OR of a and b ="+OR);
			System.out.println("NOT of a and b ="+NOT);
			sc.close();
	}
}
