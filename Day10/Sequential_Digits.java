package Day10;
import java.util.*;
public class Sequential_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter low value");
		int low=s.nextInt();
		System.out.println("Enter high value ");
		int high=s.nextInt();
		
		System.out.println("Sequential Digits Numbers are...");
		for(int i=low;i<=high;i++)
		{
			int j=i,n=0;
			int rem1=0,rem2=0;
			int ch=0;
			
			rem1=j%10;
			j/=10;
			
			while(j>0)
			{		
				rem2=j%10;
				if(rem1-rem2==1)
				{
					ch++;
					rem1=rem2;
				}
				n++;
				j/=10;				
			}
		//	System.out.println(ch+" "+n);
			if(ch==n)
				System.out.print(i+" ");
		}
		s.close();
	}

}

//Input: low = 1000, high = 13000
//Output: [1234,2345,3456,4567,5678,6789,12345]