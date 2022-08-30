package Day15;
import java.util.*;
public class sum_of_absolute_differences_in_a_sorted_array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size..");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values...");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			int sum=0;
			for(int j=0;j<size;j++)
			{
				int a=arr[i]-arr[j];
				if(a<0)
					a=-a;
				sum+=a;
			}
			System.out.print(sum+" ");
		}
		s.close();
	}

}

//Input: nums = [2,3,5]
//Output: [4,3,5]
//Explanation: Assuming the arrays are 0-indexed, then
//result[0] = |2-2| + |2-3| + |2-5| = 0 + 1 + 3 = 4,
//result[1] = |3-2| + |3-3| + |3-5| = 1 + 0 + 2 = 3,
//result[2] = |5-2| + |5-3| + |5-5| = 3 + 2 + 0 = 5.