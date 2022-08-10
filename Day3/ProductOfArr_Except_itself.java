package Day3;
import java.util.*;
public class ProductOfArr_Except_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=1;
		for(int i=0;i<size;i++)
		{
			sum=1;
			for(int j=0;j<size;j++)
			{
				if(i!=j)
				{
					sum=sum*arr[j];
				}
			}
			System.out.print(sum+" ");
		}
		sc.close();
	}

}
