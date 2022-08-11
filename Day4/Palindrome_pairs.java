package Day4;
import java.util.*;
public class Palindrome_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		String arr[]=new String[size];
		System.out.println("Enter Strings");
		for(int i=0;i<size;i++)		
			arr[i]=sc.next();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i!=j)
				{		
					String check=arr[i]+arr[j];
					if(palindrome(check))
						System.out.println(i+","+j);
				}
			}
		}
		sc.close();
	}
	static boolean palindrome(String str)
	{
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		if(rev.equalsIgnoreCase(str))
			return true;
		else
			return false;
	}

}
