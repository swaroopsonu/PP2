package pp3_3;

public class ArrayIns2 {
	int[] a;
	 int size;
	public ArrayIns2(int max)
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
	public int nodups()
	{
		int i=0,j=1;
		int arr_size=1;
		while(j<size)
		{
			if(a[i]!=a[j])
			{
				i++;
				a[i]=a[j];
				j++;
			}
			else
			{
				j++;
			}
			arr_size=i;
		}
		return arr_size;
	}
	
}
