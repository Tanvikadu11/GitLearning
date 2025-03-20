package SingleDimensional;
import java.util.Scanner;
public class ReverseArray 
{
 public static void main(String[] args) 
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Array size");
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 
   for(int i=arr.length-1;i>0;i--)
   {
	   System.out.println(i);
   }
   
 }
}
