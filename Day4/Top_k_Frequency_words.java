package Day4;
import java.util.*;
public class Top_k_Frequency_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		String arr[]=new String[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=s.next();
		}
		System.out.println("Enter target ");
		int k=s.nextInt();
		int visit[]=new int[size];
		Arrays.fill(visit,0);
		for(int i=0;i<size;i++)
		{
			if(visit[i]==0)
			{
				int count=1;
				for(int j=i+1;j<size;j++)
				{
					if(arr[i].equals(arr[j]))
					{
						visit[j]=-1;
						count++;
					}
				}
				if(count==k)
					System.out.print(arr[i]+" ");
			}
		}
		s.close();
		
	}

}
