/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 14 00:04:04 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.InterpretedFunction;
import com.google.javascript.rhino.head.Interpreter;
import com.google.javascript.rhino.head.InterpreterData;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.Scriptable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class InterpretedFunction_ESTest extends InterpretedFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Context context0 = Context.getContext();
      InterpreterData interpreterData0 = new InterpreterData((-1), "language version", (String) null, true);
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createFunction(context0, importerTopLevel0, interpreterData0, (Object) null);
      // Undeclared exception!
      try { 
        interpretedFunction0.exec(context0, importerTopLevel0);
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
  public void test01()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1, (String) null, (String) null, true);
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript(interpreterData0, (Object) null);
      Context context0 = Context.getCurrentContext();
      interpreterData0.itsFunctionType = 2;
      // Undeclared exception!
      try { 
        interpretedFunction0.exec(context0, (Scriptable) null);
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
  public void test02()  throws Throwable  {
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      NativeError nativeError0 = new NativeError();
      // Undeclared exception!
      try { 
        interpretedFunction0.construct(context0, nativeError0, context0.emptyArgs);
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
  public void test03()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1, "com.google.javascript.rhino.head.tools.shell.Runner", (String) null, false);
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript(interpreterData0, (Object) null);
      String string0 = interpretedFunction0.getFunctionName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1, "com.google.javascript.rhino.head.tools.shell.Runner", (String) null, false);
      interpreterData0.itsName = "com.google.javascript.rhino.head.tools.shell.Runner";
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript(interpreterData0, (Object) null);
      String string0 = interpretedFunction0.getFunctionName();
      assertEquals("com.google.javascript.rhino.head.tools.shell.Runner", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Context context0 = Context.enter();
      InterpreterData interpreterData0 = new InterpreterData((-1), "language version", (String) null, true);
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createFunction(context0, importerTopLevel0, interpreterData0, (Object) null);
      // Undeclared exception!
      try { 
        interpretedFunction0.createRegExpWraps(context0, importerTopLevel0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("com.google.javascript.rhino.head.Kit", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Context context0 = Context.getCurrentContext();
      InterpreterData interpreterData0 = new InterpreterData((-1), "language version", (String) null, true);
      interpreterData0.itsRegExpLiterals = context0.emptyArgs;
      InterpretedFunction.createFunction(context0, importerTopLevel0, interpreterData0, (Object) null);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Context context0 = Context.getContext();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("error reporter");
      // Undeclared exception!
      try { 
        InterpretedFunction.createFunction(context0, nativeJavaPackage0, (InterpreterData) null, nativeJavaPackage0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.InterpretedFunction", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      // Undeclared exception!
      try { 
        interpretedFunction0.getParamOrVarName(13);
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
  public void test09()  throws Throwable  {
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      // Undeclared exception!
      try { 
        interpretedFunction0.getParamOrVarConst(0);
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
  public void test10()  throws Throwable  {
      InterpreterData interpreterData0 = new InterpreterData(1, "com.google.javascript.rhino.head.tools.shell.Runner", (String) null, true);
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript(interpreterData0, (Object) null);
      interpretedFunction0.getLength();
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Interpreter interpreter0 = new Interpreter();
      InterpretedFunction interpretedFunction0 = InterpretedFunction.createScript((InterpreterData) null, (Object) null);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      // Undeclared exception!
      try { 
        interpretedFunction0.resumeGenerator(context0, interpretedFunction0, 3, interpreter0, contextFactory0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.javascript.rhino.head.Interpreter cannot be cast to com.google.javascript.rhino.head.Interpreter$CallFrame
         //
         verifyException("com.google.javascript.rhino.head.Interpreter", e);
      }
  }
}
