package pp2;
public class HighArray {
	
	        private int a[];
	        private int size;
	        public HighArray(int max)
	        {
	                a=new int[max];
	                size=0;
	        }
	        public boolean find(int search)
	        {
	                int j;
	                for(j=0;j<size;j++)
	                {
	                        if(a[j]==search)
	                                break;
	                }
	                if(j==size)
	                        return false;
	                else
	                        return true;
	        }
	        public void insert(int value)
	        {
	                a[size]=value;
	                size++;
	        }
	        public boolean delete(int del)
	        {
	                int j;
	                for(j=0;j<size;j++)
	                {
	                        if(a[j]==del)
	                                break;
	                }
	                if(j==size)
	                        return false;
	                else
	                {
	                        for(int k=j;k<size-1;k++)
	                        {
	                                a[k]=a[k+1];
	                        }
	                        size--;
	                        return true;
	                }
	        }
	        public int getmax()
	        {
	        	int i,max=0;
	        	for(i=0;i<size;i++)
	        	{
	        		if(a[i]>=max)
	        			max=a[i];
	        	}
	        	return max;
	        }
	        public void display()
	        {
	                for(int j=0;j<size;j++)
	                {
	                        System.out.print(a[j]+" ");
	                }
	                System.out.println();
	        }
			
			
}
			
				
	
	
