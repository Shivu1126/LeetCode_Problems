package Day13;
import java.util.*;
public class Count_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=s.nextInt();
		
		System.out.println("Prime numbers of "+n);
		int count=0;
		for(int i=2;i<=n;i++)
		{
			if(checkPrime(i))
			{
				count++;
			}
		}
		System.out.println(count);
		s.close();
	}
	public static boolean checkPrime(int num)
	{
		
		for(int j=2;j<=num/2;j++)
		{
			if(num%j==0)
				return false;
		}
		
		return true;
		
	}
}

//Input: n = 10
//Output: 4
//Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.