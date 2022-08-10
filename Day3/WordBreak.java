package Day3;
import java.util.*;
public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.next();
		System.out.println("Enter word array size");
		int size=sc.nextInt();
		String wordArr[]=new String[size];
		String word="";
		for(int i=0;i<size;i++)
		{
			word+=wordArr[i]=sc.next();
		}
		int s=0,k=0;
		for(int i=0;i<str.length();i++)
		{
			if(word.charAt(k)==str.charAt(i))
				s++;k++;
			if(word.length()<str.length())
				break;
		}
		if(s==str.length())
			System.out.print("True");
		else
			System.out.println("False");
		sc.close();
	}

}
