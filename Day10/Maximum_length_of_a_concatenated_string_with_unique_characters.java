package Day10;
import java.util.*;
public class Maximum_length_of_a_concatenated_string_with_unique_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size ");
		int size=s.nextInt();
		String arr[]=new String[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=s.next();
		}
		int max=arr[0].length();
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				String str=arr[i]+arr[j];
				if(check(str))
				{
					int len=str.length();
					if(len>max)
						max=len;
				}
			}
		}
		System.out.println(max);
		s.close();
	}
	static boolean check(String str)
	{
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
					return false;
			}
		}		
		return true;
	}

}

//Input: arr = ["cha","r","act","ers"]
//Output: 6
//Explanation: Possible longest valid concatenations are "chaers" ("cha" + "ers") and "acters" ("act" + "ers")