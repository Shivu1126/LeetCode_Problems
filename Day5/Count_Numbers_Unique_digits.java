package Day5;
import java.util.*;
public class Count_Numbers_Unique_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();
		int Number=1;
		while(n>0)
		{
			Number*=10;
			n--;
		}
	//	System.out.println(Number);
		
		int Count=1;
		for(int i=1;i<=Number;i++)
		{
			if(i>9)
				Count=Count+Check(i);
			else
				Count++;
		}
		System.out.print(Count-1);
		s.close();
	}
	static int Check(int n)
	{
		int arr[]=new int[20];
		int rem,i=0;
		while(n>0)
		{
			rem=n%10;
			arr[i]=rem;
			i++;
			n/=10;
		}
		for(int j=1;j<i;j++)
		{
			if(arr[j]!=arr[0])
				return 1;
		}
		return 0;
	}

}


//Input: n = 2
//Output: 91
//Explanation: The answer should be the total numbers in the range of 0 ≤ x < 100,
//			 excluding 11,22,33,44,55,66,77,88,99
