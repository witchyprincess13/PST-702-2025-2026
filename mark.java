import java.util.*;
public class mark
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int mark,grace;
    System.out.print("enter the student mark:");
    mark=sc.nextInt();
    System.out.print("enter the grace mark:");
     grace=sc.nextInt();
    if(mark>=40||grace==2)
        System.out.println("Student is passed ");
    else
     System.out.println("Student id failed");
    sc.close();
    
	}
}