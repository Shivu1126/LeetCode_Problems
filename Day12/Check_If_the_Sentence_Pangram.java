package Day12;
import java.util.*;
public class Check_If_the_Sentence_Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		int arr[]=new int[26];
		Arrays.fill(arr, -1);
		if(str.length()<26)
			System.out.println("False");
		else
			for(int i=0;i<str.length();i++)
			{
				int index=str.charAt(i)-'a';
				arr[index]=0;
			}
		int temp=0;
		for(int i=0;i<26;i++)
		{
			if(arr[i]==-1)
			{
				temp=1;
				System.out.println("False");
				break;
			}
		}
		if(temp==0)
			System.out.println("True");
		s.close();
	}

}

//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.