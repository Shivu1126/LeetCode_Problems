package Day13;
import java.util.*;
public class Prime_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=s.nextInt();
		n++;
		boolean b=true;
		while(b)
		{
				int sum=0;
				int temp=n;
				while(temp>0)
				{
					int rem=temp%10;
					sum=sum*10+rem;
					temp/=10;
				}
				if(sum==n)
				{
					if(checkPrime(n))
					{
						System.out.println("Next prime palindrome is "+n);
						b=false;
					}
				}
				n++;
		}
		s.close();
	}
	static boolean checkPrime(int n)
	{
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
