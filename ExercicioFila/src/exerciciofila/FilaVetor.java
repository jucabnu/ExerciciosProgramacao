
package exerciciofila;

/**
 *
 * @author Juliano
 */
public class FilaVetor {

    private int n;      // quantidade de elementos inseridos
    private int ini;    // posição do próximo elemento a ser retirado da fila
    private int tam;    // tamanho máximo da fila
    private int[] vet;
    
    public FilaVetor(int tam){
        this.vet = new int[tam];        // inicializa vetor com n posições
        this.n = 0;                     // inicializa quantidade atual com zero
        this.ini = 0;                   // inicializa primeiro da fila com zero
        this.tam = tam;                 // inicializa tam com tamanho recebido
    }
    
    //      *** MÉTODOS INTERFACE ***
    
    
    // INSERE
    public void insere(int v) throws Exception{
    
        int fim;
        // verifica se a fila está cheia, se sim, lança exceção
        if(n == tam){
            throw new Exception("Erro: a capacidade da fila estourou!");
        }else{
            fim = (ini + n) % tam;      // define fim com a próxima posição livre
            this.vet[fim] = v;          // insere elemento no fim
            this.n++;                   // incrementa o número de elementos
        }        
    }
    
    // RETIRA
    public int retira() throws Exception{
    
        int v;                          // para salvar valor do inicio
        
        // verifica se fila está vazia
        if(n == 0){
            throw new Exception("ERRO: fila vazia!");
        }else{
            v = this.vet[ini];          // guarda vaor do inicio
            ini = (ini + 1) % tam;      // incrementa índice do início
            this.n--;                   // decrementa número de elementos
        }
        return v;
    }
    
    // VAZIA
    public boolean vazia(){
    
        if(n != 0){
            return false;
        }else{
            return true;
        }
    }
    
    // LIBERA
    public void libera(){
        
        this.n = 0;                     // reset no número de elementos
        this.ini = 0;                   // reset no inicio
        this.vet = new int[tam];        // reset no array
    }
    
    //      *** MÉTODOS CLASSE ***
    
    
    // MERGE
    public FilaVetor merge(FilaVetor f2) throws Exception{

        // clona para preservar
        FilaVetor fa = this.clone();
        FilaVetor fb = f2.clone();       

        // cria nova fila do tamanho do vetor das fila1 + fila2
        int tamanho = f2.getTam() + this.tam;
        FilaVetor f3 = new FilaVetor(tamanho);
        int tamanhoFilaNova = f2.getN() + this.n;
        
        for(int i = 0; i < tamanhoFilaNova; i++){
            if(!fa.vazia()){
                f3.insere(fa.retira());
            }
            if(!fb.vazia()){
                f3.insere(fb.retira());
            }        
        }
        return f3;
    }
    
    // CONCATENA
    public FilaVetor concatena(FilaVetor f2) throws Exception{
    
        // clona para preservar
        FilaVetor fa = this.clone();
        FilaVetor fb = f2.clone();
        
        int tamanho = this.tam + f2.getTam();
        FilaVetor f3 = new FilaVetor(tamanho);
        
        while(!fa.vazia()){
            f3.insere(fa.retira());
        }
        while(!fb.vazia()){
            f3.insere(fb.retira());
        }
        return f3;
    }
    
    
    // TOSTRING
    @Override
    public String toString(){
    
        String todos = "";
        for(int i = ini; i < n; i++){
            todos += vet[i] + ", ";
        }
        
        return todos;
    }
    
    //      *** MÉTODOS AUXILIARES ***
    
    
    // IMPRIME TODOS
    public void imprimeFila(){        
        // percorre do primeiro da fila até quantidade de elementos
        for(int i = ini; i < n; i++){
            System.out.println("vet[" + i + "] = " + this.vet[i]);
        }
    }
    
    // RETORNA O NÚMERO DE ELEMENTOS
    public int getN(){
        return n;
    }
    
    
    // RETORNA O TAMANHO DO ARRAY
    public int getTam(){
       return tam;
    }
    
    // CLONA FILA
    
    @Override
    public FilaVetor clone() throws CloneNotSupportedException{
        FilaVetor f = new FilaVetor(tam);
        f.n = this.n;
        f.ini = this.ini;
        f.vet = this.vet;        
        return f;
    }
    
    
    public int getProx(){    
        return 0;        
    }
    
}
