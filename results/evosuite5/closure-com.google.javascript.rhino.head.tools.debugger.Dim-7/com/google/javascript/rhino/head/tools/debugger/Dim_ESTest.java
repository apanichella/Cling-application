/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 22:39:27 GMT 2019
 */

package com.google.javascript.rhino.head.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.tools.debugger.Dim;
import com.google.javascript.rhino.head.tools.debugger.GuiCallback;
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
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      String string0 = dim0.objectToString((Object) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      String string0 = dim0.objectToString(contextFactory0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      boolean boolean0 = dim0.stringIsCompilableUnit("fo\"lJs297RZ|2E0<3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      dim0.attachTo(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      Object[] objectArray0 = dim0.getObjectIds(importerTopLevel0);
      assertEquals(60, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      importerTopLevel0.setParentScope(importerTopLevel0);
      Object[] objectArray0 = dim0.getObjectIds(importerTopLevel0);
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        dim0.getObjectIds(delegator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Delegator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Object[] objectArray0 = dim0.getObjectIds(importerTopLevel0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Object object0 = dim0.getObjectProperty(nativeContinuation0, 1);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Dim dim0 = new Dim();
      NativeObject nativeObject0 = new NativeObject();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      Object object0 = dim0.getObjectProperty(nativeObject0, "diLuzw=/]~");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      String string0 = "iL\\uzwD/]~";
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeContinuation0.setAttributes(string0, 1);
      Object object0 = dim0.getObjectProperty(nativeContinuation0, string0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.getObjectProperty((Object) null, "__parent__");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.debugger.Dim", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        dim0.getObjectProperty(delegator0, "__proto__");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.Delegator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      NativeObject nativeObject0 = new NativeObject();
      NativeObject nativeObject1 = (NativeObject)dim0.getObjectProperty(nativeObject0, "this");
      assertEquals(4, ScriptableObject.PERMANENT);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Dim dim0 = new Dim();
      String string0 = dim0.eval((String) null);
      assertNotNull(string0);
      assertEquals("undefined", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.clearAllBreakpoints();
      assertEquals(0, Dim.STEP_OVER);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      dim0.attachTo(contextFactory0);
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Dim.ContextData dim_ContextData0 = new Dim.ContextData();
      // Undeclared exception!
      try { 
        dim_ContextData0.getFrame((-1878));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 1877 \u2209 [0, 0)
         //
         verifyException("com.google.javascript.rhino.head.ObjArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Dim.ContextData dim_ContextData0 = new Dim.ContextData();
      int int0 = dim_ContextData0.frameCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        Dim.ContextData.get((Context) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.debugger.Dim$ContextData", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreak();
      assertEquals(4, Dim.BREAK);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.go();
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.contextSwitch(0);
      assertEquals(4, Dim.BREAK);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Dim dim0 = new Dim();
      Dim.FunctionSource dim_FunctionSource0 = dim0.functionSourceByName("NZ{trfxH<ZFq&'=P)Q~");
      assertNull(dim_FunctionSource0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnExceptions(false);
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Dim dim0 = new Dim();
      SourceProvider sourceProvider0 = mock(SourceProvider.class, new ViolatedAssumptionAnswer());
      dim0.setSourceProvider(sourceProvider0);
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnEnter(false);
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.dispose();
      assertEquals(5, Dim.EXIT);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Dim dim0 = new Dim();
      Dim.SourceInfo dim_SourceInfo0 = dim0.sourceInfo("__parent__");
      assertNull(dim_SourceInfo0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Dim dim0 = new Dim();
      String string0 = dim0.eval("\u0006ut)0%8[q~>");
      assertEquals("undefined", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnReturn(false);
      assertEquals(0, Dim.STEP_OVER);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setGuiCallback((GuiCallback) null);
      assertEquals(1, Dim.STEP_INTO);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Dim dim0 = new Dim();
      String[] stringArray0 = dim0.functionNames();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setReturnValue(0);
      assertEquals(0, Dim.STEP_OVER);
  }
}
