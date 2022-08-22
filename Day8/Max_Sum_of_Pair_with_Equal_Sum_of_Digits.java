package Day8;
import java.util.*;
public class Max_Sum_of_Pair_with_Equal_Sum_of_Digits {

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
		int output=0,max=0;
		for(int i=0;i<size;i++)
		{
			int n=sum_of_digit(arr[i]);			
			for(int j=i+1;j<size;j++)
			{
				int temp=sum_of_digit(arr[j]);
				if(temp==n)
				{
					output=arr[i]+arr[j];
					if(output>max)
						max=output;
				}
			}
		}
		System.out.println("Maximum Sum of Pair with Equal Sum of Digits "+max);
		s.close();
	}
	static int sum_of_digit(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		return sum;
	}

}
