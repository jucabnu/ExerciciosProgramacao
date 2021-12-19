package exerciciofila;

/**
 *
 * @author Juliano
 */
public class FilaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        int insere = 6;
        int tamanho = 10;

        FilaVetor f = new FilaVetor(tamanho);

        System.out.println("Vazia? : " + f.vazia());
        for (int i = 1; i <= insere; i++) {
            f.insere(i);
        }

        System.out.println("Vazia? : " + f.vazia());
        System.out.println(f);
        System.out.println(f.retira());
        System.out.println(f);
        
        System.out.println("Vazia? : " + f.vazia());
        f.libera();
        
        System.out.println("Vazia? : " + f.vazia());

//f.imprimeFila();
        
        
        // FILAS PARA TESTAR MERGE E CONCATENA
        
        System.out.println("-----------------------------------");
        System.out.println("filas para testar merge e concatena");
        System.out.println("-----------------------------------");

        
        FilaVetor f1 = new FilaVetor(12);
        f1.insere(3);
        f1.insere(4);
        f1.insere(9);        
        System.out.println("f1: " + f1);
        
        FilaVetor f2 = new FilaVetor(4);
        f2.insere(6);
        f2.insere(6);
        f2.insere(2);
        f2.insere(8);
        System.out.println("f2: " + f2);

        
        
        System.out.println("--------------------------------");
        System.out.println("        teste concatena         ");
        System.out.println("--------------------------------");
        
       
        FilaVetor f3 = f1.concatena(f2);
        System.out.println("f3: " + f3);
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        
        System.out.println("--------------------------------");
        System.out.println("        teste merge             ");
        System.out.println("--------------------------------");
        
        FilaVetor f4 = f1.merge(f2);
        System.out.println("f4: " + f4);
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
    }
}
