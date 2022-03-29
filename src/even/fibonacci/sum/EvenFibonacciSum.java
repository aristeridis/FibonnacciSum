/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package even.fibonacci.sum;
import java.util.*;
/**
 *
 * @author alexandrosaristeridis
 */
public class EvenFibonacciSum {
   
    public Integer fibonacci(Integer i) {
         if (i == 1) {
    return 1;
} else if (i == 0) {
    return 0;
} else {
    return fibonacci(i - 1) + fibonacci(i - 2);
}}
    public Integer evenFibonacciSum(Integer n) {
    int sum=0;
    int f=0;
             for (int i = 2; i <=n; i++) {
                 if(i%2==0){
                 f=fibonacci(i - 1) + fibonacci(i - 2);
                 sum+=f;
             }}
    
    return sum;
}
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
         System.out.println("dose int");
          int n=s.nextInt();
           EvenFibonacciSum fb =new EvenFibonacciSum();
        System.out.println(fb.evenFibonacciSum(n));
    }
    
}
