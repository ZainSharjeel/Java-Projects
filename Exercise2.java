/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise2;
import java.util.*;
/**
 *
 * @author 26922
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=input.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the values of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        int min=0, max=0,avg=0,total=0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            min=arr[0];
            max=arr[i];
            total+=arr[i];
        }
        avg=(total - (max+min)) / (size-2);
        System.out.println("The average is " + avg);
    }
}
    

