package auladeestrutura_2016_exercicios_classificacao;
import java.util.Scanner;
import java.util.Random;

public class AulaDeEstrutura_2016_exercicios_classificacao {
    
    public static Scanner en = new Scanner(System.in);
    
    public static void main(String[] args) {

        int vet[] = new int[20];
        Random r = new Random();
        
        for(int q = 0; q < vet.length; q++){
            vet[q] = r.nextInt(100);
        }
        
       
        
        for(int a = 0; a < vet.length; a++){
            System.out.print(vet[a] + ", ");
        }

        
        
        for(int i = vet.length-1; i >= 1; i--){
            for(int j = 0; j < i; j++){
                if(vet[j] > vet[j+1]){
                    int aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        
        System.out.println("");
        
        
        for(int b = 0; b < vet.length; b++){
            System.out.print(vet[b] + ", ");
        }
        
    }
    
}
