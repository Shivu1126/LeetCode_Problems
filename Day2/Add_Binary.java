package Day2;
import java.util.*;
public class Add_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st and 2nd binary ");
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		
		int rem=0,sum=0,m=1,t=0;
		while(b1>0 && b2>0)
		{
			t=(b1%10 +b2%10)+rem;
			sum=sum+(t%2)*m;
			if(t/2==1)
				rem=t/2;
			else
				rem=0;
			m*=10;
			b1/=10;
			b2/=10;
		}
		while(b1>0)
		{
			t=(b1%10)+rem;
			sum=sum+(t%2)*m;
			if(t/2==1)
				rem=t/2;
			else
				rem=0;
			m*=10;
			b1/=10;
		}
		while(b2>0)
		{
			t=(b2%10)+rem;
			sum=sum+(t%2)*m;
			if(t/2==1)
				rem=t/2;
			else
				rem=0;
			m*=10;
			b2/=10;
		}
		if(rem>0)
			sum=sum+(rem*m);
		
		System.out.println(sum);
		sc.close();
	}

}
