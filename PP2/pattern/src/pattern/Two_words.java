package pattern;

public class Two_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Fruits like Mango and Apple are common but Grapes are rare";
		int a=39;
		String str[]=s.split(" ");
		String s1=str[a%10-1];
		a=a/10;
		String s2=str[a%10-1];
		char c1[] =s1.toCharArray();
		char c2[]=s2.toCharArray();
		int n1=c1.length;
		int n2=c2.length;
		String res1="", res2="",fin="";
		if(n1%2==0)
		{
			for(int i=n1/2-1;i>=0;i--)
			{
				
				res1+=c1[i];
			}
			
			for(int j=n1/2;j<n1;j++)
			{
				res1+=c1[j];
			}
			
		}
		else
		{
			for(int i=n1/2;i>=0;i--)
			{
				
				res1=res1+c1[i];
			}
			
			for(int j=n1/2;j<n1;j++)
			{
				res1+=c1[j];
			}
		}
		
		if(n2%2==0)
		{
			for(int i=n2/2-1;i>=0;i--)
			{
				
				res2+=c2[i];
			}
			for(int j=n2/2;j<n2;j++)
			{
				res2+=c2[j];
			}
			
		}
		else
		{
			for(int i=n2/2;i>=0;i--)
			{
				
				res2+=c2[i];
			}
			for(int j=n2/2;j<n2;j++)
			{
				res2+=c2[j];
			}
		}
		
		fin=res2+" "+res1;
		System.out.println(fin);
		
		
		

	}

}
