package Day1;
import java.util.*;
public class Implement_strStr_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str=sc.next();
		System.out.println("Enter sub_String : ");
		String sub=sc.next();
		
		int len1=str.length();
		int len2=sub.length();
		
		char k=sub.charAt(0);
		int index=0;
		for(int i=0;i<len1;i++)
		{
			if(k==str.charAt(i))
			{
				index=i;
				break;
			}
		}
		int l=0;
		int flag=0;
		for(int i=index;i<len1;i++)
		{
			if(str.charAt(i)==sub.charAt(l))
			{
				flag++;
				if(flag==len2)
				{
					System.out.println(index);
					return;
				}
			}
			else
			{
				System.out.println(-1);
				return;
			}
			l++;
		}
		sc.close();

	
	
	}

}
