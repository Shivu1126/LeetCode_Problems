package Day5;
import java.util.*;
public class Fizz_Buzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=s.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.toString(i+1);
		}
		
		for(int i=0;i<n;i++)
		{
			int k=Integer.parseInt(arr[i]);
			if(k%3==0 && k%5==0)
				arr[i]="FizzBuzz";
			else if(k%3==0)
				arr[i]="Fizz";
			else if(k%5==0)
				arr[i]="Buzz";
			System.out.print(arr[i]+" ");			
		}
		
		s.close();
		
	}

}
