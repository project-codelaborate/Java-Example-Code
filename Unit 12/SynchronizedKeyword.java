public class SynchronizedKeyword{
   public static void main(String[]args){
   
   Addition add = new Addition();
   
   Thread t1 = new Thread(add);
   Thread t2 = new Thread(add);
   
   t1.start();
   t2.start();
   
   try{
      t1.join();
      t2.join();
   }catch (Exception e){}
   
   System.out.println("Amount: " + add.amount); 
        
   }
}

class Addition implements Runnable{

   int amount = 0;
   public synchronized void run(){
   for (int i = 0; i < 1000000; i++){
      amount+=2;
   }}
}