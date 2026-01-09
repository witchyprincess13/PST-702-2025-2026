import java.util.*;
public class positiveEven
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("enter a number:");
    n=sc.nextInt();
    if(n>0&&n%2==0)
        System.out.println(n+"is a positive even number");
    else
     System.out.println(n+"is a positive even number");
    
    sc.close();
	}
}