package Day4;
import java.util.*;
public class Shortest_Unsorted_Continues_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=0;
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					k=j;
				}
			}
		}
		sc.close();
		System.out.println(k);
	}

}
