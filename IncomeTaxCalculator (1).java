/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package income.tax.calculator;
import java.util.*;
/**
 *
 * @author 26922
 */
public class IncomeTaxCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input=new Scanner(System.in);
        System.out.println("Enter your status");
    int status=input.nextInt();
        System.out.println("Please enter your income ");
        double income=input.nextDouble();
    double homeincome=0.0;
        switch(status){
        case 0: if ((income>=0) && (income<=8350)){
        homeincome= income - (income * 0.01);
        }else if ((income>=8351) && (income<=33950)){
        homeincome= income - (income * 0.15);
        }else if ((income>=33951) && (income<=82250)){
        homeincome= income - (income * 0.25);    
        }else if ((income>=82251) && (income<=171550)){
        homeincome= income - (income * 0.28);
        }else if ((income>=171551) && (income<=372950)){ 
    homeincome= income - (income * 0.33);
        }else if (income>=372951){
    homeincome= income - (income * 0.35);
        }
            System.out.println("The home income salary is " + homeincome);
        break;
        case 1:if ((income>=0) && (income<=16700)){
        homeincome= income - (income * 0.01);
        }else if ((income>=16701) && (income<=67900)){
        homeincome= income - (income * 0.15);
        }else if ((income>=67901) && (income<=137050)){
        homeincome= income - (income * 0.25);    
        }else if ((income>=137501) && (income<=208850)){
        homeincome= income - (income * 0.28);
        }else if ((income>=208851) && (income<=372950)){ 
    homeincome= income - (income * 0.33);
        }else if (income>=372951){
    homeincome= income - (income * 0.35);
        }
            System.out.println("The home salary is " + homeincome);
        break;
        case 3: if ((income>=0) && (income<=8350)){
        homeincome= income - (income * 0.01);
        }else if ((income>=8351) && (income<=33950)){
        homeincome= income - (income * 0.15);
        }else if ((income>=33951) && (income<=68525)){
        homeincome= income - (income * 0.25);    
        }else if ((income>=68526) && (income<=104425)){
        homeincome= income - (income * 0.28);
        }else if ((income>=104426) && (income<=186475)){ 
    homeincome= income - (income * 0.33);
        }else if (income>=186476){
    homeincome= income - (income * 0.35);
        }
        System.out.println("The home salary is " + homeincome);
        break;
        case 4:if ((income>=0) && (income<=11950)){
        homeincome= income - (income * 0.01);
        }else if ((income>=11951) && (income<=45500)){
        homeincome= income - (income * 0.15);
        }else if ((income>=45501) && (income<=117450)){
        homeincome= income - (income * 0.25);    
        }else if ((income>=117451) && (income<=171550)){
        homeincome= income - (income * 0.28);
        }else if ((income>=171551) && (income<=372950)){ 
    homeincome= income - (income * 0.33);
        }else if (income>=372951){
    homeincome= income - (income * 0.35);
        }
        System.out.println("The home salary is " + homeincome);
        break;
        default:{
            System.out.println("Invalid Status");
                }
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
        


   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
