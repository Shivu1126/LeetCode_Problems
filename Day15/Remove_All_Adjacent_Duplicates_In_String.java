package Day15;
import java.util.*;
public class Remove_All_Adjacent_Duplicates_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		
		while(true)
		{
			int f=0;
			for(int i=0;i<str.length()-1;i++)
			{
				if(str.charAt(i)==str.charAt(i+1))
				{
					f=1;
					str=checkStar(str,i);
				}
			}		
			if(f==0)
				break;
		}
		System.out.println(str);
		s.close();
	}
	
	public static String checkStar(String str,int a)
	{
		String newStr="";
		char arr[]=str.toCharArray();
		
		arr[a]=arr[a+1]=' ';
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
				newStr+=arr[i];
		}
		
		return newStr;
	}

}


//Input: s = "abbaca"
//Output: "ca"
//Explanation: 
//For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, 
//and this is the only possible move.  
//The result of this move is that the string is "aaca", of which only "aa" is possible, 
//so the final string is "ca".
