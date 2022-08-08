package Day1;
import java.util.*;
public class Two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		System.out.println("Enter values");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target : ");
		int t=sc.nextInt();
		
		for(int i=0;i<size-1;i++)
		{
			if(arr[i]+arr[i+1]==t)
			{
				System.out.print("("+i+","+(i+1)+")");
			}
		}
		sc.close();
	}

}
