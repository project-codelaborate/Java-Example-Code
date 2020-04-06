import java.lang.Thread;

public class ThreadStatesAndControl{
   
   public static void main(String[]args){
      System.out.println("Hello World");
      
      One one = new One();
      Two two = new Two();
      
      Thread t1 = new Thread(one);
      Thread t2 = new Thread(two);
      
      t1.start();
      System.out.println(t1.isAlive());
      try{Thread.sleep(10);}catch(Exception e){}
      t2.start();
   try{
      t1.join();
      t2.join();}catch(Exception E){}
      
      System.out.println("Done");
      System.out.println(t1.isAlive());
       
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