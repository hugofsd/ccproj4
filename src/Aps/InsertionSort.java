package Aps;

import java.util.List;

public class InsertionSort {
    
   public List Ordenar (List list) {
   int size = list.size();
   for(int i = 1; i < size; i++){
   int key = (int) list.get(i);
   int j = i - 1;
   while(j >= 0 && (int) list.get(j) > key) {
   list.set(j+1, list.get(j));
   j = j-1;}
   list.set(j+1, key);
   
   
   // Visualizar a ordenação. 
   System.out.println(list);
}
        return list;
}
}
