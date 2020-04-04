public class Sorting{

   public static void main(String[]args){
        int[] array = {1,2,4,9,6,4,5,0,2,5,44,77,22,88};
        int[] sortedArray = bubbleSort(array);
        for (int i=0; i < sortedArray.length; i++){
            System.out.print(sortedArray[i] + " ");
        }
   }
   
   public static int[] bubbleSort(int[] a){
      boolean sorted = false;
    int temp;
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]) {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                sorted = false;
            }
        }
    }
    return a;
   
   }
   
   public static void insertionSort(){
   
   }
}