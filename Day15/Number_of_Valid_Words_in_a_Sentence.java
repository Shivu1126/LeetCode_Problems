package Day15;
import java.util.*;
public class Number_of_Valid_Words_in_a_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String..");
		String str=s.nextLine();
		
		String arr[]=str.split(" ");
		int output=0;
		for(int i=0;i<arr.length;i++)
		{
			String t=arr[i];
			int count=0;
			for(int j=0;j<t.length();j++)
			{
				if((t.charAt(j)>='a'&& t.charAt(j)<='z') || (t.charAt(j)>='A' && t.charAt(j)<='Z') )
				{
					count++;
				}
			}
			if(t.length()==count && count!=0)
				output++;						
		}
		
		System.out.println(output);
		s.close();
	}

}

//Input: sentence = "alice and  bob are playing stone-game10"
//Output: 5
//Explanation: The valid words in the sentence are "alice", "and", "bob", "are", and "playing".
//"stone-game10" is invalid because it contains digits.