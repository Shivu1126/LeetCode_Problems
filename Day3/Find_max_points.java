package Day3;
import java.util.*;
public class Find_max_points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many points..");
		int n=sc.nextInt();
		int p1[]=new int[n];
		int p2[]=new int[n];
		
		System.out.println("Enter points..");
		for(int i=0;i<n;i++)
		{
			p1[i]=sc.nextInt();
			p2[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(p1[i]==p2[j])
				{
					if(p1[i]>max)
					{
						max=p1[i];
					}
				}
			}
		}
		System.out.println(max);
		sc.close();
	}

}
