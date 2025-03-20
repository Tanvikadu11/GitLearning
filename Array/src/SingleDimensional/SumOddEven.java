package SingleDimensional;
import java.util.Scanner;
public class SumOddEven 
{
 public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array size");
	int size=sc.nextInt();
	
	int[] arr=new int[size];
	int evensum=0;
	int oddsum=0;
	for(int i=0;i<size;i++)
	{
		System.out.println("Enter Elements :-");
		arr[i]=sc.nextInt();
		
		if(arr[i]%2==0)
		{
			System.out.println("Even Number :- "+arr[i]);
		    evensum=evensum+arr[i];
		}
		else
		{
			System.out.println("Odd Number :- "+arr[i]);
            oddsum=oddsum+arr[i];
		}
		
	}
	System.out.println("Total Even Number :-"+evensum);
	System.out.println("Total Odd Number :-"+oddsum);
}
}
//1. array reverse
//2. sort array in accending order and decending order.