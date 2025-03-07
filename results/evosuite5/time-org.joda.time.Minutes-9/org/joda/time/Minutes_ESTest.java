/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:48:49 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Minutes minutes1 = Minutes.ZERO;
      boolean boolean0 = minutes1.isLessThan(minutes0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      boolean boolean0 = minutes0.isLessThan((Minutes) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      boolean boolean0 = minutes0.isLessThan((Minutes) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      boolean boolean0 = minutes0.isLessThan(minutes0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Minutes minutes1 = Minutes.MIN_VALUE;
      boolean boolean0 = minutes0.isGreaterThan(minutes1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      boolean boolean0 = minutes0.isGreaterThan((Minutes) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      boolean boolean0 = minutes0.isGreaterThan((Minutes) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      boolean boolean0 = minutes0.isGreaterThan(minutes0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Minutes minutes1 = minutes0.dividedBy(1);
      assertSame(minutes0, minutes1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      // Undeclared exception!
      try { 
        minutes0.dividedBy(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.joda.time.Minutes", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Minutes minutes1 = minutes0.minus((Minutes) null);
      assertSame(minutes0, minutes1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Minutes minutes1 = minutes0.plus(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.parseMinutes("org.joda.time.Minutes");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.Minutes\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      Minutes minutes1 = minutes0.plus((Minutes) null);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) fixedDateTimeZone0);
      Interval interval0 = yearMonth0.toInterval((DateTimeZone) fixedDateTimeZone0);
      Minutes minutes0 = Minutes.minutesIn(interval0);
      assertEquals(40320, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(43200000L);
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      LocalDate localDate0 = LocalDate.fromCalendarFields(mockGregorianCalendar0);
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Minutes minutes1 = Minutes.THREE;
      Minutes minutes2 = minutes1.minus(minutes0);
      assertEquals(2, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Seconds seconds0 = minutes0.toStandardSeconds();
      Minutes minutes1 = seconds0.toStandardMinutes();
      assertEquals(60, seconds0.getSeconds());
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Duration duration0 = minutes0.toStandardDuration();
      Minutes minutes1 = duration0.toStandardMinutes();
      assertEquals((-35791394L), duration0.getStandardHours());
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      // Undeclared exception!
      try { 
        minutes0.MAX_VALUE.multipliedBy((-1056));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * -1056
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Hours hours0 = minutes0.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      String string0 = minutes0.toString();
      assertEquals("PT3M", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadableInstant) null, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      int int0 = minutes0.getMinutes();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      PeriodType periodType0 = minutes0.getPeriodType();
      assertEquals(1, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Minutes minutes0 = Minutes.MAX_VALUE;
      Days days0 = minutes0.TWO.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Minutes minutes1 = minutes0.THREE.negated();
      assertEquals((-3), minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Weeks weeks0 = minutes0.toStandardWeeks();
      assertEquals((-213044), weeks0.getWeeks());
  }
}
