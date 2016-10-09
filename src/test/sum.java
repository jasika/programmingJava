package test;
// Print all the pairs in an array that sum upto 10
public class sum {
	static void findPairs(int arr[])
	{	int len=arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]+arr[j]==10)
					System.out.println(arr[i]+" " +arr[j]);
			}			
		}
	}		
	 public static void main(String[] args) 
	  { int a[]={5,1,2,0,5,3,7,0,1,0,0,2,8};
		 findPairs(a);
		 
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
	  }

}
