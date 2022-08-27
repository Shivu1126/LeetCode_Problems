package Day13;
import java.util.*;
public class Score_of_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter sring");
		String str=s.next();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
				count++;
			if(str.charAt(i)==')')
				count--;
		}
		if(count==0)
			System.out.println("Output : "+ str.length()/2);
		s.close();
	}

}
