package Day1;
import java.util.*;
public class Paranthesis_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.next();
		
		int a=0,b=0,c=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
				a++;
			if(str.charAt(i)==')')
				a--;
			if(str.charAt(i)=='{')
				b++;
			if(str.charAt(i)=='}')
				b--;
			if(str.charAt(i)=='[')
				c++;
			if(str.charAt(i)==']')
				c--;
		}
		if(a==0 && b==0 && c==0)
			System.out.println("True");
		else
			System.out.println("False");
		
		sc.close();
	}

}
