package Day4;
import java.util.*;
public class Reverse_vowel_of_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String");
		String str=sc.next();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' )
				rev+=str.charAt(i);
		}
		int j=0;
		char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' )
			{
				arr[i]=rev.charAt(j);
				j++;
			}
		}
		System.out.println(new String(arr));
		sc.close();
	}
}
