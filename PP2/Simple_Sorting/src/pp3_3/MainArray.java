package pp3_3;
import java.util.*;
public class MainArray {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int max=sc.nextInt();
		ArrayIns2 obj=new ArrayIns2(max);
		int ele;
		for(int i=0;i<max;i++)
		{
			System.out.println("Enter a element");
			ele=sc.nextInt();
			obj.insert(ele);
		}
		
		obj.insertionsort();
		System.out.println("the sorted array is");
		obj.display();
		System.out.println();
		int size=obj.nodups();
		for(int i=0;i<=size;i++)
		{
			System.out.print(obj.a[i]+" ");
		}
		
	}

}
