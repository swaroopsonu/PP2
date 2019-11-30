package pp3_6;

import java.util.Scanner;



public class MainArray {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int size, x, i;
		System.out.println("Enter array size");
		size = sc.nextInt();
		ArrayIns4 arr = new ArrayIns4(size);
		System.out.println("Enter array elements");
		for (i=0; i<size; i++)
		{
			x = sc.nextInt();
			arr.insert(x);
		}
		System.out.println("Original array :");
		arr.display();
		arr.insertionSort();
		System.out.println("Sorted array :");
		arr.display();
	}



}
