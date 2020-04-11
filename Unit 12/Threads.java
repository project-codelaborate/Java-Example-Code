import java.lang.Thread;

public class Threads{
   public static void main(String[]args){
      System.out.println("Hello World");
      
      One one = new One();
      Two two = new Two();
      
      one.start();
      try{Thread.sleep(10);}catch(Exception e){}
      two.start();
      
   }
}


class One extends Thread{
    
    public void run(){
      for(int i =0; i < 6; i++){
            System.out.println("One");
            try{Thread.sleep(500);}catch(Exception e){}
         }
         
    }
}

class Two extends Thread{  
    public void run(){
      for(int i =0; i < 6; i++){
            System.out.println("Two");
            try{Thread.sleep(500);}catch (Exception e){}
         }
    }
}