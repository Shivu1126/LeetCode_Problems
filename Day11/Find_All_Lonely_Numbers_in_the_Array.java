package Day11;
import java.util.*;
public class Find_All_Lonely_Numbers_in_the_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array values");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Lonely Numbers");
		for(int i=0;i<size;i++)
		{
			int high=arr[i]+1;
			int low=arr[i]-1;
			int f=0;
			
			for(int j=0;j<size;j++)
			{
				if(i!=j)
					if(arr[j]==high || arr[j]==low || arr[j]==arr[i])
					{
						f=1;
					}
			}
			if(f==0)
				System.out.print(arr[i]+" ");
		}
		s.close();
	}

}

//Input: nums = [10,6,5,8]
//Output: [10,8]
//Explanation: 
//- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
//- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
//- 5 is not a lonely number since 6 appears in nums and vice versa.
//Hence, the lonely numbers in nums are [10, 8].
//Note that [8, 10] may also be returned.