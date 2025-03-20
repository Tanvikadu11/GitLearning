package SingleDimensional;
import java.util.Scanner;
public class OddEvenScanner 
{
 public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array size");
	int size=sc.nextInt();
	
	int[] arr=new int[size];
	for(int i=0;i<=size;i++)
	{
		System.out.println("Enter Elements :-");
		arr[i]=sc.nextInt();
		
		if(arr[i]%2==0)
		{
			System.out.println("Even Number :- "+arr[i]);
		}
		else
		{
			System.out.println("Odd Number :- "+arr[i]);
		}
	}
	 
}
}
