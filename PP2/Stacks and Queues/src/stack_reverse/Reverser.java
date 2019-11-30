package stack_reverse;

public class Reverser {
	private String ip;
	private String op;
	public Reverser(String in)
	{
		ip=in;
	}
	public String doRev()
	{
		int stackSize=ip.length();
		StackX theStack=new StackX(stackSize);
		for(int j=0;j<ip.length();j++)
		{
			char ch= ip.charAt(j);
			theStack.push(ch);
		}
		op=" ";
		while(!theStack.isEmpty())
		{
			char ch=theStack.pop();
			op=op+ch;
		}
		return op;
	}
	

}
