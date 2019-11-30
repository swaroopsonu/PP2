package pp5;

public class OrdArray1{
	
	 int[] a;
	 int size;
	
	public OrdArray1(int max)
	{
		a=new int[max];
		size=0;
	}
	
	public int sizearray()
	{
		return size;
	}
	
	public int find(int search)
	{
		int l=0;
		int h=size-1;
		int m=(l+h)/2;
		
		while(true)
		{
			if(a[m]==search)
				return m;
			else if(l>h)
				return size;
			else
			{
				if(a[m]<search)
					l=m+1;
				else if(a[m]>search)
					h=m-1;
			}
		}
	}
	public void insert(int value)
	{
		int j;
		for(j=0;j<size;j++)
		{
			if(a[j]>value)
				break;
		}
		for(int k=size;k>j;k--)
		{
			a[k]=a[k-1];
		}
		a[j]=value;
		size++;
	}
	public void merge(OrdArray1 x,OrdArray1 y,OrdArray1 z)
	{
		int i=0,j=0,k=0;
		while(i<size && j<size)
		{
			if(x.a[i]<=y.a[j])
			{
				z.a[k]=x.a[i];
				i++;
			}
			else if(x.a[i]>y.a[j])
			{
				z.a[k]=y.a[j];
				j++;
			}
			
			k++;
		}
		while(i<size)
		{
			z.a[k]=x.a[i];
			k++;
			i++;
		}
		while(j<size)
		{
			z.a[k]=y.a[j];
			j++;
		    k++;
		}
		for(int l=0;l<2*size;l++)
		{
			System.out.print(z.a[l]+" ");
		}
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}

	
