package pp3_6;

public class ArrayIns4 
	{
	  private int a[];
	  private int nElems;

	  public ArrayIns4(int max)
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
	    int j;
	    for(j=0;j<nElems;j++)
	      if(a[j]!=-1)
	      System.out.print(a[j]+" ");
	    System.out.println("");
	  }
	  public void insertionSort()
	  {
	    int i,j,key;
	    for(i=1;i<nElems;i++)
	    {
	      key=a[i];
	      j=i;
	      while(j>0 && a[j-1]>=key)
	      {
	        if(a[j-1]==key)
	            key=-1;
	        a[j]=a[j-1];
	          j--;
	      }
	      a[j]=key;
	      
	  }
	  }
	}

