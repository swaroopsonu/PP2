package selection_sort;

public class ArraySel {
	private int a[];
	private int nElems=0;
	public ArraySel(int max)
	{
		a=new int[max];
		nElems=0;
	}
	public void insert(int value)
	{
		a[nElems]=value;
		nElems++;
	}
	public void display()
	{
		for(int i=0;i<nElems;i++)
		{
			System.out.println(a[i]);
		}
	}
	public void selection()
	{
		int min;
		for(int j=0;j<nElems-1;j++)
		{
			min=j;
			for(int k=j+1;k<nElems;k++)
			{
				if(a[k]<a[min])
				{
					min=a[k];
					int temp=a[min];
					a[min]=a[j];
					a[j]=temp;
				}
			}
		}
	}

}
