package pp3_5;

public class Arrayins3 {
		int[] a;
		 int size;
		public Arrayins3(int max)
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
			int k,j,i,copy=0,comparisons=0;
			for(i=1;i<size;i++)
			{
				k=a[i];
				for(j=i-1;j>=0;j--) 
				{
					if(a[j]>k)
					{
					int temp=a[j];
				    a[j]=k;
				    comparisons++;
	                copy++;
				    a[j+1]=temp;
				    copy++;
					}
					
				}
				
			}
			 System.out.println("Copies= "+ copy +"  Comparisons= "+ comparisons);
		}
		/*public void insertionSort()
		  {

		int i,j,copy=0,comparisons=0;
	    int  key;
	    for(i=1;i<size;i++)
	    {
	      key=a[i];
	      j=i;
	      while(j>0 && a[j-1]>=key)
	      {
	        a[j]=a[j-1];
	        comparisons++;
	        copy++;
	          j--;
	      }
	      a[j]=key;
	      copy++;
	    }
	    System.out.println("Copies= "+ copy +"  Comparisons= "+ comparisons);
	  }
	  */

		
		
	}


