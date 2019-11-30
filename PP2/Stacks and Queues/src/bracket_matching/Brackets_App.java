package bracket_matching;

import java.io.*;

public class Brackets_App {
		public static void main(String[] args)throws IOException {
			String ip,op;
			while(true)
			{
				System.out.println("Enter a string ");
				System.out.flush();
				ip=getString();
				if(ip.equals(" "))
					break;
				Bracket_checker b =new Bracket_checker(ip);
				b.check();
			}
		}

		public static String getString()throws IOException
		{
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			String s= br.readLine();
			return s;
		}

	}

