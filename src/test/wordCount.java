package test;

import java.util.StringTokenizer;

public class wordCount {
	
	public static int wCount(String s, String string) {
	int count=0;
		StringTokenizer st =new StringTokenizer(s," ");
		System.out.println(string+ " String");
		while(st.hasMoreElements())
		{
		//	System.out.println(st.nextElement()+" elem");
		if(st.nextElement().equals(string))
			count++;
	//	System.out.println("yo");
		}
		return count;
	}
	public static void main(String[] args) {
		String s="hi how are you, hi I am good, hi how do you do ? ??";
		System.out.println(wCount(s,"?"));
	}


}
