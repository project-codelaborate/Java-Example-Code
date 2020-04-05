import java.util.*;

public class SetInterface{
   public static void main(String[]args){
     
     Set<Integer>numbers = new HashSet<Integer>();
     
     numbers.add(1);
     numbers.add(2);
     numbers.add(8);
     numbers.add(2);
     
     for (int i : numbers){
         System.out.print(i + " ");
     }
     System.out.println();
     
     Set<Integer>values = new TreeSet<Integer>();
     
     values.add(3);
     values.add(88);
     values.add(73);
     values.add(3);
     
   for (int i : values){
         System.out.print(i + " ");
     }
     System.out.println();
    Set<Integer> nums = new LinkedHashSet<Integer>();
    
    nums.add(99);
    nums.add(23);
    nums.add(44);
    nums.add(23);
    
   for (int i : nums){
         System.out.print(i + " ");
     }
     
      }
   }