package Day7;
import java.util.*;
public class Delete_Operation_in_Two_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st String ");
		String str1=s.next();
		System.out.println("Enter 2nd String ");
		String str2=s.next();
		int n=0,count=0;
		
		for(int i=0;i<str2.length();i++)
		{
			for(int j=0;j<str1.length();j++)
			{
				n=0;
				if(str2.charAt(i)==str1.charAt(j))
				{
					n++;
					count++;
				}
				if(n>1)
				{
					n--;
					count--;
				}
			}
		}
		s.close();
		if(str1.length()==str2.length())
		{
			System.out.println((str1.length()-count)*2);
			return;
		}
		System.out.println(str1.length()-count);
	}

}
