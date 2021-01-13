package listametodoshellu5e5;

import java.util.LinkedList;
import java.util.List;

public class ListaMetodoShellU5E5 {

     public static void main(String[] args) {
         // TODO code application logic here
         System.out.println("Ejercicio 5 ordenamiento Shellsort");
         List<Integer> Lista = new LinkedList<Integer>();
         Lista.add(9);
         Lista.add(30);
         Lista.add(40);
         Lista.add(1);
         Lista.add(89);
         Lista.add(100);
         Lista.add(122);
         //Lista.add();
         System.out.println("");
         System.out.println("Lista desordenada: "+"\n"+Lista);
         Shellsort(Lista);
         System.out.println("");
         System.out.println("Lista ordenada: ");
         System.out.println(Lista);
     }
     public static void Shellsort(List <Integer> Lista){
         int i, j, k, auxiliar, salto;
         salto = Lista.size() / 2;
         while(salto > 0){
             for (i = salto; i < Lista.size(); i++) {
                 j = i - salto;
                 while (j>=0) {
                     k = j + salto;
                     if(Lista.get(j) >= Lista.get(k)){
                         auxiliar=Lista.get(j);
                         Lista.set(j, Lista.get(k));
                         Lista.set(k, auxiliar);
                         j -= salto;
                     }else{
                         break;
                     }
                 }
             }
             salto/=2;
         }
     }
    
}
