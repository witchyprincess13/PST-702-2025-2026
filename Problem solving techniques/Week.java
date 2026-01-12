import java.util.*;
public class Week
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	int day;
	String dayname; 
	System.out.print("Enter your date:");
	day=sc.nextInt();
	switch(day)
	{
	    case 1:
	        dayname="Sunday";
	        break;
	        case 2:
	        dayname="Monday";
	        break;
	        case 3:
	        dayname="Tuesday";
	        break;
	        case 4:
	        dayname="Wednesday";
	        break;
	        case 5:
	        dayname="Thursday";
	        break;
	        case 6:
	        dayname="Friday";
	        break;
	        case 7:
	        dayname="Saturday";
	        break;
	        default:
	        dayname="Something went wrong";
	        break;
	      
	}
	  System.out.println("the day is " +dayname);
	}
}
