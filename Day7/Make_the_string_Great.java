package Day7;
import java.util.*;
public class Make_the_string_Great {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.next();
		String ans="";
		
		if((str.charAt(0)>='a' && str.charAt(0)<='z') && (str.charAt(1)>='A' && str.charAt(1)<='Z'))
			ans="";
		else
			ans+=str.charAt(0);
		
		for(int i=1;i<str.length();i++)
		{
			if((str.charAt(i-1)>='a' && str.charAt(i-1)<='z') && (str.charAt(i)>='A' && str.charAt(i)<='Z'))
			{
				i++;
				continue;
			}
			ans+=str.charAt(i);

		}
		System.out.println(ans);
		s.close();
	}

}

//Input: s = "leEeetcode"
//Output: "leetcode"
//Explanation: In the first step, either you choose i = 1 or i = 2,
//			 both will result "leEeetcode" to be reduced to "leetcode"