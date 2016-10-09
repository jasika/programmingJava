package test;

public class removeChar {

	public static String remove(String str,char c)
	{
		String s="";
		int len=str.length();
		System.out.println(str);
		for(int i =0;i<len;i++)
		{
			if(str.charAt(i)!=c)
			{s=s+str.charAt(i);}
			System.out.println(s);
		}		
		return s;
	}	
	public static void main(String[] args) {
		System.out.println(remove("hey Yo , I am doing good.How are you ?",'o'));
	}
}
