package bubble_sort;
import java.util.*;
public class MainArray {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size, x, i;
		System.out.println("Enter array size");
		size = sc.nextInt();
		ArrayBub obj = new ArrayBub(size);
		System.out.println("Enter array elements");
		for (i=0; i<size; i++)
		{
			x = sc.nextInt();
			obj.insert(x);
		}
		System.out.println("Original array :");
		obj.display();
		obj.bubsort();
		System.out.println("Sorted array :");
		obj.display();
	}
}



