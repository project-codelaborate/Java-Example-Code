import java.lang.Thread;

public class ThreadPriority{
   public static void main(String[]args){
      System.out.println("Hello World");
      
      One one = new One();
      Two two = new Two();
      
      Thread t1 = new Thread(one, "One Thread");
      Thread t2 = new Thread(two);
      t2.setName("Two Thread");
      System.out.println(t1.getName());
      System.out.println(t2.getName());
      
      System.out.println(t1.getPriority());
      System.out.println(t2.getPriority());
      t1.setPriority(Thread.MAX_PRIORITY);
      t2.setPriority(Thread.MIN_PRIORITY);
      System.out.println(t1.getPriority());
      System.out.println(t2.getPriority());


      t1.start();
      try{Thread.sleep(10);}catch(Exception e){}
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