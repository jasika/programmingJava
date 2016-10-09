package test;
// fiz(30) = 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 
public class FizzBuzz {
	public static void main(String [] args){
		fizz(30);
	}
	
	public static void fizz(int n){
		
		for(int i=1;i<=n;i++){
			if(i%15 ==0)System.out.print("FizzBuzz ");
			//if(i%3==0 && i% 5==0)System.out.print("FizzBuzz ");
			else if (i%5 ==0)System.out.print("Buzz ");
			else if(i%3 ==0)System.out.print("Fizz ");
			else {System.out.print(i+" ");}
		}	
	}
}
