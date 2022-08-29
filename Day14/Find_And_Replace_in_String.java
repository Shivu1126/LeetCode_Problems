package Day14;
import java.util.*;
public class Find_And_Replace_in_String {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String...");
		String str=s.next();
		int size=str.length();
		String arr[] = new String[size];
		for(int i=0;i<str.length();i++)
		{
			arr[i]=""+str.charAt(i);
		}
		
		
		System.out.println("Enter the indeces size");
		int ind_size=s.nextInt();
		
		int indeces[]=new int[ind_size];
		System.out.println("Enter indeces..");
		for(int i=0;i<ind_size;i++)
			indeces[i]=s.nextInt();
		
		String sources[]=new String[ind_size];
		System.out.println("Enter sources..");
		for(int i=0;i<ind_size;i++)
			sources[i]=s.next();
		
		String targets[]=new String[ind_size];
		System.out.println("Enter targets..");
		for(int i=0;i<ind_size;i++)
			targets[i]=s.next();
		
		
		for(int i=0;i<ind_size;i++)
		{
			for(int k=0;k<str.length();k++)
			{
				if(str.charAt(k)==sources[i].charAt(0))
				{
					if(k!=indeces[i])
						break;
					int count=0,j;
					for(j=k;j<str.length();j++)
					{							
						if(sources[i].length()==count)
							break;
						if(str.charAt(j)==sources[i].charAt(count))
						{
							count++;
						}
						else
						{
							break;
						}
					}
					System.out.println(j);
					if(count==sources[i].length())
					{
						arr[k]=targets[i];
						int d=sources[i].length()-1;
						for(int n=0;n<d;n++)
						{
							k++;
							arr[k]="";
						}
					}
				}
			}
		}
		
		for(int i=0;i<size;i++)
			System.out.print(arr[i]);
		
		s.close();
	}

}

//Input: s = "abcd", indices = [0, 2], sources = ["ab","ec"], targets = ["eee","ffff"]
//Output: "eeecd"
//Explanation:
//"ab" occurs at index 0 in s, so we replace it with "eee".
//"ec" does not occur at index 2 in s, so we do nothing
