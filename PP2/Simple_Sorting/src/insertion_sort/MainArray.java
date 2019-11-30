package insertion_sort;
import java.util.*;
public class MainArray {
	public static void main(String args[]) {
		
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
	int size=s.nextInt();
	
	ArrayIns obj=new ArrayIns(size);
	int ele;
	for(int i=0;i<size;i++)
	{
		System.out.println("Enter a element");
		ele=s.nextInt();
		obj.insert(ele);
	}
	
	obj.insertionsort();
	System.out.println("the sorted array is");
	obj.display();
	}
}
	
