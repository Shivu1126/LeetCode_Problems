package Day5;
import java.util.*;
public class Monotonic_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size ");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		int in=0,de=0;
		for(int i=0;i<size-1;i++)
		{
			if(arr[i]<=arr[i+1])
				in++;
			if(arr[i]>=arr[i+1])
				de++;
		}
		if(in==size-1 || de==size-1)
			System.out.println(true);
		else
			System.out.println(false);
		s.close();
	}

}
