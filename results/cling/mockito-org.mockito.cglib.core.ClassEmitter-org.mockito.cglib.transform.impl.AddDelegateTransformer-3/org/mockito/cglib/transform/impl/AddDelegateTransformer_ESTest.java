/*

 * Tue Mar 03 14:05:15 GMT 2020
 */

package org.mockito.cglib.transform.impl;

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
public class AddDelegateTransformer_ESTest extends AddDelegateTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1876);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(1, 2, "StackMap", "StackMap", "o@y-Zbw4/vJ:r-St", (String[]) null);
      classEmitter0.begin_static();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1876);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[0];
      classEmitter0.begin_class(177, 1876, "o@y-Zbw4/vJ:r-St", (Type) null, typeArray0, "");
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
  public void test2()  throws Throwable  {
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
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1876);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(1, 2, "StackMap", "StackMap", "o9y-Z(bw4/vJ:r-St", (String[]) null);
      classEmitter0.getStaticHook();
      classEmitter0.end_class();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1876);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(1, 2, "StackMap", "StackMap", "o@y-Zbw4/vJ:r-St", (String[]) null);
      classEmitter0.begin_static();
      classEmitter0.end_class();
  }
}
