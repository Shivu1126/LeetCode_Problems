package Day7;
import java.util.*;
public class Find_Lucky_Integer_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size ");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		
		
		int visit[]=new int[size];
		Arrays.fill(visit,0);
		int max=0;
		for(int i=0;i<size;i++)
		{
			if(visit[i]==0)
			{
				int count=0;
				for(int j=0;j<size;j++)
				{
					if(arr[i]==arr[j])
					{
						visit[j]=-1;
						count++;
					}
				}
				if(count==arr[i])
				{
					if(count>max)
						max=count;
				}
			}				
		}
		if(max!=0)
			System.out.println(max);
		else
			System.out.println(-1);
		s.close();
	}

}

//Input: arr = [2,2,3,4]
//Output: 2
//
//Input: arr = [1,2,2,3,3,3]
//Output: 3
//Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them
