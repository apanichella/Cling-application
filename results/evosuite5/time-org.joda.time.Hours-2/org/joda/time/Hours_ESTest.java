/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:48:57 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Hours hours1 = Hours.MIN_VALUE;
      boolean boolean0 = hours1.isLessThan(hours0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      boolean boolean0 = hours0.isLessThan((Hours) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      boolean boolean0 = hours0.isLessThan((Hours) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      boolean boolean0 = hours0.isLessThan(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.MIN_VALUE;
      boolean boolean0 = hours0.isGreaterThan(hours1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      boolean boolean0 = hours0.isGreaterThan((Hours) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      boolean boolean0 = hours0.isGreaterThan((Hours) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      boolean boolean0 = hours0.isGreaterThan(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = hours0.THREE.dividedBy(1);
      assertEquals(3, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Hours hours1 = hours0.dividedBy(6);
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = hours0.THREE.minus((Hours) null);
      assertEquals(1, hours1.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Hours hours1 = hours0.plus((Hours) null);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = hours0.THREE.minus(hours0);
      assertEquals(3, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.parseHours((String) null);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hours.parseHours("$hK'a");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"$hK'a\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.hoursIn((ReadableInterval) null);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Interval interval0 = new Interval(0L, 0L);
      Hours hours0 = Hours.hoursIn(interval0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalTime localTime0 = new LocalTime(4343L, (Chronology) gJChronology0);
      // Undeclared exception!
      try { 
        Hours.hoursBetween((ReadablePartial) localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalTime localTime0 = new LocalTime((-206L), (Chronology) gJChronology0);
      Hours hours0 = Hours.hoursBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay((Chronology) islamicChronology0);
      Hours hours0 = Hours.hoursBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Hours hours1 = hours0.plus(hours0);
      assertEquals(6, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Hours hours1 = Hours.ONE;
      Hours hours2 = hours0.plus(hours1);
      assertEquals(4, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Hours hours0 = Hours.hours(1);
      assertEquals(1, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Days days0 = Days.TWO;
      Hours hours0 = days0.toStandardHours();
      Minutes minutes0 = hours0.SEVEN.toStandardMinutes();
      assertEquals(48, hours0.getHours());
      assertEquals(420, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      int int0 = hours0.getHours();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = hours0.ZERO.negated();
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Weeks weeks0 = hours0.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      PeriodType periodType0 = hours0.FOUR.getPeriodType();
      assertEquals("Hours", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Days days0 = hours0.toStandardDays();
      assertEquals(89478485, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Hours hours1 = hours0.SIX.multipliedBy(839);
      assertEquals(5034, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Hours hours0 = Hours.hoursBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      String string0 = hours0.MIN_VALUE.toString();
      assertEquals("PT-2147483648H", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Seconds seconds0 = hours0.toStandardSeconds();
      assertEquals(25200, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Duration duration0 = hours0.EIGHT.toStandardDuration();
      assertEquals(28800000L, duration0.getMillis());
  }
}
