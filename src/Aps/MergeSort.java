package Aps;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
 
    public List Ordenar(List list) {
    if (list.size() < 2)
    
    {
    return list;
    }
    
    int m = list.size()/2;
    return merged(
    
    Ordenar(list.subList(0, m)), 
    Ordenar(list.subList(m, list.size())));
    
  }

  private static List merged(List left, List right) {
    int indiceEsquerdo = 0;
    int indiceDireito = 0; 

    List merged = new ArrayList();

    while (indiceEsquerdo < left.size() && indiceDireito < right.size()) {
      
    if ((int) left.get(indiceEsquerdo) < (int) right.get(indiceDireito)) {
    merged.add(left.get(indiceEsquerdo++));} 
    else {
    merged.add(right.get(indiceDireito++));
    }
      
    // Visualizar a ordenação. 
    System.out.println(merged); 
    }
    merged.addAll(left.subList(indiceEsquerdo, left.size()));
    merged.addAll(right.subList(indiceDireito, right.size()));
    return merged;
  }
}
