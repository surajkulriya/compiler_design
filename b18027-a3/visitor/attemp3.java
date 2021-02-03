//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public class attemp3<R,A> implements GJVisitor<R,A> {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public R visit(NodeList n, A argu) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this,argu);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeListOptional n, A argu) {
      if ( n.present() ) {
         R _ret=null;
         int _count=0;
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this,argu);
            _count++;
         }
         return _ret;
      }
      else
         return null;
   }

   public R visit(NodeOptional n, A argu) {
      if ( n.present() )
         return n.node.accept(this,argu);
      else
         return null;
   }

   public R visit(NodeSequence n, A argu) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this,argu);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeToken n, A argu) { return null; }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> MainClass()
    * f1 -> ( TypeDeclaration() )*
    * f2 -> <EOF>
    */

    int pkmkb=0;
    public String newTemp(){
        return "JaiShreeRam"+pkmkb++;
    }


    String code="";

    String topclass="";
    String middleclass="";
    String lowerclass="";

    String topmethod="";
    String midmethod="";
    String lowermethod="";

    Map<String,String> classvar=new HashMap<String,String>();
    Map<String,String> methodvar=new HashMap<String,String>();
    Map<String,String> methodpara=new HashMap<String,String>();

    int method=0;

    Map<String,Map<String,String>> data=collector.table;
    String ptype="int";
    String latcond;
   public R visit(Goal n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      System.out.println(code);
    //  System.out.println(data.size());
    //   for(Map.Entry<String,Map<String,String>> entry: data.entrySet()){
    //      System.out.println(entry.getKey());
    //      for(Map.Entry<String,String> a:entry.getValue().entrySet()){
    //         System.out.println(a.getKey());
    //         System.out.println(a.getValue());
    //      }

    //   }
      return _ret;
   }

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> "public"
    * f4 -> "static"
    * f5 -> "void"
    * f6 -> "main"
    * f7 -> "("
    * f8 -> "String"
    * f9 -> "["
    * f10 -> "]"
    * f11 -> Identifier()
    * f12 -> ")"
    * f13 -> "{"
    * f14 -> PrintStatement()
    * f15 -> "}"
    * f16 -> "}"
    */
   public R visit(MainClass n, A argu) {
      R _ret=null;
      method=0;
      topclass+="class "+n.f1.f0.tokenImage+" {\n";
      topclass+="public static void main(String[] "+n.f11.f0.tokenImage+") {\n";
      n.f1.accept(this, argu);
      n.f11.accept(this, argu);
      n.f14.accept(this, argu);
      for(Map.Entry<String,String> i:classvar.entrySet()){
        middleclass+=i.getValue()+" "+i.getKey()+" ;\n";
      }
      // System.out.println(lowerclass);
      lowerclass+="  }\n }\n";
      code+=topclass+middleclass+lowerclass;
      // code+=lowerclass;
      topclass="";middleclass="";lowerclass="";
      classvar.clear();
      return _ret;
   }

   /**
    * f0 -> ClassDeclaration()
    *       | ClassExtendsDeclaration()
    */
   public R visit(TypeDeclaration n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> ( VarDeclaration() )*
    * f4 -> ( MethodDeclaration() )*
    * f5 -> "}"
    */
    String latclass;
   public R visit(ClassDeclaration n, A argu) {
      R _ret=null;
      latclass=n.f1.f0.tokenImage;
      topclass+="class "+n.f1.f0.tokenImage+" {\n";
      n.f1.accept(this, argu);
      n.f3.accept(this, argu);
      for(Map.Entry<String,String> i:classvar.entrySet()){
          middleclass+=i.getValue()+" "+i.getKey()+" ;\n";
      }
      n.f4.accept(this, argu);
      lowerclass+="}\n";
      code+=topclass+middleclass+lowerclass;
      topclass="";middleclass="";lowerclass="";
      classvar.clear();
      return _ret;
   }

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "extends"
    * f3 -> Identifier()
    * f4 -> "{"
    * f5 -> ( VarDeclaration() )*
    * f6 -> ( MethodDeclaration() )*
    * f7 -> "}"
    */
   public R visit(ClassExtendsDeclaration n, A argu) {
      R _ret=null;
      latclass=n.f1.f0.tokenImage;
      topclass+="class "+n.f1.f0.tokenImage+" extends "+n.f3.f0.tokenImage+" {\n";
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f3.accept(this, argu);
      n.f5.accept(this, argu);
      for(Map.Entry<String,String> i:classvar.entrySet()){
        middleclass+=i.getValue()+" "+i.getKey()+" ;\n";
      }
      n.f6.accept(this, argu);
      lowerclass+="}\n";
      code+=topclass+middleclass+lowerclass;
      topclass="";middleclass="";lowerclass="";
      classvar.clear();
      return _ret;
   }

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> ";"
    */
   public R visit(VarDeclaration n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      if(method==1){
        methodvar.put(n.f1.f0.tokenImage,(String)n.f0.accept(this,argu));
      }
      else{
          classvar.put(n.f1.f0.tokenImage,(String)n.f0.accept(this,argu));
      }
      return _ret;
   }

   /**
    * f0 -> "public"
    * f1 -> Type()
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> ( FormalParameterList() )?
    * f5 -> ")"
    * f6 -> "{"
    * f7 -> ( VarDeclaration() )*
    * f8 -> ( Statement() )*
    * f9 -> "return"
    * f10 -> Expression()
    * f11 -> ";"
    * f12 -> "}"
    */
   public R visit(MethodDeclaration n, A argu) {
      method=1;
      R _ret=null;
      topmethod+="public "+(String)n.f1.accept(this,argu)+" "+n.f2.f0.tokenImage+"(";
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f4.accept(this, argu);
      topmethod+=") {\n";
      n.f7.accept(this, argu);
      n.f8.accept(this, argu);
      
      String toadd="return "+(String)n.f10.accept(this,argu)+" ;\n}\n";
      for(Map.Entry<String,String> i:methodvar.entrySet()){
         midmethod+=i.getValue()+" "+i.getKey()+" ;\n";
       }
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      lowerclass+=topmethod+midmethod+lowermethod;
      topmethod=""; midmethod=""; lowermethod="";
      methodvar.clear();
      method=0;
      methodpara.clear();
      return _ret;
   }

   /**
    * f0 -> FormalParameter()
    * f1 -> ( FormalParameterRest() )*
    */
   public R visit(FormalParameterList n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    */
   public R visit(FormalParameter n, A argu) {
      R _ret=null;
      topmethod+=(String)n.f0.accept(this,argu)+" "+n.f1.f0.tokenImage;
      methodpara.put(n.f1.f0.tokenImage,(String)n.f0.accept(this,argu));
      return _ret;
   }

   /**
    * f0 -> ","
    * f1 -> FormalParameter()
    */
   public R visit(FormalParameterRest n, A argu) {
      R _ret=null;
      topmethod+=" ,";
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> ArrayType()
    *       | BooleanType()
    *       | IntegerType()
    *       | Identifier()
    */
   public R visit(Type n, A argu) {
      R _ret=null;
      _ret=(R)n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "int"
    * f1 -> "["
    * f2 -> "]"
    */
   public R visit(ArrayType n, A argu) {
      R _ret=null;
      _ret=(R)"int[]";  
      return _ret;
   }

   /**
    * f0 -> "boolean"
    */
   public R visit(BooleanType n, A argu) {
      R _ret=null;
      _ret=(R)"boolean";  
      return _ret;
   }

   /**
    * f0 -> "int"
    */
   public R visit(IntegerType n, A argu) {
      R _ret=null;
      _ret=(R)"int";  
      return _ret;
   }

   /**
    * f0 -> Block()
    *       | AssignmentStatement()
    *       | ArrayAssignmentStatement()
    *       | FieldAssignmentStatement()
    *       | IfStatement()
    *       | WhileStatement()
    *       | PrintStatement()
    */
   public R visit(Statement n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "{"
    * f1 -> ( Statement() )*
    * f2 -> "}"
    */
   public R visit(Block n, A argu) {
      R _ret=null;
      String toadd="{\n";
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      n.f1.accept(this, argu);
      toadd="\n}\n";  
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      return _ret;
   }

   /**
    * f0 -> Identifier()
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> ";"
    */
   public R visit(AssignmentStatement n, A argu) {
      R _ret=null;
      String toadd=n.f0.f0.tokenImage+" = "+(String)n.f2.accept(this,argu)+" ;\n";  
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      return _ret;
   }

   /**
    * f0 -> Identifier()
    * f1 -> "["
    * f2 -> Expression()
    * f3 -> "]"
    * f4 -> "="
    * f5 -> Expression()
    * f6 -> ";"
    */
   public R visit(ArrayAssignmentStatement n, A argu) {
      R _ret=null;
      String toadd=n.f0.f0.tokenImage+"["+(String)n.f2.accept(this,argu)+"] = "+n.f5.accept(this,argu)+" ;\n";  
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      return _ret;
   }

   /**
    * f0 -> Expression()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "="
    * f4 -> Expression()
    * f5 -> ";"
    */
   public R visit(FieldAssignmentStatement n, A argu) {
      R _ret=null;
      String toadd=(String)n.f0.accept(this,argu)+"."+n.f2.f0.tokenImage+" = "+(String)n.f4.accept(this,argu)+" ;\n";  
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      return _ret;
   }

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    * f5 -> "else"
    * f6 -> Statement()
    */
   public R visit(IfStatement n, A argu) {
      R _ret=null;
        String toadd="if("+n.f2.accept(this,argu)+") {\n";
        if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
        n.f4.accept(this,argu);
         toadd="}\n else{\n";
         if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
        n.f6.accept(this,argu);
         toadd="\n}\n";
         if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      return _ret;
   }

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public R visit(WhileStatement n, A argu) {
      R _ret=null;
         latcond="";
         String suraj=newTemp();
         String toadd=suraj+" = "+(String)n.f2.accept(this,argu)+" ;\n";
         if(method==1){
            methodvar.put(suraj,"boolean");
         }
         else{
            classvar.put(suraj,"boolean");
         }
        toadd+="while("+suraj+") {\n";
      //   String toaddd=latcond;
        if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
        n.f4.accept(this,argu);
         // toadd=toaddd;latcond="";toaddd="";
         toadd=suraj+" = "+(String)n.f2.accept(this,argu)+" ;\n";
        toadd+="\n}\n";
        if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      return _ret;
   }

   /**
    * f0 -> "System.out.println"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public R visit(PrintStatement n, A argu) {
      R _ret=null;
      String suraj = newTemp();

      if(method==1){
          String toadd=suraj+" = "+(String)n.f2.accept(this,argu)+" ;\n";
          lowermethod+=toadd;
          methodvar.put(suraj,ptype);
          toadd="System.out.println("+suraj+") ;\n";
          lowermethod+=toadd;
      
      }  
      else{
          String toadd=(String)(suraj+" = "+(String)n.f2.accept(this,argu)+" ;\n");
            lowerclass+=toadd;
          //  System.out.println("test"+lowerclass);
          classvar.put(suraj,ptype);
        toadd=(String)("System.out.println("+suraj+") ;\n");
         lowerclass+=toadd;
        //   System.out.println("test"+lowerclass);   
      }
      // if(method==0){
      //    System.out.println("checkkk"+lowerclass);
      // }
      return _ret;
   }

   /**
    * f0 -> OrExpression()
    *       | AndExpression()
    *       | CompareExpression()
    *       | neqExpression()
    *       | PlusExpression()
    *       | MinusExpression()
    *       | TimesExpression()
    *       | DivExpression()
    *       | ArrayLookup()
    *       | ArrayLength()
    *       | MessageSend()
    *       | PrimaryExpression()
    */
   public R visit(Expression n, A argu) {
      R _ret=null;
      _ret=(R)n.f0.accept(this, argu);
      // if(method==0)System.out.println("sffffftart"+lowerclass);
      return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "&&"
    * f2 -> PrimaryExpression()
    */
    public R visit(AndExpression n, A argu) {
        R _ret=null;
        String suraj1=(String)n.f0.accept(this,argu);
        String suraj2=(String)n.f2.accept(this,argu);
        String suraj3=newTemp();
        if(method==1){
         methodvar.put(suraj3,"boolean");
        }
        else classvar.put(suraj3,"boolean");
        String toadd=suraj3+" = "+suraj1+" && "+suraj2+";\n";
        latcond=toadd;
        if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
        _ret=(R)suraj3;
        ptype="boolean";
        return _ret;
     }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "||"
    * f2 -> PrimaryExpression()
    */
    public R visit(OrExpression n, A argu) {
        R _ret=null;
        String suraj1=(String)n.f0.accept(this,argu);
        String suraj2=(String)n.f2.accept(this,argu);
        String suraj3=newTemp();
        if(method==1){
         methodvar.put(suraj3,"boolean");
        }
        else classvar.put(suraj3,"boolean");
        String toadd=suraj3+" = "+suraj1+" || "+suraj2+";\n";
        latcond=toadd;
        if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
        _ret=(R)suraj3;
        ptype="boolean";
        return _ret;
     }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "<"
    * f2 -> PrimaryExpression()
    */
    public R visit(CompareExpression n, A argu) {
        R _ret=null;
        String suraj1=(String)n.f0.accept(this, argu);
        String suraj2=(String)n.f2.accept(this, argu);
        String suraj3=newTemp();
        if(method==1){
         methodvar.put(suraj3,"boolean");
        }
        else classvar.put(suraj3,"boolean");
        String toadd= suraj3+" = "+suraj1+" < "+ suraj2+ ";\n";
        latcond=toadd;
        if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
        _ret=(R)suraj3;
        ptype="boolean";
        return _ret;
     }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "!="
    * f2 -> PrimaryExpression()
    */
    public R visit(neqExpression n, A argu) {
        R _ret=null;
        String suraj1=(String)n.f0.accept(this,argu);
        String suraj2=(String)n.f2.accept(this,argu);
        String suraj3=newTemp();
        if(method==1){
         methodvar.put(suraj3,"boolean");
        }
        else classvar.put(suraj3,"boolean");
        String toadd=suraj3+" = "+suraj1+" != "+suraj2+";\n";
        latcond=toadd;
        if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
        _ret=(R)suraj3;
        ptype="boolean";
        return _ret;
     }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "+"
    * f2 -> PrimaryExpression()
    */
    public R visit(PlusExpression n, A argu) {
        R _ret=null;
        String suraj1=(String)n.f0.accept(this,argu);
        String suraj2=(String)n.f2.accept(this,argu);
        String suraj3=newTemp();
        if(method==1){
         methodvar.put(suraj3,"int");
        }
        else classvar.put(suraj3,"int");
        String toadd=suraj3+" = "+suraj1+" + "+suraj2+";\n";
        if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
        _ret=(R)suraj3;
        ptype="int";
        return _ret;
     }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "-"
    * f2 -> PrimaryExpression()
    */
    public R visit(MinusExpression n, A argu) {
        R _ret=null;
        String suraj1=(String)n.f0.accept(this,argu);
        String suraj2=(String)n.f2.accept(this,argu);
        String suraj3=newTemp();
        if(method==1){
         methodvar.put(suraj3,"int");
        }
        else classvar.put(suraj3,"int");
        String toadd=suraj3+" = "+suraj1+" - "+suraj2+";\n";
        if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
        _ret=(R)suraj3;
        ptype="int";
        return _ret;
     }
   /**
    * f0 -> PrimaryExpression()
    * f1 -> "*"
    * f2 -> PrimaryExpression()
    */
    public R visit(TimesExpression n, A argu) {
        R _ret=null;
        String suraj1=(String)n.f0.accept(this,argu);
        String suraj2=(String)n.f2.accept(this,argu);
        String suraj3=newTemp();
        if(method==1){
         methodvar.put(suraj3,"int");
        }
        else classvar.put(suraj3,"int");
        String toadd=suraj3+" = "+suraj1+"*"+suraj2+";\n";
        if(method==1) lowermethod+=toadd;
        else lowerclass+=toadd;
        _ret=(R)suraj3;
        ptype="int";
        return _ret;
     }
  

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "/"
    * f2 -> PrimaryExpression()
    */
    public R visit(DivExpression n, A argu) {
        R _ret=null;
        String suraj1=(String)n.f0.accept(this,argu);
        String suraj2=(String)n.f2.accept(this,argu);
        String suraj3=newTemp();
        if(method==1){
         methodvar.put(suraj3,"int");
        }
        else classvar.put(suraj3,"int");
        String toadd=suraj3+" = "+suraj1+"/"+suraj2+";\n";
        if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
        _ret=(R)suraj3;
        ptype="int";
        return _ret;
     }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "["
    * f2 -> PrimaryExpression()
    * f3 -> "]"
    */
    public R visit(ArrayLookup n, A argu) {
        R _ret=null;
        String suraj1=(String)n.f0.accept(this,argu);
        String suraj2=(String)n.f2.accept(this,argu);
        String suraj3=newTemp();
        if(method==1){
         methodvar.put(suraj3,"int");
        }
        else classvar.put(suraj3,"int");
        String toadd=suraj3+" = "+suraj1+"["+suraj2+"]"+";\n";
        if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
        _ret=(R)suraj3;
        ptype="int";
        return _ret;
     }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> "length"
    */
    public R visit(ArrayLength n, A argu) {
        R _ret=null;
        String suraj1=(String)n.f0.accept(this,argu);
        String suraj2=newTemp();
        if(method==1){
         methodvar.put(suraj2,"int");
        }
        else classvar.put(suraj2,"int");
        String toadd=suraj2+" = "+suraj1+".length ;\n";
        if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
        _ret=(R)suraj2;
        ptype="int";
        return _ret;
     }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> ( ExpressionList() )?
    * f5 -> ")"
    */
    Vector<String> vsv=new Vector<String>();
   public R visit(MessageSend n, A argu) {
      R _ret=null;
      String suraj1=newTemp();
      String toadd=suraj1+" = "+(String)n.f0.accept(this,argu)+";\n";
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      if(method==1){
         methodvar.put(suraj1,ptype);
        }
        else classvar.put(suraj1,ptype);
      String suraj3=newTemp();
      // methodvar.put(suraj2,"int");
      // if(data.containsKey(n.f0.accept(this,argu))){
      //    System.out.println("passed");
      //    Map<String,String> m=data.get(n.f0.accept(this,argu));
      //    if(m.containsKey(n.f2.f0.tokenImage)){
      //       System.out.println("method found");
      //    }
      //    else{
      //       System.out.println(n.f2.f0.tokenImage);
      //    }
      // }
      // else{
      //    System.out.println("yeah hai"+suraj1);
      //    if(methodvar.containsKey(suraj1)) {
      //       System.out.println(methodvar.get(suraj1));
      //    }
      //    else{
      //       System.out.println("yeah bhi nhi hai");
      //    }
      // }
      ptype="int";
      if(method==1){
         ptype=data.get(methodvar.get(suraj1)).get(n.f2.f0.tokenImage);
      }
      else{
         ptype=data.get(classvar.get(suraj1)).get(n.f2.f0.tokenImage);
      }
      if(method==1){
         methodvar.put(suraj3,ptype);
        }
        else classvar.put(suraj3,ptype);
      String tempp=ptype;
      String suraj=(String)n.f0.accept(this,argu);
      // String suraj2=newTemp();
      
      // String toadd=suraj2+" = "+suraj+" ;\n";
      n.f4.accept(this,argu);
      toadd=suraj3+ " = "+ suraj+"."+n.f2.f0.tokenImage+"(";
      latcond=toadd;
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;toadd="";
      for(int i=0;i<vsv.size();i++) toadd+=vsv.get(i);
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      vsv.clear();
      latcond+=toadd+") ;\n";
      toadd=") ;\n";
      
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      _ret=(R)suraj3;
      ptype="int";
      if(method==1){
         ptype=data.get(methodvar.get(suraj1)).get(n.f2.f0.tokenImage);
      }
      else{
         ptype=data.get(classvar.get(suraj1)).get(n.f2.f0.tokenImage);
      }
      // ptype=data.get(methodvar.get(suraj1)).get(n.f2.f0.tokenImage);
      // if(method==0){
      //    System.out.println("check"+lowerclass);
      // }
      return _ret;
   }

   /**
    * f0 -> Expression()
    * f1 -> ( ExpressionRest() )*
    */
   public R visit(ExpressionList n, A argu) {
      R _ret=null;
      String suraj=(String)n.f0.accept(this,argu);
      String suraj2=newTemp();
      if(method==1){
         methodvar.put(suraj2,ptype);
        }
        else classvar.put(suraj2,ptype);
      String toadd=suraj2+" = "+suraj+" ;\n";
      vsv.add(suraj2);
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> ","
    * f1 -> Expression()
    */
   public R visit(ExpressionRest n, A argu) {
      R _ret=null;
      vsv.add(",");
      String suraj=(String)n.f1.accept(this,argu);
      String suraj2=newTemp();
      if(method==1){
         methodvar.put(suraj2,ptype);
        }
        else classvar.put(suraj2,ptype);
      String toadd=suraj2+" = "+suraj+" ;\n";
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      vsv.add(suraj2);
      return _ret;
   }

   /**
    * f0 -> IntegerLiteral()
    *       | TrueLiteral()
    *       | FalseLiteral()
    *       | Identifier()
    *       | ThisExpression()
    *       | ArrayAllocationExpression()
    *       | AllocationExpression()
    *       | NotExpression()
    *       | BracketExpression()
    */
   public R visit(PrimaryExpression n, A argu) {
      R _ret=null;
      _ret=(R)n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public R visit(IntegerLiteral n, A argu) {
      R _ret=null;
      String suraj=newTemp();
      String toadd=suraj+" = "+n.f0.tokenImage+" ;\n";
      if(method==1) lowermethod+=toadd;
      else {lowerclass+=toadd;}
      if(method==1){
         methodvar.put(suraj,"int");
        }
        else {classvar.put(suraj,"int");}
      n.f0.accept(this, argu);
      _ret=(R)suraj;
      ptype="int";
      return _ret;
   }

   /**
    * f0 -> "true"
    */
   public R visit(TrueLiteral n, A argu) {
      R _ret=null;
      String suraj=newTemp();
      String toadd=suraj+" = "+n.f0.tokenImage+" ;\n";
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      if(method==1){
         methodvar.put(suraj,"boolean");
        }
        else classvar.put(suraj,"boolean");
      n.f0.accept(this, argu);
      _ret=(R)suraj;
      ptype="boolean";
      return _ret;
   }

   /**
    * f0 -> "false"
    */
   public R visit(FalseLiteral n, A argu) {
      R _ret=null;
      String suraj=newTemp();
      String toadd=suraj+" = "+n.f0.tokenImage+" ;\n";
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      if(method==1){
         methodvar.put(suraj,"boolean");
        }
        else classvar.put(suraj,"boolean");
      n.f0.accept(this, argu);
      _ret=(R)suraj;
      ptype="boolean";
      return _ret;
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(Identifier n, A argu) {
      R _ret=null;
      _ret=(R)n.f0.tokenImage;
      n.f0.accept(this, argu);
      if(methodpara.containsKey(n.f0.tokenImage)) ptype=methodpara.get(n.f0.tokenImage);
      if(methodvar.containsKey(n.f0.tokenImage)) ptype=methodvar.get(n.f0.tokenImage);
      if(classvar.containsKey(n.f0.tokenImage)) ptype=classvar.get(n.f0.tokenImage);
    //   ptype=n.f0.tokenImage;
      return _ret;
   }

   /**
    * f0 -> "this"
    */
   public R visit(ThisExpression n, A argu) {
      R _ret=null;
      String suraj=newTemp();
      String toadd=suraj+" = "+n.f0.tokenImage+" ;\n";
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      if(method==1){
         methodvar.put(suraj,latclass);
        }
        else classvar.put(suraj,latclass);
      n.f0.accept(this, argu);
      _ret=(R)suraj;
      ptype=latclass;
      return _ret;
   }

   /**
    * f0 -> "new"
    * f1 -> "int"
    * f2 -> "["
    * f3 -> Expression()
    * f4 -> "]"
    */
   public R visit(ArrayAllocationExpression n, A argu) {
      R _ret=null;
      String suraj=newTemp();
      if(method==1){
         methodvar.put(suraj,"int[]");
        }
        else classvar.put(suraj,"int[]");
      String toadd=suraj+" = new int["+(String)n.f3.accept(this,argu)+"] ;\n";
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      _ret=(R)suraj;
      ptype="int[]";
      return _ret;
   }

   /**
    * f0 -> "new"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> ")"
    */
   public R visit(AllocationExpression n, A argu) {
      R _ret=null;
      String suraj=newTemp();
      if(method==1){
         methodvar.put(suraj,n.f1.f0.tokenImage);
        }
        else classvar.put(suraj,n.f1.f0.tokenImage);
      String toadd=suraj+" = new "+n.f1.f0.tokenImage+"() ;\n";
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      _ret=(R)suraj;
      ptype=n.f1.f0.tokenImage;
      return _ret;
   }

   /**
    * f0 -> "!"
    * f1 -> Expression()
    */
   public R visit(NotExpression n, A argu) {
      R _ret=null;
      String suraj=newTemp();
      if(method==1){
         methodvar.put(suraj,"boolean");
        }
        else classvar.put(suraj,"boolean");
      String toadd=suraj+" = !"+(String)n.f1.accept(this,argu)+" ;\n";
      latcond=toadd;
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      _ret=(R)suraj;
      ptype="boolean";
      return _ret;
   }

   /**
    * f0 -> "("
    * f1 -> Expression()
    * f2 -> ")"
    */
   public R visit(BracketExpression n, A argu) {
      R _ret=null;
      String suraj=newTemp();
      String toadd=suraj+" = "+(String)n.f1.accept(this,argu)+" ;\n";
      if(method==1) lowermethod+=toadd;
      else lowerclass+=toadd;
      if(method==1){
         methodvar.put(suraj,ptype);
        }
        else classvar.put(suraj,ptype);
      _ret=(R)suraj;
      return _ret;
   }

   /**
    * f0 -> Identifier()
    * f1 -> ( IdentifierRest() )*
    */
   public R visit(IdentifierList n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> ","
    * f1 -> Identifier()
    */
   public R visit(IdentifierRest n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

}
