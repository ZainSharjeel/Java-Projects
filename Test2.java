/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test2;
import java.util.*;
/**
 *
 * @author Zain Sharjeel
 */
public class Test2 {

    
    public static void squareMatrix(int arr[][], int num, int size2)
	{
            if (num > size2)
                return;
            for (int i = 0; i < size2 - num + 1; i++) {
                for (int j = 0; j < size2 - num + 1; j++) {
                    int sum = 0;
                    for (int p = i; p < num + i; p++)
                        for (int q = j; q < num + j; q++)
                            sum += arr[p][q];
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       try {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size 1");
        int size1=input.nextInt();
        System.out.println("Enter the size 2");
        int size2=input.nextInt();
        int [][]arr=new int[size1][size2];
        System.out.println("Enter the values of array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=input.nextInt();
            }
        }
        int n = 3;
        squareMatrix(arr, n, size2);
       }
       catch (IndexOutOfBoundsException e) {
           System.out.println(e);
       }
       catch (InputMismatchException e1) {
           System.out.println(e1);
       }
    }
}


    
    

