
package exercicioexcecao;

public class ExercicioExcecao {

    public static void main(String[] args) {
    
        
        //System.out.println(10/0);
        
        
        try{
        
            System.out.println(10 / 0);
        
        }catch(Exception e){
            System.out.println("Erro. Divisão por zero!");
        
        }
        
        
    }
    
}
