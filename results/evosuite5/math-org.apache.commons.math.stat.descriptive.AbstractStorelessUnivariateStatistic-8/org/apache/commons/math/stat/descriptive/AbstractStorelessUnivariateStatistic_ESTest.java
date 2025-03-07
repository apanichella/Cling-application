/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:03:22 GMT 2019
 */

package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.ThirdMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math.stat.descriptive.summary.SumOfSquares;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractStorelessUnivariateStatistic_ESTest extends AbstractStorelessUnivariateStatistic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      sumOfLogs0.increment((-512.69590488));
      FourthMoment fourthMoment0 = new FourthMoment();
      GeometricMean geometricMean0 = new GeometricMean(sumOfLogs0);
      boolean boolean0 = fourthMoment0.equals(geometricMean0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Object object0 = new Object();
      boolean boolean0 = fourthMoment0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ThirdMoment thirdMoment0 = new ThirdMoment();
      Variance variance0 = new Variance(false, thirdMoment0);
      boolean boolean0 = thirdMoment0.equals(variance0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Variance variance0 = new Variance(true);
      double[] doubleArray0 = new double[2];
      fourthMoment0.incrementAll(doubleArray0);
      boolean boolean0 = fourthMoment0.equals(variance0);
      assertEquals(0.0, fourthMoment0.getResult(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      double[] doubleArray0 = new double[0];
      sumOfSquares0.incrementAll(doubleArray0);
      assertEquals(0L, sumOfSquares0.getN());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[4];
      double double0 = secondMoment0.evaluate(doubleArray0, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Mean mean0 = new Mean(fourthMoment0);
      // Undeclared exception!
      try { 
        mean0.evaluate((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input value array is null
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      ThirdMoment thirdMoment0 = new ThirdMoment();
      double double0 = thirdMoment0.evaluate(doubleArray0);
      assertEquals(2L, thirdMoment0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Mean mean0 = new Mean(fourthMoment0);
      mean0.hashCode();
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SumOfSquares sumOfSquares0 = new SumOfSquares();
      // Undeclared exception!
      try { 
        sumOfSquares0.incrementAll((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input values array is null
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }
}
