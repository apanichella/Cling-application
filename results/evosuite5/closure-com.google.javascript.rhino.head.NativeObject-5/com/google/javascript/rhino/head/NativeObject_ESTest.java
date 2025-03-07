/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 14:42:17 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import java.util.Set;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeObject_ESTest extends NativeObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      int int0 = nativeIterator_StopIteration0.findPrototypeId("J6lXOhn:X;SHiRO6");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      int int0 = nativeIterator_StopIteration0.findPrototypeId("language version");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeIterator_StopIteration0.exportAsJSClass(13, importerTopLevel0, false);
      Object object0 = nativeIterator_StopIteration0.get("error reporter", (Scriptable) importerTopLevel0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      int int0 = nativeObject0.findPrototypeId("isFrozen");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      int int0 = nativeIterator_StopIteration0.findPrototypeId("S|Rsn26Gh[a{r(>bz]o");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      int int0 = nativeIterator_StopIteration0.findPrototypeId("ITZK24rQ#5? Fkipb");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      int int0 = nativeObject0.findPrototypeId("zTo:zHDNE;g`Dc%5#");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      int int0 = nativeIterator_StopIteration0.findPrototypeId("_lookuoSetter__");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      int int0 = nativeIterator_StopIteration0.findPrototypeId("AK`nd19,j");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeObject.EntrySet nativeObject_EntrySet0 = nativeIterator_StopIteration0.new EntrySet();
      Object object0 = nativeIterator_StopIteration0.remove((Object) nativeObject_EntrySet0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object object0 = nativeIterator_StopIteration0.remove((Object) "__lookuoSetter__");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Short short0 = new Short((short) (-898));
      Object object0 = nativeIterator_StopIteration0.remove((Object) short0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put(8, (Scriptable) nativeIterator_StopIteration0, (Object) 2);
      boolean boolean0 = nativeIterator_StopIteration0.containsValue(nativeIterator_StopIteration0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put(7, (Scriptable) nativeIterator_StopIteration0, (Object) nativeIterator_StopIteration0);
      boolean boolean0 = nativeIterator_StopIteration0.containsValue(nativeIterator_StopIteration0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Short short0 = new Short((short)3076);
      boolean boolean0 = nativeIterator_StopIteration0.containsKey(short0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object object0 = nativeIterator_StopIteration0.getOrDefault("__defineSettlr__", "__defineSettlr__");
      assertEquals("__defineSettlr__", object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(13, importerTopLevel0, false);
      Object[] objectArray0 = new Object[2];
      ScriptableObject.callMethod(context0, (Scriptable) idFunctionObject0, "__lookupSetter__", objectArray0);
      assertEquals(1, idFunctionObject0.getArity());
      assertEquals(1, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Object[] objectArray0 = new Object[6];
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) importerTopLevel0, "__defineSetter__", objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: null is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Context context0 = Context.getContext();
      Object[] objectArray0 = new Object[13];
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Object object0 = ScriptableObject.callMethod(context0, (Scriptable) importerTopLevel0, "propertyIsEnumerable", objectArray0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(11, importerTopLevel0, false);
      Object[] objectArray0 = new Object[17];
      objectArray0[0] = (Object) context0;
      nativeIterator_StopIteration0.execIdCall(idFunctionObject0, context0, idFunctionObject0, importerTopLevel0, objectArray0);
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(13, importerTopLevel0, false);
      Object[] objectArray0 = new Object[23];
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) idFunctionObject0, "__lookupSetter__", context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(13, importerTopLevel0, false);
      Object[] objectArray0 = new Object[23];
      NativeObject nativeObject0 = (NativeObject)nativeIterator_StopIteration0.execIdCall(idFunctionObject0, context0, importerTopLevel0, importerTopLevel0, objectArray0);
      assertEquals("Object", nativeObject0.getClassName());
      assertEquals(1, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) importerTopLevel0, "__defineSetter__", context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(13, importerTopLevel0, false);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) idFunctionObject0, "isPrototypeOf", context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod(context0, (Scriptable) importerTopLevel0, "propertyIsEnumerable", context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(13, importerTopLevel0, false);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.execIdCall(idFunctionObject0, context0, importerTopLevel0, importerTopLevel0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(110, nativeIterator_StopIteration0, false);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.containsValue(idFunctionObject0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(11, importerTopLevel0, false);
      importerTopLevel0.defineOwnProperty(context0, (Object) idFunctionObject0, (ScriptableObject) importerTopLevel0, false);
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ScriptableObject.callMethod((Scriptable) importerTopLevel0, "toLocaleString", context0.emptyArgs);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.put((Object) "__lookuoSetter__", (Object) "__lookuoSetter__");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeIterator_StopIteration0, nativeIterator_StopIteration0, 4, 1);
      Context context0 = Context.getContext();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=4 MASTER=[object StopIteration]
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.putAll(nativeObject0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      NativeObject nativeObject0 = new NativeObject();
      nativeObject0.getOwnPropertyDescriptor(context0, importerTopLevel0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put(8, (Scriptable) nativeIterator_StopIteration0, (Object) 2);
      boolean boolean0 = nativeIterator_StopIteration0.containsValue((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      BiFunction<NativeContinuation, IdFunctionObject, NativeJavaTopPackage> biFunction0 = (BiFunction<NativeContinuation, IdFunctionObject, NativeJavaTopPackage>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any(com.google.javascript.rhino.head.NativeContinuation.class) , any(com.google.javascript.rhino.head.IdFunctionObject.class));
      nativeIterator_StopIteration0.put(4, (Scriptable) nativeIterator_StopIteration0, (Object) nativeIterator_StopIteration0);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.replaceAll(biFunction0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject$EntrySet$1$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.put(8, (Scriptable) nativeIterator_StopIteration0, (Object) 2);
      NativeObject.KeySet nativeObject_KeySet0 = nativeIterator_StopIteration0.new KeySet();
      Double double0 = new Double((-5889.42696871));
      boolean boolean0 = nativeObject_KeySet0.remove(double0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeObject.KeySet nativeObject_KeySet0 = nativeIterator_StopIteration0.new KeySet();
      boolean boolean0 = nativeObject_KeySet0.contains(nativeIterator_StopIteration0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeObject.KeySet nativeObject_KeySet0 = nativeIterator_StopIteration0.new KeySet();
      boolean boolean0 = nativeObject_KeySet0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Set<Object> set0 = nativeIterator_StopIteration0.keySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeObject.ValueCollection nativeObject_ValueCollection0 = nativeIterator_StopIteration0.new ValueCollection();
      int int0 = nativeObject_ValueCollection0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeObject.EntrySet nativeObject_EntrySet0 = nativeIterator_StopIteration0.new EntrySet();
      int int0 = nativeObject_EntrySet0.size();
      assertEquals(0, int0);
  }
}
