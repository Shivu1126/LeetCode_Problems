package Day6;
import java.util.*;
public class Check_If_array_pairs_divisible_by_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array values ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter k value ");
		int k=s.nextInt();
		s.close();
		for(int i=0;i<n/2;i++)
		{
			int temp=arr[i]+arr[n-1-i];
			if(temp%k != 0)
			{
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
		
	}

}
//
//Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
//Output: true
//Explanation: Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10)