package pp3;
import java.util.*;

public class HighArrayapp3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        HighArray3 arr=new HighArray3(size);
        int ele;
        for(int i=0;i<size;i++)
        {
        	System.out.println("Enter a element");
        	ele=sc.nextInt();
         	arr.insert(ele);
        }
        System.out.println("The arrray elements are");
        arr.display();
        System.out.println("Enter the search key");        
        int search=sc.nextInt();
        if(arr.find(search))
        	{
        	System.out.println("Element Found : "+search);
        	}
        else
        {
        	System.out.println("Element Not Found");
        }
        System.out.println("Enter the delete key");
       	int del=sc.nextInt();
       	arr.delete(del);
       	System.out.println("The final array is ");
        arr.display();
		int max=arr.getmax();		        
		System.out.println("The greatest element present in the array is : "+max);
	    arr.delete(max);
		System.out.println("The array after deleting the maximum element is");
        arr.display();
        HighArray3 obj=new HighArray3(size);
        
        for(int i=0;i<size-2;i++)
        {
        	max=arr.getmax();
        	obj.insert(max);
        	arr.delete(max);
        }
        System.out.println("the inversely sorted array is");
        obj.display();
        
        }       
        
        
}

		