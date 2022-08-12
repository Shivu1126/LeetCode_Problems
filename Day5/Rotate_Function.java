package Day5;
import java.util.*;
public class Rotate_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=s.nextInt();
		int k=size;
		int arr[]=new int[size];
		System.out.println("Enter values ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		int max=0,sum=0;
		s.close();
		while(k>0)
		{
			//sum
			for(int i=0;i<size;i++)
			{
				sum=sum+(i*arr[i]);
			}
			
		//	System.out.println(sum);
			

			for(int l=0;l<size;l++)
				System.out.print(arr[l]+" ");
			System.out.print(" = "+sum);
			System.out.println();
			
			
			//find max
			if(sum>max)
			{
				max=sum;
			}
			
			//swap
			int temp=arr[0];			
			for(int j=0;j<size-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[size-1]=temp;
			
			
			sum=0;
			k--;
		}
		System.out.println("Maximum Rotate Function "+max);
	}

}


//Enter size of array
//4
//Enter values 
//1 2 3 4
//Output :
//1 2 3 4  = 20	      (0*1)+(1*2)+(2*3)+(3*4)=20		
//2 3 4 1  = 14		  (0*2)+(1*3)+(2*4)+(3*1)=14	
//3 4 1 2  = 12       (0*3)+(1*4)+(2*1)+(3*2)=12
//4 1 2 3  = 14       (0*4)+(1*1)+(2*2)+(3*3)=14
//Maximum Rotate Function 20
