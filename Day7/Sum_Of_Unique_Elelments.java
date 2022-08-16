package Day7;
import java.util.*;
public class Sum_Of_Unique_Elelments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++)
		{	
			int f=0;
			for(int j=0;j<size;j++)
			{
				if(i!=j)
					if(arr[i]==arr[j])
					{
						f=1;
						arr[j]=0;
					}
			}
			if(f==1)
				arr[i]=0;
			sum+=arr[i];
		}
		System.out.println(sum);
		s.close();
	}
}


//Input: nums = [1,2,3,2]
//Output: 4
//Explanation: The unique elements are [1,3], and the sum is 4