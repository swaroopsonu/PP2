package pp4;

public class OrdArray {
		private int[] a;
		private int size;
		
		public OrdArray(int max)
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
			int lowerbound=0;
			int higherbound=size-1;
			int mid=0;
			
			while(true)
			{
				mid=(lowerbound+higherbound)/2;
				if(a[mid]==search)
					return mid;
				else if(lowerbound>higherbound)
					return size;
				else
				{
					if(a[mid]<search)
						lowerbound=mid+1;
					else if(a[mid]>search)
						higherbound=mid-1;
				}
			}
		}
		public void insert(int value)
		{
			int lowerBound = 0;
			int upperBound = size - 1;
			int mid = 0;
			while(true)
			{
				if(lowerBound > upperBound) 
					break;
				mid = (lowerBound + upperBound) / 2;
				if(value > a[mid]) 
				{
					lowerBound = mid + 1;
					mid++;
				}
				else 
					upperBound = mid - 1;
			}
			for(int k=size; k>mid; k--) 
				a[k] = a[k-1];
			a[mid] = value; 
			size++;
		}
		public boolean delete(int value)
		{
			int j = find(value);
			if(j==size)
				return false;
			else
			{
				for(int k=j; k<size-1; k++) 
					a[k] = a[k+1];
				size--;
				return true;
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
	



