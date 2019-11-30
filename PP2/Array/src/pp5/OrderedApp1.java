package pp5;
import java.util.*;
public class OrderedApp1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		OrdArray1 obj=new OrdArray1(size);
		int ele;
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter a element");
         	ele=sc.nextInt();
	        obj.insert(ele);
		}
		OrdArray1 obj1=new OrdArray1(size);
		System.out.println("Enter elements for second array");
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter a element");
			ele=sc.nextInt();
			obj1.insert(ele);
		}
		OrdArray1 obj2=new OrdArray1(2*size);
        System.out.println("the merged array elements are");
        obj.merge(obj,obj1,obj2);
	}
}