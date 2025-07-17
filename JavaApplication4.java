/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.*;
/**
 *
 * @author 26922
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input=new Scanner(System.in);
        System.out.println("Please enter your weight in kilogram ");
    double weight=input.nextDouble();
        System.out.println("Please enter the height in meters ");
    double height=input.nextDouble();
    double BMI= weight / (Math.sqrt(height)) ;
       if(BMI<18.5){
           System.out.println("Underweight");
       }
       else if (BMI<=18.5 && BMI<25.0)
                   System.out.println("Normal");
       else if (BMI>=25.0 && BMI<30.0)
               
        System.out.println("Overweight");
        else if (BMI>=30.0)
        System.out.println("Obese");
     System.out.print("The BMI is " + BMI); 
    }
       
       
            
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    

