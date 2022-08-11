package Day4;
import java.util.*;
public class Word_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pattern ");
		String pattern=sc.next();
		String arr[]=new String[pattern.length()];
		System.out.println("Enter Strings");
		for(int i=0;i<pattern.length();i++)
		{
			arr[i]=sc.next();
		}
		sc.close();
		for(int i=0;i<pattern.length();i++)
		{
			for(int j=0;j<pattern.length();j++)
			{
				if(i!=j)
				{
					if(pattern.charAt(i)==pattern.charAt(j))
					{
						if(!check(arr,i,j))
						{							
							System.out.println("false");
							return ;
						}
					}
				}
			}
		}
		System.out.println("true");
	}
	static boolean check(String arr[],int i,int j)
	{
		if(arr[i].equals(arr[j]))
			return true;
		return false;
	}

}
