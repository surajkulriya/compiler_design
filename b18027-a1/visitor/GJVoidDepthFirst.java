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
public class GJVoidDepthFirst<A> implements GJVoidVisitor<A> {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public void visit(NodeList n, A argu) {
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this,argu);
         _count++;
      }
   }

   public void visit(NodeListOptional n, A argu) {
      if ( n.present() ) {
         int _count=0;
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this,argu);
            _count++;
         }
      }
   }

   public void visit(NodeOptional n, A argu) {
      if ( n.present() )
         n.node.accept(this,argu);
   }

   public void visit(NodeSequence n, A argu) {
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this,argu);
         _count++;
      }
   }

   public void visit(NodeToken n, A argu) {}

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( PStatement() )*
    * f1 -> <EOF>
    */
   public void visit(Goal n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
   }

   /**
    * f0 -> Statementt()
    *       | Statement()
    */
   public void visit(PStatement n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> Statement1()
    * f1 -> Statement2()
    * f2 -> ";"
    */
   public void visit(Statement n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
   }

   /**
    * f0 -> Statement1()
    * f1 -> Statement3()
    * f2 -> Statement2()
    * f3 -> ";"
    */
   public void visit(Statementt n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
   }

   /**
    * f0 -> Compstat()
    */
   public void visit(Statement3 n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> Identifier()
    */
   public void visit(Statement1 n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> Identifier()
    */
   public void visit(Statement2 n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> Identifier()
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> ";"
    */
   public void visit(AssignmentStatement n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
      n.f3.accept(this, argu);
   }

   /**
    * f0 -> <PRINT>
    * f1 -> Expression()
    * f2 -> ";"
    */
   public void visit(PrintStatment n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
   }

   /**
    * f0 -> PlusExpression()
    *       | MinusExpression()
    *       | TimesExpression()
    *       | PrimaryExpression()
    */
   public void visit(Expression n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> <PLUS>
    * f2 -> PrimaryExpression()
    */
   public void visit(PlusExpression n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> <MINUS>
    * f2 -> PrimaryExpression()
    */
   public void visit(MinusExpression n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> <TIMES>
    * f2 -> PrimaryExpression()
    */
   public void visit(TimesExpression n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
   }

   /**
    * f0 -> IntegerLiteral()
    *       | Identifier()
    *       | BracketExpression()
    */
   public void visit(PrimaryExpression n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public void visit(IntegerLiteral n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(Identifier n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> <COMPSTAT>
    */
   public void visit(Compstat n, A argu) {
      n.f0.accept(this, argu);
   }

   /**
    * f0 -> <LPAREN>
    * f1 -> Expression()
    * f2 -> ")"
    */
   public void visit(BracketExpression n, A argu) {
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
   }

}
