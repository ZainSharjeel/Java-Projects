/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise3;
import java.util.*;
/**
 *
 * @author 26922
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input= new Scanner(System.in);
        int count1=0;
        int count2=0;
        int highestcindex=0;
        int highestccount=0;
        int highestrindex=0;
        int highestrcount=0;
        int [][] b = new int[4][4];
       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                b[i][j]= (int)(Math.random()*2);
            }  
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j]);  
            }
            System.out.println();
           
        }
       
        for(int i = 0; i < b.length; i++){        
            count1=0;
            for(int j = 0; j < b[i].length; j++){    
              if(b[i][j]==1){
              count1+=1;    }  
            }
            if(count1>highestrcount){
            highestrcount=count1;
            highestrindex=i;
           
            }
        }
        for(int i = 0; i < b.length; i++){    
             count2=0;
            for(int j = 0; j < b[0].length; j++){    
                if(b[i][j]==1){
              count2+=1;    }
            }
            if(count2>highestccount){
            highestccount=count2;
            highestcindex=i;
           
            }
        }
        System.out.println("for column "+highestccount +" on "+ highestcindex );
        System.out.println("for row "+highestrcount +" on "+ highestrindex );

    }
}
        
    
    

