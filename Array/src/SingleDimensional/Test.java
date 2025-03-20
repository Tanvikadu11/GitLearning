package SingleDimensional;

public class Test 
{
public static void main(String[] args) 
{
	//different types
	int[]arr1= {10,20,30,40,50};
	int[]arr2= {10,20,30,40,50};
	int arr3[]= {10,20,30,40,50};
	
	int[]arr4=new int[5];
	
	arr4[0]=101;
	arr1[1]=102;
	arr2[2]=103;
	arr3[3]=104;
	arr4[4]=105;
	
	System.out.println(arr4[0]);//101
	System.out.println(arr1[0]);
}
}
