/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 17:19:43 GMT 2019
 */

package com.google.javascript.rhino.head.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeFunction;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.tools.debugger.Dim;
import com.google.javascript.rhino.head.tools.debugger.GuiCallback;
import com.google.javascript.rhino.head.tools.debugger.ScopeProvider;
import com.google.javascript.rhino.head.tools.debugger.SourceProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Dim_ESTest extends Dim_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.evalScript("5rKH|ud#\"fZ`ej2%", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.debugger.Dim", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      String string0 = dim0.objectToString((Object) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      Delegator delegator0 = new Delegator();
      ScopeProvider scopeProvider0 = mock(ScopeProvider.class, new ViolatedAssumptionAnswer());
      doReturn(delegator0).when(scopeProvider0).getScope();
      dim0.setScopeProvider(scopeProvider0);
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.evalScript("java/lang/Void", "java/lang/Void");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.debugger.Dim", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      String string0 = dim0.objectToString(contextFactory0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      boolean boolean0 = dim0.stringIsCompilableUnit("tis");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.compileScript("", "//");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.debugger.Dim", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeFunction nativeFunction0 = mock(NativeFunction.class, new ViolatedAssumptionAnswer());
      NativeGenerator nativeGenerator0 = new NativeGenerator(nativeContinuation0, nativeFunction0, contextFactory0);
      Object[] objectArray0 = dim0.getObjectIds(nativeGenerator0);
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object[] objectArray0 = dim0.getObjectIds(nativeContinuation0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        dim0.getObjectIds(nativeJavaClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object object0 = dim0.getObjectProperty(nativeContinuation0, 1);
      String string0 = dim0.objectToString(object0);
      assertEquals("undefined", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeContinuation0.setAttributes(0, 0);
      dim0.attachTo(contextFactory0);
      Object object0 = dim0.getObjectProperty(nativeContinuation0, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeContinuation0.setAttributes("S6)4x{s6B?", 1);
      dim0.attachTo(contextFactory0);
      Object object0 = dim0.getObjectProperty(nativeContinuation0, "S6)4x{s6B?");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object object0 = dim0.getObjectProperty(nativeContinuation0, "__parent__");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object object0 = dim0.getObjectProperty(nativeContinuation0, "");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Dim dim0 = new Dim();
      String string0 = dim0.eval((String) null);
      assertEquals("undefined", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.clearAllBreakpoints();
      assertEquals(4, Dim.BREAK);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.evalScript("<d#VEkZ`", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.debugger.Dim", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      dim0.attachTo(contextFactory0);
      assertEquals(0, Dim.STEP_OVER);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Dim.ContextData dim_ContextData0 = new Dim.ContextData();
      // Undeclared exception!
      try { 
        dim_ContextData0.getFrame(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -2 \u2209 [0, 0)
         //
         verifyException("com.google.javascript.rhino.head.ObjArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Dim.ContextData dim_ContextData0 = new Dim.ContextData();
      int int0 = dim_ContextData0.frameCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreak();
      assertEquals(0, Dim.STEP_OVER);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.go();
      assertEquals(4, Dim.BREAK);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.contextSwitch(2280);
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Dim dim0 = new Dim();
      Dim.FunctionSource dim_FunctionSource0 = dim0.functionSourceByName("Failed to load source from ");
      assertNull(dim_FunctionSource0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnExceptions(true);
      assertEquals(2, Dim.STEP_OUT);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Dim dim0 = new Dim();
      SourceProvider sourceProvider0 = mock(SourceProvider.class, new ViolatedAssumptionAnswer());
      dim0.setSourceProvider(sourceProvider0);
      assertEquals(4, Dim.BREAK);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnEnter(true);
      assertEquals(4, Dim.BREAK);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.dispose();
      assertEquals(0, Dim.STEP_OVER);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Dim dim0 = new Dim();
      Dim.SourceInfo dim_SourceInfo0 = dim0.sourceInfo("!mcg7=uPM(qz{OqI%");
      assertNull(dim_SourceInfo0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Dim dim0 = new Dim();
      String string0 = dim0.eval("h&.p{(_;^cwEC\"LID ");
      assertEquals("undefined", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnReturn(true);
      assertEquals(0, Dim.STEP_OVER);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setGuiCallback((GuiCallback) null);
      assertEquals(4, Dim.BREAK);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Dim dim0 = new Dim();
      String[] stringArray0 = dim0.functionNames();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setReturnValue(1825);
      assertEquals(5, Dim.EXIT);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.evalScript("4Xf{p#73pRRCd", "com.google.javascript.rhino.head.tools.debugger.Dim$ContextData");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.debugger.Dim", e);
      }
  }
}
