package Day3;
import java.util.*;
public class Sliding_Window_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter key ");
		int key=sc.nextInt();
		int max;
		for(int i=0;i<=size-key;i++)
		{
			max=0;
			for(int j=i;j<i+key;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
				}
			}
			System.out.print(max+" ");
		}
		sc.close();
	}

}
