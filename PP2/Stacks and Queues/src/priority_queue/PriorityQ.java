package priority_queue;

public class PriorityQ {
	private int maxSize;
	private int arr[];
	private int nItems;
	
	public PriorityQ(int s)
	{
		maxSize=s;
		arr=new int[maxSize];
		nItems=0;
	}
	
	public void insert(int item)
	{
		int j;
		if(nItems==0)
			arr[nItems++]=item;
		else
		{
			for(j=nItems-1;j>=0;j--)
			{
				if(item > arr[j])
					arr[j+1]=arr[j];
				else
					break;
			}
			arr[j+1]=item;
			nItems++;
		}
	}
		
		public int remove()
		{
			return arr[nItems--];
		}
		
		public int peekMin()
		{
			return arr[nItems-1];
			
		}
		
		public boolean isEmpty()
		{
			return (nItems==0);
		}

		public boolean isFull()
		{
			return (nItems==maxSize);
		}
		
}
