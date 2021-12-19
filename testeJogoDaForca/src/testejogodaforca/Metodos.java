/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testejogodaforca;

public class Metodos {

public static String secretWord = "hello";
  public static char[] mask = new char[secretWord.length()];
  
  // cria mascara
  public static void criaMascara(){
    for(int i = 0; i < secretWord.length(); i++){
      mask[i] = '_';
      
    }  
  }
  
  // imprime mascara
  public static void imprimeMascara(){
    for(int j = 0; j < mask.length; j++){
      System.out.print(mask[j]);
    }
  }

    
    
    
}
