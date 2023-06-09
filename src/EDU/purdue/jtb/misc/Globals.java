/**
 * Copyright (c) 2004,2005 UCLA Compilers Group.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  Redistributions of source code must retain the above copyright
 *  notice, this list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *
 *  Neither UCLA nor the names of its contributors may be used to endorse
 *  or promote products derived from this software without specific prior
 *  written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 **/
/*
 * All files in the distribution of JTB, The Java Tree Builder are
 * Copyright 1997, 1998, 1999 by the Purdue Research Foundation of Purdue
 * University.  All rights reserved.
 *
 * Redistribution and use in source and binary forms are permitted
 * provided that this entire copyright notice is duplicated in all
 * such copies, and that any documentation, announcements, and
 * other materials related to such distribution and use acknowledge
 * that the software was developed at Purdue University, West Lafayette,
 * Indiana by Kevin Tao, Wanjun Wang and Jens Palsberg.  No charge may
 * be made for copies, derivations, or distributions of this material
 * without the express written consent of the copyright holder.
 * Neither the name of the University nor the name of the author
 * may be used to endorse or promote products derived from this
 * material without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND WITHOUT ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, WITHOUT LIMITATION, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR ANY PARTICULAR PURPOSE.
 */
package EDU.purdue.jtb.misc;

import EDU.purdue.jtb.parser.Token;
import EDU.purdue.jtb.syntaxtree.INode;
import EDU.purdue.jtb.syntaxtree.INodeList;
import EDU.purdue.jtb.syntaxtree.NodeChoice;
import EDU.purdue.jtb.syntaxtree.NodeList;
import EDU.purdue.jtb.syntaxtree.NodeListOptional;
import EDU.purdue.jtb.syntaxtree.NodeOptional;
import EDU.purdue.jtb.syntaxtree.NodeSequence;
import EDU.purdue.jtb.syntaxtree.NodeTCF;
import EDU.purdue.jtb.syntaxtree.NodeToken;

/**
 * Class Globals contains global program information and related utility methods.
 *
 * @author Marc Mazas
 * @version 1.4.0 : 05-11/2009 : MMa : adapted to JavaCC v4.2 grammar and JDK 1.5
 * @version 1.4.1 : 02/2010 : MMa : added static flag
 * @version 1.4.6 : 01/2011 : FA/MMa : added -va and -npfx and -nsfx options
 * @version 1.4.14 : 01/2017 : MMa : SERIAL_UID set to the product version number (without dots)
 */
public class Globals {

  /*
   * Global constants
   */

  /** Turns on / off debugging class comment printing */
  public static final boolean DEBUG_CLASS_COMMENTS         = false;
  /** Turns on / off debugging class comment printing */
  public static final boolean DEBUG_FIELD_AND_SUB_COMMENTS = false;
  /** The program version (set also SERIAL_UID) */
  public static final String  VERSION                      = "1.4.14";
  /** The serial uid version (same as VERSION without the dots) */
  public static final long    SERIAL_UID                   = 1414L;
  /** The java program name */
  public static final String  PROG_NAME                    = "JTB";
  /** The shell script name */
  public static final String  SCRIPT_NAME                  = "jtb";
  /** Some of the authors */
  public static final String  AUTHORS                      = "Jens Palsberg, Wanjun Wang, Kevin Tao, Vids Samanta," +
                                                             " Marc Mazas, Francis Andre";
  /** An indication in case of JTB internal errors */
  public static final String  SUPPORT                      = "JTB support (https://github.com/jtb-javacc/JTB)";
  /** The indentation default number of characters */
  public static final int     INDENT_AMT                   = 2;
  /** The OS line separator string */
  public static final String  LS                           = System.getProperty("line.separator");
  /** The OS line separator first character */
  public static final char    LS0                          = LS.charAt(0);
  /** The OS line separator string length */
  public static final int     LSLEN                        = LS.length();
  /** The javadoc break */
  public static final String  BR                           = "<br>";
  /** The javadoc break plus string length */
  public static final int     BRLEN                        = BR.length();
  /** The javadoc break plus the OS line separator */
  public static final String  BRLS                         = BR + LS;
  /** The javadoc break plus the OS line separator string length */
  public static final int     BRLSLEN                      = BRLS.length();

  /*
   * Classes / interfaces / variables names (constants)
   */

  /** Name of the node interface that all tree nodes implement */
  public static final String  iNode                        = INode.class.getSimpleName();
  /** Name of the list interface that NodeList, NodeListOptional and NodeSequence implement */
  public static final String  iNodeList                    = INodeList.class.getSimpleName();

  /** Name of the node class representing a grammar choice such as ( A | B ) */
  public static final String  nodeChoice                   = NodeChoice.class.getSimpleName();
  /** Name of the node class representing a list such as ( A )+ */
  public static final String  nodeList                     = NodeList.class.getSimpleName();
  /** Name of the node class representing an optional list such as (A )* */
  public static final String  nodeListOpt                  = NodeListOptional.class.getSimpleName();
  /** Name of the node class representing an optional such as [ A ] or ( A )? */
  public static final String  nodeOpt                      = NodeOptional.class.getSimpleName();
  /** Name of the node class representing a nested sequence of nodes */
  public static final String  nodeSeq                      = NodeSequence.class.getSimpleName();
  /** Name of the node class representing a token string such as "package" */
  public static final String  nodeToken                    = NodeToken.class.getSimpleName();
  /** Name of the (generated by JavaCC) class representing a token */
  public static final String  jjToken                      = Token.class.getSimpleName();
  /**
   * Name of the node class representing a token string in an ExpansionUnit type 3:<br>
   * "try", "{", "}", "catch", "(", ")", "finally"
   */
  public static final String  nodeTCF                      = NodeTCF.class.getSimpleName();

  /** "RetArgu" visitor interface name (with return type and a user object argument) */
  public static final String  iRetArguVisitor              = "IRetArguVisitor";
  /** Depth First "RetArgu" visitor class name (with return type and a user object argument) */
  public static final String  dFRetArguVisitor             = "DepthFirstRetArguVisitor";
  /** Javadoc comment fragment for "RetArgu" visitor */
  public static final String  retArguVisitorCmt            = "RetArgu";

  /** "Ret" visitor interface name (with return type and no user object argument) */
  public static final String  iRetVisitor                  = "IRetVisitor";
  /** Depth First "Ret" visitor class name (with return type and no user object argument) */
  public static final String  dFRetVisitor                 = "DepthFirstRetVisitor";
  /** Javadoc comment fragment for "Ret" visitor */
  public static final String  retVisitorCmt                = "Ret";

  /** "VoidArgu" visitor interface name (with no return type and a user object argument) */
  public static final String  iVoidArguVisitor             = "IVoidArguVisitor";
  /** Depth First "VoidArgu" visitor class name (with no return type and a user object argument) */
  public static final String  dFVoidArguVisitor            = "DepthFirstVoidArguVisitor";
  /** Javadoc comment fragment for "VoidArgu" visitor */
  public static final String  voidArguVisitorCmt           = "VoidArgu";

  /** "Void" visitor interface name (with no return type and no user object argument)) */
  public static final String  iVoidVisitor                 = "IVoidVisitor";
  /** Depth First "Void" visitor class name (with no return type and no user object argument) */
  public static final String  dFVoidVisitor                = "DepthFirstVoidVisitor";
  /** Javadoc comment fragment for "Void" visitor */
  public static final String  voidVisitorCmt               = "Void";

  /** Visitor methods return type */
  public static final String  genRetType                   = "R";
  /** Visitor methods user argument (second argument) type */
  public static final String  genArguType                  = "A";
  /** Visitor methods user argument (second argument) varargs type */
  public static final String  genArgusType                 = "A...";
  /** Visitor methods return variable */
  public static final String  genRetVar                    = "nRes";
  /** Visitor methods node argument (first argument) variable */
  public static final String  genNodeVar                   = "n";
  /** Visitor methods node argument (first argument) variable plus dot */
  public static final String  genNodeVarDot                = genNodeVar + ".";
  /** Visitor methods user argument (second argument) variable */
  public static final String  genArguVar                   = "argu";
  /** Visitor methods depth level local variable */
  public static final String  genDepthLevelVar             = "depthLevel";

  /** The JTB result type variables prefix */
  public static final String  jtbRtPrefix                  = "jtbrt_";

  /*
   * Changeable flags (command line options)
   */

  /**
   * -cl option which prints the generated classes list to System.out
   */
  public static boolean       printClassList               = false;
  /**
   * -w options which prevents JTB from overwriting existing files
   */
  public static boolean       noOverwrite                  = false;
  /**
   * -e option which suppresses JTB semantic error checking
   */
  public static boolean       noSemanticCheck              = false;
  /**
   * -jd option which generates JavaDoc-friendly comments in generated visitors and syntax tree
   * classes
   */
  public static boolean       javaDocComments              = false;
  /**
   * -f option which generates descriptive node class child field names such as whileStatement,
   * nodeToken2, ... rather than f0, f1, ...
   */
  public static boolean       descriptiveFieldNames        = false;
  /**
   * -pp option which generates parent pointer and getParent() and setParent() methods in all node
   * classes
   */
  public static boolean       parentPointer                = false;
  /**
   * -dl option which generates depthLevel field in all visitor classes
   */
  public static boolean       depthLevel                   = false;
  /**
   * -tk option which stores special tokens in the parse tree
   */
  public static boolean       keepSpecialTokens            = false;
  /**
   * -ia option which "inlines" the visitors accept methods on base classes
   */
  public static boolean       inlineAcceptMethods          = false;
  /**
   * -va option which generates a return/argument visitor with a variable number of argument
   */
  public static boolean       varargs                      = false;
  /**
   * -scheme option which generates the Scheme programming language record definitions file
   * records.scm and the SchemeTreeBuilder visitor
   */
  public static boolean       schemeToolkit                = false;
  /**
   * -printer option which generates TreeDumper and TreeFormatter visitors
   */
  public static boolean       printerToolkit               = false;
  /**
   * static or not option that comes from JavaCC
   */
  public static boolean       staticFlag                   = false;

  /*
   * Default names
   */

  /** Default nodes prefix */
  public static final String  DEF_ND_PREFIX                = "";
  /** Default nodes suffix */
  public static final String  DEF_ND_SUFFIX                = "";
  /** Default nodes package name */
  public static final String  DEF_ND_PKG_NAME              = "syntaxtree";
  /** Default nodes package name */
  public static final String  DEF_VIS_PKG_NAME             = "visitor";
  /** Default nodes package name */
  public static final String  DEF_ND_DIR_NAME              = "syntaxtree";
  /** Default nodes package name */
  public static final String  DEF_VIS_DIR_NAME             = "visitor";
  /** Default nodes package name */
  public static final String  DEF_OUT_FILE_NAME            = "jtb.out.jj";

  /*
   * Changeable names
   */

  /**
   * -npfx & -nsfx options which defines the node' prefix
   */
  public static String        nodePrefix                   = DEF_ND_PREFIX;
  /**
   * -npfx & -nsfx options which defines the node' suffix
   */
  public static String        nodeSuffix                   = DEF_ND_SUFFIX;
  /**
   * -np & -p options which defines the nodes package name (default is syntaxtree)
   */
  public static String        nodesPackageName             = DEF_ND_PKG_NAME;
  /**
   * -vp & -p options which defines the visitors package name (default is visitor)
   */
  public static String        visitorsPackageName          = DEF_VIS_PKG_NAME;
  /**
   * -nd & -d options which defines the nodes directory name (default is syntaxtree)
   */
  public static String        nodesDirName                 = DEF_ND_DIR_NAME;
  /**
   * -vd & -d options which defines the visitors directory name (default is visitor)
   */
  public static String        visitorsDirName              = DEF_VIS_DIR_NAME;
  /**
   * -ns option which defines the nodes superclass
   */
  public static String        nodesSuperclass              = null;
  /**
   * the input (jtb) file name (must be set in main)
   */
  public static String        jtbInputFileName;
  /**
   * -o option which defines the output (generated) file name (default is jtb.out.jj)
   */
  public static String        jtbOutputFileName            = DEF_OUT_FILE_NAME;

  /*
   * Convenience methods
   */

  /**
   * Builds a file header comment ("Generated by JTB version").
   *
   * @return a file header comment
   */
  public static String genFileHeaderComment() {
    return "/* Generated by " + PROG_NAME + " " + VERSION + " */";
  }

  /**
   * Builds a (class) name with the default prefix and/or suffix, except for the base (class) names.
   *
   * @param name - string to prefix or suffix
   * @return the prefixed and/or suffixed name
   */
  public static String getFixedName(final String name) {
    if (nodePrefix == null && nodeSuffix == null)
      return name;
    if (name.equals(jjToken) || name.equals(nodeToken) || name.equals(nodeChoice) ||
        name.equals(nodeList) || name.equals(nodeListOpt) || name.equals(nodeSeq) ||
        name.equals(nodeOpt)) {
      return name;
    }
    final int len = name.length() + (nodePrefix != null ? nodePrefix.length() : 0) +
                    (nodeSuffix != null ? nodePrefix.length() : 0);
    final StringBuilder sb = new StringBuilder(len);
    if (nodePrefix != null) {
      sb.append(nodePrefix);
    }
    sb.append(name);
    if (nodeSuffix != null) {
      sb.append(nodeSuffix);
    }
    return sb.toString();
  }

}
