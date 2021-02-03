import syntaxtree.*;
import visitor.*;
import java.util.*;
public class Main {
   public static void main(String [] args) {
      try {
         Node root = new NanoJavaParser(System.in).Goal();
         ass4visitor vv = new ass4visitor();
         root.accept(vv); // Your assignment part is invoked here.
         // System.out.println("Yo boi passed successfully :-)");
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 
