package Day7;
import java.util.*;
public class Sum_of_Muted_Array_Closest_Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size ");
		int n=s.nextInt();
		System.out.println("Enter values ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter target ");
		int target=s.nextInt();
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		
		int out=0;
		for(int i=0;i<n;i++)
		{
			int t=arr[i];
			while(t<target)
			{
				t=t+arr[i];
			}
			int check=t<=target?t:t-arr[i];
			if(target-check<=max)
			{
				max=target-check;
				out=arr[i];
			}
		}
		System.out.println(out);
		s.close();
	}

}
