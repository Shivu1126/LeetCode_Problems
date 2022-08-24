package Day10;
import java.util.*;
public class Spiral_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter matrix row and column size ");
		int row=s.nextInt();
		int col=s.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("Enter the values");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("Normal way");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println("Spiral way ");
		int k=0,l=0,i;
		while(k<row && l<col)
		{
			for(i=l;i<col;i++)
				System.out.print(arr[k][i]+" ");
			k++;
			
			for(i=k;i<row;i++)
				System.out.print(arr[i][col-1]+" ");
			col--;
			
			if(k<row)
			{
				for(i=col-1;i>=l;i--)
					System.out.print(arr[row-1][i]+" ");
				row--;
			}
			
			if(l<col)
			{
				for(i=row-1;i>=k;i--)
					System.out.print(arr[i][l]+" ");
				l++;
			}			
		}
		
		s.close();
	}

}
