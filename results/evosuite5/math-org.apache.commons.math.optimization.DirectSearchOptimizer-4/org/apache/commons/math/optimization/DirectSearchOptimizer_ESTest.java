/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:59:51 GMT 2019
 */

package org.apache.commons.math.optimization;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.optimization.CostFunction;
import org.apache.commons.math.optimization.MultiDirectional;
import org.apache.commons.math.optimization.NelderMead;
import org.apache.commons.math.optimization.PointCostPair;
import org.apache.commons.math.random.GaussianRandomGenerator;
import org.apache.commons.math.random.JDKRandomGenerator;
import org.apache.commons.math.random.RandomVectorGenerator;
import org.apache.commons.math.random.UncorrelatedRandomVectorGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(840.2818264273554, (double)562, 840.2818264273554, 840.2818264273554, (double)562).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true, false, false, false, true).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[1];
      nelderMead0.minimize(costFunction0, 4, convergenceChecker0, doubleArray0, doubleArray0, 562, 0L);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(840.2818264273554, (double)562, 840.2818264273554, 840.2818264273554, (double)562).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true, false, false, false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[1];
      PointCostPair pointCostPair0 = nelderMead0.minimize(costFunction0, 4, convergenceChecker0, doubleArray0, doubleArray0, 562, 0L);
      assertEquals(562.0, pointCostPair0.getCost(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead((-91.09213979216), (-91.09213979216), (-91.09213979216), Double.NaN);
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[][] doubleArray0 = new double[8][9];
      try { 
        nelderMead0.minimize(costFunction0, 0, convergenceChecker0, doubleArray0, 0, (-1691L));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // none of the 1 start points lead to convergence
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead(902.96, 902.96, (-1357.8250124), (-1406.115733546));
      // Undeclared exception!
      try { 
        nelderMead0.getMinima();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[][] doubleArray0 = new double[0][7];
      try { 
        nelderMead0.minimize(costFunction0, (-3556), convergenceChecker0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // none of the 1 start points lead to convergence
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nelderMead0.minimize((CostFunction) null, 1609, convergenceChecker0, (RandomVectorGenerator) null, (-2189));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      GaussianRandomGenerator gaussianRandomGenerator0 = new GaussianRandomGenerator(jDKRandomGenerator0);
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(7, gaussianRandomGenerator0);
      // Undeclared exception!
      try { 
        multiDirectional0.minimize((CostFunction) null, 553, convergenceChecker0, (RandomVectorGenerator) uncorrelatedRandomVectorGenerator0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[1];
      try { 
        nelderMead0.minimize(costFunction0, 562, convergenceChecker0, doubleArray0, doubleArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // none of the 1 start points lead to convergence
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }
}
