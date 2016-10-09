package test;
//find the number of occurrences of a character in a string
public class CharCountInStr {
	/*
	public static int charCount(String str,char cha){
		int count =0;
		String st=str;
		char ch=cha;
		System.out.println("length of String "+st.length());
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==ch)
			{
				count=count+1;
			}			
		}
		return count;		
	}*/
	public static int charCount(String str,char cha){
		int count =0;
		String st=str;
		char ch=cha;
		System.out.println("length of String "+st.length());
		
		
		return count;	
	}
	
	public static void main(String [] args){
		System.out.println("yo "+charCount("abaaa",'a'));		
		//charCount("abc",'a');
	}
}
