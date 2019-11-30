package pp3_1;

public class BubSort {
	private int a[];
    private int nElems=0;
public BubSort(int max)
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
public void bubble()
{
	int h=0,temp=0;
	for(int j=nElems-1;j>0;j--)
	{
		for(int k=0;k<j;k++)
		{
			if(a[k]>a[k+1])
			{
			        temp=a[k];
			        a[k]=a[k+1];
			        a[k+1]=temp;
			}
		}
		for(int k=j-1;k>h;k--)
		{
			if(a[k]<a[k-1])
			{
			        temp=a[k];
			        a[k]=a[k-1];
			        a[k-1]=temp;
			}
		}
		h++;
	}
}
}



