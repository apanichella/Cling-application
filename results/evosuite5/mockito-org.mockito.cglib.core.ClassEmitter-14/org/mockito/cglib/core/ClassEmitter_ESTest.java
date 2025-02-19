/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 13:58:05 GMT 2019
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassAdapter;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassEmitter_ESTest extends ClassEmitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo((-506), "oY?RILV{0", type0, (Object) null);
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(4, "@Cc/h6", type0, classEmitter_FieldInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.cglib.core.ClassEmitter$FieldInfo@44cba83
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(0, "#H\"M'{", type0, type0);
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(10, "#H\"M'{", type0, classEmitter_FieldInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.cglib.core.ClassEmitter$FieldInfo@3fc0d4a1
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.declare_field((-474), "L", type0, type0);
      // Undeclared exception!
      try { 
        classEmitter0.declare_field((-474), "L", type0, classEmitter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field \"L\" has been declared differently
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(0, "#H\"M'{", type0, type0);
      classEmitter_FieldInfo0.value = null;
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = Type.VOID_TYPE;
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      classEmitter0.declare_field(10, "|K/-~;%Ad{+", type0, "|K/-~;%Ad{+");
      Type type1 = Type.CHAR_TYPE;
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(10, "|K/-~;%Ad{+", type1, "|K/-~;%Ad{+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field \"|K/-~;%Ad{+\" has been declared differently
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(0, "#H\"M'{", type0, type0);
      classEmitter_FieldInfo0.access = 1996;
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(1996, "c>zA7vCc<cfs:|_(", type0, type0);
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.declare_field(8, "I", type0, "I");
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(10, "I", type0, "I");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field \"I\" has been declared differently
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(0, "#H\"M'{", type0, type0);
      boolean boolean0 = classEmitter_FieldInfo0.equals(type0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(0, "Ljava/lang/Synthetic;", type0, type0);
      boolean boolean0 = classEmitter_FieldInfo0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      // Undeclared exception!
      try { 
        classEmitter0.getFieldInfo("org.mockito.cglib.core.Constants");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.declare_field(8, "I", type0, "I");
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = classEmitter0.getFieldInfo("I");
      assertNotNull(classEmitter_FieldInfo0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.declare_field(0, ")", type0, type0);
      boolean boolean0 = classEmitter0.isFieldDeclared(")");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      boolean boolean0 = classEmitter0.isFieldDeclared("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Type type0 = Type.VOID_TYPE;
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      classEmitter0.declare_field(10, "K/-~;%JAd{+", type0, "K/-~;%JAd{+");
      classEmitter0.declare_field(10, "K/-~;%JAd{+", type0, "K/-~;%JAd{+");
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.declare_field((-474), "L", type0, type0);
      // Undeclared exception!
      try { 
        classEmitter0.declare_field((-474), "L", type0, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field \"L\" has been declared differently
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[3];
      classEmitter0.visit(7, (-3422), "lv2F", "lv2F", "lv2F", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.begin_static();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@1
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(9, 8, "2", "2", "2", stringArray0);
      classEmitter0.getStaticHook();
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[41];
      classEmitter0.visit(9, 8, "", "", "", stringArray0);
      classEmitter0.begin_static();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(5, (-2359), "#H\"M'{", "#H\"M'{", "#H\"M'{", (String[]) null);
      // Undeclared exception!
      try { 
        classEmitter0.getStaticHook();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // static hook is invalid for this class
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("oh&Q+L");
      Type[] typeArray0 = new Type[0];
      classEmitter0.begin_class(9, 5, "oh&Q+L", type0, typeArray0, "oh&Q+L");
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[8];
      // Undeclared exception!
      try { 
        classEmitter0.begin_class((-1959), (-1959), "s[)b{Pt{_3}WK--P", (Type) null, typeArray0, "s[)b{Pt{_3}WK--P");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      ClassEmitter classEmitter1 = new ClassEmitter(classEmitter0);
      classEmitter1.declare_field((-474), "L", type0, (Object) null);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.getSuperType();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      ClassEmitter classEmitter1 = new ClassEmitter(classEmitter0);
      String[] stringArray0 = new String[25];
      classEmitter1.visit(9, 8, "", "", "", stringArray0);
      classEmitter1.begin_static();
      classEmitter1.end_class();
      assertFalse(classEmitter1.equals((Object)classEmitter0));
  }
}
