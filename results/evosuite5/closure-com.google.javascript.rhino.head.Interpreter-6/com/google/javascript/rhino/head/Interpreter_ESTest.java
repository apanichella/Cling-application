/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 15:04:15 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.DefaultErrorReporter;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.WrappedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockError;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Interpreter_ESTest extends Interpreter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context.getCurrentContext();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      Context context0 = new Context();
      InterpreterData interpreterData0 = new InterpreterData(140, "error reporter", "error reporter", false);
      // Undeclared exception!
      try { 
        interpreterData0.getLineNumbers();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/javascript/rhino/head/Interpreter
         //
         verifyException("com.google.javascript.rhino.head.InterpreterData", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Context.enter();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Context context0 = new Context();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      MockError mockError0 = new MockError();
      WrappedException wrappedException0 = null;
      try {
        wrappedException0 = new WrappedException(mockError0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test5()  throws Throwable  {
      DefaultErrorReporter defaultErrorReporter0 = DefaultErrorReporter.instance;
      String string0 = "N>$}";
      int int0 = 261;
      // Undeclared exception!
      try { 
        defaultErrorReporter0.runtimeError("N>$}", "N>$}", 261, "N>$}", 261);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-3203), "WZWtj]vMJK*8a2.g", "WZWtj]vMJK*8a2.g", true);
      InterpreterData interpreterData1 = new InterpreterData((-3203), "WZWtj]vMJK*8a2.g", "WZWtj]vMJK*8a2.g", true);
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-55);
      byteArray0[3] = (byte) (-7);
      interpreterData0.argCount = (int) (byte) (-7);
      interpreterData1.itsICode = byteArray0;
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData((-3203), "WZWtj]vMJK*8a2.g", "WZWtj]vMJK*8a2.g", true);
      InterpreterData interpreterData1 = new InterpreterData((-3203), "WZWtj]vMJK*8a2.g", "WZWtj]vMJK*8a2.g", true);
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-55);
      byteArray0[2] = (byte)36;
      byteArray0[3] = (byte) (-28);
      interpreterData0.argCount = (int) (byte) (-28);
      interpreterData1.itsICode = byteArray0;
  }
}
