package Day9;
import java.util.*;
public class Sum_of_Even_Numbers_After_Queries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size ");
		int size=s.nextInt();
		int queries[][]=new int[size][2];
		int arr[]=new int[size];
		System.out.println("Enter values ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter Quries values");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<2;j++)
			{
				queries[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<size;i++)
		{		
			int sum=0;
			arr[queries[i][1]]+=queries[i][0];
			for(int j=0;j<size;j++)
			{
				if(arr[j]%2==0)
					sum+=arr[j];
			}
			System.out.print(sum+" ");
		}
		s.close();
		
	}

}
