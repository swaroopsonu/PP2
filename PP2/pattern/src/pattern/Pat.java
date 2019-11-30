package pattern;
import java.lang.*;
import java.io.*;
public class Pat {

		public static void main(String args[]){
			int i,j;
			/*for(i=1;i<=10;i++)
			{
				for(j=1;j<=i;j++) 
				{
					System.out.print(j);
					
				}
			System.out.println(" ");  
			}*/ // program for multiplication
			
			for(i=0;i<6;i++)
			{
				for(j=0;j<5;j++)
				{
					if((i==1 && (j==0 || j==4)) || (i==2 && (j==0 || j==1 || j==3 || j==4)) || (i==3 && (j==0||j==1||j==3||j==4))||(i==4 && (j==0||j==4)))
					{
						System.out.print(" ");
						
					}
					else
						System.out.print("*");
				}
				System.out.println(" ");
			}
		}
}


