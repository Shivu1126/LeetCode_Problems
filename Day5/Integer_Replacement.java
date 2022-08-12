package Day5;
import java.util.Scanner;
public class Integer_Replacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=s.nextInt();
		int count=0;
		while(n!=1)
		{
			if(n%2==0)
				n/=2;
			else
				n+=1;
			count++;
		}
		System.out.println(count);
		s.close();
	}

}



//Given a positive integer n, you can apply one of the following operations:

//If n is even, replace n with n / 2.
//If n is odd, replace n with either n + 1 or n - 1.
//Return the minimum number of operations needed for n to become 1.

//Input: n = 8
//Output: 3
//Explanation: 8 -> 4 -> 2 -> 1