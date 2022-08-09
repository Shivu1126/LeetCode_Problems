package Day2;
import java.util.*;
public class Unique_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		System.out.println("Enter values ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<n;i++)
		{
			int f=0;
			for(int j=0;j<n;j++)
			{				
				if(i!=j && arr[i]==arr[j])
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.println(arr[i]);
				return;
			}
		}		
	}

}
