package Day11;
import java.util.*;
public class Single_Number_iii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Single Numbers ");
		
		for(int i=0;i<size;i++)
		{
			int f=0;
			for(int j=0;j<size;j++)
			{
				if(i!=j)
				{
					if(arr[i]==arr[j])
						f=1;
				}
			}
			if(f==0)
				System.out.print(arr[i]+" ");
		}
		s.close();
	}

}

//Enter array size
//7
//Enter values
//1 1 3 3 8 9 10
//Single Numbers 
//8 9 10 
