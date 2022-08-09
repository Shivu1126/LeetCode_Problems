package Day2;
import java.util.*;
public class Valid_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		str=str.toLowerCase();
		//System.out.println(str);
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				rev+=str.charAt(i);
			}
		}
		int k=0,tem=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
				if(rev.charAt(k)==str.charAt(i))
					k++;
				else
					tem=1;					
		}
		if(tem==0)
			System.out.println("Palindrome String");
		else
			System.out.println("Not Palindrome");
		sc.close();
	}

}
