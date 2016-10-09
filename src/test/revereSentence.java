package test;

import java.util.StringTokenizer;

public class revereSentence {
	
	public static String revereSent(String s)
	{
	StringTokenizer st = new StringTokenizer(s," ");
	String str="";
//	StringBuffer sb = new StringBuffer();
	while(st.hasMoreElements())
	{
		str=str+st.nextToken()+" ";//.append(" ");
		System.out.println("str "+str);
	}
	String[] split = str.split(" ");
	String result = "";
	for (int i = split.length - 1; i >= 0; i--) {
	  result += (split[i] + " ");
	}
//	System.out.println(result.trim());
	return result;
}
	public static void main(String [] args){
	System.out.println(revereSent("I      love    India."));
	}	
}
