
import java.util.Scanner;

public class Login {
	public static void main(String [] args){
		Scanner keyboard=new Scanner(System.in);
		String password="Password123";
		String username="User1";
		String userin;
		String passin;
		System.out.println("please enter your username:");
		userin=keyboard.next();
		System.out.println("Please enter your password:");
		passin=keyboard.next();
		if(userin.equals(username) && passin.equals(password))
		{
			System.out.println("Welcome User1");
		}
		else{
			System.out.println("incorrect username or password");
		}
	}
}
