package pp3_2;

import java.util.Scanner;
public class MainArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		
		ArrayIns1 obj=new ArrayIns1(size);
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
        int med=obj.median();
		
		System.out.println("The median value is "+obj.a[med]);

		}
	}


