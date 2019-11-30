package pp3_1;
import java.util.*;

public class MainBub {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
	int size=s.nextInt();
	BubSort a =new BubSort(size);
	for(int i=0;i<size;i++)
	{
		System.out.println("enter the array elements");
		int k=s.nextInt();
		a.insert(k);
	}
	a.display();
	a.bubble();
	System.out.println("the array elements after sorting is ");
	a.display();
}
}



