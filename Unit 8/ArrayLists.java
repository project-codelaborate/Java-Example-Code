import java.util.ArrayList;

public class ArrayLists{
   public static void main (String[] args){
      //Declare ArrayList
      
      ArrayList<Integer> list = new ArrayList<Integer>();
      
      //Add Elements
      list.add(3);
      list.add(4);
      list.add(6);
      list.add(7);
      list.add(10);
      
      // Print ArrayList
      
      System.out.println(list);
      
      //Replace Elements
      
      list.set(2,99);
      System.out.println(list);
      
      //Remove Elements
      list.remove(3);
      System.out.println(list);
      
      //Insert Element
      list.add(2,5);
      System.out.println(list);
      
      //Iterating Through an ArrayList
      for (int i =0; i < list.size(); i++){
         System.out.print(list.get(i) + " ");
      }
      
      System.out.println();
      ArrayList <Object> listTwo = new ArrayList<Object>();
      listTwo.add("Hello World");
      listTwo.add(4);
      System.out.println(listTwo);
      
   }
}