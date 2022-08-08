package Day1;
import java.util.*;
public class Palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		int tem=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num/=10;
		}
		//System.out.println(sum);
		if(tem==sum)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		sc.close();
	}

}
