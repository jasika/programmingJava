package test;

public class Palindrome {
	public static void main(String [] args){
	System.out.println(isPalindrome(13431));
	}	
	public static boolean isPalindrome(int n){
		int rem;
		int num=n;
		int rev=0 ;
		System.out.println("n "+n);
		while(n > 0){		
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		System.out.println("rev** "+rev);		
		 if(rev == num)
		{	System.out.println("rev "+rev);		
			return true;	}		
		else 
			{	System.out.println("n "+n);
			return false;}
	}
}