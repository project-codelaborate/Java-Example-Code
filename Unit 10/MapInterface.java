import java.util.*;

public class MapInterface{
   public static void main(String[]args){
      
      Map <String, String> map = new HashMap<String, String>();
      
      map.put("Name", "Joe");
      map.put("Color", "Blue");
      map.put("Animal", "Cat");
      map.put("Color", "Red");
      
      System.out.println(map);
      
      Set<String>keys = new HashSet<String>();
      keys = map.keySet();
      System.out.println(keys);
      
      for( String key : keys){
         System.out.println(map.get(key));
      }
      
      Map<String,String> mapTwo = new LinkedHashMap<>();
      Map<String,String>mapThree = new TreeMap<>();
      
   }

}