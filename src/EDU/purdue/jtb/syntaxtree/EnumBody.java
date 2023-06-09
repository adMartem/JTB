/* Generated by JTB 1.4.14 */
package EDU.purdue.jtb.syntaxtree;

import EDU.purdue.jtb.visitor.*;

/**
 * JTB node class for the production EnumBody:<br>
 * Corresponding grammar:<br>
 * f0 -> "{"<br>
 * f1 -> [ #0 EnumConstant()<br>
 * .. .. . #1 ( $0 "," $1 EnumConstant() )* ]<br>
 * f2 -> [ "," ]<br>
 * f3 -> [ #0 ";"<br>
 * .. .. . #1 ( ClassOrInterfaceBodyDeclaration() )* ]<br>
 * f4 -> "}"<br>
 */
public class EnumBody implements INode {

  /** Child node 1 */
  public NodeToken f0;

  /** Child node 2 */
  public NodeOptional f1;

  /** Child node 3 */
  public NodeOptional f2;

  /** Child node 4 */
  public NodeOptional f3;

  /** Child node 5 */
  public NodeToken f4;

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
   */
  public EnumBody(final NodeToken n0, final NodeOptional n1, final NodeOptional n2, final NodeOptional n3, final NodeToken n4) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
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
