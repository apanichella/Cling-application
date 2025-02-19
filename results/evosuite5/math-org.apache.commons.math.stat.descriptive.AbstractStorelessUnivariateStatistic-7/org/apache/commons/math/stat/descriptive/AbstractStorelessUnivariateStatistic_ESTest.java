/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:03:05 GMT 2019
 */

package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.GeometricMean;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.rank.Min;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractStorelessUnivariateStatistic_ESTest extends AbstractStorelessUnivariateStatistic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-2852.76);
      sumOfLogs0.incrementAll(doubleArray0);
      Variance variance0 = new Variance();
      boolean boolean0 = sumOfLogs0.equals(variance0);
      assertEquals(4L, sumOfLogs0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GeometricMean geometricMean0 = new GeometricMean((SumOfLogs) null);
      boolean boolean0 = geometricMean0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      Mean mean0 = new Mean(fourthMoment0);
      boolean boolean0 = mean0.equals(fourthMoment0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      double[] doubleArray0 = new double[4];
      sumOfLogs0.incrementAll(doubleArray0);
      Variance variance0 = new Variance();
      boolean boolean0 = sumOfLogs0.equals(variance0);
      assertEquals(Double.NEGATIVE_INFINITY, sumOfLogs0.getResult(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      double[] doubleArray0 = new double[0];
      sumOfLogs0.incrementAll(doubleArray0);
      assertEquals(0, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      // Undeclared exception!
      try { 
        sumOfLogs0.incrementAll((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input values array is null
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      double[] doubleArray0 = new double[1];
      double double0 = secondMoment0.evaluate(doubleArray0);
      assertEquals(0.0, secondMoment0.getResult(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[0];
      double double0 = fourthMoment0.evaluate(doubleArray0, 0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Min min0 = new Min();
      // Undeclared exception!
      try { 
        min0.evaluate((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input value array is null
         //
         verifyException("org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Mean mean0 = new Mean();
      mean0.hashCode();
  }
}
