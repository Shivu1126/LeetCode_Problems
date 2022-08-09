package Day2;
import java.util.*;
public class Ugly_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int t=0;
		
		int arr[]=new int[num];
		//find factors
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				arr[t]=i;
				t++;
			}
		}
//		for(int i=0;i<t;i++)
//		{
//			System.out.println(arr[i]+" ");
//		}
		sc.close();
		for(int i=0;i<t;i++)
		{
			if(arr[i]>5)
			{
				if(Check(arr[i]))
				{
					System.out.println("FALSE");
					return ;
				}
			}
		}
		System.out.println("TRUE");
	}
	public static boolean Check(int n)
	{
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;		
	}

}
