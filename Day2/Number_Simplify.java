package Day2;
import java.util.*;
public class Number_Simplify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int sum=0;
		while(n>0 ||sum>9 )
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			int rem=n%10;
			sum=sum+rem;
			n=n/10;		
		}
		System.out.println(sum);
		sc.close();
	}

}
