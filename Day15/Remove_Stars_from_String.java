package Day15;
import java.util.*;
public class Remove_Stars_from_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		
		while(true)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)!='*')
				{
					count++;
				}
			}
			if(count!=str.length())
				str=checkStar(str);
			else
				break;
		}
		System.out.println(str);
		s.close();
	}
	
	public static String checkStar(String str)
	{
		String newStr="";
		char arr[]=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(str.charAt(i)=='*')
			{
				arr[i-1]=' ';
				arr[i]=' ';
				break;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=' ')
				newStr+=arr[i];
		}
		
		return newStr;
	}
	
}


//Input: s = "leet**cod*e"
//Output: "lecoe"
//Explanation: Performing the removals from left to right:
//- The closest character to the 1st star is 't' in "leet**cod*e". s becomes "lee*cod*e".
//- The closest character to the 2nd star is 'e' in "lee*cod*e". s becomes "lecod*e".
//- The closest character to the 3rd star is 'd' in "lecod*e". s becomes "lecoe".
//There are no more stars, so we return "lecoe"