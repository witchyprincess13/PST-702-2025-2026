import java.util.*;
public class number
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("enter the number:");
    num=sc.nextInt();
    if(num>10&&num<50)
        System.out.println("the number is in range");
    else
     System.out.println("the number is not within range");
    sc.close();
    
	}
}
