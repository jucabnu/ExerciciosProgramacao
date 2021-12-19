package auladeestrutura3_2016_exercicios;
import java.util.Scanner;

public class AulaDeEstrutura3_2016_exercicios {

    public static Scanner entrada = new Scanner(System.in);
    
    // minha solução
    public static int multiplica(int n1, int n2, int soma){
       if(n1 > 0){
           soma = soma + n2;
           return multiplica(n1-1, n2, soma);
       }else{
           return soma;
       }      
    }
    
    // solução do professor
    public static int multiplica(int n1, int n2){       
        if(n2 == 1){
            return n1;
        }else{
            return n1 + multiplica(n1, n2 - 1);
        }        
    }
    
    public static void inverter(String palavra){        
        if(palavra.length() > 0){
            inverter(palavra.substring(1,palavra.length()));
            System.out.print(palavra.charAt(0));
        }        
    }
    
    public static int potencia(int b, int e){    
        if(b == 0){
            return 1;
        }else{
            if(e == 0){
                return 1;
            }else{
                return (b * potencia(b, e-1));
            }
        }
    }
    
    
    public static void main(String[] args) {

        /*
        System.out.print("Informe numero: ");
        int a = entrada.nextInt();
        System.out.print("Informe numero: ");
        int b = entrada.nextInt();
        System.out.println(multiplica(a, b, 0));
        */
        
        /*
        inverter("Juliano");
        */
        
        /*
        System.out.println(potencia(2, 4));
        */
        
        
        
        
    }
    
}
