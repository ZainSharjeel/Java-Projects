/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ramanujan.java;
import java.util.*;
/**
 *
 * @author HP
 */
public class RamanujanJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input=new Scanner(System.in);
    System.out.println("Please enter the number");
    
    int n=input.nextInt();
    
    int a, b, c, d, aCube, bCube, cCube, dCube;
    
    for (a = 1 ;a <= n; a++){
        aCube = a * a * a;
        if (aCube > n){
            break;
        }
        for (b = a ;b <= n; b++){
            bCube = b * b * b;
            if (aCube + bCube > n){
                break;
            }
            for (c= a + 1; c <= n; c++){
                cCube = c * c * c;
                if (cCube > aCube + bCube){
                    break;
                }
                for (d = c; d <= n; d++){
                    dCube = d * d * d;
                    if (cCube + dCube > aCube + bCube){
                        break;
                    }
                    if (cCube + dCube == aCube + bCube){
                        System.out.print((aCube + bCube) + " = ");
                        System.out.print(a + "^3 + " + b + "^3 = " );
                        System.out.print(c + "^3 + " + d + "^3");
                        System.out.println();
                    }
                }
            }
        }
    }
    }
}
 
    
    

