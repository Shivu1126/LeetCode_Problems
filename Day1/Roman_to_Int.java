package Day1;
import java.util.*;
public class Roman_to_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.next();
		int tot=0;
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			switch(a) {
			case 'I':
				tot=tot+1;
				break;
			case 'V':
				tot=tot+5;
				break;
			case 'X':
				tot=tot+10;
				break;
			case 'L':
				tot=tot+50;
				break;
			case 'C':
				tot=tot+100;
				break;
			case 'D':
				tot=tot+500;
				break;
			case 'M':
				tot=tot+1000;
				break;
			
			}
				
		}
		for(int i=0;i<str.length()-1;i++)
		{
			
			if((str.charAt(i)=='I' && str.charAt(i+1)=='V') || (str.charAt(i)=='I' && str.charAt(i+1)=='X'))
				tot=tot-2;
			if((str.charAt(i)=='X' && str.charAt(i+1)=='L') || (str.charAt(i)=='X' && str.charAt(i+1)=='C'))
				tot=tot-20;
			if((str.charAt(i)=='C' && str.charAt(i+1)=='D') || (str.charAt(i)=='C' && str.charAt(i+1)=='M'))
				tot=tot-200;
			
		}		
		sc.close();
		System.out.println(tot);
	}

}
