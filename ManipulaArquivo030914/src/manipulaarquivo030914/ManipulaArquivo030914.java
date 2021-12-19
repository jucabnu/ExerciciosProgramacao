
package manipulaarquivo030914;

import java.io.File;
import java.io.IOException;

public class ManipulaArquivo030914 {

    public static void main(String[] args) throws IOException {
    
        File f = new File("C:/teste/teste.txt");
        
        // verifica se está oculto
        System.out.println(f.isHidden());
        
        // verifica se existe
        System.out.println(f.exists());
        
        // criar diretório
        File f2 = new File("C:/teste/teste2");
        f2.mkdir();
        
        // lista arquivos do diretório
        File f1 = new File("C:/");        
        File[] files = f1.listFiles();        
        for(File fx : files){
            System.out.println(fx.getName());
        }     
        
        // "C:/teste/teste1.txt"
        
    }
    
}
