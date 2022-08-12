package Day5;
import java.util.*;
public class Contains_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		s.close();

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i!=j)
					if(arr[i]==arr[j])
					{
						System.out.println("True");
						return ;
					}
			}
		}
		System.out.println("False");
	}

}
