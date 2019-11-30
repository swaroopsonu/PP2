package stack_eg_1;

import java.util.Scanner;

public class Stack_main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		StackX obj=new StackX (size);
		for(int i=0;i<=size-1;i++)
		{
			System.out.println("enter the Array elements");
			int c=s.nextInt();
			obj.push(c);
		}
                System.out.println("the array elements are");
		obj.display();
		long x=obj.pop();
		System.out.println("array elements after popping out : " + x);
		long y=obj.peek();
		System.out.println("array element at the peek is :" + y);
		
	}

}
