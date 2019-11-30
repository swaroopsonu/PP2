package trangular_no;
import java.io.*;
import java.util.*;
public class Tri {
	public static void main(String args[]){
			Scanner s=new Scanner (System.in);
			System.out.println("enter a number");
			int n=s.nextInt();
			int r=triangle(n);
			System.out.println("the triangular number  is : " +r);
		}
	
	static int triangle(int n)
	{
		int t=0;
		while(n>0)
		{
			 
			t=t+n;
		     --n;
		}
		return(t);

	}
}


