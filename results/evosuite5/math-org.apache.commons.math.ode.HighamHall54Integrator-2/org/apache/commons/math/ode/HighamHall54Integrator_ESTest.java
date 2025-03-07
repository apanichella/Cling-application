/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:41:23 GMT 2019
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
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1190.5001173665), (-1190.5001173665), (-1190.5001173665), (-1190.5001173665));
      double[][] doubleArray0 = new double[7][0];
      double[] doubleArray1 = new double[5];
      doubleArray0[0] = doubleArray1;
      doubleArray0[1] = doubleArray0[0];
      doubleArray0[2] = doubleArray0[1];
      doubleArray0[3] = doubleArray0[1];
      doubleArray0[4] = doubleArray0[0];
      doubleArray0[5] = doubleArray0[1];
      doubleArray0[6] = doubleArray1;
      double double0 = highamHall54Integrator0.estimateError(doubleArray0, doubleArray0[0], doubleArray0[0], (-1190.5001173665));
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-22.113666853125302), 983.40071032151, doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[8][2];
      // Undeclared exception!
      try { 
        highamHall54Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray0, (-22.113666853125302));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.math.ode.HighamHall54Integrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-5.801203960010585), 0.0, doubleArray0, doubleArray0);
      String string0 = highamHall54Integrator0.getName();
      assertEquals("Higham-Hall 5(4)", string0);
      assertEquals(5, highamHall54Integrator0.getOrder());
  }
}
