import java.util.*;
public class Reverse
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	int i=1,n,rev=0,r;
System.out.print("Enter a number:");
n=sc.nextInt();
r=n;
while(n!=0)
{
    r=n%10;
    rev=rev*10+r;
    n=n/10;
}
System.out.println(" reverse of the given number is "+rev);
}
}