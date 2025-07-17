/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gcdfinder2;

import java.util.Scanner;

/**
 *
 * @author 26922
 */
public class GcdFINDER2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner input=new Scanner(System.in);
    System.out.println("Please enter number 1");
    int num1=input.nextInt();
    System.out.println("Please enter number 2");    
    int num2=input.nextInt();
    int i;
    int gcd=1;
    for(i=2; (i<num1 && i<num2) ;i++){
        if((num1 % i ==0) && (num2 % i ==0)){ 
            gcd=i;
    }
    }
    
     System.out.println("The greatest common divisor is " + gcd);
     
    }
    
}


























    
    












