package Day15;
import java.util.*;
public class Check_if_all_characters_have_equal_number_of_occurences {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string..");
		String str=s.next();
		
		int arr[]=new int[str.length()];
		int k=0;
		int visit[]=new int[str.length()];
		Arrays.fill(visit,-1);
		for(int i=0;i<str.length();i++)
		{	
			int count=1;			
			if(visit[i]==-1)
			{
				for(int j=0;j<str.length();j++)
				{
					if(i!=j && str.charAt(i)==str.charAt(j))
					{
						count++;
						visit[i]=0;
					}
				}
				arr[k++]=count;
			}			
		}
		int f=0;
		for(int i=0;i<k-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				f=1;
				System.out.println(false);
				break;
			}
		}
		if(f==0)
			System.out.println(true);
		s.close();
		
	}

}

//Input: s = "abacbc"
//Output: true
//Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.