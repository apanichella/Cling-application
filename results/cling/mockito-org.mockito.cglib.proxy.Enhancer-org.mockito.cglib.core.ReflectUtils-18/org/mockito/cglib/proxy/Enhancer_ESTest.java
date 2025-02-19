/*

 * Tue Mar 03 14:22:55 GMT 2020
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
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.internal.creation.MethodInterceptorFilter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Enhancer_ESTest extends Enhancer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      Class<MethodInterceptorFilter>[] classArray0 = (Class<MethodInterceptorFilter>[]) Array.newInstance(Class.class, 6);
      Class<MethodInterceptorFilter> class0 = MethodInterceptorFilter.class;
      classArray0[0] = class0;
      classArray0[1] = classArray0[0];
      classArray0[2] = class0;
      classArray0[3] = class0;
      classArray0[4] = class0;
      classArray0[5] = class0;
      enhancer0.setCallbackTypes(classArray0);
      // Undeclared exception!
      try { 
        enhancer0.createClass();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Multiple callback types possible but no filter specified
         //
         verifyException("org.mockito.cglib.proxy.Enhancer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Enhancer enhancer0 = new Enhancer();
      try { 
        enhancer0.generateClass((ClassVisitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.AbstractClassGenerator", e);
      }
  }
}
