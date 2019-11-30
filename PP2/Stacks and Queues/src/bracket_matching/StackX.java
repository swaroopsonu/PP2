package bracket_matching;

public class StackX {
	private int maxSize;
	private int top;
	private char arr[];
	
	public StackX(int max)
	{
		maxSize=max;
		arr=new char[maxSize];
		top=-1;
	}
	
	public void push(char j)
	{
		arr[++top]=j;
	}

	public char pop()
	{
		return arr[top--];
	}
	public char peek()
	{
		return arr[top];
	}
	public boolean isEmpty()
	{
		return(top == -1);
	}
}
