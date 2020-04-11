import java.io.*;

public class ReadWriteFiles{
   public static void main(String[]args) throws Exception{
      
      File f = new File("test.txt");
      FileOutputStream fOut = new FileOutputStream(f);
      DataOutputStream dOut = new DataOutputStream(fOut);
      
      dOut.writeUTF("Hello World"); 
      
      FileInputStream fIn = new FileInputStream(f);
      DataInputStream dIn = new DataInputStream(fIn);
      String content = dIn.readUTF();
      
      System.out.println(content);
      
   }

}