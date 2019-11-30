package insertion_sort;

public class ArrayIns {
	 int[] a;
	 int size;
	public ArrayIns(int max)
	{
		a=new int[max];
		size=0;
	}
	public void insert(int value)
	{
		a[size]=value;
		size++;
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
	public void insertionsort()
	{
		int k,j,i;
		for(i=1;i<size;i++)
		{
			k=a[i];
			for(j=i-1;j>=0;j--) 
			{
				if(a[j]>k)
				{
				int temp=a[j];
			    a[j]=k;
			    a[j+1]=temp;
				}
				
			}
		}
	}
}
