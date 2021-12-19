/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciofila;

/**
 *
 * @author Juliano
 */
public interface Fila {
    
    void insere(int v) throws Exception;
    
    int retira() throws Exception;
    
    boolean vazia();
    
    void libera();
    
}
