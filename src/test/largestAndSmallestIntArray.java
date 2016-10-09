package test;
//Find the largest, smallest and second largest int in an array
public class largestAndSmallestIntArray {
	
	public static void maxMinFunction(int arr[]){
		int len=arr.length;
		int max1 =Integer.MIN_VALUE,max2 =Integer.MIN_VALUE,min=Integer.MAX_VALUE;// To be noted
		System.out.println(min + "  "+max1);
		for(int i=0;i<len;i++){
			if(arr[i]>=max1)// Equal to to avoid wrong output if repition is there for max value
				{
				max2=max1;//______________
				max1=arr[i];
				
				}
			if(arr[i]<min)
				{min=arr[i];}
			System.out.println("For I "+i+"  Max1 "+max1 + " Max2 "+max2 +" Min "+min);		

		}
		System.out.println("Max1 "+max1 + " Max2 "+max2 +" Min "+min);		
	}	
	public static void main(String [] args){
		int a[]={1,2,103,3,4,-5,6,7,101,100,103,-10,-10,-11};
		maxMinFunction(a);
	}

}
