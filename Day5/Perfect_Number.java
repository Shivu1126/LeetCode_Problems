package Day5;
import java.util.*;
public class Perfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			System.out.println(true);
		else
			System.out.println(false);
		s.close();
	}

}


//Input: num = 28
//Output: true
//Explanation: 28 = 1 + 2 + 4 + 7 + 14
//1, 2, 4, 7, and 14 are all divisors of 28.