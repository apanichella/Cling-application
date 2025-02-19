/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:50:25 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.MAX_VALUE;
      boolean boolean0 = hours0.isLessThan(hours1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = hours0.multipliedBy((-2321));
      boolean boolean0 = hours1.isLessThan((Hours) null);
      assertEquals((-2321), hours1.getHours());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      boolean boolean0 = hours0.isLessThan((Hours) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      boolean boolean0 = hours0.isLessThan(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = Hours.SIX;
      boolean boolean0 = hours1.isGreaterThan(hours0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      boolean boolean0 = hours0.isGreaterThan((Hours) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      boolean boolean0 = hours0.isGreaterThan((Hours) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      boolean boolean0 = hours0.isGreaterThan(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((long) 43);
      Hours hours0 = Hours.hoursBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Hours hours1 = hours0.dividedBy(1);
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Hours hours1 = hours0.minus((Hours) null);
      assertEquals(1, hours1.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = hours0.plus((Hours) null);
      assertEquals(5, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Hours hours0 = Hours.standardHoursIn(seconds0);
      Hours hours1 = hours0.plus(hours0);
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.parseHours((String) null);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hours.parseHours("ZW}'3 5HbYGJ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"ZW}'3 5HbYGJ\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Hours hours0 = Hours.hoursIn((ReadableInterval) null);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((Object) null);
      Hours hours0 = Hours.hoursIn(mutableInterval0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1, (Chronology) buddhistChronology0);
      // Undeclared exception!
      try { 
        Hours.hoursBetween((ReadablePartial) localTime0, (ReadablePartial) yearMonth0);
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
      Hours hours0 = Hours.hoursBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Hours hours0 = Hours.hours(7);
      assertEquals(7, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Hours hours0 = Hours.hours(5);
      assertEquals(5, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Hours hours0 = Hours.hours(2);
      assertEquals(2, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Hours hours0 = Hours.hours((-366));
      Hours hours1 = hours0.dividedBy((-366));
      assertEquals(1, hours1.getHours());
      assertEquals((-366), hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Minutes minutes0 = hours0.toStandardMinutes();
      assertEquals(60, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      int int0 = hours0.getHours();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Hours hours0 = Hours.hours(0);
      Hours hours1 = hours0.MAX_VALUE.negated();
      assertEquals((-2147483647), hours1.getHours());
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Weeks weeks0 = hours0.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      PeriodType periodType0 = hours0.FOUR.getPeriodType();
      assertEquals(1, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Days days0 = hours0.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hours.hoursBetween((ReadableInstant) null, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      String string0 = hours0.THREE.toString();
      assertEquals("PT3H", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Hours hours1 = hours0.minus(hours0);
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((long) 43);
      Hours hours0 = Hours.hoursBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      hours0.toStandardSeconds();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Duration duration0 = hours0.EIGHT.toStandardDuration();
      assertEquals(28800000L, duration0.getMillis());
  }
}
