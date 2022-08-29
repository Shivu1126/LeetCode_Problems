package Day14;
import java.util.*;
public class Ugly_Number_iii {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value..");
		int n=s.nextInt();
		System.out.println("Enter a,b,c values...");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		s.close();

		int temp=0,i;
		for(i=1;;i++)
		{
			if(i%a==0 || i%b==0 || i%c==0 )			
				temp++;
			if(n==temp)
				break;
		}
		System.out.println(i);
	}

}
