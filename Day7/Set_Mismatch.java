package Day7;
import java.util.*;
public class Set_Mismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Array size ");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size-1;i++)
		{
			if(arr[i] != arr[i+1]-1)
			{
				System.out.println(arr[i]+" "+(arr[i+1]+1));
				break;
			}
		}
		s.close();
	}

}
//
//Input: nums = [1,2,2,4]
//Output: [2,3]
