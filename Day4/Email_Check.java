package Day4;
import java.util.*;
public class Email_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		boolean r=str.endsWith("@gmail.com");
		System.out.print("Mail is "+r);
		sc.close();
	}

}
