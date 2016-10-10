package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 1) brute force method which compares each element of Array to all other elements and returns true if it
  founds duplicates. Though this is not an efficient choice it is the one which first comes to mind.

2) Another quick way of checking if a Java array contains duplicates or not is to convert that array into Set.
 Since Set doesn’t allow duplicates size of  the corresponding Set will be smaller than original 
 Array if Array contains duplicates otherwise the size of both Array and Set will be same.

3) One more way to detect duplication in java array is adding every element of the array into HashSet which is 
a Set implementation. Since the add(Object obj) method of Set returns false if Set already contains an element
 to be added, it can be used to find out if the array contains duplicates in 
 Java or not.
*/
public class dublicateEleminArray {
	private static void findDublicateElem(int[] a) {
	System.out.println("yo");
	System.out.println(Arrays.toString(a));
	//System.out.println(Arrays.asList(a));	
	Set temp =new HashSet();
	
	for(int i=0;i<a.length;i++)
	{
		if(!temp.add(a[i]))
		{
			System.out.println(i+1+" "+a[i]);
			//return true;			
		}		
	}
	//return false;	
	}	
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,2,10,11,12,6,8,8};
		//System.out.println(findDublicateElem(a));
		findDublicateElem(a);
	}
}