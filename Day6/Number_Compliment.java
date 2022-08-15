package Day6;
import java.util.*;
public class Number_Compliment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int num=s.nextInt();
		
		int arr[]=new int[3];
		int i=0;
		while(num>0)
		{
			arr[i++]=num%2;
			num/=2;
			arr[i-1] = arr[i-1]==0?1:0;
			
		}
		int sum=0,k=0;
		for(int j=i-1;j>=0;j--)
		{
			sum+=(arr[j]*Math.pow(2, k));
			k++;
		}
		System.out.println("Compliment "+sum);
		s.close();
	}

}
//
//Input: num = 5
//Output: 2
//Explanation: The binary representation of 5 is 101 (no leading zero bits),
//			 and its complement is 010. So you need to output 2.