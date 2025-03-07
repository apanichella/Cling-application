/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:41:40 GMT 2019
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
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, (-490.61145118171), 846.9758152806829, (-1613.74));
      double[][] doubleArray0 = new double[9][6];
      double double0 = highamHall54Integrator0.estimateError(doubleArray0, doubleArray0[0], doubleArray0[1], 0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 0.0, doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[8][0];
      doubleArray1[0] = highamHall54Integrator0.vecAbsoluteTolerance;
      doubleArray1[1] = highamHall54Integrator0.vecAbsoluteTolerance;
      doubleArray1[2] = highamHall54Integrator0.vecAbsoluteTolerance;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = highamHall54Integrator0.vecAbsoluteTolerance;
      doubleArray1[5] = doubleArray0;
      doubleArray1[6] = doubleArray0;
      double double0 = highamHall54Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray0, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1522.0, (-1626.19635245), doubleArray0, doubleArray0);
      String string0 = highamHall54Integrator0.getName();
      assertEquals("Higham-Hall 5(4)", string0);
      assertEquals(5, highamHall54Integrator0.getOrder());
  }
}
