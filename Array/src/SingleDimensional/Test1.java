package SingleDimensional;

public class Test1 
{
public static void main(String[] args) {
	int []arr4= new int[5];
	
	arr4[0]=101;
	arr4[1]=102;
	arr4[2]=103;
	System.out.println("Before Update "+arr4[2]);
	arr4[3]=104;
	arr4[4]=105;
	//arr4[5]=106;java.lang.ArrayIndexOutOfBoundsException
	
	arr4[2]=333;
	
	System.out.println("After Update "+arr4[2]);
	
}
}
