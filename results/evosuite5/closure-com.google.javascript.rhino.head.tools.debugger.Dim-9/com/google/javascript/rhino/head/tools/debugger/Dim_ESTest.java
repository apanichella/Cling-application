/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 22:35:00 GMT 2019
 */

package com.google.javascript.rhino.head.tools.debugger;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeFunction;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import com.google.javascript.rhino.head.tools.debugger.Dim;
import com.google.javascript.rhino.head.tools.debugger.GuiCallback;
import com.google.javascript.rhino.head.tools.debugger.ScopeProvider;
import com.google.javascript.rhino.head.tools.debugger.SourceProvider;
import javax.swing.JLayeredPane;
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
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      String string0 = dim0.objectToString(contextFactory0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      TopLevel topLevel0 = new TopLevel();
      ScopeProvider scopeProvider0 = mock(ScopeProvider.class, new ViolatedAssumptionAnswer());
      doReturn(topLevel0).when(scopeProvider0).getScope();
      dim0.setScopeProvider(scopeProvider0);
      // Undeclared exception!
      try { 
        dim0.evalScript("com.google.javascript.rhino.head.tools.debugger.Dim$ContextData", "1(");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected end of file (com.google.javascript.rhino.head.tools.debugger.Dim$ContextData#1)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      boolean boolean0 = dim0.stringIsCompilableUnit("s)_a=?#c3^|");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.evalScript("com.google.javascript.rhino.head.tools.debugger.Dim$ContextData", "1(");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unexpected end of file (com.google.javascript.rhino.head.tools.debugger.Dim$ContextData#1)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      // Undeclared exception!
      try { 
        dim0.compileScript(">9rn[", ">9rn[");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // syntax error (>9rn[#1)
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      NativeObject nativeObject0 = new NativeObject();
      Object[] objectArray0 = dim0.getObjectIds(nativeObject0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      BaseFunction baseFunction0 = new BaseFunction();
      NativeFunction nativeFunction0 = mock(NativeFunction.class, new ViolatedAssumptionAnswer());
      NativeGenerator nativeGenerator0 = new NativeGenerator(baseFunction0, nativeFunction0, baseFunction0);
      Object[] objectArray0 = dim0.getObjectIds(nativeGenerator0);
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
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
  public void test10()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      Object[] objectArray0 = dim0.getObjectIds(contextFactory0);
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      importerTopLevel0.setAttributes(0, 2);
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      Object object0 = dim0.getObjectProperty(importerTopLevel0, integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      ScriptableObject.putProperty((Scriptable) importerTopLevel0, "undefined", (Object) "oSfHi{ qH^c%dDL");
      Object object0 = dim0.getObjectProperty(importerTopLevel0, "undefined");
      assertNotNull(object0);
      assertEquals("oSfHi{ qH^c%dDL", object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      NativeArray nativeArray0 = new NativeArray(1);
      Object object0 = dim0.getObjectProperty(nativeArray0, "__parent__");
      assertNull(object0);
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
      assertEquals(1, Dim.STEP_INTO);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      dim0.attachTo(contextFactory0);
      assertEquals(2, Dim.STEP_OUT);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Dim.ContextData dim_ContextData0 = new Dim.ContextData();
      // Undeclared exception!
      try { 
        dim_ContextData0.getFrame(4);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // -5 \u2209 [0, 0)
         //
         verifyException("com.google.javascript.rhino.head.ObjArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        Dim.ContextData.get(context0);
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
      Dim.ContextData dim_ContextData0 = new Dim.ContextData();
      int int0 = dim_ContextData0.frameCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      dim0.attachTo(contextFactory0);
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = null;
      try {
        importerTopLevel0 = new ImporterTopLevel(context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreak();
      assertEquals(4, Dim.BREAK);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.go();
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.contextSwitch(5);
      assertEquals(4, Dim.BREAK);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Dim dim0 = new Dim();
      Dim.FunctionSource dim_FunctionSource0 = dim0.functionSourceByName("BI}T");
      assertNull(dim_FunctionSource0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnExceptions(true);
      assertEquals(0, Dim.STEP_OVER);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Dim dim0 = new Dim();
      SourceProvider sourceProvider0 = mock(SourceProvider.class, new ViolatedAssumptionAnswer());
      dim0.setSourceProvider(sourceProvider0);
      assertEquals(1, Dim.STEP_INTO);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnEnter(true);
      assertEquals(0, Dim.STEP_OVER);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.dispose();
      assertEquals(0, Dim.STEP_OVER);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Dim dim0 = new Dim();
      Dim.SourceInfo dim_SourceInfo0 = dim0.sourceInfo("RaF29@[k4");
      assertNull(dim_SourceInfo0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Dim dim0 = new Dim();
      String string0 = dim0.eval("oSfHi{ qH^c%dDL");
      assertEquals("undefined", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setBreakOnReturn(true);
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setGuiCallback((GuiCallback) null);
      assertEquals(4, Dim.BREAK);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Dim dim0 = new Dim();
      String[] stringArray0 = dim0.functionNames();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Dim dim0 = new Dim();
      dim0.setReturnValue(150);
      assertEquals(3, Dim.GO);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Dim dim0 = new Dim();
      ContextFactory contextFactory0 = new ContextFactory();
      dim0.attachTo(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Object object0 = dim0.getObjectProperty(importerTopLevel0, importerTopLevel0.UNINITIALIZED_CONST);
      assertNotNull(object0);
  }
}
