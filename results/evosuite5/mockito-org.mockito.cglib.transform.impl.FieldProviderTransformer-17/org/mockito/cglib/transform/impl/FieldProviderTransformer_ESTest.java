/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 15:42:47 GMT 2019
 */

package org.mockito.cglib.transform.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.cglib.transform.impl.FieldProviderTransformer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FieldProviderTransformer_ESTest extends FieldProviderTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FieldProviderTransformer fieldProviderTransformer0 = new FieldProviderTransformer();
      // Undeclared exception!
      try { 
        fieldProviderTransformer0.end_class();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.transform.impl.FieldProviderTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FieldProviderTransformer fieldProviderTransformer0 = new FieldProviderTransformer();
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        fieldProviderTransformer0.visit(0, 0, "/D&gcsC`^a]Y@K'*k", "/D&gcsC`^a]Y@K'*k", "/D&gcsC`^a]Y@K'*k", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FieldProviderTransformer fieldProviderTransformer0 = new FieldProviderTransformer();
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        fieldProviderTransformer0.visit((-12), (-12), "/D&gcsC`^a]Y@K'*k", "/D&gcsC`^a]Y@K'*k", "/D&gcsC`^a]Y@K'*k", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }
}
