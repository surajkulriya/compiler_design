//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All void visitors must implement this interface.
 */

public interface Visitor {

   //
   // void Auto class visitors
   //

   public void visit(NodeList n);
   public void visit(NodeListOptional n);
   public void visit(NodeOptional n);
   public void visit(NodeSequence n);
   public void visit(NodeToken n);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( PStatement() )*
    * f1 -> <EOF>
    */
   public void visit(Goal n);

   /**
    * f0 -> Statementt()
    *       | Statement()
    */
   public void visit(PStatement n);

   /**
    * f0 -> Statement1()
    * f1 -> Statement2()
    * f2 -> ";"
    */
   public void visit(Statement n);

   /**
    * f0 -> Statement1()
    * f1 -> Statement3()
    * f2 -> Statement2()
    * f3 -> ";"
    */
   public void visit(Statementt n);

   /**
    * f0 -> Compstat()
    */
   public void visit(Statement3 n);

   /**
    * f0 -> Identifier()
    */
   public void visit(Statement1 n);

   /**
    * f0 -> Identifier()
    */
   public void visit(Statement2 n);

   /**
    * f0 -> Identifier()
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> ";"
    */
   public void visit(AssignmentStatement n);

   /**
    * f0 -> <PRINT>
    * f1 -> Expression()
    * f2 -> ";"
    */
   public void visit(PrintStatment n);

   /**
    * f0 -> PlusExpression()
    *       | MinusExpression()
    *       | TimesExpression()
    *       | PrimaryExpression()
    */
   public void visit(Expression n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> <PLUS>
    * f2 -> PrimaryExpression()
    */
   public void visit(PlusExpression n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> <MINUS>
    * f2 -> PrimaryExpression()
    */
   public void visit(MinusExpression n);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> <TIMES>
    * f2 -> PrimaryExpression()
    */
   public void visit(TimesExpression n);

   /**
    * f0 -> IntegerLiteral()
    *       | Identifier()
    *       | BracketExpression()
    */
   public void visit(PrimaryExpression n);

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public void visit(IntegerLiteral n);

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(Identifier n);

   /**
    * f0 -> <COMPSTAT>
    */
   public void visit(Compstat n);

   /**
    * f0 -> <LPAREN>
    * f1 -> Expression()
    * f2 -> ")"
    */
   public void visit(BracketExpression n);

}

