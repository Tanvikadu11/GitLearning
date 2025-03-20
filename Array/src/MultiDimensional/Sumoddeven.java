package MultiDimensional;

import java.util.Scanner;

public class Sumoddeven
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the size of the array:");
        int num = sc.nextInt();
        int oddsum=0;
        int evensum=0;
        
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
                    evensum=evensum+arr[i][j];
                } 
                else 
                {
                    System.out.println("Odd Number: " + arr[i][j]);
                    oddsum=oddsum+arr[i][j];
                }
            }
        }
            System.out.println("Sum of Even Number is :- "+evensum);
            System.out.println("Sum of Odd Number is :- "+oddsum);
    }
}