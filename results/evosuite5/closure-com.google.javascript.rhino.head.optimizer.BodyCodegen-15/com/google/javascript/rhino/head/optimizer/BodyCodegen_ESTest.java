/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 17:13:10 GMT 2019
 */

package com.google.javascript.rhino.head.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.EmptyExpression;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Jump;
import com.google.javascript.rhino.head.ast.Label;
import com.google.javascript.rhino.head.ast.LabeledStatement;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.RegExpLiteral;
import com.google.javascript.rhino.head.ast.ScriptNode;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.ThrowStatement;
import com.google.javascript.rhino.head.optimizer.BodyCodegen;
import com.google.javascript.rhino.head.optimizer.Codegen;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BodyCodegen_ESTest extends BodyCodegen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Codegen codegen0 = new Codegen();
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      LabeledStatement labeledStatement0 = new LabeledStatement();
      labeledStatement0.addChildrenToBack(regExpLiteral0);
      astRoot0.addChildToFront(labeledStatement0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "(", astRoot0, "(", false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      Codegen codegen0 = new Codegen();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      astRoot0.addChildToFront(objectLiteral0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "msg.bad.radix", astRoot0, "# \"[.ZdqYP6c+", false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad tree in codegen
         //
         verifyException("com.google.javascript.rhino.head.optimizer.Codegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Codegen codegen0 = new Codegen();
      Jump jump0 = new Jump(131);
      astRoot0.addChildToFront(jump0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "<B?)<WNU1k<", astRoot0, "<B?)<WNU1k<", false);
      assertEquals(2409, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      Codegen codegen0 = new Codegen();
      Label label0 = new Label(1);
      astRoot0.addChildToFront(label0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "GmB]", astRoot0, "GmB]", false);
      assertEquals(2388, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      Codegen codegen0 = new Codegen();
      com.google.javascript.rhino.head.ast.Block block0 = new com.google.javascript.rhino.head.ast.Block(9);
      astRoot0.addChildToFront(block0);
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "05k", astRoot0, "xGNAn\"c[0~-&Zv)V$g", false);
      assertEquals(2404, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      EmptyExpression emptyExpression0 = new EmptyExpression();
      astRoot0.addChildToFront(emptyExpression0);
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "x", astRoot0, "x", false);
      assertEquals(2379, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      SwitchStatement switchStatement0 = new SwitchStatement();
      astRoot0.addChildToFront(switchStatement0);
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "VDTUL w", astRoot0, "VDTUL w", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.optimizer.BodyCodegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      FunctionNode functionNode0 = new FunctionNode(0);
      AstRoot astRoot0 = new AstRoot();
      astRoot0.addChildToFront(functionNode0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, ",z\"@_c3a", astRoot0, ",z\"@_c3a", false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      Codegen codegen0 = new Codegen();
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      regExpLiteral0.setType(59);
      astRoot0.addChildToFront(regExpLiteral0);
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "=", astRoot0, "=", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.optimizer.BodyCodegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      Codegen codegen0 = new Codegen();
      ThrowStatement throwStatement0 = new ThrowStatement(0, astRoot0);
      astRoot0.addChildToFront(throwStatement0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "l)LgeHp)<1", astRoot0, "l)LgeHp)<1", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.optimizer.BodyCodegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Codegen codegen0 = new Codegen();
      ObjectLiteral objectLiteral0 = new ObjectLiteral(19);
      objectLiteral0.setType(5);
      astRoot0.addChildToFront(objectLiteral0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "Um", astRoot0, "Um", false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.head.ast.ObjectLiteral cannot be cast to com.google.javascript.rhino.head.ast.Jump
         //
         verifyException("com.google.javascript.rhino.head.optimizer.BodyCodegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      Codegen codegen0 = new Codegen();
      ObjectLiteral objectLiteral0 = new ObjectLiteral();
      objectLiteral0.setType(4);
      astRoot0.addChildToFront(objectLiteral0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "Um", astRoot0, "Um", false);
      assertEquals(2398, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      Codegen codegen0 = new Codegen();
      Jump jump0 = new Jump(2);
      astRoot0.addChildToFront(jump0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "GmB]", astRoot0, "GmB]", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.optimizer.BodyCodegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = new Context();
      StringReader stringReader0 = new StringReader("uneval");
      // Undeclared exception!
      try { 
        context0.compileReader((Reader) stringReader0, "error reporter", 1, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot(0);
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      compilerEnvirons0.setGenerateDebugInfo(false);
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "msg.bad.radix", astRoot0, "# \"[.ZdqYP6c+", false);
      assertEquals(2345, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Codegen codegen0 = new Codegen();
      RegExpLiteral regExpLiteral0 = new RegExpLiteral();
      astRoot0.addRegExp(regExpLiteral0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, "x", astRoot0, "x", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BodyCodegen bodyCodegen0 = new BodyCodegen();
      Codegen codegen0 = new Codegen();
      bodyCodegen0.codegen = codegen0;
      FunctionNode functionNode0 = new FunctionNode();
      ScriptNode[] scriptNodeArray0 = new ScriptNode[10];
      codegen0.scriptOrFnNodes = scriptNodeArray0;
      bodyCodegen0.scriptOrFn = (ScriptNode) functionNode0;
      // Undeclared exception!
      try { 
        bodyCodegen0.generateBodyCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.optimizer.BodyCodegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Codegen codegen0 = new Codegen();
      FunctionNode functionNode0 = new FunctionNode(2);
      FunctionNode functionNode1 = new FunctionNode(134);
      functionNode0.addFunction(functionNode1);
      astRoot0.addFunction(functionNode0);
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, ",z\"@_c3a", astRoot0, (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.optimizer.BodyCodegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Codegen codegen0 = new Codegen();
      FunctionNode functionNode0 = new FunctionNode(2);
      astRoot0.addFunction(functionNode0);
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      // Undeclared exception!
      try { 
        codegen0.compileToClassFile(compilerEnvirons0, ",z\"@_c3a", astRoot0, (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.optimizer.BodyCodegen", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AstRoot astRoot0 = new AstRoot();
      Codegen codegen0 = new Codegen();
      Jump jump0 = new Jump(3);
      astRoot0.addChildToFront(jump0);
      CompilerEnvirons compilerEnvirons0 = CompilerEnvirons.ideEnvirons();
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "Y4a Vi]`", astRoot0, "<B?)<WNU1k<", false);
      assertEquals(2516, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      AstRoot astRoot0 = new AstRoot();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      compilerEnvirons0.setGenerateObserverCount(true);
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "x", astRoot0, "UH#|HaL[", false);
      assertEquals(2480, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BodyCodegen.FinallyReturnPoint bodyCodegen_FinallyReturnPoint0 = new BodyCodegen.FinallyReturnPoint();
  }
}
