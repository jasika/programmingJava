package test;

//sb.append( from + ((row + col) % side) );
public class NumberPattern1 {
	public static void main(String args[])
	{
		int i,j,n=5;
		for (i=1;i<n;i++)//row
		{	for (j=i;j<n;j++)
				{
					System.out.print(i+((i+j)%2));					
				}			
     	//	System.out.print(i);
			System.out.println("");
		}		
	}
}
