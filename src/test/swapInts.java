package test;

public class swapInts {
public static void swap(int a, int b)
{
	a=a+b;
	b=Math.abs(a-b);
	a=Math.abs(b-a);
	
	System.out.println("a = "+a+" b "+b);
	}		
	public static void main(String[] args) 
	{
		swap(2,3);
	}




	
}
