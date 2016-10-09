package test;

public class starpattern2 {
	public static void main(String args[])
	{
		int i,j,n=5;
		for (i=1;i<=n;i++) //row
		{
			for (j=1;j<=i;j++) //column
			{
				System.out.print("*");				
			}
			System.out.println("");
		}		
	}	
}
