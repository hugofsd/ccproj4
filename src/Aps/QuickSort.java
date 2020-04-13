package Aps;
import java.util.List;
public class QuickSort {
    
    public List Ordenar(List list){        
       quicksort(list, 0, list.size() - 1);
       return list;
    }
    
    private List quicksort(List list, int shift, int end)
   {
    int principal;
    if (shift < end) 
    {
    principal = separador(list, shift, end);
    quicksort(list, shift, principal - 1);
    quicksort(list, principal + 1, end);
         
    //Visualizar a ordenação
    System.out.println(list);
    }
    return list;
   }
    public int separador(List list, int comeco, int end)
    {
    int principal = (int) list.get(end);
    int p = comeco - 1;
    int shift;
        
    for(int j = comeco; j <= end - 1; j++)
    {
    if( (int) list.get(j) <= principal)
    {
    p++;
    shift = (int) list.get(p);
    list.set(p, list.get(j));
    list.set(j, shift);
    }}
    shift = (int) list.get(end);
    list.set(end , list.get(p + 1));
    list.set(p + 1, shift);
    return p+1;
    }
}
