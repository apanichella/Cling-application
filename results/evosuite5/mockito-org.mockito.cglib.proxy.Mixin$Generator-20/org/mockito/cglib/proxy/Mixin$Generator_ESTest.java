/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 15:37:30 GMT 2019
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassVisitor;
import org.mockito.cglib.proxy.Mixin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Mixin$Generator_ESTest extends Mixin$Generator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      Class<String> class0 = String.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.setStyle(1);
      mixin_Generator0.setDelegates(objectArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified class class java.lang.String is incompatible with delegate class class org.mockito.cglib.proxy.Mixin$Generator (index 0)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setStyle(1);
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 4);
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.setDelegates(objectArray0);
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
  public void test03()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.setStyle(1);
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
  public void test04()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setStyle(2);
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
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      // Undeclared exception!
      try { 
        mixin_Generator0.setStyle((-660));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown mixin style: -660
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      mixin_Generator0.setStyle(0);
      assertTrue(mixin_Generator0.getUseCache());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      // Undeclared exception!
      try { 
        mixin_Generator0.nextInstance(mixin_Generator0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mockito.cglib.proxy.Mixin$Generator cannot be cast to org.mockito.cglib.proxy.Mixin
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 1);
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
