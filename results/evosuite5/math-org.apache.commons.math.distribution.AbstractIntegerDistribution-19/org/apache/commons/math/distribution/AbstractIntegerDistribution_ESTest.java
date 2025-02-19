/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 15:49:19 GMT 2019
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractIntegerDistribution_ESTest extends AbstractIntegerDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(31.057854535236583);
      // Undeclared exception!
      try { 
        poissonDistributionImpl0.inverseCumulativeProbability(31.057854535236583);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // p must be between 0 and 1.0 (inclusive)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(8.13056919923757E-108);
      int int0 = poissonDistributionImpl0.inverseCumulativeProbability(8.13056919923757E-108);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(8.13056919923757E-108);
      // Undeclared exception!
      try { 
        poissonDistributionImpl0.inverseCumulativeProbability((-2173.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // p must be between 0 and 1.0 (inclusive)
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(8.13056919923757E-108);
      double double0 = poissonDistributionImpl0.probability((-1.7976931348623157E308));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(8.13056919923757E-108);
      double double0 = poissonDistributionImpl0.probability(8.13056919923757E-108);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(484.62083057785907);
      // Undeclared exception!
      try { 
        poissonDistributionImpl0.cumulativeProbability(484.62083057785907, 484.62083057785907);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint must be less than or equal to upper endpoint
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(8.441822398385275E-5);
      // Undeclared exception!
      try { 
        poissonDistributionImpl0.cumulativeProbability(8.441822398385275E-5, (-165.536107));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // lower endpoint must be less than or equal to upper endpoint
         //
         verifyException("org.apache.commons.math.distribution.AbstractIntegerDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0);
      double double0 = poissonDistributionImpl0.cumulativeProbability(1.0, 1.0);
      assertEquals(0.3678794411714608, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(8.13056919923757E-108);
      double double0 = poissonDistributionImpl0.cumulativeProbability(8.13056919923757E-108);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.92145266662209);
      int int0 = poissonDistributionImpl0.inverseCumulativeProbability(0.92145266662209);
      assertEquals(1, int0);
  }
}
