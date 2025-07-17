/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isbn.java;
import java.util.*;
/**
 *
 * @author HP
 */
public class ISBNJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input= new Scanner(System.in);
        System.out.println("Please enter a 9 digit number "); 
    int num=input.nextInt();
   
     // Acess the indivivual digit from the isbn number
    int d1 = num / 100000000;
    int numleft = num % 100000000;
    int d2 = numleft / 10000000;
    numleft= numleft % 10000000;
    int d3 = numleft / 1000000;
    numleft= numleft % 1000000;
    int d4=  numleft / 100000;
    numleft= numleft % 100000;
    int d5= numleft / 10000;
    numleft= numleft % 10000;
    int d6= numleft / 1000;
    numleft= numleft % 1000;
    int d7= numleft / 100;
    numleft= numleft % 100;
    int d8= numleft / 10;
    numleft= numleft % 10;
    int d9= numleft;
    
    //Compute the checksum digit
    int d10= (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11;
           
     System.out.println("The ISBN number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
        System.out.println(d10);
    }
    
}
