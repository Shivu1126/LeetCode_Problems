package Day4;
import java.util.*;
public class Power_of_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		System.out.println("Enter target ");
		int target=sc.nextInt();
		int t=1,sum=n;
		
		for(int i=1;i<=target;i++)
		{
			sum=sum*n;
			if(sum==target)
			{
				t=0;
				System.out.println("True");
				break;
			}
			if(sum>target)
			{
				t=1;
				break;
			}
		}
		if(t==1)
			System.out.print("False");
		sc.close();
	}

}
