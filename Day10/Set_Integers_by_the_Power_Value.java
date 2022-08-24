package Day10;
import java.util.*;
public class Set_Integers_by_the_Power_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter low value");
		int low=s.nextInt();
		System.out.println("Enter high value ");
		int high=s.nextInt();
		System.out.println("Enter target index");
		int index=s.nextInt();
		
		int arr[]=new int[(high-low)+1];		//Value array
		int temp[]=new int[(high-low)+1];		//Count array
		int k=0;
		for(int i=low;i<=high;i++)
		{
			arr[k]=i;						//Stored the value in value array
			int n=i,count=0;
			while(n!=1)
			{
				if(n%2==0)
					n=n/2;
				else
					n=(3 * n) + 1;
				count++;				//Counting					
			}
			
			temp[k]=count;			//Stored the power of 'i' count in count array 
			k++;					//Index
		}
		
		//Sorting count array and value array for get target index
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				if(temp[i]>temp[j])
				{
					int t=temp[i];
					temp[i]=temp[j];
					temp[j]=t;
					
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		
		System.out.println("The "+index+"position in the sorted array is "+arr[index-1]);
		
		s.close();
	}

}

//if x is even then x = x / 2
//if x is odd then x = 3 * x + 1

//For example, the power of x = 3 is 7 
//because 3 needs 7 steps to become 1 (3 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2 --> 1).

//Input: low = 7, high = 11, target = 4
//Output: 7
//Explanation: The power array corresponding to the interval [7, 8, 9, 10, 11] is [16, 3, 19, 6, 14].
//The interval sorted by power is [8, 10, 11, 7, 9].
//The fourth number in the sorted array is 7.