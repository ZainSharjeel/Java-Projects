/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2;
import java.util.*;
/**
 *
 * @author Zain Sharjeel
 */
public class Task2 {

    
    public static int Largest(String str) {
        int counter = 0;
        int max = 0;
        for(int i=0; i<str.length(); i++){
            if(i==0) {
                counter++;
                max = counter;
            }
            else {
                if(str.charAt(i)==str.charAt(i-1)){
                    counter++;
                    if(max<counter) {
                        max = counter;
                    }
                }
                else{
                    counter = 1;
                }
            }
        }
        return max;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the string");
            String str=input.nextLine();
            System.out.println("The largest block is " + Largest(str));
        }
        catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
        
}