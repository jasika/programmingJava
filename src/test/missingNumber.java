package test;
//Print missing numbers in an array, array may be sorted or not,
//but it does not add the numbers to the array
//Alternative : try binary Search
import java.util.BitSet;

public class missingNumber {

	private static void printMissingNumber(int[] numbers, int count) 
	{ int missingCount = count - numbers.length; 
	BitSet bitSet = new BitSet(count); 
	for (int number : numbers) 
	{ bitSet.set(number - 1); } 
	
	System.out.println("");
//	System.out.printf("Missing numbers in integer array %s, with total number %d is %n");
	//, Arrays.toString(numbers), count); 
	int lastMissingIndex = 0; 
	for (int i = 0; i < missingCount; i++) 
	{ lastMissingIndex = bitSet.nextClearBit(lastMissingIndex); 
	System.out.println(++lastMissingIndex); }
	}	
	public static void main(String[] args)
	{
		int a[]={1,2,4,2};
		printMissingNumber(a,6);
		for(int i=0;i<a.length;i++)
		{System.out.print(a[i]+" ");}
	}
}
