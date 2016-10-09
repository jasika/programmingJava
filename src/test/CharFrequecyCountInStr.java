package test;
//find frequency of all characters in a string
public class CharFrequecyCountInStr {
	
	public static void charFrequesncyCount(String str){

		String st=str;
		System.out.println("length of String "+st.length());
		//for(int i ='A';i<='z';i++)
			for(int i=0;i<st.length();i++)
		{   int count =0;
			for(int j =0;j<str.length();j++)
			{
				if(j<i && st.charAt(i)==st.charAt(j))
					break;
				if(st.charAt(i)==st.charAt(j))
				{
					count++;
				}
			if(j==str.length()-1)	
			{
				System.out.println("("+st.charAt(i)+")"+"   "+count+" times");
			}
				
			}// J loop			
		} // I loop
	}	
	
	/* i=str.length();
        for(c='A'; c<='z'; c++)
        {
            k=0;
            for(j=0; j<i; j++)
            {
                ch = str.charAt(j);
                if(ch == c)
                {
                    k++;
                }
            }
            if(k>0)
            {
                System.out.println("The character " + c + " has occurred for " + k + " times");
            }
        }*/
	public static void main(String [] args){
		charFrequesncyCount("abaaAAacccssssdddqqa");		
		//charCount("abc",'a');
	}
}
