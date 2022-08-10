package Day3;
public class Day_Count {
	static int monthDays[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int dt1[]= {26,11,2001};
		int dt2[]= {10,8,2022};
		System.out.println("Total days : "+getDiff(dt1,dt2));
	}
	static int getDiff(int dt1[],int dt2[])
	{
		
		int n1=dt1[2] * 365 +dt1[0];
		for(int i=0;i<dt1[1]-1;i++)
		{
			n1+=monthDays[i];
		}		
		n1+=leap(dt1);
		
		int n2=dt2[2] * 365 +dt2[0];
		for(int i=0;i<dt2[1]-1;i++)
		{
			n2+=monthDays[i];
		}
		n2+=leap(dt2);
		
		return (n2-n1);
	}
	static int leap(int d[])
	{
		int years=d[2];
		if(d[1]<=2)
		{
			years--;
		}
		return years/4 - years/100 + years/400;
	}
}
