import java.util.*;

public class Sorting{

   public static void main(String[]args){
        int[] array = {1,2,4,9,6,4,5,0,2,5,44,77,22,88};
        Arrays.sort(array);
        
        ArrayList <Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(99);
        arrayList.add(88);
        arrayList.add(77);
        arrayList.add(66);
        //System.out.println(arrayList);
        Collections.sort(arrayList);
        //System.out.println(arrayList);
        
        //int[] sortedArray = bubbleSort(array);
        int[] sortedArrayTwo = insertionSort(array);
                
        for (int i=0; i < sortedArrayTwo.length; i++){
            System.out.print(sortedArrayTwo[i] + " ");
        }
   }
   
   public static int[] bubbleSort(int[] array){
      boolean sorted = false;
      int temp;
      while(!sorted){
         sorted = true;
         for (int i =0; i < array.length -1; i++){
            if (array[i] > array[i+1]){
               temp = array[i];
               array[i] = array[i+1];
               array[i+1] = temp;
               sorted = false;
            }
         }return array;
         
      }
   
    return array;
   
   }
   
   public static int[] insertionSort(int[] array){
      for (int i = 0; i < array.length; i++){
         int current = array[i];
         int j = i -1;
         while (j >=0 && current < array[j]){
            array[j+1] = array[j];
            j--; 
         }
         
         array[j+1] = current;
      }
      return array;
   
   }
}