/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 17:12:06 GMT 2019
 */

package com.google.javascript.rhino.head.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.ScriptNode;
import com.google.javascript.rhino.head.optimizer.BodyCodegen;
import com.google.javascript.rhino.head.optimizer.Codegen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BodyCodegen_ESTest extends BodyCodegen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Codegen codegen0 = new Codegen();
      CompilerEnvirons compilerEnvirons0 = new CompilerEnvirons();
      AstRoot astRoot0 = new AstRoot();
      byte[] byteArray0 = codegen0.compileToClassFile(compilerEnvirons0, "@lbwEO+L*WI q", astRoot0, "@lbwEO+L*WI q", false);
      assertEquals(2413, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BodyCodegen bodyCodegen0 = new BodyCodegen();
      Codegen codegen0 = new Codegen();
      ScriptNode[] scriptNodeArray0 = new ScriptNode[12];
      codegen0.scriptOrFnNodes = scriptNodeArray0;
      bodyCodegen0.codegen = codegen0;
      FunctionNode functionNode0 = new FunctionNode();
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
  public void test2()  throws Throwable  {
      BodyCodegen.FinallyReturnPoint bodyCodegen_FinallyReturnPoint0 = new BodyCodegen.FinallyReturnPoint();
  }
}
