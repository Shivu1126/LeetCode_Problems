package Day1;
import java.util.*;
public class Remove_Duplicate_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j++]=arr[n-1];
		
		System.out.println(j);
		
		for(int i=0;i<j;i++)
		{
			System.out.print(temp[i]+" ");
		}
		sc.close();
	}

}
