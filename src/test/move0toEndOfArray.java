package test;

public class move0toEndOfArray {
	
	static void pushZerosToEnd(int arr[])
	{
		int count =0; // Non zero values
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
		if(arr[i]!=0)
		{arr[count++]=arr[i];}		
		}
		while(count<n)
		{
			arr[count++]=0;
		}		
	}	
	 public static void main(String[] args) 
	  { int a[]={0,1,2,0,5,0,1,0,0,6,7};
		 pushZerosToEnd(a);
		 
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
	  }

}
