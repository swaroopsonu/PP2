package stack_eg_1;

public class StackX {
	private int maxSize;
	private long[] stackArray;
	private int top;
	long a;
	
	public StackX(int max)
	{
		maxSize=max;
		stackArray= new long[maxSize];
		
	}
	
	public void push(int j)
	{
		if(top==maxSize-1)
		System.out.println("stack is full");
		else
			stackArray[++top]=j;
	}
	public long pop()
	{
		if(top==-1)
		System.out.println("Stack is empty");
		else
		     a=stackArray[top--];
		return a;
	}
	public long peek()
	{ 
		return stackArray[top];
		
	}
	public void display()
	{
		for(int i=0;i<=maxSize-1;i++)
		System.out.println(stackArray[i]+" ");
	}
}
