package test;

public class reverseArray {

	public static void reverseArray(int arr[])
	{ int temp=0;
		int len = arr.length;
		if(arr==null||len==1)
		return;
		for (int i=0;i<len/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[len-1-i];
			arr[len-1-i]=temp;			
		}		
	}		
	public static void main(String [] args){
		int a[]={1,2,3,4,5,6,7};
		int num = a.length;
		System.out.println(num);
		reverseArray(a);
		
		for (int i=0;i<num;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
