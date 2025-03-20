
package SingleDimensional;

public class OddEven 
{
public static void main(String[] args)
{
	 int []arr={1,2,3,4,5,6,7,8,9,10,11};
 
 int length=arr.length;
 
 for(int i=0;i<=length-1;i++)
 {
	 if(arr[i]%2==0)
	 {
		 System.out.println("Even Number:- "+arr[i]);
	 }
	 else
	 {
		 System.out.println("Odd Number :- "+arr[i]);
	 }
 }
}
}
