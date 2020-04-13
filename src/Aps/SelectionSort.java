package Aps;
import java.util.List;
public class SelectionSort{
    
      public List Ordenar(List list) 
    {   
      int aux, segMenor = (int)list.get(1);
      
      for(int i = 1; i < list.size()-1; i++)
      {
         for(int j = i+1; j<list.size(); j++){
              if((int) list.get((int)segMenor)> (int)list.get(j))
              {segMenor = j;}}
            
         if((int)list.get(i)>(int) list.get((int) segMenor))
         {   
            //Visualizar a ordenação
            System.out.println(list); 
            aux = (int) list.get((int) segMenor);
            list.set((int) segMenor, list.get(i));
            list.set(i, aux);
         }
      }
     return list;
    }
}
