/* Generated by JTB 1.4.14 */
package EDU.purdue.jtb.syntaxtree;

import EDU.purdue.jtb.visitor.*;

/**
 * JTB node class for the production JavaCCInput:<br>
 * Corresponding grammar:<br>
 * f0 -> JavaCCOptions()<br>
 * f1 -> "PARSER_BEGIN"<br>
 * f2 -> "("<br>
 * f3 -> IdentifierAsString()<br>
 * f4 -> ")"<br>
 * f5 -> CompilationUnit()<br>
 * f6 -> "PARSER_END"<br>
 * f7 -> "("<br>
 * f8 -> IdentifierAsString()<br>
 * f9 -> ")"<br>
 * f10 -> ( Production() )+<br>
 * f11 -> < EOF ><br>
 */
public class JavaCCInput implements INode {

  /** Child node 1 */
  public JavaCCOptions f0;

  /** Child node 2 */
  public NodeToken f1;

  /** Child node 3 */
  public NodeToken f2;

  /** Child node 4 */
  public IdentifierAsString f3;

  /** Child node 5 */
  public NodeToken f4;

  /** Child node 6 */
  public CompilationUnit f5;

  /** Child node 7 */
  public NodeToken f6;

  /** Child node 8 */
  public NodeToken f7;

  /** Child node 9 */
  public IdentifierAsString f8;

  /** Child node 10 */
  public NodeToken f9;

  /** Child node 11 */
  public NodeList f10;

  /** Child node 12 */
  public NodeToken f11;

  /** The serial version UID */
  private static final long serialVersionUID = 1414L;

  /**
   * Constructs the node with all its children nodes.
   *
   * @param n0 - first child node
   * @param n1 - next child node
   * @param n2 - next child node
   * @param n3 - next child node
   * @param n4 - next child node
   * @param n5 - next child node
   * @param n6 - next child node
   * @param n7 - next child node
   * @param n8 - next child node
   * @param n9 - next child node
   * @param n10 - next child node
   * @param n11 - next child node
   */
  public JavaCCInput(final JavaCCOptions n0, final NodeToken n1, final NodeToken n2, final IdentifierAsString n3, final NodeToken n4, final CompilationUnit n5, final NodeToken n6, final NodeToken n7, final IdentifierAsString n8, final NodeToken n9, final NodeList n10, final NodeToken n11) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
    f5 = n5;
    f6 = n6;
    f7 = n7;
    f8 = n8;
    f9 = n9;
    f10 = n10;
    f11 = n11;
  }

  /**
   * Accepts the IRetArguVisitor visitor.
   *
   * @param <R> the user return type
   * @param <A> the user argument type
   * @param vis - the visitor
   * @param argu - a user chosen argument
   * @return a user chosen return information
   */
  @Override
  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu) {
    return vis.visit(this, argu);
  }

  /**
   * Accepts the IRetVisitor visitor.
   *
   * @param <R> the user return type
   * @param vis - the visitor
   * @return a user chosen return information
   */
  @Override
  public <R> R accept(final IRetVisitor<R> vis) {
    return vis.visit(this);
  }

  /**
   * Accepts the IVoidArguVisitor visitor.
   *
   * @param <A> the user argument type
   * @param vis - the visitor
   * @param argu - a user chosen argument
   */
  @Override
  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu) {
    vis.visit(this, argu);
  }

  /**
   * Accepts the IVoidVisitor visitor.
   *
   * @param vis - the visitor
   */
  @Override
  public void accept(final IVoidVisitor vis) {
    vis.visit(this);
  }

}
