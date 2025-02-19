/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 13:11:18 GMT 2019
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FilterInputStream;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.cglib.core.CodeGenerationException;
import org.mockito.cglib.proxy.Mixin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Mixin$Generator_ESTest extends Mixin$Generator_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setStyle(1);
      mixin_Generator0.create();
      mixin_Generator0.setStyle(2);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: CodeGenerationException");
      
      } catch(CodeGenerationException e) {
         //
         // java.lang.reflect.InvocationTargetException-->null
         //
         verifyException("org.mockito.cglib.core.AbstractClassGenerator", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Class<FilterInputStream>[] classArray0 = (Class<FilterInputStream>[]) Array.newInstance(Class.class, 1);
      Class<FilterInputStream> class0 = FilterInputStream.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      mixin_Generator0.create();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Mixin.Generator mixin_Generator0 = new Mixin.Generator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mixin_Generator0;
      mixin_Generator0.setUseCache(false);
      mixin_Generator0.setDelegates(objectArray0);
      mixin_Generator0.setStyle(1);
      mixin_Generator0.create();
      Class<FilterInputStream>[] classArray0 = (Class<FilterInputStream>[]) Array.newInstance(Class.class, 1);
      Class<FilterInputStream> class0 = FilterInputStream.class;
      classArray0[0] = class0;
      mixin_Generator0.setClasses(classArray0);
      // Undeclared exception!
      try { 
        mixin_Generator0.create();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Specified class class java.io.FilterInputStream is incompatible with delegate class class org.mockito.cglib.proxy.Mixin$Generator (index 0)
         //
         verifyException("org.mockito.cglib.proxy.Mixin$Generator", e);
      }
  }
}
