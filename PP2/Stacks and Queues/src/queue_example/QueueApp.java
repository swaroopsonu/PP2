package queue_example;

import java.util.*;
public class QueueApp {
	public static void main( String args[] ) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the Queue");
		int size=s.nextInt();
		Queue obj=new Queue(size);
		for(int i=0;i<size-1;i++)
		{
			System.out.println("enter the items in Queue");
			int j=s.nextInt();
			obj.insert(j);
			
		}
		while(!obj.isEmpty())
		{
			int n=obj.remove();
			System.out.println("the result is : "+ n);
		}
		obj.display();
		System.out.println("the queue is empty now");
	}

}
