package Day6;
import java.util.*;
public class Max_Consecutive_Ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array values ");
		int k=0,count=1;
		
		int max[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			if(i!=0)
			{
				if(arr[i]==arr[i-1])
					count++;
				else
				{
					max[k]=count;
					count=1;
					k++;
				}
			}
		}
		max[k]=count;k++;
		
		int ans=0;
		for(int j=0;j<k;j++)
		{
			if(max[j]>ans)
				ans=max[j];
		}
		System.out.println(ans);
		s.close();
	}

}
//
//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s.
//		     The maximum number of consecutive 1s is 3.