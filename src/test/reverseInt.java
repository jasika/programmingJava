package test;
//brother of palindrome
public class reverseInt {

	public static void main(String[] args) {
		System.out.println(revInt(1233401));
	}
	public static int revInt(int n) {
		int rev=0;
		int rem;
		while(n>0)
		{   rem =n%10;  
		System.out.println(rem + " rem");
			rev=rev*10+rem;
			System.out.println(rev + " rev");
			n=n/10;
			System.out.println(n+ " n");
		}		
		return rev;
	}
}
