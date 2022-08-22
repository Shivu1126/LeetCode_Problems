package Day8;
import java.util.*;
public class Find_three_consecutive_integers_that_sum_to_a_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		int i=1;
		boolean b=true;
		int a=0;
		while(b)
		{
			a=(i)+(i+1)+(i+2);
			if(a==n)
			{
				System.out.print(i+" "+(i+1)+" "+(i+2)+" ");
				b=false;
			}
			i++;
		}
		s.close();
	}

}
