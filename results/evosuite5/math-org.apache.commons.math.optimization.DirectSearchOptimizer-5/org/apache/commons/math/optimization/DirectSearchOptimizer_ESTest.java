/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:05:22 GMT 2019
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
import org.apache.commons.math.random.JDKRandomGenerator;
import org.apache.commons.math.random.RandomAdaptor;
import org.apache.commons.math.random.RandomVectorGenerator;
import org.apache.commons.math.random.UncorrelatedRandomVectorGenerator;
import org.apache.commons.math.random.UniformRandomGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DirectSearchOptimizer_ESTest extends DirectSearchOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      double[] doubleArray0 = new double[0];
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-2337), 1782.198378, 2.147483647E9, 1782.198378, (double)(-2337)).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true, true, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
      RandomAdaptor randomAdaptor0 = new RandomAdaptor(jDKRandomGenerator0);
      UniformRandomGenerator uniformRandomGenerator0 = new UniformRandomGenerator(randomAdaptor0);
      UncorrelatedRandomVectorGenerator uncorrelatedRandomVectorGenerator0 = new UncorrelatedRandomVectorGenerator(doubleArray0, doubleArray0, uniformRandomGenerator0);
      PointCostPair pointCostPair0 = nelderMead0.minimize(costFunction0, (-1), convergenceChecker0, (RandomVectorGenerator) uncorrelatedRandomVectorGenerator0, 2420);
      assertEquals((-2337.0), pointCostPair0.getCost(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead((-452.220033), (-452.220033), 320.8436927052, 1767.633958);
      double[] doubleArray0 = new double[1];
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-3624.1), 320.8436927052, (double)(-508), (-508.0)).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      PointCostPair pointCostPair0 = nelderMead0.minimize(costFunction0, 2452, convergenceChecker0, doubleArray0, doubleArray0);
      assertEquals((-3624.1), pointCostPair0.getCost(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional(0.0, 0.0);
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[1];
      multiDirectional0.minimize(costFunction0, (-1378), convergenceChecker0, doubleArray0, doubleArray0, (-1378), (long) (-1378));
      // Undeclared exception!
      multiDirectional0.iterateSimplex();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional(0.0, 0.0);
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[] doubleArray0 = new double[2];
      try { 
        multiDirectional0.minimize(costFunction0, 2, convergenceChecker0, doubleArray0, doubleArray0, 2, 678L);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // none of the 2 start points lead to convergence
         //
         verifyException("org.apache.commons.math.optimization.DirectSearchOptimizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead((-452.220033), (-452.220033), 320.8436927052, 1767.633958);
      double[] doubleArray0 = new double[1];
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2.147483647E9, 2.147483647E9, 320.8436927052, 253.815311).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      PointCostPair pointCostPair0 = nelderMead0.minimize(costFunction0, 2452, convergenceChecker0, doubleArray0, doubleArray0);
      assertEquals(253.815311, pointCostPair0.getCost(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(costFunction0).cost(any(double[].class));
      double[][] doubleArray0 = new double[1][1];
      // Undeclared exception!
      try { 
        multiDirectional0.minimize(costFunction0, 2390, (ConvergenceChecker) null, doubleArray0, 2, (long) 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
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
  public void test7()  throws Throwable  {
      NelderMead nelderMead0 = new NelderMead();
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      doReturn(730.1, 2.147483647E9).when(costFunction0).cost(any(double[].class));
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(convergenceChecker0).converged(any(org.apache.commons.math.optimization.PointCostPair[].class));
      double[][] doubleArray0 = new double[2][8];
      PointCostPair pointCostPair0 = nelderMead0.minimize(costFunction0, (-2337), convergenceChecker0, doubleArray0);
      assertEquals(730.1, pointCostPair0.getCost(), 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional((-1.0), 0.0);
      CostFunction costFunction0 = mock(CostFunction.class, new ViolatedAssumptionAnswer());
      ConvergenceChecker convergenceChecker0 = mock(ConvergenceChecker.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        multiDirectional0.minimize(costFunction0, 0, convergenceChecker0, (RandomVectorGenerator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
