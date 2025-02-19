/*

 * Tue Mar 03 14:08:16 GMT 2020
 */

package org.mockito.cglib.transform.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassAdapter;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AddDelegateTransformer_ESTest extends AddDelegateTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1153));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[6];
      classEmitter0.visit((-1153), (-1153), "", "", (String) null, stringArray0);
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
  public void test1()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1680);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      String[] stringArray0 = new String[6];
      classEmitter0.visit(2, 1, "", "6uur&1WD/_A", "ic0lm:/fR]RRSQGQG'", stringArray0);
      classEmitter0.begin_static();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn("mwxTml~@k*M0").when(type0).getInternalName();
      ClassWriter classWriter0 = new ClassWriter((-648));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.begin_class(5, (-1299), "mwxTml~@k*M0", type0, (Type[]) null, "mwxTml~@k*M0");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1663);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      classEmitter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1663);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      String[] stringArray0 = new String[6];
      classEmitter0.visit(2, 1, ":6@F~&{`P(m", "6uur&1WD/_A", "ic0lm:/fR]RRSQGQG'", stringArray0);
      classEmitter0.getStaticHook();
      classEmitter0.visitEnd();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1680);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      String[] stringArray0 = new String[6];
      classEmitter0.visit(2, 1, "", "6uur&1WD/_A", "ic0lm:/fR]RRSQGQG'", stringArray0);
      classEmitter0.begin_static();
      classEmitter0.visitEnd();
  }
}
