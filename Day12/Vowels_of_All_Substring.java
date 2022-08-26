package Day12;
import java.util.*;
public class Vowels_of_All_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.next();
		int sum=0,t;
		for(int i=0;i<str.length();i++)
		{
			t=i;
			sum+=check(str,t);
		}
		System.out.println(sum);
		s.close();
	}
	public static int check(String str,int t)
	{
		String res=" ";
		int count=0;
		for(int j=t;j<str.length();j++)
		{
			res+=str.charAt(j);
			count+=checkVowel(res);
		}
		
		return count;
	}
	public static int checkVowel(String res)
	{
		int c=0;
		for(int k=0;k<res.length();k++)
		{
			if(res.charAt(k)=='a' || res.charAt(k)=='e' || res.charAt(k)=='i' || res.charAt(k)=='o' || res.charAt(k)=='u')
				c++;
		}
		return c;
	}
}

//Input: word = "aba"
//Output: 6
//Explanation: 
//All possible substrings are: "a", "ab", "aba", "b", "ba", and "a".
//- "b" has 0 vowels in it
//- "a", "ab", "ba", and "a" have 1 vowel each
//- "aba" has 2 vowels in it
//Hence, the total sum of vowels = 0 + 1 + 1 + 1 + 1 + 2 = 6.
