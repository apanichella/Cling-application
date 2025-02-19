/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:25:54 GMT 2019
 */

package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math.stat.descriptive.DescriptiveStatisticsImpl;
import org.apache.commons.math.stat.descriptive.UnivariateStatistic;
import org.apache.commons.math.stat.descriptive.moment.Mean;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.rank.Max;
import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DescriptiveStatistics_ESTest extends DescriptiveStatistics_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.addValue(0.0);
      descriptiveStatistics0.addValue((-1));
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
      
      descriptiveStatistics0.setWindowSize(1);
      assertEquals(1, descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.setWindowSize((-1));
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.addValue((-1));
      String string0 = descriptiveStatisticsImpl0.toString();
      assertEquals("DescriptiveStatistics:\nn: 1\nmin: -1.0\nmax: -1.0\nmean: -1.0\nstd dev: 0.0\nmedian: -1.0\nskewness: NaN\nkurtosis: NaN\n", string0);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
      
      descriptiveStatistics0.setWindowSize(1);
      descriptiveStatistics0.addValue((-1));
      descriptiveStatistics0.addValue((-1));
      assertEquals(1, descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.windowSize = (-2144371351);
      descriptiveStatistics0.addValue((-1));
      assertEquals((-1), DescriptiveStatistics.INFINITE_WINDOW);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      // Undeclared exception!
      try { 
        descriptiveStatisticsImpl0.getElement((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Elements cannot be retrieved from a negative array index
         //
         verifyException("org.apache.commons.math.util.ResizableDoubleArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getVarianceImpl();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = null;
      try {
        descriptiveStatistics0 = new DescriptiveStatistics((-2147483645));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // window size must be positive.
         //
         verifyException("org.apache.commons.math.stat.descriptive.DescriptiveStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.addValue((-1));
      descriptiveStatistics0.addValue((-1));
      String string0 = descriptiveStatistics0.toString();
      assertEquals("DescriptiveStatistics:\nn: 2\nmin: -1.0\nmax: -1.0\nmean: -1.0\nstd dev: 0.0\nmedian: -1.0\nskewness: NaN\nkurtosis: NaN\n", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      StandardDeviation standardDeviation0 = new StandardDeviation();
      // Undeclared exception!
      try { 
        descriptiveStatistics0.setPercentileImpl(standardDeviation0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Percentile implementation does not support setQuantile
         //
         verifyException("org.apache.commons.math.stat.descriptive.DescriptiveStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.getGeometricMean();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      Sum sum0 = new Sum();
      descriptiveStatisticsImpl0.setMeanImpl(sum0);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      Max max0 = new Max();
      descriptiveStatistics0.setSumImpl(max0);
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      UnivariateStatistic univariateStatistic0 = descriptiveStatistics0.getKurtosisImpl();
      descriptiveStatistics0.setSkewnessImpl(univariateStatistic0);
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.getMeanImpl();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.getSumsqImpl();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.getMinImpl();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.getSumImpl();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.setVarianceImpl((UnivariateStatistic) null);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getSkewnessImpl();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getMaxImpl();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      Variance variance0 = new Variance();
      descriptiveStatisticsImpl0.setMinImpl(variance0);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      descriptiveStatistics0.getPercentileImpl();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.getSumsq();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.setGeometricMeanImpl((UnivariateStatistic) null);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        DescriptiveStatistics.newInstance(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.apache.commons.math.stat.descriptive.DescriptiveStatistics
         //
         verifyException("org.apache.commons.math.stat.descriptive.DescriptiveStatistics", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      UnivariateStatistic univariateStatistic0 = descriptiveStatisticsImpl0.getGeometricMeanImpl();
      descriptiveStatisticsImpl0.setMaxImpl(univariateStatistic0);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.clear();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.setSumsqImpl((UnivariateStatistic) null);
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      descriptiveStatisticsImpl0.getSum();
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = new DescriptiveStatistics();
      Mean mean0 = new Mean();
      descriptiveStatistics0.setKurtosisImpl(mean0);
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      int int0 = descriptiveStatisticsImpl0.getWindowSize();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DescriptiveStatisticsImpl descriptiveStatisticsImpl0 = new DescriptiveStatisticsImpl();
      String string0 = descriptiveStatisticsImpl0.toString();
      assertEquals("DescriptiveStatistics:\nn: 0\nmin: NaN\nmax: NaN\nmean: NaN\nstd dev: NaN\nmedian: NaN\nskewness: NaN\nkurtosis: NaN\n", string0);
      assertEquals((-1), descriptiveStatisticsImpl0.getWindowSize());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DescriptiveStatistics descriptiveStatistics0 = DescriptiveStatistics.newInstance();
      descriptiveStatistics0.getSortedValues();
      assertEquals((-1), descriptiveStatistics0.getWindowSize());
  }
}
