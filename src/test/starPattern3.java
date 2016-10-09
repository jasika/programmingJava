package test;
//print 6 stars , find why ?Anwer below
public class starPattern3 {
	public static void main(String args[])
	{
		int i,j,n=5;
		for (i=0;i<=n;i++) //row
		{
			for (j=0;j<=n;j++) //column
			{
				if(j==0|i==(n)|j==(n))
				System.out.print("*");		
				else {System.out.print(" ");}
			}
			System.out.println("");
		}		
	}
}













//Anwer because counter start s from 0 and goes to lees than equal to