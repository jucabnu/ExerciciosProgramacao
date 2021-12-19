/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testejogodaforca;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jucabnu
 */
public class TesteJogoDaForca {

    public static Scanner read = new Scanner(System.in);
    
    private String[] wordSet = {
        "mundo",
        "world",
        "hello",
        "pterodactilo",
        "paralelepipedo",
        "abacate",
        "trolha"
    };

    
    // declara variável que guarda a palavra secreta
    private String secretWord = Hangman();

    // seleciona uma das palavras e guarda em secretWord
    public String Hangman() {
        double teste = Math.random() * 7;
        // double teste = Math.random() * 10;
        int num = (int) teste;
        secretWord = wordSet[num];
        return secretWord;
    }

    // cria string com "_" do mesmo tamanho que a secretWord
    public String criaMascara(){
    
        String mascara;
        
        for(int i = 0; i < secretWord.length(); i++)
    
        return mascara;
    
    }

    public void Testes(){
    
        // determinar tamanho da secretword
        // this.secretWord.length();
        System.out.println("palavra secreta: " + secretWord);       
        
            System.out.println("Informe caractere: ");
            String a = read.next();
            char c = a.charAt(0);
            
            for(int i = 0; i < secretWord.length(); i++){
                
                if(c == secretWord.charAt(i)){
                    
                    System.out.println("Acertou!");
                    System.out.println("Posição: " + secretWord.indexOf(c));
                    
                }else{
                
                    System.out.println("Errou");
                }
            
            }
            
        
            
    }
    
    public static void main(String[] args) {
        
        TesteJogoDaForca teste = new TesteJogoDaForca();
        
        teste.Testes();
        
    }
}
