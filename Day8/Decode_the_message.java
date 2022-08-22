package Day8;
import java.util.*;
public class Decode_the_message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the key");
		String str=s.nextLine();
		System.out.println("Enter the message");
		String msg=s.nextLine();
		char c='a';
		char arr[]=new char[26];
		//Store a to z character 
		for(int i=0;i<26;i++)
		{
			arr[i]=c;
			c++;
		}
		
		char letters[]=new char[str.length()];
		int k=0;
		
		//Remove space and add char arr
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ') 
			{
				letters[k]=str.charAt(i);
				//System.out.print(letters[k]);
				k++;
			}
		}
	//	System.out.println(k);
	
		
		//Remove Duplicate character
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				if(letters[i]==letters[j])
				{
					int p=j;
					for(int l=j+1;l<k;l++)
					{
						letters[p]=letters[l];
						p++;
					}
					k--;
				}
			}
		}
		
		
		String new_msg="";
		for(int i=0;i<msg.length();i++)
		{
			if(msg.charAt(i)==' ')
			{
				new_msg+=" ";
				continue;
			}
			
			for(int j=0;j<k;j++)
			{
				if(msg.charAt(i)==letters[j])
				{
					new_msg+=arr[j];
				}
			}
		}
		System.out.println("New Message");
		System.out.println(new_msg);
		s.close();
		
		
	}

}

