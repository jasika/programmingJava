package test;

import java.util.HashMap;

public class CharFirstNonRepeating {
	
	public static char firstNonRepeatingChar(String str)
	{	char c;
		HashMap<Character,Integer> charCount = new HashMap();
		
		for (int i =0;i<str.length();i++)
		{
			 c =str.charAt(i);
			if(charCount.containsKey(c))
			{
				charCount.put(c, charCount.get(c)+1);
			}
			else{charCount.put(c,1);}
		}
		/*for (int i = 0; i < word.length(); i++) 
		  { char c = word.charAt(i);
		 if (scoreboard.get(c) == 1) 
		  { return c; }
		  }	
	}*/		
		for(int i =0;i<=charCount.size();i++)
		{
			if(charCount.get(i)==1)
				return c;
		}
	}
	
	
	public static void main(String [] args){
		firstNonRepeatingChar("abaaacccsdddqa");
		int count=0;
		
	//	for (int i;i<str)
	}

}
