/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 15:37:22 GMT 2019
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.cglib.proxy.Mixin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Mixin$Generator_ESTest extends Mixin$Generator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(1);
      ClassWriter classWriter0 = new ClassWriter(1);
      // Undeclared exception!
      try { 
        mixin_Generator0.generateClass(classWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(2);
      // Undeclared exception!
      try { 
        mixin_Generator0.generateClass((ClassVisitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      // Undeclared exception!
      try { 
        mixin_Generator0.generateClass((ClassVisitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 6);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = classArray0[1];
      classArray0[3] = class0;
      mixin_Generator0.setDelegates(classArray0);
      classArray0[4] = classArray0[1];
      classArray0[5] = class0;
      Class<Integer>[] classArray1 = (Class<Integer>[]) Array.newInstance(Class.class, 6);
      Class<Integer> class1 = Integer.class;
      classArray1[0] = class1;
      mixin_Generator0.setClasses(classArray1);
      mixin_Generator0.setStyle((byte)2);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified class class java.lang.Integer is incompatible with delegate class class java.lang.Class (index 0)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 6);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = class0;
      classArray0[3] = class0;
      mixin_Generator0.setDelegates(classArray0);
      classArray0[4] = class0;
      classArray0[5] = class0;
      Class<InputStream>[] classArray1 = (Class<InputStream>[]) Array.newInstance(Class.class, 0);
      mixin_Generator0.setStyle((byte)2);
      mixin_Generator0.setClasses(classArray1);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified classes are incompatible with delegates
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 6);
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.setStyle((byte)2);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.Reflection", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 6);
      mixin_Generator0.setDelegates(classArray0);
      mixin_Generator0.setStyle((byte)2);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Either classes or delegates must be set
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle((-1165));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: -1165
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      // Undeclared exception!
      try { 
        Mixin.createBean(objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ReflectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(0);
      assertFalse(mixin_Generator0.getAttemptLoad());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      // Undeclared exception!
      try { 
        mixin_Generator0.nextInstance("=|.U ;\"FG\"3Mig");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.mockito.cglib.proxy.Mixin
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 6);
      mixin_Generator0.setClasses(classArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.Reflection", e);
      }
  }
}
