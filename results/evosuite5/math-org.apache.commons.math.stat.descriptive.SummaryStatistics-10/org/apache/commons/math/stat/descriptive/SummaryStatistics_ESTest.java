/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:54:58 GMT 2019
 */

package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.StatisticalSummary;
import org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic;
import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.apache.commons.math.stat.descriptive.SummaryStatisticsImpl;
import org.apache.commons.math.stat.descriptive.moment.FourthMoment;
import org.apache.commons.math.stat.descriptive.moment.Kurtosis;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SummaryStatistics_ESTest extends SummaryStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getMeanImpl();
      summaryStatistics0.addValue(6.283185307179586);
      // Undeclared exception!
      try { 
        summaryStatistics0.setMaxImpl(storelessUnivariateStatistic0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Implementations must be configured before values are added.
         //
         verifyException("org.apache.commons.math.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      assertTrue(summaryStatisticsImpl1.equals((Object)summaryStatisticsImpl0));
      
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      double[] doubleArray0 = new double[1];
      sumOfLogs0.incrementAll(doubleArray0);
      summaryStatisticsImpl1.setSumsqImpl(sumOfLogs0);
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatisticsImpl1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      Sum sum0 = summaryStatistics0.sum;
      double[] doubleArray0 = new double[6];
      sum0.incrementAll(doubleArray0);
      SummaryStatistics summaryStatistics1 = new SummaryStatistics();
      boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
      assertEquals(0L, summaryStatistics1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      summaryStatisticsImpl1.addValue(Double.NaN);
      boolean boolean0 = summaryStatisticsImpl1.equals(summaryStatisticsImpl0);
      assertEquals(1L, summaryStatisticsImpl1.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[4];
      fourthMoment0.evaluate(doubleArray0);
      Kurtosis kurtosis0 = new Kurtosis(fourthMoment0);
      summaryStatistics0.setMinImpl(kurtosis0);
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatistics0);
      assertFalse(boolean0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      assertTrue(summaryStatisticsImpl1.equals((Object)summaryStatisticsImpl0));
      
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[3];
      fourthMoment0.evaluate(doubleArray0);
      summaryStatisticsImpl1.secondMoment = (SecondMoment) fourthMoment0;
      boolean boolean0 = summaryStatisticsImpl1.equals(summaryStatisticsImpl0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.addValue((-17.07877741291844));
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      boolean boolean0 = summaryStatisticsImpl1.equals(summaryStatisticsImpl0);
      assertEquals(1L, summaryStatisticsImpl0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.addValue(6.0);
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      boolean boolean0 = summaryStatisticsImpl1.equals(summaryStatisticsImpl0);
      assertEquals(1L, summaryStatisticsImpl0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      Max max0 = new Max();
      boolean boolean0 = summaryStatistics0.equals(max0);
      assertEquals(0L, summaryStatistics0.getN());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FourthMoment fourthMoment0 = new FourthMoment();
      double[] doubleArray0 = new double[9];
      fourthMoment0.incrementAll(doubleArray0);
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.setVarianceImpl(fourthMoment0);
      summaryStatisticsImpl0.clear();
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SecondMoment secondMoment0 = new SecondMoment();
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.setMeanImpl(secondMoment0);
      summaryStatisticsImpl0.addValue(610.87);
      assertEquals(1L, summaryStatisticsImpl0.getN());
      
      summaryStatisticsImpl0.clear();
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.n = 1L;
      summaryStatistics0.addValue(1392.9);
      double double0 = summaryStatistics0.getStandardDeviation();
      assertEquals(2L, summaryStatistics0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.addValue(Double.NaN);
      double double0 = summaryStatistics0.getStandardDeviation();
      assertEquals(1L, summaryStatistics0.getN());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      summaryStatisticsImpl1.setMeanImpl((StorelessUnivariateStatistic) null);
      // Undeclared exception!
      try { 
        summaryStatisticsImpl0.equals(summaryStatisticsImpl1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.stat.descriptive.SummaryStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.addValue((-17.07877741291844));
      SummaryStatisticsImpl summaryStatisticsImpl1 = new SummaryStatisticsImpl();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatisticsImpl0.getMinImpl();
      summaryStatisticsImpl1.setVarianceImpl(storelessUnivariateStatistic0);
      assertEquals(1L, summaryStatisticsImpl0.getN());
      
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      boolean boolean0 = summaryStatisticsImpl1.equals(summaryStatistics0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.getGeoMeanImpl();
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getMaxImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.getVarianceImpl();
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StatisticalSummary statisticalSummary0 = summaryStatistics0.getSummary();
      assertEquals(0L, statisticalSummary0.getN());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.getSumImpl();
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      summaryStatisticsImpl0.getSumLogImpl();
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SumOfLogs sumOfLogs0 = new SumOfLogs();
      summaryStatisticsImpl0.setGeoMeanImpl(sumOfLogs0);
      summaryStatisticsImpl0.addValue(1983.2723420120437);
      assertEquals(1L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getMeanImpl();
      summaryStatistics0.setSumLogImpl(storelessUnivariateStatistic0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      String string0 = summaryStatisticsImpl0.toString();
      assertEquals("SummaryStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\ngeometric mean: NaN\nvariance: NaN\nsum of squares: NaN\nstandard deviation: NaN\nsum of logs: NaN\n", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      summaryStatistics0.hashCode();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatisticsImpl0.getSumsqImpl();
      summaryStatisticsImpl0.setSumImpl(storelessUnivariateStatistic0);
      assertEquals(0L, summaryStatisticsImpl0.getN());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SummaryStatistics summaryStatistics0 = SummaryStatistics.newInstance();
      Max max0 = new Max();
      summaryStatistics0.setVarianceImpl(max0);
      assertEquals(0L, summaryStatistics0.getN());
      
      summaryStatistics0.addValue(3.141592653589793);
      assertEquals(1L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SummaryStatisticsImpl summaryStatisticsImpl0 = new SummaryStatisticsImpl();
      SummaryStatistics summaryStatistics0 = new SummaryStatistics();
      boolean boolean0 = summaryStatisticsImpl0.equals(summaryStatistics0);
      assertTrue(boolean0);
      assertEquals(0L, summaryStatistics0.getN());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        SummaryStatistics.newInstance(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.math.stat.descriptive.SummaryStatistics
         //
         verifyException("org.apache.commons.math.stat.descriptive.SummaryStatistics", e);
      }
  }
}
