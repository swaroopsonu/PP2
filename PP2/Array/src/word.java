import java.util.*;
public class word {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		String fin="";
		for(int i=0;i<arr.length;i++)
		{
			int x=0;
			int sum=0;
			int y=arr[i].length()-1;
			while(x<=y)
			{
				if(x==y)
					sum+=(int)arr[i].charAt(x)-64;
				else 
					sum+=Math.abs(((int)arr[i].charAt(x)-64)-((int)arr[i].charAt(y)-64));
				
				x++;
				y--;
				
			}
			fin+=sum;
		}
		System.out.println(fin);
	}
}
