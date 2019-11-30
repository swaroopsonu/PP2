package pp4;
import java.util.*;
public class OrderedApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		OrdArray obj=new OrdArray(size);
		int ele;
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter a element");
			ele=sc.nextInt();
			obj.insert(ele);
		}
		obj.display();
		System.out.println("Enter search key");
		int search=sc.nextInt();
		if(obj.find(search)!=obj.sizearray())
			System.out.println("Found " + search);
		else
			System.out.println("Cant find " + search);
			
		System.out.println("Enter a element to delete");
		
		int del=sc.nextInt();
		
		obj.delete(del);
		
		System.out.println("The Final array is");
		
		obj.display();
	}

	}

