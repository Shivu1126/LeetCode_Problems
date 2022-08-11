package Day4;
import java.util.*;
public class Move_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int index=size;
		int last=size-1;
		System.out.println("Enter values");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		
			if(arr[i]==0)
			{
				arr[last--]=arr[i];		
				i--;
				size--;
			}				
		}
		for(int i=0;i<index;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
