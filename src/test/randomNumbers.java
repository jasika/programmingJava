package test;
//generate numbers in a range
import java.util.Random;

public class randomNumbers {
	public static void generateNumbers(int n, int min, int max) 
	{
		Random r=new Random();
		for (int i =0;i<n;i++)
		{
			System.out.println(r.nextInt((max-min)+1)+min);			
		}	
	}	
public static void main(String[] args) {
	generateNumbers(3,2,5);
	
}


}
