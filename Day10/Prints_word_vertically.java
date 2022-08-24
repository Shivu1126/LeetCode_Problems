package Day10;
import java.util.*;
public class Prints_word_vertically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		
		String arr[]=str.split(" ");
		
		int max_len=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>max_len)
				max_len=arr[i].length();
		}
		
		int k=0,n=0,j=0;
		while(k<max_len)
		{
			int i=0;
			while(i<arr.length)
			{
				char c[]=arr[i].toCharArray();
				j=n;
				while(j<c.length && j<n+1)
				{
					System.out.print(c[j]);
					j++;
				}
				i++;
			}
			System.out.print(" ");
			n++;
			k++;
		}
		s.close();
	}

}
