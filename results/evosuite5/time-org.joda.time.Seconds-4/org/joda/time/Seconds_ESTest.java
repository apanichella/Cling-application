/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:39:38 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutableInterval;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = Seconds.ONE;
      boolean boolean0 = seconds1.isLessThan(seconds0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      boolean boolean0 = seconds0.isLessThan((Seconds) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      boolean boolean0 = seconds0.isLessThan((Seconds) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      boolean boolean0 = seconds0.isLessThan(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = Seconds.ONE;
      boolean boolean0 = seconds0.isGreaterThan(seconds1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      boolean boolean0 = seconds0.isGreaterThan((Seconds) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      boolean boolean0 = seconds0.isGreaterThan((Seconds) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      boolean boolean0 = seconds0.isGreaterThan(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = seconds0.dividedBy(1);
      assertEquals(2, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = seconds0.minus((Seconds) null);
      assertSame(seconds0, seconds1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      Seconds seconds1 = seconds0.plus((Seconds) null);
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = seconds0.plus(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.parseSeconds("{{& 4Q)}+hmK;e~M1Y3j");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"{{& 4Q)}+hmK;e~M1Y3j\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Seconds seconds0 = Seconds.secondsIn(mutableInterval0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      MonthDay monthDay0 = new MonthDay();
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      Seconds seconds1 = seconds0.plus(seconds0);
      assertEquals(2, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(3);
      Seconds seconds1 = seconds0.dividedBy(3);
      assertEquals(1, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(5503);
      String string0 = seconds0.MIN_VALUE.toString();
      assertEquals(5503, seconds0.getSeconds());
      assertEquals("PT-2147483648S", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Days days0 = seconds0.ONE.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      int int0 = seconds0.getSeconds();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Seconds seconds0 = weeks0.toStandardSeconds();
      Hours hours0 = seconds0.ONE.toStandardHours();
      assertEquals(604800, seconds0.getSeconds());
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Seconds seconds0 = weeks0.toStandardSeconds();
      Seconds seconds1 = seconds0.minus(seconds0);
      assertEquals(0, seconds1.getSeconds());
      assertEquals(604800, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds((-287));
      Minutes minutes0 = seconds0.toStandardMinutes();
      assertEquals((-4), minutes0.getMinutes());
      assertEquals((-287), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTime dateTime0 = new DateTime((-30L));
      Seconds seconds0 = Seconds.secondsBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = seconds0.negated();
      assertEquals((-2), seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Seconds seconds1 = seconds0.multipliedBy(1205);
      assertEquals(3615, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(5503);
      Weeks weeks0 = seconds0.toStandardWeeks();
      assertEquals(5503, seconds0.getSeconds());
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      PeriodType periodType0 = seconds0.ONE.getPeriodType();
      assertEquals("Seconds", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Duration duration0 = seconds0.ZERO.toStandardDuration();
      assertEquals(0L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }
}
