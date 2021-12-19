
package aulaordenacao200814;

public class AulaOrdenacao200814 {

    
    public static int[] embaralha(int[] cadeia){
    int aux;
        for(int i = 0; i < cadeia.length; i++){
        
            int ran = (int) Math.random();
            aux = cadeia[i];
            cadeia[i] = cadeia[ran];
            cadeia[ran] = aux;
        }
        return cadeia;
    
    }
    
    
    
    public static void main(String[] args) {
    
        int[] cadeia[10];
        
        
    }
        
    }
    
}
