package Day9;
import java.util.*;
public class Self_Dividing_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter starting number");
		int start=s.nextInt();
		System.out.println("Enter ending number");
		int end=s.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			if(i%10==0)
			{
				continue;
			}
			else
			{
				int k=0,c=0;
				int t=i;
				while(t>0)
				{
					int rem=t%10;
					if(i%rem==0)
					{
						c++;
					}
					k++;
					t/=10;
				}
				if(c==k)
					System.out.print(i+" ");
			}
		}
		s.close();
	}

}

//Input: left = 1, right = 22
//Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]

//For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.