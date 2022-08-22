package Day8;
import java.util.*;
public class Precentage_of_letter_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=s.next();
		System.out.println("Enter letter ");
		char c=s.next().charAt(0);
		float count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
				count++;
			}
		}
		float precentage = count*(100/(float)str.length());
		int ans=(int)precentage;
		System.out.print("Precentage of '"+c+"' in String = "+ans+"%");
		s.close();
	}

}

//Input: str = "foobar", c = "o"
//Output: 33
//Explanation:
//The percentage of characters in str that equal the letter 'o' is 2 * (100/6) = 33% when rounded down,
//so we return 33.