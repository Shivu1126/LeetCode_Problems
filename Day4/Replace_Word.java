package Day4;
import java.util.*;
public class Replace_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter sentence ");
		String str=s.nextLine();
		
		System.out.println("Enter words arr size ");
		int w=s.nextInt();
		String words[]=new String[w];
		System.out.println("Enter words");
		for(int i=0;i<w;i++)
		{
			words[i]=s.next();
		}
		
		String sen[]=str.split(" ");
		
		for(int i=0;i<w;i++)
		{
			for(int j=0;j<sen.length;j++)
			{
				if(sen[j].contains(words[i]))
					sen[j]=words[i];
			}			
		}
		System.out.println("Output : ");
		for(int i=0;i<sen.length;i++)
			System.out.print(sen[i]+" ");
		s.close();
	}

}
