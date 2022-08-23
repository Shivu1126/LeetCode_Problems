package Day9;
import java.util.*;
public class Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int arr[][]=new int[size][size];
		System.out.println("Enter values");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				arr[i][j]=s.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Before Rotate :");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("After Rotate :");
		
		for(int j=0;j<size;j++)
		{
			for(int i=size-1;i>=0;i--)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		s.close();
	}

}
