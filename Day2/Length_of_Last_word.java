package Day2;
import java.util.*;
public class Length_of_Last_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		int len=str.length();
		int index=0;
		for(int i=len-1;i>=0;i--)
		{
			if(str.charAt(i)!=' ')
			{
				index=i;
				break;
			}
		}
		int count=0;
		for(int i=index;i>=0;i--)
		{
			if(str.charAt(i)!=' ')
				count++;
			else
				break;
			
		}
		System.out.println(count);
		sc.close();
	}

}
/*
input : hey shiv how are you
ouput : 3
explanation: last word length is '3'


*/