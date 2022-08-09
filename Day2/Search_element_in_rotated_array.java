package Day2;
import java.util.*;
public class Search_element_in_rotated_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values ");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Rotated size");
		int rot=sc.nextInt();
		int k,temp;
		for(int i=0;i<rot;i++)
		{
			temp=arr[0];
			for(k=0;k<n-1;k++)
			{
				arr[k]=arr[k+1];
			}
			arr[k]=temp;
		}
		System.out.println("Enter Search element ");
		int target=sc.nextInt();
		int v=0;
		for(int i=0;i<n;i++)
		{
			if(target==arr[i])
			{
				v=1;
				System.out.print(i);
				break;
			}
		}
		if(v==0)
			System.out.println(-1);
		sc.close();
	}

}
