package Day7;
import java.util.*;
public class Replace_All_Digits_with_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.next();
		char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				arr[i]= (char) (arr[i-1]+1);
			}
		}
		System.out.println(new String(arr));
		s.close();
	}

}

//Input: s = "a1c1e1"
//Output: "abcdef"

//long contiguous segment of ones then zero