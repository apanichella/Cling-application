/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 14:17:04 GMT 2019
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.security.ProtectionDomain;
import java.util.LinkedList;
import javax.management.remote.JMXPrincipal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.cglib.core.ClassInfo;
import org.mockito.cglib.core.ReflectUtils;
import org.mockito.cglib.core.Signature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ReflectUtils_ESTest extends ReflectUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[8];
      Method[] methodArray0 = new Method[1];
      // Undeclared exception!
      try { 
        ReflectUtils.findMethods(stringArray0, methodArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[3];
      Method[] methodArray0 = new Method[0];
      Method[] methodArray1 = ReflectUtils.findMethods(stringArray0, methodArray0);
      assertEquals(1, methodArray1.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<JMXPrincipal> class0 = JMXPrincipal.class;
      ClassInfo classInfo0 = ReflectUtils.getClassInfo(class0);
      assertNotNull(classInfo0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 2);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      // Undeclared exception!
      try { 
        ReflectUtils.findPackageProtected(classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.Reflection", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<ProtectionDomain>[] classArray0 = (Class<ProtectionDomain>[]) Array.newInstance(Class.class, 0);
      int int0 = ReflectUtils.findPackageProtected(classArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Method> class0 = Method.class;
      // Undeclared exception!
      try { 
        ReflectUtils.findNewInstance(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.lang.reflect.Method is not an interface
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        ReflectUtils.findNewInstance(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // expecting exactly 1 method in interface java.lang.annotation.Annotation
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<PropertyDescriptor> linkedList0 = new LinkedList<PropertyDescriptor>();
      Class<String> class0 = String.class;
      ReflectUtils.addAllInterfaces(class0, linkedList0);
      assertEquals(3, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Method> class0 = Method.class;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ReflectUtils.addAllMethods(class0, linkedList0);
      assertEquals(130, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Method> class0 = Method.class;
      try { 
        ReflectUtils.findDeclaredMethod(class0, "}o'`t9|#!;$G", (Class[]) null);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // }o'`t9|#!;$G
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Method> class0 = Method.class;
      PropertyDescriptor[] propertyDescriptorArray0 = ReflectUtils.getBeanGetters(class0);
      assertEquals(25, propertyDescriptorArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Method> class0 = Method.class;
      PropertyDescriptor[] propertyDescriptorArray0 = ReflectUtils.getBeanSetters(class0);
      Method[] methodArray0 = ReflectUtils.getPropertyMethods(propertyDescriptorArray0, false, false);
      assertEquals(0, methodArray0.length);
      assertEquals(1, propertyDescriptorArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Class[] classArray0 = ReflectUtils.getClasses(objectArray0);
      assertEquals(1, classArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      String[] stringArray0 = ReflectUtils.getNames(classArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = ReflectUtils.getNames((Class[]) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<String> class0 = String.class;
      Constructor constructor0 = ReflectUtils.getConstructor(class0, (Class[]) null);
      Signature signature0 = ReflectUtils.getSignature(constructor0);
      assertEquals("<init>", signature0.getName());
      assertTrue(constructor0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        ReflectUtils.getExceptionTypes((Member) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot get exception types of a field
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<ReflectUtils> class0 = ReflectUtils.class;
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 0);
      Constructor constructor0 = ReflectUtils.getConstructor(class0, classArray0);
      ReflectUtils.getExceptionTypes(constructor0);
      assertTrue(constructor0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      ClassInfo classInfo0 = ReflectUtils.getClassInfo(class0);
      assertNotNull(classInfo0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        ReflectUtils.getMethodInfo((Member) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        ReflectUtils.getMethodInfo((Member) null, 2226);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot get signature of a field
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      byte[] byteArray0 = new byte[3];
      try { 
        ReflectUtils.defineClass("", byteArray0, classLoader0);
        fail("Expecting exception: InvocationTargetException");
      
      } catch(InvocationTargetException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        ReflectUtils.findMethod("l?OO6");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<PropertyDescriptor> class0 = PropertyDescriptor.class;
      PropertyDescriptor[] propertyDescriptorArray0 = ReflectUtils.getBeanProperties(class0);
      assertEquals(12, propertyDescriptorArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Method> class0 = Method.class;
      PropertyDescriptor[] propertyDescriptorArray0 = ReflectUtils.getBeanSetters(class0);
      Method[] methodArray0 = ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
      assertEquals(2, methodArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        ReflectUtils.findConstructor("&d<7ohp(_");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException-->&d<7ohp
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<String> class0 = String.class;
      Object object0 = ReflectUtils.newInstance(class0);
      assertEquals("", object0);
  }
}
