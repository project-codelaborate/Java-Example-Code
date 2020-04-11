import java.lang.Thread;

public class RunnableInterface{
   public static void main(String[]args){
      System.out.println("Hello World");
      
      One one = new One();
      Two two = new Two();
      
      Thread t1 = new Thread(one);
      Thread t2 = new Thread(two);
      
      t1.start();
      try{Thread.sleep(10);}catch (Exception e){}
      t2.start();
      
   }
}

class One implements Runnable{
   
   public void run(){
      for(int i = 0; i < 6; i ++){
         System.out.println("One");
         try{Thread.sleep(500);}
         catch(Exception e){}
      
      }
   }
}

class Two implements Runnable{
   
   public void run(){
      for(int i = 0; i < 6; i ++){
         System.out.println("Two");
         try{Thread.sleep(500);}
         catch(Exception e){}
      }
   }
}