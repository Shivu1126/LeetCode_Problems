package Day5;
import java.util.*;
public class First_Unique_Char_Index_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.next();
		s.close();

		for(int i=0;i<str.length();i++)
		{
			int c=0;
			for(int j=0;j<str.length();j++)
			{
				if(i!=j)
				{	
					if(str.charAt(i)==str.charAt(j))
					{
						c=1;
						break;
					}
				}
			}
			if(c==0)
			{
				System.out.print(i);
				return;
			}
		}
		System.out.println(-1);
	}

}
