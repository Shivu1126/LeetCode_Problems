package Day7;
import java.util.*;
public class Kth_Factor_of_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N value");
		int N=s.nextInt();
		System.out.println("Enter k value");
		int k=s.nextInt();
		int fact=0,count=0;
		for(int i=1;i<=N;i++)
		{
			if(N%i==0)
			{
				fact=i;
				count++;
			}
			if(count==k)
				break;
		}
		if(count!=k)
			System.out.println(-1);
		else
			System.out.println(fact);
		s.close();
	}

}

//Input: n = 12, k = 3
//Output: 3
//Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3