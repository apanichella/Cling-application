/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:00:22 GMT 2019
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
      Type type0 = Type.FLOAT_TYPE;
      ClassWriter classWriter0 = new ClassWriter(4);
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(1, "[S'6p|v", type0, (Object) null);
      // Undeclared exception!
      try { 
        classWriter0.newConst(classEmitter_FieldInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.cglib.core.ClassEmitter$FieldInfo@5db9200c
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(3247, "Tc7%i345C~}?sd", type0, "Tc7%i345C~}?sd");
      ClassWriter classWriter0 = new ClassWriter(4);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(4, "Tc7%i345C~}?sd", type0, classEmitter_FieldInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.cglib.core.ClassEmitter$FieldInfo@c850f2ff
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(46, "", type0, type0);
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(46, "", type0, classEmitter_FieldInfo0);
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      classEmitter0.setTarget(classEmitter0);
      Type type0 = Type.CHAR_TYPE;
      classEmitter0.declare_field(1, "j.(Q$a-8_", type0, (Object) null);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(47, "", (Type) null, (Object) null);
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(47, "static hook is invalid for this class", (Type) null, "static hook is invalid for this class");
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo((-666), "+C!5h@f=ce!N*r%v*?V", type0, type0);
      ClassEmitter.FieldInfo classEmitter_FieldInfo1 = new ClassEmitter.FieldInfo(0, "+C!5h@f=ce!N*r%v*?V", type0, "+C!5h@f=ce!N*r%v*?V");
      boolean boolean0 = classEmitter_FieldInfo0.equals(classEmitter_FieldInfo1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(5, "", type0, classEmitter0);
      boolean boolean0 = classEmitter_FieldInfo0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = new ClassEmitter.FieldInfo(8, "", (Type) null, "");
      boolean boolean0 = classEmitter_FieldInfo0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      classEmitter0.setTarget(classEmitter0);
      // Undeclared exception!
      try { 
        classEmitter0.getFieldInfo((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      classEmitter0.setTarget(classEmitter0);
      Type type0 = Type.BOOLEAN_TYPE;
      classEmitter0.declare_field((-2147483641), "KaMXbv3L(O+,", type0, classEmitter0);
      ClassEmitter.FieldInfo classEmitter_FieldInfo0 = classEmitter0.getFieldInfo("KaMXbv3L(O+,");
      assertNotNull(classEmitter_FieldInfo0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      classEmitter0.setTarget(classEmitter0);
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      classEmitter0.declare_field(2147483645, "KaMXbv3L(O+,", type0, classEmitter0);
      boolean boolean0 = classEmitter0.isFieldDeclared("KaMXbv3L(O+,");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(6);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      boolean boolean0 = classEmitter0.isFieldDeclared("J=Wi}9i#N*Rb");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      classEmitter0.setTarget(classEmitter0);
      Type type0 = Type.VOID_TYPE;
      Type type1 = Type.getObjectType(";");
      // Undeclared exception!
      try { 
        classEmitter0.declare_field(9, "Field ", type1, type0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field \"Field \" has been declared differently
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2214));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[14];
      classEmitter0.visit(1, (-2214), "", "", "93Wf:N", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.end_class();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2214));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit((-2214), 2, "u", " Bt4{Ha#;G?#E#rbb}|", "K(?\"k", stringArray0);
      classEmitter0.getStaticHook();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2214));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[14];
      classEmitter0.visit(1, (-2214), "%Pm<SD", "%Pm<SD", "%Pm<SD", stringArray0);
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
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2214));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      classEmitter0.begin_class((-291), (-1067), "RuntimeVisibleParameterAnnotations", type0, typeArray0, "K(?\"k");
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        classEmitter0.begin_class((-208), (-208), "", (Type) null, (Type[]) null, "L");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2214));
      ClassEmitter classEmitter0 = new ClassEmitter();
      String[] stringArray0 = new String[14];
      ClassEmitter classEmitter1 = new ClassEmitter(classWriter0);
      classEmitter0.setTarget(classEmitter1);
      classEmitter0.visit(1, 2, "%P7mS", "%P7mS", "%P7mS", stringArray0);
      classEmitter0.getStaticHook();
      classEmitter0.end_class();
      assertNotSame(classEmitter0, classEmitter1);
  }
}
