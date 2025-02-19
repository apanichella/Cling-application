/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:35:45 GMT 2019
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.BisectionSolver;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.LaguerreSolver;
import org.apache.commons.math.analysis.MullerSolver;
import org.apache.commons.math.analysis.NewtonSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.RiddersSolver;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.complex.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class UnivariateRealSolverImpl_ESTest extends UnivariateRealSolverImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-985.0);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        riddersSolver0.solve((-985.0), 0.95);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function values at endpoints do not have different signs.  Endpoints: [-985.0,0.95]  Values: [-985.0,-985.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1569.43394144);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        riddersSolver0.solve((-1569.43394144), (-1569.43394144), (-31.5074719));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-1569.43394144,-1569.43394144]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunction0);
      riddersSolver0.verifySequence(0.0, 1.0E-15, 1563.97);
      assertEquals(1.0E-14, riddersSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, riddersSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, riddersSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      boolean boolean0 = laguerreSolver0.isRootOK(0.0, (-4015.752794275), complex0);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
      assertFalse(boolean0);
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = Double.POSITIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunction0);
      try { 
        riddersSolver0.solve((-985.0), 0.95);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.RiddersSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = Double.NEGATIVE_INFINITY;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      try { 
        mullerSolver0.solve(Double.NEGATIVE_INFINITY, 311.9441773);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.MullerSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1569.43394144);
      doubleArray0[1] = 999.357;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunctionLagrangeForm0);
      boolean boolean0 = brentSolver0.isBracketing(5918.96, 1.0E-15, polynomialFunctionLagrangeForm0);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01);
      assertFalse(boolean0);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      Complex[] complexArray0 = new Complex[4];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      laguerreSolver0.solve(complexArray0, complex0);
      int int0 = laguerreSolver0.getIterationCount();
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, laguerreSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.getIterationCount();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No result available
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunction0);
      riddersSolver0.resultComputed = true;
      double double0 = riddersSolver0.getResult();
      assertEquals(1.0E-14, riddersSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, riddersSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, riddersSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        riddersSolver0.getResult();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No result available
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = null;
      try {
        laguerreSolver0 = new LaguerreSolver((UnivariateRealFunction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // function can not be null.
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunctionLagrangeForm0);
      double double0 = mullerSolver0.getFunctionValueAccuracy();
      assertEquals(1.0E-15, double0, 0.01);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunction0);
      double double0 = riddersSolver0.getRelativeAccuracy();
      assertEquals(100, riddersSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, double0, 0.01);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, riddersSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunction0);
      riddersSolver0.resetFunctionValueAccuracy();
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(100, riddersSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, riddersSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-6, riddersSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (-1569.43394144);
      doubleArray0[1] = 999.357;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      BisectionSolver bisectionSolver0 = new BisectionSolver(polynomialFunctionLagrangeForm0);
      double double0 = bisectionSolver0.solve((-1569.43394144), 0.95, (-2.0));
      assertEquals(1.0E-15, bisectionSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, bisectionSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, bisectionSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, bisectionSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals((-3.0439151273872874E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      MullerSolver mullerSolver0 = new MullerSolver(polynomialFunction0);
      mullerSolver0.resetAbsoluteAccuracy();
      assertEquals(1.0E-6, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, mullerSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunction0);
      riddersSolver0.setFunctionValueAccuracy(396.0);
      assertEquals(396.0, riddersSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunction0);
      riddersSolver0.setMaximalIterationCount(1242);
      assertEquals(1242, riddersSolver0.getMaximalIterationCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      int int0 = laguerreSolver0.getMaximalIterationCount();
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(100, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunction0);
      double double0 = riddersSolver0.getAbsoluteAccuracy();
      assertEquals(1.0E-14, riddersSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, riddersSolver0.getMaximalIterationCount());
      assertEquals(1.0E-6, double0, 0.01);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      NewtonSolver newtonSolver0 = new NewtonSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        newtonSolver0.solve(396.0, (-1117.9096541));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid interval, initial value parameters:  lower=396.0 initial=-360.95482704999995 upper=-1117.9096541
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunctionLagrangeForm0);
      riddersSolver0.setRelativeAccuracy((-185.0321690049));
      assertEquals((-185.0321690049), riddersSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01);
      
      brentSolver0.setAbsoluteAccuracy(0.0);
      assertEquals(0.0, brentSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      RiddersSolver riddersSolver0 = new RiddersSolver(polynomialFunction0);
      riddersSolver0.resetRelativeAccuracy();
      assertEquals(100, riddersSolver0.getMaximalIterationCount());
      assertEquals(1.0E-14, riddersSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, riddersSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-6, riddersSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      BrentSolver brentSolver0 = new BrentSolver(polynomialFunction0);
      brentSolver0.resetMaximalIterationCount();
      assertEquals(1.0E-6, brentSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, brentSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(100, brentSolver0.getMaximalIterationCount());
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
  }
}
