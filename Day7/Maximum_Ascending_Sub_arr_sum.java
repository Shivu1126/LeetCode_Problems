package Day7;
import java.util.*;
public class Maximum_Ascending_Sub_arr_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values ");
		int max=0,sum=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		int j;
		for(int i=0;i<size;i++)
		{
			sum=arr[i];
			for(j=i;j<size-1;j++) 
			{
				if(arr[j]<arr[j+1])
					sum+=arr[j+1];	
				else 
					break;
			}
			i=j;
			if(sum > max)
			{
				max=sum;
			}
		}
		System.out.println(max);
		s.close();
	}

}

//Input: nums = [10,20,30,5,10,50]
//Output: 65
//Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65