/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 13:58:34 GMT 2019
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassEmitter_ESTest extends ClassEmitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2537);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(1, "o", type0, (Object) null);
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(8, "LocalVariableTypeTable", type0, classEmitter_FieldInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.cglib.core.ClassEmitter$FieldInfo@63
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(224);
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(9, "Q", type0, type0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(9, "H>r", type0, classEmitter_FieldInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.cglib.core.ClassEmitter$FieldInfo@74
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(68, "org.mockito.cglib.core.ClassEmitter$2", type0, type0);
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(68, "org.mockito.cglib.core.ClassEmitter$2", type0, "org.mockito.cglib.core.ClassEmitter$2");
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo((-2092), "org.mockito.cglib.core.ClassEmitter$2", type0, type0);
      classEmitter_FieldInfo0.value = null;
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2547);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.BOOLEAN_TYPE;
      classEmitter0.declare_field(1024, "~Rj{:*b{c/\u0004?Q", type0, "~Rj{:*b{c/\u0004?Q");
      Type type1 = Type.BYTE_TYPE;
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(1024, "~Rj{:*b{c/\u0004?Q", type1, "~Rj{:*b{c/\u0004?Q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field \"~Rj{:*b{c/\u0004?Q\" has been declared differently
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo((-2108), "org.mockito.cglib.core.lassEmittr$2", type0, type0);
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo((-2108), "<", type0, classEmitter_FieldInfo0);
      boolean boolean0 = classEmitter_FieldInfo1.equals(classEmitter_FieldInfo0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(224);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.BOOLEAN_TYPE;
      classEmitter0.declare_field(10, "~Rj{:*b0{c/\u0004?Q", type0, type0);
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(0, "~Rj{:*b0{c/\u0004?Q", type0, "~Rj{:*b0{c/\u0004?Q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field \"~Rj{:*b0{c/\u0004?Q\" has been declared differently
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo((-2081), "long", type0, type0);
      boolean boolean0 = classEmitter_FieldInfo0.equals("long");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo((-889275714), "~Rj{:*b{c/\u0004?Q", (Type) null, "~Rj{:*b{c/\u0004?Q");
      boolean boolean0 = classEmitter_FieldInfo0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassEmitter classEmitter1 = new ClassEmitter(classEmitter0);
      // Undeclared exception!
      try { 
        classEmitter1.getFieldInfo("org.mockito.cglib.core.ClassEmitter$2");
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
      ClassWriter classWriter0 = new ClassWriter(224);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.BOOLEAN_TYPE;
      classEmitter0.declare_field(10, "~Rj{:*b0{c/\u0004?Q", type0, type0);
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = classEmitter0.getFieldInfo("~Rj{:*b0{c/\u0004?Q");
      assertNotNull(classEmitter_FieldInfo0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(180);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("~Rj{:*b{c/\u0004?Q");
      classEmitter0.declare_field(2, "~Rj{:*b{c/\u0004?Q", type0, "~Rj{:*b{c/\u0004?Q");
      boolean boolean0 = classEmitter0.isFieldDeclared("~Rj{:*b{c/\u0004?Q");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassEmitter classEmitter1 = new ClassEmitter(classEmitter0);
      boolean boolean0 = classEmitter1.isFieldDeclared("l}k[SiUJ!^k&[sj?r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      classEmitter0.setTarget(classEmitter0);
      Type type0 = Type.DOUBLE_TYPE;
      classEmitter0.declare_field(2755, "Q", type0, "Q");
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2537);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.BOOLEAN_TYPE;
      classEmitter0.declare_field(8, "~Rj{:*b{c/\u0004?Q", type0, (Object) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(8, "~Rj{:*b{c/\u0004?Q", type0, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field \"~Rj{:*b{c/\u0004?Q\" has been declared differently
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2537);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(1, (-1522), "org.mockito.cglib.core.CodeEmitter", "3sUL>{b.lEXTl&?Q/>", "org.mockito.cglib.core.CodeEmitter", (String[]) null);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2537);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(47, 2537, "]f", "]f", "]f", (String[]) null);
      classEmitter0.getStaticHook();
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2537);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(2537, 2, "void <clinit>()", "void <clinit>()", "void <clinit>()", (String[]) null);
      classEmitter0.begin_static();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2537);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(2, 3719, "org.mockito.cglib.core.ClassEmitter$2", "org.mockito.cglib.core.ClassEmitter$2", "org.mockito.cglib.core.ClassEmitter$2", (String[]) null);
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
  public void test19()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassWriter classWriter0 = new ClassWriter(648);
      classEmitter0.setTarget(classWriter0);
      Type[] typeArray0 = new Type[0];
      classEmitter0.begin_class(1061, (-2004318069), "org.mockito.asm.Label", (Type) null, typeArray0, "org.mockito.asm.Label");
      assertEquals(0, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.visitMethod(46, "g-B~4b-].?)", "g-B~4b-].?)", (String) null, (String[]) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@1
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.visitEnd();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2537);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(1, 2537, "]f", "]f", "ga{9M q1RB", (String[]) null);
      classEmitter0.begin_static();
      classEmitter0.end_class();
  }
}
