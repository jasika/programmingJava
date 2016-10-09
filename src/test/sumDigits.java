package test;

public class sumDigits {

	public static int addDigitsofNum(int n) {
		int sum=0,digit;
		while(n!=0)
		{
			digit=n%10;
			System.out.println("n mod "+digit);
			sum=sum+digit;
			n=n/10;	
			System.out.println("n "+n);
		}		
		return sum;		
	}
	
	public static void main(String[] args) {
		System.out.println(addDigitsofNum(-34111));
	}

	
}
