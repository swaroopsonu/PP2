package pp3_4;

public class OddEven {
	private int a[];
	private int nElems;
	public OddEven(int max)
	{
		a = new int[max];
		nElems = 0;
	}
	public void insert(int element)
	{
		a[nElems] = element;
		nElems++;
	}
	public void display()
	{
		int i;
		for (i=0; i<nElems; i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public void sort()
	{
		int out, in, flag, size =nElems-1;
		while (true)
		{
			flag = 0;
			for (in=0; in<size; in=in+2)
			{
				if (a[in] > a[in+1])
				{
					int temp;
					temp = a[in];
					a[in] = a[in+1];
					a[in+1] = temp;
					flag = 1;
				}
			}
			for (in=1; in<size; in=in+2)
			{
				if (a[in] > a[in+1])
				{
					int temp;
					temp = a[in];
					a[in] = a[in+1];
					a[in+1] = temp;
					flag = 1;
				}
			}
			if (flag==0)
				break;
		}
	}
	


	
	
}
                                 
                                        
                          
                          
                         
                

