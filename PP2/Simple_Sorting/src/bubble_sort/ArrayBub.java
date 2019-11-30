package bubble_sort;

public class ArrayBub {
	private int a[];
	private int n;
	public ArrayBub(int max)
	{
		a = new int[max];
		n = 0;
	}
	public void insert(int element)
	{
		a[n] = element;
		n++;
	}
	public void display()
	{
		int i;
		for (i=0; i<n; i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public void bubsort()
	{
		int j, i,temp;
		for (j=n-1; j>0; j--)
		{
			for (i=0; i<j; i++)
			{
				if (a[i] > a[i+1])
					{
					temp=a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					}
			}
		}
	}
}
	





