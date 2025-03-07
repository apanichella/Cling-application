/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:41:05 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.ode.HighamHall54Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HighamHall54Integrator_ESTest extends HighamHall54Integrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 3773.243415535, (-625.61571881783), (-965.1199));
      double[][] doubleArray0 = new double[7][4];
      double[] doubleArray1 = new double[3];
      double double0 = highamHall54Integrator0.estimateError(doubleArray0, doubleArray1, doubleArray1, 0.0625);
      assertEquals(0.0, double0, 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1855.44054, 1855.44054, doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[7][1];
      double double0 = highamHall54Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray0, 125.0);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.10416666666666667, 180.171349, doubleArray0, doubleArray0);
      String string0 = highamHall54Integrator0.getName();
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals("Higham-Hall 5(4)", string0);
  }
}
