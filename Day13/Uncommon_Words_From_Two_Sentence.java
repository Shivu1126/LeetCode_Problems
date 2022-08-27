package Day13;
import java.util.*;
public class Uncommon_Words_From_Two_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st sentence");
		String str1=s.nextLine();
		System.out.println("Enter 2nd sentence");
		String str2=s.nextLine();
		
		String arr1[]=str1.split(" ");
		String arr2[]=str2.split(" ");
		
		int visit1[]=new int[arr1.length];
		int visit2[]=new int[arr2.length];
		Arrays.fill(visit1,-1);
		Arrays.fill(visit2,-1);
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(i!=j)
					if(arr1[i].equals(arr1[j]))
					{
						visit1[i]=0;
						visit1[j]=0;
					}
			}
			for(int k=0;k<arr2.length;k++)
			{
				if(arr1[i].equals(arr2[k]))
				{
					visit1[i]=0;
					visit2[k]=0;
				}
						
			}
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			if(visit1[i]==-1)
				System.out.print(arr1[i]+" ");
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(visit2[i]==-1)
				System.out.print(arr2[i]+" ");
		}
		s.close();			
	}
}

//Input: s1 = "this apple is sweet", s2 = "this apple is sour"
//Output: ["sweet","sour"]