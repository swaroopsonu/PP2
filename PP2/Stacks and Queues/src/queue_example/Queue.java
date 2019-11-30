package queue_example;

public class Queue {
	private int maxSize;
	private int arr[];
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int s)
	{
		maxSize=s;
		arr=new int[maxSize];
		front=0;
		rear=-1;
		nItems=0;
	}
	public void insert(int j)
	{
		if(rear==maxSize-1)
			rear=-1;
		rear = ( rear + 1 ) % maxSize;
		arr[rear]=j;
		nItems++;
	}

	public int remove()
	{
		if(front == maxSize)
			front=0;
		int j=arr[front];
		front=(front + 1) % maxSize;
		nItems--;
		return j;
	}
	public int peekFront()
	{
		return arr[front];
	}
	
	public boolean isEmpty()
	{
		return (nItems==0);
	}
	public boolean isFull()
	{
		return (nItems==maxSize);
	}
	public int size()
	{
		return nItems;
	}
	public void display()
	{
		if(front==0 && rear==-1)
			System.out.println("Queue is empty");
		else if(front==rear)
			System.out.println("the res :" +arr[front]);
		else
		{
			int f=front;
			while(f<=rear)
			{
				System.out.print("result :" +arr[f++]+" ");
			}
			System.out.println();
		}
	}
}

