package Day3;
import java.util.*;
public class Number_of_Digit_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum+=count(i);
		}
		System.out.println(sum);
		sc.close();
	}

	public static int count(int n)
	{
		int cnt=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem==1)
				cnt++;
			n/=10;
		}		
		return cnt;
	}
	
}
