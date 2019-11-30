
public class abc {

	public static void main(String args[])
	{
		String s1="Anand";
		String s2="Swapi";
		int n1=37261995;
		int n2=5;
		String x1="";
		x1+=n1;
		int ascii1=0;
		int ascii2=0;
		
		for(int i=0;i<s1.length();i++)
			ascii1+=(int)s1.charAt(i);
		for(int i=0;i<s2.length();i++)
			ascii2+=(int)s2.charAt(i);
		String fin="";
		if(ascii1>ascii2)
		{
			fin+=s1.charAt(s1.length()-1);
			fin+=s2;
		    fin+=x1.charAt(n2-1);
		//int count=x1.length()-1;
		    fin+=x1.charAt(x1.length()-n2);
		}
		else
		{
			fin+=s2.charAt(s2.length()-1);
			fin+=s1;
			fin+=x1.charAt(n2-1);
		//int count=x1.length()-1;
		    fin+=x1.charAt(x1.length()-n2);
		}
		String fin1="";
		for(int i=0;i<fin.length();i++)
		{
			if(Character.isLowerCase(fin.charAt(i)))
				fin1+=Character.toUpperCase(fin.charAt(i));
			else
				fin1+=Character.toLowerCase(fin.charAt(i));
		}
		System.out.println(fin);
		System.out.println(fin1);
	}
	
}
