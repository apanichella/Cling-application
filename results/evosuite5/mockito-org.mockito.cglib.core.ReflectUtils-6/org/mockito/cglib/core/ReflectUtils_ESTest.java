/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:22:49 GMT 2019
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
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.cglib.core.ClassInfo;
import org.mockito.cglib.core.ReflectUtils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ReflectUtils_ESTest extends ReflectUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[4];
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
      Class<String> class0 = String.class;
      ClassInfo classInfo0 = ReflectUtils.getClassInfo(class0);
      assertNotNull(classInfo0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<ProtectionDomain>[] classArray0 = (Class<ProtectionDomain>[]) Array.newInstance(Class.class, 1);
      Class<ProtectionDomain> class0 = ProtectionDomain.class;
      classArray0[0] = class0;
      int int0 = ReflectUtils.findPackageProtected(classArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        ReflectUtils.findInterfaceMethod(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.lang.String is not an interface
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Annotation> class0 = Annotation.class;
      // Undeclared exception!
      try { 
        ReflectUtils.findInterfaceMethod(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // expecting exactly 1 method in interface java.lang.annotation.Annotation
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<String> class0 = String.class;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ReflectUtils.addAllInterfaces(class0, linkedList0);
      assertEquals(3, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Method> class0 = Method.class;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedHashSet0);
      ReflectUtils.addAllMethods(class0, list0);
      assertEquals(130, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<ProtectionDomain> class0 = ProtectionDomain.class;
      try { 
        ReflectUtils.findDeclaredMethod(class0, "Ns(ux(MpH", (Class[]) null);
        fail("Expecting exception: NoSuchMethodException");
      
      } catch(NoSuchMethodException e) {
         //
         // Ns(ux(MpH
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<String> class0 = String.class;
      PropertyDescriptor[] propertyDescriptorArray0 = ReflectUtils.getBeanGetters(class0);
      Method[] methodArray0 = ReflectUtils.getPropertyMethods(propertyDescriptorArray0, true, true);
      assertEquals(2, methodArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        ReflectUtils.getClasses(objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class[] classArray0 = ReflectUtils.getClasses(objectArray0);
      assertEquals(0, classArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 0);
      String[] stringArray0 = ReflectUtils.getNames(classArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = ReflectUtils.getNames((Class[]) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 2);
      // Undeclared exception!
      try { 
        ReflectUtils.getNames(classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        ReflectUtils.getSignature((Member) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot get signature of a field
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
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
      Class<Object> class0 = Object.class;
      Constructor constructor0 = ReflectUtils.getConstructor(class0, (Class[]) null);
      ReflectUtils.getExceptionTypes(constructor0);
      assertTrue(constructor0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Object> class0 = Object.class;
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
      Class<String> class0 = String.class;
      Constructor constructor0 = ReflectUtils.getConstructor(class0, (Class[]) null);
      ReflectUtils.getMethodInfo((Member) constructor0, (-310));
      assertTrue(constructor0.isAccessible());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ReflectUtils.defineClass(",lww+5", byteArray0, classLoader0);
        fail("Expecting exception: InvocationTargetException");
      
      } catch(InvocationTargetException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<String> class0 = String.class;
      PropertyDescriptor[] propertyDescriptorArray0 = ReflectUtils.getBeanGetters(class0);
      Method[] methodArray0 = ReflectUtils.getPropertyMethods(propertyDescriptorArray0, false, false);
      assertEquals(2, propertyDescriptorArray0.length);
      assertEquals(0, methodArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        ReflectUtils.findMethod("B");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<ProtectionDomain> class0 = ProtectionDomain.class;
      PropertyDescriptor[] propertyDescriptorArray0 = ReflectUtils.getBeanProperties(class0);
      assertEquals(4, propertyDescriptorArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Method> class0 = Method.class;
      PropertyDescriptor[] propertyDescriptorArray0 = ReflectUtils.getBeanSetters(class0);
      assertEquals(1, propertyDescriptorArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        ReflectUtils.findConstructor("r!(y@m*");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException-->r!
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<ReflectUtils> class0 = ReflectUtils.class;
      Object object0 = ReflectUtils.newInstance(class0);
      assertNotNull(object0);
  }
}
