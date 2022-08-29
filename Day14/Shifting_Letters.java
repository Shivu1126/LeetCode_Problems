package Day14;
import java.util.*;
public class Shifting_Letters {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter String..");
		String str=s.next();
		int shift[]=new int[str.length()];
		char arr[]=str.toCharArray();
		
		System.out.println("Enter shifting value..");
		for(int i=0;i<str.length();i++)
			shift[i]=s.nextInt();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				arr[j]+=shift[i];
			}
		}
		
		System.out.print(new String(arr));
		s.close();
	}

}

//Input: s = "abc", shifts = [3,5,9]
//Output: "rpl"
//Explanation: We start with "abc".
//After shifting the first 1 letters of s by 3, we have "dbc".
//After shifting the first 2 letters of s by 5, we have "igc".
//After shifting the first 3 letters of s by 9, we have "rpl", the answer.