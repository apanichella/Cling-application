/*

 * Tue Mar 03 14:19:11 GMT 2020
 */

package org.mockito.cglib.proxy;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassVisitor;
import org.mockito.cglib.proxy.Enhancer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Enhancer_ESTest extends Enhancer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<Method> class0 = Method.class;
      enhancer0.setSuperclass(class0);
      try { 
        enhancer0.generateClass((ClassVisitor) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot subclass final class class java.lang.reflect.Method
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      // Undeclared exception!
      try { 
        enhancer0.nextInstance("8t\"KxP6%HZ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // class java.lang.String is not an enhanced class
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test2()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      ClassVisitor classVisitor0 = mock(ClassVisitor.class, new ViolatedAssumptionAnswer());
      try { 
        enhancer0.generateClass(classVisitor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.AbstractClassGenerator", e);
      }
  }
}
