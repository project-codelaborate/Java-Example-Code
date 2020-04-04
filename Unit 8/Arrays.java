public class Arrays{
   public static void main(String[] args){
   // Initializing + Declaring an Array
   
   int[]numbers = new int[20];
   int[]hello = {1,2,3,4,5,6,7,8,9,10};
   //System.out.println(hello);
   // Accessing Array elements// 
//    System.out.println(hello[0]);
//    System.out.println(numbers[0]);
   numbers[1] = 3;
   System.out.println(numbers[1]);
   //System.out.println(numbers[20]);
   
   
   // Iterating through an array
   for (int i=0; i < hello.length; i++)
      System.out.print(hello[i] + " ");
   System.out.println();
   // Multidimensional arrays
   int[][] flowers = {{1,2,3},{3,4,5},{5,6,7}};
   
   System.out.println(flowers[1][1]);
   
   for (int i=0; i < 3; i++){
      for (int j=0; j < 3; j++)
         System.out.print(flowers[i][j] + " ");
   
   System.out.println();
   }
   
   
   byte[] bytes = {23,44,55};
   char[] chars = {'a','b'};
   String[] strings = {"Hello", "World"};
   
   
   }
}