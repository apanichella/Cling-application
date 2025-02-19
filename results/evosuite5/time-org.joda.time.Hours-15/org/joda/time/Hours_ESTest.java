/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:34:02 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
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
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.MAX_VALUE;
      boolean boolean0 = hours0.isLessThan(hours1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      boolean boolean0 = hours0.isLessThan((Hours) null);
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
      Hours hours0 = Hours.ONE;
      boolean boolean0 = hours0.isLessThan(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = Hours.TWO;
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
      Hours hours0 = Hours.ONE;
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
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = hours0.TWO.dividedBy(1);
      assertEquals(2, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Hours hours1 = hours0.minus((Hours) null);
      assertEquals(3, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = hours0.FIVE.plus((Hours) null);
      assertNotSame(hours0, hours1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.ZERO;
      Hours hours2 = hours0.SIX.minus(hours1);
      assertEquals(6, hours2.getHours());
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
        Hours.parseHours("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
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
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) copticChronology0);
      MonthDay monthDay0 = MonthDay.now();
      // Undeclared exception!
      try { 
        Hours.hoursBetween((ReadablePartial) localTime0, (ReadablePartial) monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) gregorianChronology0);
      Hours hours0 = Hours.hoursBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hours.hoursBetween((ReadablePartial) null, (ReadablePartial) null);
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
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.ZERO;
      Hours hours2 = hours1.plus(hours0);
      assertSame(hours2, hours0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Hours hours1 = hours0.FIVE.plus(hours0);
      assertEquals(7, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = Hours.FIVE;
      Hours hours2 = hours0.ONE.plus(hours1);
      assertEquals(6, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Hours hours1 = Hours.THREE;
      Hours hours2 = hours0.EIGHT.minus(hours1);
      assertEquals(5, hours2.getHours());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Hours hours0 = Hours.hours(4);
      assertEquals(4, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      DateMidnight dateMidnight0 = DateMidnight.now();
      MutableInterval mutableInterval0 = new MutableInterval(hours0, dateMidnight0);
      Hours hours1 = Hours.hoursIn(mutableInterval0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = hours0.dividedBy((-2080895));
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Minutes minutes0 = hours0.SEVEN.toStandardMinutes();
      assertEquals(420, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      int int0 = hours0.getHours();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = hours0.SIX.negated();
      assertEquals((-6), hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Weeks weeks0 = hours0.MAX_VALUE.toStandardWeeks();
      assertEquals(12782640, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      PeriodType periodType0 = hours0.getPeriodType();
      assertEquals(1, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Days days0 = hours0.ZERO.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      // Undeclared exception!
      try { 
        hours0.MAX_VALUE.multipliedBy(2000);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 2000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
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
  public void test37()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      String string0 = hours0.toString();
      assertEquals("PT2147483647H", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Seconds seconds0 = hours0.toStandardSeconds();
      assertEquals(18000, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Duration duration0 = hours0.MAX_VALUE.toStandardDuration();
      assertEquals(128849018820L, duration0.getStandardMinutes());
  }
}
