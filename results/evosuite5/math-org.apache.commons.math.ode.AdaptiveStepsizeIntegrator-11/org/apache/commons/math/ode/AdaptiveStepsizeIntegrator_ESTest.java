/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 14:36:21 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.DormandPrince54Integrator;
import org.apache.commons.math.ode.DormandPrince853Integrator;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.HighamHall54Integrator;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.StepHandler;
import org.apache.commons.math.ode.SwitchingFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AdaptiveStepsizeIntegrator_ESTest extends AdaptiveStepsizeIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 0.0, (-3400.6377091335353), 100.0);
      double double0 = dormandPrince54Integrator0.filterStep(0.0, true);
      assertEquals(0.0, double0, 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1000.913, 0.8073151063905684, 0.8073151063905684, 2993.0);
      double double0 = dormandPrince54Integrator0.filterStep(0.8073151063905684, true);
      assertEquals(0.8073151063905684, double0, 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(28.426258724684523, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(3.0281880441426567, 2120.859202, (-1226.205884697839), (-1226.205884697839));
      try { 
        dormandPrince54Integrator0.filterStep((-0.19316434850839564), false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // minimal step size (3.028) reached, integration needs 0.193
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(1000.913, (-1226.205884697839), 3.0281880441426567, (-1160.5291753017991));
      double double0 = dormandPrince54Integrator0.filterStep((-555.811732), true);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals((-1226.205884697839), double0, 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-5.0), 100.0, (-2677.21582380091), (-4989.84912461163));
      double double0 = dormandPrince54Integrator0.filterStep((-2677.21582380091), false);
      assertEquals((-100.0), double0, 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.0E-15, 4373.7, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      dormandPrince853Integrator0.initializeStep(firstOrderConverter0, false, (-395), doubleArray0, (-555.811732), doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
      assertEquals(2.091339283808345E-6, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) (-395);
      doubleArray0[1] = 2632.77095353457;
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-395), (-395), (-395.0), 2632.77095353457);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double double0 = dormandPrince853Integrator0.initializeStep(firstOrderConverter0, true, (-395), doubleArray0, 2659.0986630699153, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals((-395.0), dormandPrince853Integrator0.getMinStep(), 0.01);
      assertEquals((-395.0), double0, 0.01);
      assertEquals(395.0, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
      assertArrayEquals(new double[] {(-398.95), 2659.0986630699153}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = 4970.8208716357;
      doubleArray0[1] = 4970.8208716357;
      doubleArray0[2] = 4970.8208716357;
      doubleArray0[3] = 4970.8208716357;
      doubleArray0[4] = 4970.8208716357;
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(4970.8208716357, 4970.8208716357, 4608.092355151, 0);
      double double0 = dormandPrince54Integrator0.initializeStep(firstOrderConverter0, true, 0, doubleArray0, 1.0, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
      assertEquals(4970.8208716357, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertArrayEquals(new double[] {5020.5290803520575, 5020.5290803520575, 5020.5290803520575, 5020.5290803520575, 5020.5290803520575}, doubleArray0, 0.01);
      assertEquals(4970.8208716357, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 2120.859202, (-1227.009), (-1227.009));
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.initializeStep((FirstOrderDifferentialEquations) null, false, 0, doubleArray0, 2120.859202, doubleArray0, doubleArray0, doubleArray0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.0E-15, 1.0E-15, doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      try { 
        dormandPrince853Integrator0.sanityChecks(firstOrderConverter0, 1.0E-15, doubleArray0, (-488.4867878), doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 0, initial state vector has dimension 3
         //
         verifyException("org.apache.commons.math.ode.AdaptiveStepsizeIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-488.4867878), 620.144836760787, (-1.324889724104E12), 3.0281880441426567);
      double[] doubleArray0 = new double[0];
      dormandPrince853Integrator0.sanityChecks(firstOrderConverter0, 0.78125, doubleArray0, 2120.859202, doubleArray0);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 735.6844, 1.0E-12, 0.0);
      dormandPrince54Integrator0.setInitialStepSize(0.0);
      assertEquals(735.6844, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-885.7936976343), (-885.7936976343), 267.0, 267.0);
      dormandPrince54Integrator0.setInitialStepSize(267.0);
      assertEquals(885.7936976343, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1.0E-15, 4373.7, doubleArray0, doubleArray0);
      dormandPrince853Integrator0.setInitialStepSize((-1.324889724104E12));
      assertEquals(Double.NaN, dormandPrince853Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(2.091339283808345E-6, dormandPrince853Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1352.71, 1352.71, doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getCurrentSignedStepsize();
      assertEquals(1352.71, double0, 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(1741.283928559, 1741.283928559, 1741.283928559, 0.0);
      double double0 = graggBulirschStoerIntegrator0.getCurrentStepStart();
      assertEquals(1741.283928559, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(2120.859202, 1, 620.144836760787, 0.001);
      graggBulirschStoerIntegrator0.getStepHandler();
      assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentStepStart(), 0.01);
      assertEquals(46.052787125211, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.8073151063905684, 0.8073151063905684, 0.8073151063905684, 0.8073151063905684);
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      highamHall54Integrator0.addSwitchingFunction(switchingFunction0, 1968.683484, 0.8073151063905684, 2243);
      assertEquals(0.8073151063905684, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(0.0, 2120.859202, (-1227.009), (-1227.009));
      dormandPrince54Integrator0.setStepHandler((StepHandler) null);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(2120.859202, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }
}
