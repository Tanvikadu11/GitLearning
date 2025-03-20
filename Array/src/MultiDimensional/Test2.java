package MultiDimensional;

public class Test2 
{
public static void main(String[] args) 
{
 int [][]arr=new int[3][3];
 
 arr[0][0]=101;
 arr[0][1]=102;
 arr[0][2]=103;
 arr[1][0]=104;
 arr[1][1]=105;
 arr[1][2]=106;
 arr[2][0]=107;
 arr[2][1]=108;
 arr[2][2]=109;
 
 for(int i=0;i<3;i++)
 {
	 for(int j=0;j<3;j++)
	 {
		//System.out.println(i+""+j); display index position
		 System.out.println(arr[i][j]); //display index element
	 }
 }
}
}
