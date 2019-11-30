package selection_sort;
import java.util.*;

public class MainArray {
	public static void main(String args[]){

		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		ArraySel obj=new ArraySel(size);
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the Array elements");
			int c=s.nextInt();
			obj.insert(c);
		}
                System.out.println("the array elements are");
		obj.display();
		obj.selection();
		System.out.println("array elements after sorting");
		obj.display();
		}
	}
		
		


