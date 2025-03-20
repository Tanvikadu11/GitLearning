package SingleDimensional;
import java.util.Scanner;
public class ScannerWord 
{
 public static void main(String[] args) 
 {
	String []arr= {"Apple","Banana","Mango","Orange","Grapes"};
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter Array size");
	//String size=sc.next()+sc.nextLine();
	
	System.out.println("Enter Word");
	String word=sc.next()+sc.nextLine();
	
	if(word.equals(word))
	 {
		 System.out.println(word+":- It is present in array");
	 }
	else
	{
		System.out.println(word+":- It is not Present");
	} 
}
}
