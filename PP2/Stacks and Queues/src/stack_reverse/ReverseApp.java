package stack_reverse;
import java.io.*;
public class ReverseApp {

	public static void main(String[] args)throws IOException {
		String ip,op;
		while(true)
		{
			System.out.println("Enter a string ");
			System.out.flush();
			ip=getString();
			if(ip.equals(" "))
				break;
			Reverser theReverser=new Reverser(ip);
			op=theReverser.doRev();
			System.out.println("Reversed: "+ op);
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
