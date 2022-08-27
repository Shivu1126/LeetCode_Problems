package Day13;
import java.util.*;
public class Length_of_Longest_Fibonaci_sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		int count=0,max=0;
		for(int i=0;i<size-2;i++)
		{
			for(int j=i+1;j<size-1;j++)
			{
				count=2;
				int t=arr[i]+arr[j];
				int d=arr[j];
				for(int k=j+1;k<size;k++)
				{
					if(t==arr[k])
					{
						count++;
						t=t+d;
						d=arr[k];
					}
				}
				if(count>=max)
					max=count;
			}
		}
		System.out.println(max);
		s.close();
	}

}
