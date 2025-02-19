/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:20:21 GMT 2019
 */

package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl;
import org.apache.commons.math.util.ResizableDoubleArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DescriptiveStatistics_ESTest extends DescriptiveStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(1863, (-2091.31312));
      double double0 = resizableDoubleArray0.addElementRolling(3010.5);
      assertEquals(1, resizableDoubleArray0.start());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      resizableDoubleArray0.setExpansionMode(1);
      descriptiveStatisticsImpl0.addValue(1);
      descriptiveStatisticsImpl0.addValue(1376);
      assertEquals(2L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1376);
      resizableDoubleArray0.setNumElements(1376);
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
  public void test03()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl((-1));
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1377);
      resizableDoubleArray0.setNumElements(1377);
      assertEquals(1377, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1376);
      resizableDoubleArray0.setNumElements(1376);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 0 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1376);
      resizableDoubleArray0.setNumElements(1376);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement((-3049));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Elements cannot be retrieved from a negative array index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1376);
      resizableDoubleArray0.setNumElements(1376);
      assertEquals(1376, resizableDoubleArray0.getNumElements());
      
      double double0 = descriptiveStatisticsImpl0.getPercentile(1);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.addElementRolling(3010.5);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-1), 1863);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl((-1));
      descriptiveStatisticsImpl0.addValue(1);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.addValue(16);
      // Undeclared exception!
      try { 
        descriptiveStatistics0.getElement(16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 16 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue((-1));
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Elements cannot be retrieved from a negative array index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1863);
      resizableDoubleArray0.setElement(398, 50.0);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-1287));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl((-1));
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1376);
      resizableDoubleArray0.setNumElements(1376);
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      descriptiveStatisticsImpl0.eDA.getElement(0);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.eDA.setNumElements((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1);
      descriptiveStatisticsImpl0.getPercentile(1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1376);
      resizableDoubleArray0.setNumElements(1376);
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      descriptiveStatisticsImpl0.setWindowSize(1);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.eDA.setNumElements((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.setWindowSize(1);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setNumElements((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of elements must be zero or a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2997);
      resizableDoubleArray0.setElement(3223, (-447.34906247918457));
      resizableDoubleArray0.addElement((-447.34906247918457));
      assertEquals(3225, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue(1);
      descriptiveStatisticsImpl0.setWindowSize(1);
      descriptiveStatisticsImpl0.addValue(1376);
      descriptiveStatisticsImpl0.eDA.setElement(1, 770);
      descriptiveStatisticsImpl0.addValue(1376);
      assertEquals(2L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(1376, 1);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Elements cannot be retrieved from a negative array index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(2997);
      resizableDoubleArray0.setElement(3223, (-447.34906247918457));
      assertEquals(3224, resizableDoubleArray0.getNumElements());
      
      descriptiveStatisticsImpl0.addValue(3223);
      String string0 = descriptiveStatisticsImpl0.toString();
      assertEquals("DescriptiveStatistics:\nn: 1\nmin: 3223.0\nmax: 3223.0\nmean: 3223.0\nstd dev: 0.0\nmedian: 3223.0\nskewness: NaN\nkurtosis: NaN\n", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(898, 1.2944496870040894);
      assertEquals(899, resizableDoubleArray0.getNumElements());
      
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(898);
      descriptiveStatisticsImpl0.addValue((-2878));
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(1, (-1));
      descriptiveStatisticsImpl0.addValue(1);
      descriptiveStatisticsImpl0.toString();
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(1863, (-2091.31312));
      assertEquals(1864, resizableDoubleArray0.getNumElements());
      
      double double0 = descriptiveStatisticsImpl0.getStandardDeviation();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1387);
      resizableDoubleArray0.setNumElements(1387);
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      descriptiveStatisticsImpl0.addValue(1);
      descriptiveStatisticsImpl0.setWindowSize(1);
      assertEquals(1, descriptiveStatisticsImpl0.getWindowSize());
      
      resizableDoubleArray0.setElement(1, 0);
      assertEquals(2, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1387);
      resizableDoubleArray0.setNumElements(1387);
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      descriptiveStatisticsImpl0.setWindowSize(1);
      ResizableDoubleArray resizableDoubleArray1 = new ResizableDoubleArray();
      resizableDoubleArray1.setElement(1, 0);
      descriptiveStatisticsImpl0.addValue(0);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.setWindowSize(1);
      descriptiveStatisticsImpl0.eDA.setElement(1, 770);
      descriptiveStatisticsImpl0.addValue(1376);
      assertEquals(2L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      descriptiveStatisticsImpl0.addValue(1);
      descriptiveStatisticsImpl0.getElement(0);
      resizableDoubleArray0.setElement(1376, 1);
      assertEquals(1377, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-1), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1376);
      resizableDoubleArray0.setNumElements(1376);
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      descriptiveStatisticsImpl0.addValue(1);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setExpansionMode((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal expansionMode setting.
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1376);
      resizableDoubleArray0.setExpansionMode(1);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 0 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1376);
      resizableDoubleArray0.setNumElements(1376);
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      descriptiveStatisticsImpl0.setWindowSize(1);
      descriptiveStatisticsImpl0.addValue(1376);
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setExpansionMode((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal expansionMode setting.
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      descriptiveStatisticsImpl0.addValue(1);
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setExpansionMode((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal expansionMode setting.
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      descriptiveStatisticsImpl0.addValue(1);
      double double0 = descriptiveStatisticsImpl0.getElement(0);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Elements cannot be retrieved from a negative array index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1376);
      resizableDoubleArray0.setNumElements(1376);
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      descriptiveStatisticsImpl0.addValue(1);
      assertEquals(1377L, descriptiveStatisticsImpl0.getN());
      
      resizableDoubleArray0.setElement(0, 1);
      assertEquals(1377, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1376);
      resizableDoubleArray0.setNumElements(1376);
      descriptiveStatisticsImpl0.addValue(1);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
      
      resizableDoubleArray0.setElement(0, 1);
      assertEquals(1376, resizableDoubleArray0.getNumElements());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(767, (-223.0));
      resizableDoubleArray0.setElement(16, (-0.13311662546853498));
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      // Undeclared exception!
      try { 
        descriptiveStatistics0.getElement(3999);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // The index specified: 3999 is larger than the current number of elements
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1376);
      resizableDoubleArray0.setNumElements(1376);
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      descriptiveStatisticsImpl0.setWindowSize(1);
      resizableDoubleArray0.setElement(0, 1);
      descriptiveStatisticsImpl0.addValue(12.583309102557587);
      assertEquals(1L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1366);
      resizableDoubleArray0.setNumElements(1366);
      resizableDoubleArray0.setElement(1, 1053.386826785061);
      assertEquals(1366, resizableDoubleArray0.getNumElements());
      
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics(770);
      descriptiveStatistics0.addValue(0.0);
      assertEquals(1L, descriptiveStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray(1376);
      resizableDoubleArray0.setNumElements(1376);
      descriptiveStatisticsImpl0.eDA = resizableDoubleArray0;
      resizableDoubleArray0.setElement(0, 1.0);
      double double0 = descriptiveStatisticsImpl0.getElement(0);
      assertEquals(1376L, descriptiveStatisticsImpl0.getN());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(1, (-2388.9730484));
      resizableDoubleArray0.setElement(1, 389.82205182119);
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl(1);
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement((-2239));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Elements cannot be retrieved from a negative array index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.eDA.setExpansionMode(0);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
      assertEquals(0L, descriptiveStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setElement(1863, (-2091.31312));
      resizableDoubleArray0.setElement(594, (-478.74));
      // Undeclared exception!
      try { 
        resizableDoubleArray0.setElement((-1), 1863);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Cannot set an element at a negative index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = null;
      try {
        resizableDoubleArray0 = new ResizableDoubleArray((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The initial capacity supplied: -1must be a positive integer
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ResizableDoubleArray resizableDoubleArray0 = new ResizableDoubleArray();
      resizableDoubleArray0.setExpansionMode(1);
      resizableDoubleArray0.setElement(1376, 1);
      assertEquals(1377, resizableDoubleArray0.getNumElements());
  }
}
