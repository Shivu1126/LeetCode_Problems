package Day6;
import java.util.*;
public class Check_if_N_and_its_Double_Exist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array values ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		s.close();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]==2*arr[j])
				{
					System.out.println(true);
					return;
				}
			}
		}
		System.out.println(false);
	}

}
//
//Input: arr = [10,2,5,3]
//Output: true
//Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5