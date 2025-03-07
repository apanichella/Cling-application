/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 14:21:24 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.ode.DormandPrince853Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DormandPrince853Integrator_ESTest extends DormandPrince853Integrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-4.436036387594894), (-4.436036387594894), (-4.436036387594894), (-4.436036387594894));
      double[][] doubleArray1 = new double[25][8];
      double double0 = dormandPrince853Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray0, 0.0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-4.436036387594894), (-4.436036387594894), doubleArray0, doubleArray0);
      double[][] doubleArray1 = new double[25][8];
      dormandPrince853Integrator0.estimateError(doubleArray1, doubleArray0, doubleArray0, 0.0);
      assertEquals(8, dormandPrince853Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-4.436036387594894), (-4.436036387594894), (-4.436036387594894), (-4.436036387594894));
      String string0 = dormandPrince853Integrator0.getName();
      assertEquals(8, dormandPrince853Integrator0.getOrder());
      assertEquals("Dormand-Prince 8 (5, 3)", string0);
  }
}
