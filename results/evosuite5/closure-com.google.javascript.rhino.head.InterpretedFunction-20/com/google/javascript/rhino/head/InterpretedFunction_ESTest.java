/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 14 00:06:46 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.InterpretedFunction;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class InterpretedFunction_ESTest extends InterpretedFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      Context context0 = Context.enter();
      InterpreterData interpreterData0 = new InterpreterData(1, "error reporter", "language version", false);
      InterpretedFunction interpretedFunction1 = InterpretedFunction.createFunction(context0, interpretedFunction0, interpreterData0, (Object) null);
      // Undeclared exception!
      try { 
        interpretedFunction1.exec(context0, interpretedFunction0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.InterpretedFunction", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      Context context0 = Context.enter();
      InterpreterData interpreterData0 = new InterpreterData(1, "error reporter", "language version", false);
      interpreterData0.itsFunctionType = 7;
      InterpretedFunction interpretedFunction1 = InterpretedFunction.createFunction(context0, interpretedFunction0, interpreterData0, (Object) null);
      // Undeclared exception!
      try { 
        interpretedFunction1.exec((Context) null, interpretedFunction0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.InterpretedFunction", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      Context context0 = new Context();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      // Undeclared exception!
      try { 
        interpretedFunction0.construct(context0, scriptableObject0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Interpreter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      Context context0 = new Context();
      InterpreterData interpreterData0 = new InterpreterData(1, "error reporter", "language version", true);
      InterpretedFunction interpretedFunction1 = InterpretedFunction.createFunction(context0, interpretedFunction0, interpreterData0, (Object) null);
      // Undeclared exception!
      try { 
        interpretedFunction1.exec(context0, interpretedFunction0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.InterpretedFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Context context0 = Context.enter();
      InterpreterData interpreterData0 = new InterpreterData(1, "error reporter", "language version", false);
      // Undeclared exception!
      try { 
        InterpretedFunction.createScript(interpreterData0, context0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.InterpretedFunction", e);
      }
  }
}
