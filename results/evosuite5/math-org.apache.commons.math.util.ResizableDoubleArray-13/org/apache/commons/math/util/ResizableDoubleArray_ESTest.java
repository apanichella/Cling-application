/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:37:33 GMT 2019
 */

package org.apache.commons.math.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.util.ResizableDoubleArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ResizableDoubleArray_ESTest extends ResizableDoubleArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(3052, 3052, 3052);
      resizableDoubleArray0.contractionCriteria = (float) 0;
      resizableDoubleArray0.expansionMode = 1529;
      double double0 = resizableDoubleArray0.addElementRolling((-7.15827904E8));
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(0, resizableDoubleArray0.start());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-1735));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = null;
      try {
        resizableDoubleArray0 = new ResizableDoubleArray((-1566));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The initial capacity supplied: -1566must be a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = null;
      try {
        resizableDoubleArray0 = new ResizableDoubleArray(3053, 5.0F, 3053, 696);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal expansionMode setting.
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(3053, 3053, 3053);
      resizableDoubleArray0.addElementRolling(738.4063F);
      resizableDoubleArray0.setElement(5, 5);
      assertEquals(6, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1);
      resizableDoubleArray0.addElement(4003.9844611424023);
      resizableDoubleArray0.setElement(0, 4003.9844611424023);
      assertEquals(1, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.getElement((-33));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Elements cannot be retrieved from a negative array index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(3053, 3053, 3053);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.getElement(1529);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 1529 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(3053, 3053, 3053);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      
      resizableDoubleArray0.expansionMode = 1529;
      resizableDoubleArray0.expand();
      assertEquals(3053.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.discardFrontElements(0);
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(3053, 3053, 3053);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.discardFrontElements((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot discard a negative number of elements.
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 2.5F, 2.5F, 1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.discardFrontElements(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot discard more elements than arecontained in this array.
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = null;
      try {
        resizableDoubleArray0 = new ResizableDoubleArray(2, 0.5F, 0.5F, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The expansion factor must be a number greater than 1.0
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(3052, 3052, 3052);
      resizableDoubleArray0.contractionCriteria = (float) 0;
      // Undeclared exception!
      try { 
        resizableDoubleArray0.checkContractExpand(2125.4497F, 421.6026F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The contraction criteria must be a number larger than one.  If the contractionCriteria is less than or equal to one an endless loop of contraction and expansion would ensue as an internalArray.length == numElements would satisfy the contraction criteria
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1698, 1698, 1698);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.checkContractExpand((-5550.701F), 1.5F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(570, 570);
      resizableDoubleArray0.setNumElements(570);
      resizableDoubleArray0.addElementRolling(0);
      assertEquals(570, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.addElement(1);
      assertEquals(1, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1);
      resizableDoubleArray0.addElement(4003.9844611424023);
      resizableDoubleArray0.addElement(1);
      assertEquals(2, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 2.5F, 2.5F, 1);
      resizableDoubleArray0.addElement(2.5F);
      resizableDoubleArray0.discardFrontElements(1);
      assertEquals(1, resizableDoubleArray0.start());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      int int0 = resizableDoubleArray0.getNumElements();
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, int0);
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(3053, 3053, 3053);
      int int0 = resizableDoubleArray0.start();
      assertEquals(0, int0);
      assertEquals(3053.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(0, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(3053, 3053, 3053);
      resizableDoubleArray0.clear();
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(3053.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      double[] doubleArray0 = resizableDoubleArray0.getElements();
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, doubleArray0.length);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(3053, 3053, 3053);
      int int0 = resizableDoubleArray0.getInternalLength();
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(3053.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(3053, int0);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1);
      double[] doubleArray0 = resizableDoubleArray0.getValues();
      assertEquals(2.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(1, doubleArray0.length);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(2.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1, 5.0F, 5.0F, 0);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(5.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(570, 570);
      resizableDoubleArray0.setExpansionFactor(570);
      assertEquals(570.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getExpansionMode());
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(570.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(242);
      assertEquals(0, resizableDoubleArray0.getNumElements());
      
      resizableDoubleArray0.numElements = 242;
      resizableDoubleArray0.getElement(0);
      assertEquals(0, resizableDoubleArray0.start());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(570, 570);
      int int0 = resizableDoubleArray0.getExpansionMode();
      assertEquals(570.0F, resizableDoubleArray0.getExpansionFactor(), 0.01F);
      assertEquals(0, resizableDoubleArray0.getNumElements());
      assertEquals(570.5F, resizableDoubleArray0.getContractionCriteria(), 0.01F);
      assertEquals(0, resizableDoubleArray0.start());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(3053, 3053, 3053);
      resizableDoubleArray0.contract();
      resizableDoubleArray0.setNumElements(1467);
      assertEquals(1467, resizableDoubleArray0.getNumElements());
  }
}
