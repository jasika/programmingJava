package test;

public class numberBinary {
	public static boolean isBinary(int n) {		
		while(n!=0)
		{ if(n%10>1)
			{System.out.println("true "+n);
			return false;
			}
			n=n/10;		
			System.out.println("true mod n  "+n);
		}
		System.out.println("false "+n);
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isBinary(2011));
	}

	

}
