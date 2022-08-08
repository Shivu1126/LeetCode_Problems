package Day1;
import java.util.*;
public class Remove_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter element ");
		int rem=sc.nextInt();
		System.out.println("Enter array : ");
		int c=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]==rem)
			{
				c++;
			}
		}
		System.out.println("count = "+c);
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=rem)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		sc.close();
		
	}

}
