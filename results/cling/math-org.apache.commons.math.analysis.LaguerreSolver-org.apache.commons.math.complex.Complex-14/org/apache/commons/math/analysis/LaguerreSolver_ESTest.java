/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:41:23 GMT 2019
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.LaguerreSolver;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.complex.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LaguerreSolver_ESTest extends LaguerreSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.ONE;
      complexArray0[0] = complex0;
      Complex complex1 = Complex.INF;
      complexArray0[1] = complex1;
      complex1.tanh();
      complexArray0[2] = complexArray0[0];
      complexArray0[3] = complexArray0[1];
      try { 
        laguerreSolver0.solve(complexArray0, complex0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-2092.58);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.ONE;
      complexArray0[0] = complex0;
      complexArray0[0].tanh();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(3084.9, 3084.9);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [3084.9,3084.9]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.ONE;
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      Complex complex1 = complex0.tanh();
      assertEquals(0.761594155955765, complex1.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      
      complexArray0[2] = complexArray0[1];
      complexArray0[3] = complex1;
      Complex complex2 = laguerreSolver0.solve(complexArray0, complex0);
      assertEquals((-0.07742241508636186), complex2.getReal(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1706.595);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      Complex complex0 = Complex.ONE;
      complex0.acos();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(4378891.0564, (-1706.595));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [4378891.0564,-1706.595]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-2092.58);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      complex0.pow(complex0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(3084.9, 3084.9);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [3084.9,3084.9]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-1706.595);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.ONE;
      complexArray0[0] = complex0;
      laguerreSolver0.solve((-1706.595), 4378891.0564);
      boolean boolean0 = laguerreSolver0.isRootOK((-1706.595), (-1706.595), complexArray0[0]);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-1706.595);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      double double0 = laguerreSolver0.solve((-1706.595), 4378891.0564);
      assertEquals(0.0, double0, 0.01);
      
      Complex[] complexArray0 = new Complex[3];
      complexArray0[0] = complex0;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      laguerreSolver0.solveAll(complexArray0, complex0);
      assertEquals(1.0, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 0.5;
      doubleArray0[5] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      PolynomialFunction polynomialFunction1 = polynomialFunction0.polynomialDerivative();
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction1);
      laguerreSolver0.solveAll(doubleArray0, 1.1348448115395189E14);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(4149310.985, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [4149310.985,0.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[5] = 1.0;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.I;
      boolean boolean0 = laguerreSolver0.isRootOK((-836.0), 1.0, complex0);
      assertFalse(boolean0);
      assertFalse(complex0.isNaN());
      
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 1.1348448115395189E14);
      assertEquals(5, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = new Complex(12.0, (-1521.780063));
      Complex complex1 = complex0.exp();
      assertEquals((-154411.64822714354), complex1.getImaginary(), 0.01);
      assertEquals(51440.888616161705, complex1.getReal(), 0.01);
      assertEquals(162754.79141900392, complex1.abs(), 0.01);
      
      boolean boolean0 = laguerreSolver0.isRootOK(4.703620423703454E10, 4717.0, complex0);
      assertEquals((-1521.780063), complex0.getImaginary(), 0.01);
      assertFalse(boolean0);
      assertEquals(1521.827375277592, complex0.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (-2092.58);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.ONE;
      complex0.pow(complex0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(3084.9, 3084.9);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [3084.9,3084.9]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = new Complex(12.0, (-1521.780063));
      Complex complex1 = complex0.exp();
      assertEquals(162754.79141900392, complex1.abs(), 0.01);
      assertEquals((-154411.64822714354), complex1.getImaginary(), 0.01);
      assertEquals(51440.888616161705, complex1.getReal(), 0.01);
      assertEquals((-1521.780063), complex0.getImaginary(), 0.01);
      
      double double0 = laguerreSolver0.solve(575.1340435003, (-3595.4648294084027), 656.6538850029392);
      assertEquals(575.1340435003, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-2092.58);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.ONE;
      complexArray0[0] = complex0;
      Complex complex1 = complexArray0[0].pow(complexArray0[0]);
      assertTrue(complex1.equals((Object)complex0));
      
      double double0 = laguerreSolver0.solve((-2092.58), (-2092.58), 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.pow(complex1);
      Complex complex3 = complex2.tanh();
      assertEquals(1.0, complex0.abs(), 0.01);
      assertTrue(complex3.isNaN());
      assertNotSame(complex3, complex2);
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sinh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      
      Complex complex2 = complex0.asin();
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1706.595);
      Complex complex0 = Complex.ONE;
      complex0.sinh();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, (-1706.595));
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.ONE;
      complex0.sinh();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, (-1706.595));
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1706.595);
      Complex complex0 = Complex.ONE;
      complex0.exp();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      try { 
        laguerreSolver0.solveAll(doubleArray0, 4.528448215408654E-43);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.conjugate();
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.abs(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.pow(complex0);
      assertEquals(1.0, complex0.abs(), 0.01);
      assertEquals(0.0, complex1.abs(), 0.01);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ZERO;
      Complex[] complexArray0 = new Complex[6];
      complex1.acos();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray0, complex0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.conjugate();
      assertEquals(1.0, complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.pow(complex0);
      assertFalse(complex0.equals((Object)complex1));
      assertTrue(complex2.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.exp();
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
      assertEquals(2.718281828459045, complex1.abs(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = laguerreSolver0.solveAll(doubleArray0, 4.528448215408654E-43);
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = new Complex(12.0, (-1521.780063));
      Complex complex1 = complex0.exp();
      assertFalse(complex1.equals((Object)complex0));
      
      Complex[] complexArray0 = new Complex[6];
      complexArray0[0] = complex1;
      complexArray0[1] = complex0;
      complexArray0[2] = complex0;
      complexArray0[3] = complex0;
      complexArray0[4] = complex0;
      complexArray0[5] = complex1;
      Complex complex2 = laguerreSolver0.solve(complexArray0, complex1);
      assertEquals(0.9995782342947149, complex2.abs(), 0.01);
      assertEquals(51440.888616161705, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.ONE;
      complexArray0[0] = complex0;
      Complex complex1 = Complex.INF;
      complexArray0[1] = complex1;
      complex1.conjugate();
      complexArray0[2] = complexArray0[1];
      complexArray0[3] = complexArray0[0];
      try { 
        laguerreSolver0.solve(complexArray0, complex0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Complex complex0 = Complex.ONE;
      complex0.asin();
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = (-3063.7);
      doubleArray1[2] = (-3063.7);
      try { 
        laguerreSolver0.solveAll(doubleArray1, 4.528448215408654E-43);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1706.595);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.ONE;
      complexArray0[1] = complex0;
      complexArray0[1].cos();
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((-1706.595), (-1706.595), (-2906.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-1706.595,-1706.595]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.acos();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex0.abs(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      double double0 = laguerreSolver0.solve(2178.0678, 2178.0678, 912.4025353050644);
      assertEquals(2178.0678, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = new Complex(12.0, (-1521.780063));
      laguerreSolver0.solve(575.1340435003, (-3595.4648294084027), 656.6538850029392);
      Complex[] complexArray0 = new Complex[6];
      // Undeclared exception!
      try { 
        laguerreSolver0.solve(complexArray0, complex0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-1706.595);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      laguerreSolver0.solve((-1706.595), 4378891.0564);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((-1.0), (-1706.595), 4.1013686479275647E-85);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-1.0,-1706.595]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (-1706.595);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex complex0 = Complex.INF;
      complex0.pow(complex0);
      // Undeclared exception!
      try { 
        laguerreSolver0.solve((-1706.595), (-2906.0), (-1706.595));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-1706.595,-2906.0]
         //
         verifyException("org.apache.commons.math.analysis.UnivariateRealSolverImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-2092.58);
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(polynomialFunction0);
      Complex[] complexArray0 = new Complex[4];
      Complex complex0 = Complex.ONE;
      complexArray0[0] = complex0;
      Complex complex1 = Complex.INF;
      complexArray0[1] = complex1;
      complexArray0[2] = complex0;
      laguerreSolver0.solve((-2092.58), (-2092.58), 0.0);
      complexArray0[3] = complex1;
      try { 
        laguerreSolver0.solve(complexArray0, complex0);
        fail("Expecting exception: MaxIterationsExceededException");
      
      } catch(MaxIterationsExceededException e) {
         //
         // Maximal number of iterations (100) exceeded
         //
         verifyException("org.apache.commons.math.analysis.LaguerreSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = new Complex(0.5, (-1521.780063));
      Complex complex1 = complex0.cosh();
      assertEquals(0.6094559928636705, complex1.abs(), 0.01);
      assertEquals((-0.4943828952941118), complex1.getImaginary(), 0.01);
      assertEquals(0.35640168360720986, complex1.getReal(), 0.01);
      assertEquals((-1521.780063), complex0.getImaginary(), 0.01);
  }
}
