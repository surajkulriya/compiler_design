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
/* Pair<String,boolean>*/
public class ass22visitor extends GJDepthFirst<String , Map< String, typedec>> {

   Map< String, Map< String, typedec>> symt = new HashMap<>();
   boolean inn = false;
   boolean noerror = true;

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> MainClass()
    * f1 -> ( TypeDeclaration() )*
    * f2 -> <EOF>
    */
   public String visit(Goal n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      
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
   public String visit(MainClass n, Map<String, typedec> argu) {
      String _ret=null;
      
      n.f1.accept(this, argu);

      n.f7.accept(this, argu);
      n.f8.accept(this, argu);
      
      n.f11.accept(this, argu);
      
      n.f14.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> ClassDeclaration()
    *       | ClassExtendsDeclaration()
    */
   public String visit(TypeDeclaration n, Map<String, typedec> argu) {
      String _ret=null;
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
   public String visit(ClassDeclaration n, Map<String, typedec> argu) {
      String _ret=null;
      Map<String, typedec> symTab = new HashMap<> ();
      String classname = n.f1.accept(this, symTab);
      
      n.f3.accept(this, symTab);
      
      inn = true;
      n.f4.accept(this, symTab);
      inn = false;
      
      symt.put(classname, symTab);
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
   public String visit(ClassExtendsDeclaration n, Map<String, typedec> argu) {
      String _ret = n.f1.accept(this, argu);
      String parentClass = n.f3.accept(this, argu);

      Map<String, typedec> symTab = new HashMap<> ();
      Map<String, typedec> parent = symt.get(parentClass);

      n.f5.accept(this, symTab);

      for (Map.Entry<String, typedec> entry : parent.entrySet())
      {
         if (symTab.get(entry.getKey()) == null)
            symTab.put(entry.getKey(), new typedec(entry.getValue().getType(), entry.getValue().getInit()));
      }

      inn = true;
      n.f6.accept(this, symTab);
      inn = false;
      
      symt.put(_ret, symTab);
      return _ret;
   }

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> ";"
    */
   public String visit(VarDeclaration n, Map<String, typedec> argu) {
      String _ret=null;

      String id = n.f1.accept(this, argu);
      String type = n.f0.f0.accept(this, argu);
      
      if (argu.get(id) != null){
         System.out.println("Multiple declarations for " + id + ": declared type " + argu.get(id).getType() + "; new type " + type);
         noerror = false;
      }
      else{
         if (inn == false)
            argu.put(id, new typedec(type, true));
         else
            argu.put(id, new typedec(type, false));
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
   public String visit(MethodDeclaration n, Map<String, typedec> argu) {
      String _ret=null;
      Map<String, typedec> deepCopy = new HashMap<> ();
      for (Map.Entry<String, typedec> entry : argu.entrySet())
      {
         deepCopy.put(entry.getKey(), new typedec(entry.getValue().getType(), entry.getValue().getInit()));
      }
      n.f4.accept(this, deepCopy);
      n.f7.accept(this, deepCopy);
      n.f8.accept(this, deepCopy);
      n.f10.accept(this, deepCopy);
      return _ret;
   }

   /**
    * f0 -> FormalParameter()
    * f1 -> ( FormalParameterRest() )*
    */
   public String visit(FormalParameterList n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    */
   public String visit(FormalParameter n, Map<String, typedec> argu) {
      String _ret=null;
      String id = n.f1.accept(this, argu);
      String type = n.f0.f0.accept(this, argu);
      
      if (argu.get(id) != null){
         System.out.println("Multiple declarations for " + id + ": declared type " + argu.get(id).getType() + "; new type " + type);
         noerror = false;
      }
      else{
         argu.put(id, new typedec(type, true));
      }
      return _ret;
   }

   /**
    * f0 -> ","
    * f1 -> FormalParameter()
    */
   public String visit(FormalParameterRest n, Map<String, typedec> argu) {
      String _ret=null;
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> ArrayType()
    *       | BooleanType()
    *       | IntegerType()
    *       | Identifier()
    */
   public String visit(Type n, Map<String, typedec> argu) {
      String _ret=n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "int"
    * f1 -> "["
    * f2 -> "]"
    */
   public String visit(ArrayType n, Map<String, typedec> argu) {
      String _ret="int[]";
      // n.f0.accept(this, argu);
      // n.f1.accept(this, argu);
      // n.f2.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "boolean"
    */
   public String visit(BooleanType n, Map<String, typedec> argu) {
      String _ret="boolean";
      // n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "int"
    */
   public String visit(IntegerType n, Map<String, typedec> argu) {
      String _ret="int";
      // n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> Block()
    *       | AssignmentStatement()
    *       | ArrayAssignmentStatement()
    *       | IfStatement()
    *       | WhileStatement()
    *       | PrintStatement()
    */
   public String visit(Statement n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "{"
    * f1 -> ( Statement() )*
    * f2 -> "}"
    */
   public String visit(Block n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> Identifier()
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> ";"
    */
   public String visit(AssignmentStatement n, Map<String, typedec> argu) {
      String _ret = n.f0.accept(this, argu);

      n.f2.accept(this, argu);
      
      if (_ret != null) {
         if (argu.get(_ret) == null) {
            System.out.println("Undeclared: " + _ret);
            noerror = false;
         }
         else {
            argu.get(_ret).setInit(true);
         }
      }

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
   public String visit(ArrayAssignmentStatement n, Map<String, typedec> argu) {
      String _ret=n.f0.accept(this, argu);
      // n.f1.accept(this, argu);
      n.f5.accept(this, argu);

      n.f2.accept(this, argu);
      // n.f3.accept(this, argu);
      // n.f4.accept(this, argu);
      if (_ret != null) {
         if (argu.get(_ret) == null) {
            System.out.println("Undeclared: " + _ret);
            noerror = false;
         }
      }
      // n.f6.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> IfthenElseStatement()
    *       | IfthenStatement()
    */
   public String visit(IfStatement n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public String visit(IfthenStatement n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
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
   public String visit(IfthenElseStatement n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
      n.f6.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public String visit(WhileStatement n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "System.out.println"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public String visit(PrintStatement n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
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
   public String visit(Expression n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "&&"
    * f2 -> PrimaryExpression()
    */
   public String visit(AndExpression n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
   }

   /* fucntion to access noerror */
   public boolean geterror()
   {
       return noerror;
   }
   /**
    * f0 -> PrimaryExpression()
    * f1 -> "||"
    * f2 -> PrimaryExpression()
    */
   public String visit(OrExpression n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
   }


   /**
    * f0 -> PrimaryExpression()
    * f1 -> "-"
    * f2 -> PrimaryExpression()
    */
    public String visit(MinusExpression n, Map<String, typedec> argu) {
        String _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
     }
  
     /**
      * f0 -> PrimaryExpression()
      * f1 -> "*"
      * f2 -> PrimaryExpression()
      */
     public String visit(TimesExpression n, Map<String, typedec> argu) {
        String _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
     }


   /**
    * f0 -> PrimaryExpression()
    * f1 -> "<="
    * f2 -> PrimaryExpression()
    */
   public String visit(CompareExpression n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "!="
    * f2 -> PrimaryExpression()
    */
   public String visit(neqExpression n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "+"
    * f2 -> PrimaryExpression()
    */
   public String visit(PlusExpression n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
   }

   

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "/"
    * f2 -> PrimaryExpression()
    */
   public String visit(DivExpression n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "["
    * f2 -> PrimaryExpression()
    * f3 -> "]"
    */
   public String visit(ArrayLookup n, Map<String, typedec> argu) {
      String _ret=null;
      n.f2.accept(this, argu);
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f3.accept(this, argu);
      return _ret;
   }


   /**
    * f0 -> <IDENTIFIER>
    */
    public String visit(Identifier n, Map<String, typedec> argu) {
        String _ret=n.f0.tokenImage;
        // n.f0.accept(this, argu);
        return _ret;
     }
  
    
     
  
     /**
      * f0 -> "("
      * f1 -> Expression()
      * f2 -> ")"
      */
     public String visit(BracketExpression n, Map<String, typedec> argu) {
        String _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
     }
  
     /**
      * f0 -> Identifier()
      * f1 -> ( IdentifierRest() )*
      */
     public String visit(IdentifierList n, Map<String, typedec> argu) {
        String _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        return _ret;
     }
  
     /**
      * f0 -> ","
      * f1 -> Identifier()
      */
     public String visit(IdentifierRest n, Map<String, typedec> argu) {
        String _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        return _ret;
     }


   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> "length"
    */
   public String visit(ArrayLength n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
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
   public String visit(MessageSend n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
      n.f4.accept(this, argu);
      n.f5.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> Expression()
    * f1 -> ( ExpressionRest() )*
    */
   public String visit(ExpressionList n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> ","
    * f1 -> Expression()
    */
   public String visit(ExpressionRest n, Map<String, typedec> argu) {
      String _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   public String visit(PrimaryExpression n, Map<String, typedec> argu) {
      String _ret=n.f0.accept(this, argu);
      if (_ret != null) {
         if (argu.get(_ret) == null) {
            System.out.println("Undeclared: " + _ret);
            noerror = false;
         }
         else if (argu.get(_ret).getInit() == false) {
            System.out.println("Uninitialized: " + _ret);
            noerror = false;
         }
      }
      return _ret;
   }

  

   

}
