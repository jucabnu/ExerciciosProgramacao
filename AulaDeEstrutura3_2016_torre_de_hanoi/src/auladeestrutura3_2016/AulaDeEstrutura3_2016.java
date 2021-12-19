/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladeestrutura3_2016;
import java.util.Scanner;

/**
 *
 * @author Juliano
 */
public class AulaDeEstrutura3_2016 {

    /**
     * @param args the command line arguments
     */
    
    public static void hanoi(int n, char de, char para, char tmp){
        if(n == 1){
            System.out.println("Move disco " + de + " para o pino " + para);
            passos++;
        }else{
            hanoi(n-1, de, tmp, para);
            System.out.println("Move disco " + de + " para o pino " + para);    
            hanoi(n-1, tmp, para, de);
            passos++;
        }
    }
    
    public static int passos;
    
    public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
            System.out.print("Quantos discos: ");          
            hanoi(entrada.nextInt(), 'A', 'B', 'C');
            System.out.println("Passos: " + passos);
            passos = 0;
      
    }
    
}
