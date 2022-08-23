package Day9;
import java.util.*;
public class Duplicate_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size ");
		int size=s.nextInt();
		int arr[]=new int[size];
		int org[]=new int[2*size];
		int k=0;
		int zero_count=0;
		System.out.println("Enter array values ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
			if(arr[i]==0)
			{
				org[k]=arr[i];
				org[k+1]=arr[i];
				k+=2;
				zero_count++;
			}
			else
			{
				org[k]=arr[i];
				k++;
			}
		}
		k-=zero_count;
		System.out.println("Old array ");
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		
		System.out.println("New array ");
		for(int i=0;i<k;i++)
			System.out.print(org[i]+" ");
		
		s.close();
	}

}
