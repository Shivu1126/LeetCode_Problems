package Day3;
import java.util.*;
public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int n=sc.nextInt();
		
		System.out.print("[");
		for(int i=1;i<=n;i++)
		{
			int t=1;
			System.out.print(" [ ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(t+" ");
				t=t*(i-j)/j;
			}
			System.out.print(" ] ");
		}
		System.out.print("]");
		sc.close();
	}

}
