package test;

public class anagram {

	
	public static void main(String[] args) {
		System.out.println(isAnagram("ccccc","ccccC"));
	}

	private static boolean isAnagram(String string1, String string2) {
		int len1=string1.length();
		int len2=string2.length();
		if(len1!=len2)
		return false;
		/*
		string1=string1.toLowerCase();
		string2=string2.toLowerCase();
		*/
		char [] charArray=string1.toCharArray();
		StringBuffer sb =new StringBuffer(string2);
		for(char c : charArray){
			int index =sb.indexOf(c+"");
			if(index!=-1)//if(c==sb.indexOf(String.valueOf(c))
			{
				sb.deleteCharAt(sb.indexOf(c+""));
			}
			System.out.println(sb);
		}
		return sb.length()==0;
		//return true;
	}
}
