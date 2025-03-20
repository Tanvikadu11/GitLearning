package MultiDimensional;
import java.util.Scanner;

public class CountOddEven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the size of the array:");
        int num = sc.nextInt();
        int countodd=0;
        int counteven=0;
        
        int[][] arr = new int[num][num];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < num; i++) 
        {
            for (int j = 0; j < num; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++) 
            {
                if (arr[i][j] % 2 == 0) 
                {
                    System.out.println("Even Number: " + arr[i][j]);
                    counteven++;
                } 
                else 
                {
                    System.out.println("Odd Number: " + arr[i][j]);
                    countodd++;
                }
            }
        }
            System.out.println("Sum of Even Number is :- "+counteven);
            System.out.println("Sum of Odd Number is :- "+countodd);
    }
}