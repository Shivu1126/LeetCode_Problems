package Day5;
import java.util.*;
public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter arr1 and arr2 sizes ");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		System.out.println("Enter arr1 values ");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=s.nextInt();
		}
		System.out.println("Enter arr2 values ");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=s.nextInt();
		}
		
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					if(j+1!=n2)
						if(arr2[j]<arr2[j+1])
							System.out.print(arr2[j+1]+" ");
						else
							System.out.print(-1+" ");
					else
						System.out.print(-1+" ");
				}
			}
		}
		s.close();
	}

}
