package Day5;
import java.util.*;
public class Elimination_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		int k=1;
		while(size!=1)
		{
			int count=0;
			for(int i=0;i<size;i++)
			{
				if(k<size)
				{
					arr[i]=arr[k];
					k+=2;
					count++;
				}
			}
			
			for(int j=0;j<count;j++)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			
			if(k%2==0)
				k=1;
			else
				k=0;
			size=count;
			
		}
		System.out.print("Output : "+arr[size-1]);
		s.close();
	}

}

//Input: size = 9
// 			[1,2,3,4,5,6,7,8,9]		
//Output: 6
//Explanation:
//arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
//arr = [2, 4, 6, 8]
//arr = [2, 6]
//arr = [6]