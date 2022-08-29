package Day14;

import java.util.*;

public class Minimum_increment_to_make_the_array_Unique{
	
	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array values");
		for(int i=0;i<size;i++)
			arr[i]=s.nextInt();
		int count=0;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i!=j)
					if(arr[i]==arr[j])
					{
						count++;
						arr[i]++;
						j=-1;
						continue;
					}
			}
		}
		System.out.println(count);
		s.close();
	}
	
}

//Input: nums = [3,2,1,2,1,7]
//Output: 6
//Explanation: After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
//It can be shown with 5 or less moves that it is impossible for the array to have all unique values.