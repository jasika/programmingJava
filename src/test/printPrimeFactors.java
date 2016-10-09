package test;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Print prime facotrs of a number
public class printPrimeFactors {
	public static void printFactors(int n) {
		ArrayList<Object> primefactors = new ArrayList<>(); //Print all values
		//Set<Integer> primefactors = new HashSet<>(); //repetition of values not allowed.		
		long copyOfInput = n; 
		while(copyOfInput%2==0)
		{   long val=(copyOfInput/2);
			primefactors.add(2);
			System.out.println("Val in while "+val);
			copyOfInput=val;
		}
		for (int i = 3; i <= copyOfInput; i+=2) 
		{  System.out.println("Val of I "+i);
			if (copyOfInput % i == 0) 
		{
		primefactors.add(i); // prime factor 
		copyOfInput /= i;
		System.out.println("copyOfInput "+copyOfInput);
		i-=2; 
		} 
		}				 
		 System.out.println(primefactors);
		}	
	
	public static void main(String[] args) {
		printFactors(73);
	}
}

/* Different format response
 * 
 * class PrimeFactors
{
public static void main() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n;
System.out.print(“Enter a Number : “);
n=Integer.parseInt(br.readLine());

int i=2;
while(n>1)
{
if(n%i == 0)
{
System.out.println(i+”t| “+n);
n=n/i;
}
else
i++;
}
System.out.println(“t| 1”);
}
}*/
