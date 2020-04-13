package Aps;
import java.util.List;
public class Time {

  public double BubbleSort(List list) {
  BubbleSort bubble = new BubbleSort();
  double startTime = System.nanoTime();
  bubble.Ordenar(list);
  double horaParada = System.nanoTime();
        
  return (horaParada - startTime)/1000000;
    }
    
  public double InsertionSort(List lista) {
  InsertionSort insertion = new InsertionSort();
  double startTime = System.nanoTime();
  insertion.Ordenar(lista);
  double stopTime = System.nanoTime();
        
  return (stopTime - startTime)/1000000;
    }
    
  public double QuickSort(List lista) {
  QuickSort quick = new QuickSort();
        
  double startTime = System.nanoTime();
  quick.Ordenar(lista);
  double stopTime = System.nanoTime();
        
  return (stopTime - startTime)/1000000;
    }
    
  public double SelectionSort(List lista) {
  SelectionSort selection = new SelectionSort();
        
  double startTime = System.nanoTime();
  selection.Ordenar(lista);
  double stopTime = System.nanoTime();
        
  return (stopTime - startTime)/1000000;
    }
    
  public double MergeSort(List lista) {
  MergeSort merge = new MergeSort();
  double startTime = System.nanoTime();
  merge.Ordenar(lista);
  double stopTime = System.nanoTime();
        
  return (stopTime - startTime)/1000000;
    }
}
