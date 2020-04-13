package Aps;

import java.util.List;

public class BubbleSort {
    public List Ordenar (List ordenacao) {
    int size = ordenacao.size();
    for(int i = 0; i < size; i++) {
    for(int j = i + 1; j < size; j++) {
    if((int) ordenacao.get(i) > (int) ordenacao.get(j))
    {
    int auxiliar = (int) ordenacao.get(i);
    ordenacao.set(i, ordenacao.get(j));
    ordenacao.set(j, auxiliar);
    
    // Visualizar a ordenação. 
    System.out.println(ordenacao); 
    }}}

    return ordenacao;
    }
}
