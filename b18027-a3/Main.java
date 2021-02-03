import syntaxtree.*;
import visitor.*;
import java.util.*;
public class Main {
   public static void main(String [] args) {
      try {
         Node root = new LasagnePPJavaParser(System.in).Goal();
         collector vvv = new collector();
         root.accept(vvv,null);
         Map<String,Map<String,String>> topass=vvv.getTable();
         // System.out.println(topass.size());
         attemp3 vv = new attemp3();
         root.accept(vv,topass); // Your assignment part is invoked here.
         
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 
