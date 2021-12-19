/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testequicksort;

/**
 *
 * @author Juliano
 */
public class QuickSort {
 
    public static void quick_sort(int []v,int ini, int fim) {
   int meio;
 
   if (ini < fim) {
     meio = partition(v, ini, fim);
     quick_sort(v, ini, meio);
     quick_sort(v, meio + 1, fim);
   }
 }
 
 public static int partition(int []v, int ini, int fim) {
   int pivo, topo, i;
   pivo = v[ini];
   topo = ini;
 
   for (i = ini + 1; i <= fim; i++) {
     if (v[i] < pivo) {
       v[topo] = v[i];
       v[i] = v[topo + 1];
       topo++;
     }
   }
   v[topo] = pivo;
   return topo;
 }
    
    
}


 