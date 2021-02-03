import syntaxtree.*;
import visitor.*;
import java.util.*;
public class Main {
   public static void main(String [] args) {
      try {
         Node root = new CalcExpr(System.in).Goal();
         ass1visitor vv=new ass1visitor();
         root.accept(vv); // Your assignment part is invoked here.
         Vector<String> m=new Vector<String>();
         Integer mh=0;
         Integer mm=0;
         Integer dead=0;
         Vector<String> maj=new Vector<String>();
         Integer curr=0;
         Map<String,Integer> health=vv.gethealth();
         Map<String,Vector<String>> val=vv.getvalues();
         for(String i:val.keySet()){
            curr=0;
            for(String j:val.get(i))
            {
               if(health.get(j)==mh)
               {
                  m.add(j);
               }
               if(health.get(j)>mh)
               {
                  mh=health.get(j);
                  Vector<String> temp=new Vector<String>();
                  temp.add(j);
                  m=temp;
               }
               if(health.get(j)<=0) dead++;
               else curr++;
            }
            if(curr==mm)
            {
               maj.add(i);
            }
            if(curr>mm)
            {
               mm=curr;
               Vector<String> temp=new Vector<String>();
               temp.add(i);
               maj=temp;
            }

         }
         Integer n=maj.size();
         System.out.println(dead);
         Collections.sort(maj);
         if(mh>0){
            for(int i=0;i<n-1;i++) {System.out.print(maj.get(i));System.out.print(" ");}
            System.out.println(maj.get(n-1));
         }
         else System.out.println("\n");
         Collections.sort(m);
         n=m.size();
         for(int i=0;i<n-1;i++)
         {
            System.out.print(m.get(i));System.out.print(" ");
         }
         System.out.println(m.get(n-1));


         

      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 
