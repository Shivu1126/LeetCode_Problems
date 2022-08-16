package Day7;

import java.util.*;

public class Reverse_the_words_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string : ");
		String str=s.nextLine();
		int n=str.length();
		
		char arr[]=new char[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=str.charAt(i);
		}
	
		String rev="";
		for(int i=n-1;i>=0;i--)
		{
			
			
			if( (str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='0' && str.charAt(i)<='9'))
			{		
				rev+=str.charAt(i);
			}
		}
		//System.out.println(rev);
		int j=0;
		for(int i=0;i<n;i++)
		{
			if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z') || (arr[i]>='0' && arr[i]<='9'))
			{
				arr[i]=rev.charAt(j);
				j++;
			}
		}
		System.out.println(new String(arr));
		s.close();
	}

}

/*
 * 	i/p ::: house no 123@ cbe
 * 	o/p ::: ebc32 1o nes@ uoh 	
 * 
 */ 