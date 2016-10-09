package test;

public class reverseArrayByN {
	public static void reverseArray(int arr[],int n)
	{
		int len=arr.length;
		int leftIndex,rightIndex;
		int temp;
		for(int i=0;i<len;i=i+n)
		{
			leftIndex=i;
			System.out.println("leftIndex "+i+" "+leftIndex);
			rightIndex=i+n;	
			rightIndex = rightIndex > len ? len - 1 : (rightIndex - 1); //
			System.out.println("rightIndex "+i+" "+rightIndex);
			while(leftIndex<rightIndex)
			{
				temp=arr[leftIndex];
				arr[leftIndex++]=arr[rightIndex];
				arr[rightIndex--]=temp;
			}			
		}				
	}	
	public static void main(String [] args){
		int a[]={1,2,3,4,5,6,7};
		int num = a.length,order=2;
		System.out.println(num);
		reverseArray(a,order);
		
		for (int i=0;i<num;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
