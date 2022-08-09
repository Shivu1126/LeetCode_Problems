package Day2;
import java.util.*;
public class Search_Insert_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size ");
		int n=sc.nextInt();
		
		System.out.println("Enter array ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target ");
		int tar=sc.nextInt();
		sc.close();

		if(tar>=arr[n-1])
		{
			System.out.println(n);
			return;
		}
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]<=tar && arr[i+1]>=tar)
			{
				System.out.println(i+1);
				break;
			}
		}
	}

}
