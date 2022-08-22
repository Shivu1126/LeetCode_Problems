package Day8;
import java.util.*;
public class Best_Poker_Hand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		
		int ranks[]=new int[size];
		char suits[]=new char[size];
		
		System.out.println("Enter Ranks");
		for(int i=0;i<size;i++)
		{
			ranks[i]=s.nextInt();
		}
		int count=0;
		System.out.println("Enter suits");
		for(int i=0;i<size;i++)
		{
			suits[i]=s.next().charAt(0);
			if(i!=0)
			{
				if(suits[i]==suits[i-1])
					count++;
			}
		}
		s.close();

		if(count==size-1)
		{
			System.out.println("Flush");
			return;
		}
		
		
		for(int i=0;i<size;i++)
		{
			count=1;
			for(int j=i+1;j<size;j++)
			{
				if(ranks[i]==ranks[j])
					count++;
			}
			if(count>=3)
			{
				System.out.println("Three of a kind");
				return;
			}
			if(count==2)
			{
				System.out.println("Pair");
				return;
			}
		}
		System.out.println("High card");
		
	}

}

//"Flush": Five cards of the same suit.
//"Three of a Kind": Three cards of the same rank.
//"Pair": Two cards of the same rank.
//"High Card": Any single card.

//Input: ranks = [4,4,2,4,4], suits = ["d","a","a","b","c"]
//Output: "Three of a Kind"

//Input: ranks = [13,2,3,1,9], suits = ["a","a","a","a","a"]
//Output: "Flush"
