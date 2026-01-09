import java.util.*;
public class age
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age;
    System.out.print("enter the age:");
    age=sc.nextInt();
    if(!(age>=18))
        System.out.println("You are not eligible");
    else
     System.out.println("you are eligible");
    sc.close();
	}
}