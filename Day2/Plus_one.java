package Day2;
import java.util.*;
public class Plus_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res[]=new int[n+1];
		int a=n-1;
		int add=arr[a]+1;
		int k=0,q=0;
		if(add<10)
		{
			arr[a]=add;
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		else
		{
			a=a-1;
			while(a>=0)
			{
				
				if(add>9) 
				{
					int rem=add%10;
					q=add/10;
					res[k]=rem;
					k++;
					add=arr[a]+q;
				}
				else
				{
					res[k]=add;
					k++;
					q=0;
					break;
				}
				a--;
			}
			
			if(a==-1 && add<10)
			{
				res[k]=add;
				k++;
			}
			if(a==-1 && add==10)
			{
				while(add>0)
				{
					
					int l=add%10;
					res[k]=l;
					add=add/10;
					k++;
				}
			}
			
			while(a>=0)
			{
				res[k]=arr[a]+q;
				a--;
				k++;
			}
			for(int i=k-1;i>=0;i--)
			{
				System.out.print(res[i]+" ");
			}
		}
		sc.close();
		
	}

}
/*
input : 8 9
output: 9 0

input : 9 9 9
output: 1 0 0 0
*/
