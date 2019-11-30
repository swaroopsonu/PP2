package pp3_4;
import java.util.*;
public class MainClass {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size, x, i;
		System.out.println("Enter array size");
		size = sc.nextInt();
		OddEven arr = new OddEven(size);
		System.out.println("Enter array elements");
		for (i=0; i<size; i++)
		{
			x = sc.nextInt();
			arr.insert(x);
		}
		System.out.println("Original array :");
		arr.display();
		arr.sort();
		System.out.println("Sorted array :");
		arr.display();
	}


}
