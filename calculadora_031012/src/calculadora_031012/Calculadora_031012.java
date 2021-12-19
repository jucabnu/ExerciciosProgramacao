package calculadora_031012;
import java.util.Scanner;

public class Calculadora_031012 {
    
    static Scanner entrada; //declarando variável global "teclado" do tipo Scanner
    
    
    static double calculaSalario(int funcao, float horas) //rebebe número correspondente à função e calcula o salário
            
    static double calculaHE(int)
    
    static double calculaINSS(double valor) //recebe valor do salário e retorna calculado
    
    static double calculaIRPF(double valor) //recebe valor de calculaINSS e retorna calculado
            
    static 
            
      
            
            
    
    static String LerOperador(){
    
        Scanner entrada = new Scanner(System.in); 
        String opera;
        
        do{
            System.out.print("Informe o operador desejado: ");
            opera = entrada.nextLine();
            if(!opera.equals("+") || !opera.equals("-") || !opera.equals("*") || !opera.equals("/")){
                System.out.println("Operador inválido!");
            }
        
        }while(!opera.equals("+") || !opera.equals("-") || !opera.equals("*") || !opera.equals("/"));
        
        return opera;
    }
    
    
    static int LerInteiro(String msg){ 
        
        //parâmetro recebido é a String no () da chamada.
        //static int pois vai retornar inteiro
        
        Scanner entrada = new Scanner(System.in); 
        int num;
        
        do{
            System.out.print(msg); //passa o parâmetro como texto para o print
            num = entrada.nextInt();
            if(num < 0){
                System.out.println("Número inválido, digite número maior que 0");
            }
        }while(num < 0); //enquanto num é menor que 0, repita.
        
        return num;
        
    }
            
            

    public static void main(String[] args) {        
    
        //Scanner entrada = new Scanner(System.in); 
        //inicializando variável entrada (instanciando)
               
        
        int num1 = LerInteiro("Informe o primeiro número: ");
        int num2 = LerInteiro("Informe o segundo número: ");
        String opera = LerOperador();
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(opera);
        
        
        
        //Criar Swith Case para calcular com base no Leroperador().
        
        /*
        int[] arrayNome = new int[10]; //criacao do array de inteiros com 10 posicoes

        for (int i = 0; i < arrayNome.length; i++) {
            System.out.print("Digite numero: ");
            arrayNome[i] = entrada.nextInt();
        */
        
    }
}
