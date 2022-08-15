package Day6;
import java.util.*;
public class Find_Number_If_Even_Number_of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array values ");
		
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();	
		}
		for(int i=0;i<n;i++)
		{
			int num=arr[i];
			int count=0;
			while(num>0)
			{
				count++;
				num/=10;
			}
			if(count%2==0)
				System.out.println(arr[i]);
			
		}
		s.close();
	}

}
//
//Input: nums = [12,345,2,6,7896]
//Output: 2
//Explanation: 
//12 contains 2 digits (even number of digits). 
//345 contains 3 digits (odd number of digits). 
//2 contains 1 digit (odd number of digits). 
//6 contains 1 digit (odd number of digits). 
//7896 contains 4 digits (even number of digits). 
//Therefore only 12 and 7896 contain an even number of digits.