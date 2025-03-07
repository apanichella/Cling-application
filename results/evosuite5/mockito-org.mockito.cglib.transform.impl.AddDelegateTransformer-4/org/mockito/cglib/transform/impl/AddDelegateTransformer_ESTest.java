/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 21:01:14 GMT 2019
 */

package org.mockito.cglib.transform.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.cglib.transform.impl.AddDelegateTransformer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AddDelegateTransformer_ESTest extends AddDelegateTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 3);
      Class<Object> class0 = Object.class;
      AddDelegateTransformer addDelegateTransformer0 = null;
      try {
        addDelegateTransformer0 = new AddDelegateTransformer(classArray0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NoSuchMethodException-->java.lang.Object.<init>(java.lang.Object)
         //
         verifyException("org.mockito.cglib.transform.impl.AddDelegateTransformer", e);
      }
  }
}
