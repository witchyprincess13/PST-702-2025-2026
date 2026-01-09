import java.util.*;
public class unary
{
	public static void main(String[] args) {
        int a = 5;
        boolean isTrue = true;
        System.out.println("Unary Plus (+a): " + (+a));
        System.out.println("Prefix Increment (++a): " + (++a));
        System.out.println("Postfix Increment (a++): " + (a++)); 
        System.out.println("Logical NOT (!isTrue): " + (!isTrue)); 
        System.out.println("Bitwise Complement (~a): " + (~a)); 
    }
}