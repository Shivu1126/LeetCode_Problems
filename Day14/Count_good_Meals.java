package Day14;
import java.util.*;
public class Count_good_Meals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values..");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(checkPowOf2(arr[i]+arr[j]))
					count++;
			}
		}
		System.out.println(count);
		s.close();
	}

	public static boolean checkPowOf2(int n)
	{
		int k=1;
		while(k<=n)
		{
			if(n==Math.pow(2, k))
			{
				return true;
			}
			k++;
		}
		return false;
	}
}

//Input: deliciousness = [1,3,5,7,9]
//Output: 4
//Explanation: The good meals are (1,3), (1,7), (3,5) and, (7,9).
//Their respective sums are 4, 8, 8, and 16, all of which are powers of 2.