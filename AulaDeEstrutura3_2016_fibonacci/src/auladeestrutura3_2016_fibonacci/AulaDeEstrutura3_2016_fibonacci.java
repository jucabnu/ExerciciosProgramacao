/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladeestrutura3_2016_fibonacci;

/**
 *
 * @author Juliano
 */
public class AulaDeEstrutura3_2016_fibonacci {

    public static int fibo(int n){
        if(n <= 0){
            return 0;
        }else{
            if(n == 1){
                return 1;
            }else{
                return fibo(n-1) + fibo(n-2);
            }
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(fibo(4));
        
    }
    
}
