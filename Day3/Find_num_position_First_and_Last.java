package Day3;
import java.util.*;
public class Find_num_position_First_and_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter target ");
		int target=sc.nextInt();
		
		int index[]=new int[n];
		int k=0;
		System.out.println("Enter values ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]==target)
			{
				index[k]=i;
				k++;
			}
		}
		if(k==0)
			System.out.println("-1,-1");
		else
			System.out.println("["+index[0]+","+index[k-1]+"]");
		sc.close();
	}

}
