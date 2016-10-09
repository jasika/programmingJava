package test;

/* Program for Printing first N terms of Fibonacci series using for loop (without taking input from user)
* Code by Vivek R (vividvilla) - Contact me at - http://vivek.techiestuffs.com
*/

public class FibonacciFor {

  public static void main(String[] args) 
  {
    int n=10,first=0,second=1,next,i;
    System.out.println("Printing first "+n+" numbers in Fibonacci Series \n");
    for(i=0;i<n;i++)
    {
      if(i<=1)
      next=i;
      else
      {
        next = first + second;
        first = second;
        second = next;
      }
    System.out.print(next + "\t");
    }
  }
}