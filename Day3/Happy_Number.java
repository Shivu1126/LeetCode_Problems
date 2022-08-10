package Day3;
import java.util.*;
public class Happy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente number ");
		int num=sc.nextInt();
		int sum=0;
		while(num>0 || sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			int rem=num%10;
			sum=sum+(rem*rem);
			num/=10;			
		}
		System.out.println(sum==1);
		sc.close();
	}

}
