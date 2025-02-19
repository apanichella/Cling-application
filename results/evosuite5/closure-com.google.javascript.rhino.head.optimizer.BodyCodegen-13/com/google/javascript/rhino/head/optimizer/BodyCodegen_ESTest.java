/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 17:12:24 GMT 2019
 */

package com.google.javascript.rhino.head.optimizer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.optimizer.BodyCodegen;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BodyCodegen_ESTest extends BodyCodegen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = Context.enter();
      StringReader stringReader0 = new StringReader("yFO9>4;W5y");
      // Undeclared exception!
      try { 
        context0.compileReader((Reader) stringReader0, "yFO9>4;W5y", 0, (Object) "yFO9>4;W5y");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // securityDomain should be null if setSecurityController() was never called
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Context context0 = Context.enter();
      StringReader stringReader0 = new StringReader("com.google.javascript.rhino.head.commonjs.module.Require");
      // Undeclared exception!
      try { 
        context0.compileReader((Reader) stringReader0, "com.google.javascript.rhino.head.commonjs.module.Require", 0, (Object) "com.google.javascript.rhino.head.commonjs.module.Require");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // securityDomain should be null if setSecurityController() was never called
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context context0 = Context.enter();
      StringReader stringReader0 = new StringReader("ITt%U");
      // Undeclared exception!
      try { 
        context0.compileReader((Reader) stringReader0, "ITt%U", 0, (Object) "ITt%U");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // securityDomain should be null if setSecurityController() was never called
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Context context0 = Context.enter();
      StringReader stringReader0 = new StringReader("nuF&Z>H");
      // Undeclared exception!
      try { 
        context0.compileReader((Reader) stringReader0, "nuF&Z>H", 0, (Object) "nuF&Z>H");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // securityDomain should be null if setSecurityController() was never called
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BodyCodegen.FinallyReturnPoint bodyCodegen_FinallyReturnPoint0 = new BodyCodegen.FinallyReturnPoint();
  }
}
