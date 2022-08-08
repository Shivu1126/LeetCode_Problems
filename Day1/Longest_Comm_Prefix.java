package Day1;
import java.util.*;
public class Longest_Comm_Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		String str[]=new String[size];
		for(int i=0;i<size;i++)
		{
			str[i]=sc.next();
		}
		int f=0,index=-1;
		for(int i=0;i<size;i++)
		{
			f=1;
			for(int j=1;j<size;j++)
			{
				if(str[0].charAt(i)!=str[j].charAt(i))
				{
					f=0;
					break;
				}				
			}
			if(f==1)
				index=i;
			else
				break;			
		}
		if(index!=-1)
			for(int i=0;i<=index;i++)
				System.out.print(str[0].charAt(i));
		else
			System.out.println("Not Match");
		
		sc.close();
	}

}
