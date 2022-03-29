/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;
import java.util.*;
import java.io.*;
/**
 *
 * @author alexandrosaristeridis
 */
public class Factorial {
    public int facto(int n){
       int factorial = n;
for (int j = n - 1; j > 0; j--) {
    factorial = factorial * j;
}
return factorial;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factorial obj=new Factorial();
        Scanner s = new Scanner(System.in);

        System.out.println("dose factorial");

        int n=s.nextInt();

        
        System.out.println(obj.facto(n));
    }

}
