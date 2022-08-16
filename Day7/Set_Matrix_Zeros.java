package Day7;
import java.util.*;
public class Set_Matrix_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter row and column size ");
		int r=s.nextInt();
		int c=s.nextInt();
		int matrix[][]=new int[r][c];
		
		int row[]=new int[r];Arrays.fill(row, 1);
		int col[]=new int[c];Arrays.fill(col, 1);
		System.out.println("Enter values ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{	
				matrix[i][j]=s.nextInt();
				if(matrix[i][j]==0)
				{
					row[i]=0;
					col[j]=0;
				}
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(row[i]==0 || col[j]==0)
				{
					matrix[i][j]=0;
				}
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();		
		}
		s.close();
	}
}

//Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]