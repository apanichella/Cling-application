/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 14:30:17 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.HighamHall54Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HighamHall54Integrator_ESTest extends HighamHall54Integrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-499.657157342), (-499.657157342), (-499.657157342), (-499.657157342));
      double[] doubleArray0 = new double[5];
      double[][] doubleArray1 = new double[7][9];
      // Undeclared exception!
      try { 
        highamHall54Integrator0.estimateError(doubleArray1, doubleArray1[2], doubleArray0, 1835.2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.math.ode.HighamHall54Integrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1210.03, 1210.03, doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[9][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      doubleArray1[6] = doubleArray0;
      double double0 = highamHall54Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray0, 1210.03);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(4278.032279205368, 0.0, 0.0, 4278.032279205368);
      String string0 = highamHall54Integrator0.getName();
      assertEquals("Higham-Hall 5(4)", string0);
      assertEquals(5, highamHall54Integrator0.getOrder());
  }
}
