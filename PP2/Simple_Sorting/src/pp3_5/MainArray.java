package pp3_5;
import java.util.*;

public class MainArray {
	
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int size, x, i;
			System.out.println("Enter array size");
			size = sc.nextInt();
			Arrayins3 arr = new Arrayins3(size);
			System.out.println("Enter array elements");
			for (i=0; i<size; i++)
			{
				x = sc.nextInt();
				arr.insert(x);
			}
			System.out.println("Original array :");
			arr.display();
			arr.insertionsort();
			System.out.println("Sorted array :");
			arr.display();
		}


	}


