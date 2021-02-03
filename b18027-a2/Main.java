import syntaxtree.*;
import visitor.*;

public class Main {
   public static void main(String [] args) {
      try {
         Node root = new SurajParser(System.in).Goal();
         ass22visitor vv=new ass22visitor();
         root.accept(vv, null);
         boolean noerror=vv.geterror();
         if (noerror) 
         {
            System.out.println("Yay, Garfield can eat your program!");
         }
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 
