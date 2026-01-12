import java.util.*;
public class Gre100
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	int num;
	System.out.print("Enter the number:");
	num=sc.nextInt();
	if(num>100)
	System.out.println("the given number is greater than 100");
	else if(num<100)
	System.out.println("the given number is not greater than 100");
	else
	System.out.println("the given number is equal to 100");
	}
}
