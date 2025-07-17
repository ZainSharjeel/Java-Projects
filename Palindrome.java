/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrome;
import java.util.*;
/**
 *
 * @author 26922
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number ");
    int num=input.nextInt();
    int d1= (num % 10);
    int d2= (num %100)/10;
    int d3= (num % 1000)/100;
    int d4= (num % 10000)/1000 ;
    
    int reverse= (d1 * 1000) + (d2 * 100) + (d3 * 10) + (d4);
    if ( num == reverse ){
        System.out.println("PALINDROME");
    }
    else {
        System.out.println("The reverse number is" + reverse);
    }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

