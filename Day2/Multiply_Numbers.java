package Day2;
import java.util.*;
public class Multiply_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int p=1;
		int sum=0;
		while(num2>0)
		{
			int rem=num2%10;
			int mul=(rem*p)*num1;
			sum=sum+mul;
			p*=10;			
			num2/=10;
		}
		System.out.println(sum);
		sc.close();
		
	}
}
