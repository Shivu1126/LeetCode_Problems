package Day2;
import java.util.*;
public class Three_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	sc=new Scanner(System.in);
		System.out.println("Enter size ");
		int n=sc.nextInt();
		System.out.println("Enter arr values");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
						System.out.println(arr[i]+","+arr[j]+","+arr[k]);
				}
			}
		}
		sc.close();
	}

}
