package Day4;
import java.util.*;
public class Keyboard_row_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String row1="qwertyuiop";
		String row2="asdfghjkl";
		String row3="zxcvbnm";
		System.out.println("Enter size");
		int size=sc.nextInt();
		String arr[]=new String[size];
		System.out.println("Enter Strings");
		for(int i=0;i<size;i++)
			arr[i]=sc.next();
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<row1.length();j++)
			{
				if(arr[i].charAt(0)==row1.charAt(j))
					if(check(arr[i],row1))
						System.out.println(arr[i]);
			}
			for(int j=0;j<row2.length();j++)
			{
				if(arr[i].charAt(0)==row2.charAt(j))
					if(check(arr[i],row2))
						System.out.println(arr[i]);
			}
			for(int j=0;j<row3.length();j++)
			{
				if(arr[i].charAt(0)==row3.charAt(j))
					if(check(arr[i],row3))
						System.out.println(arr[i]);
			}
		}
		sc.close();
	}
	static boolean check(String str,String row)
	{
		
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<row.length();j++)
			{
				if(str.charAt(i)==row.charAt(j))
				{
					count++;
				}
			}
		}
		if(str.length()==count)
			return true;
		else
			return false;
	}
	
}
