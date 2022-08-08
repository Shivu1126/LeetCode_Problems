package Day1;
import java.util.*;
public class Merge_SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the arr1 and arr2 size");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		int res[]=new int[n1+n2];
		int k=0;
		System.out.println("Enter 1st array : ");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
			res[k]=arr1[i];
			k+=2;
		}
		System.out.println("Enter 2nd array : ");
		k=1;
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
			res[k]=arr2[i];
			k+=2;
		}
		
		for(int i=0;i<n1+n2;i++)
			System.out.print(res[i]+" ");
		
		sc.close();
	}

}
