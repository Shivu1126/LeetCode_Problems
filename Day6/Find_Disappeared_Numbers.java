package Day6;
import java.util.*;
public class Find_Disappeared_Numbers {

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
		
		Arrays.sort(arr);
		
		for(int i=0;i<n-1;i++)
		{
			if(arr[i+1]-arr[i]==1 || arr[i+1]-arr[i]==0)
			{
				continue;
			}
			else
			{
				for(int k=arr[i]+1;k<arr[i+1];k++)
				{
					System.out.print(k+" ");
				}
			}
		}
		
		
		s.close();
	}

}
