/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 18:57:28 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.months(1);
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.months(1);
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Period period0 = duration0.toPeriod();
      Period period1 = period0.plusHours(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.seconds(0);
      Period period1 = period0.plusWeeks(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.plusMonths(1);
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.months(1);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      // Undeclared exception!
      try { 
        period0.minusDays(3635);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusYears(1000);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.millis(0);
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.days(0);
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) 0);
      Period period1 = period0.ZERO.plus(mutablePeriod0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.normalizedStandard();
      period1.minusMillis(3635);
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.seconds(0);
      PeriodFormatter periodFormatter0 = ISOPeriodFormat.standard();
      period0.toString(periodFormatter0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.seconds(0);
      Period.fieldDifference(yearMonth0, yearMonth0);
      PeriodFormatter periodFormatter0 = ISOPeriodFormat.standard();
      String string0 = period0.toString(periodFormatter0);
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period();
      period0.negated();
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      period0.minus(period0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      Period period1 = period0.minus(period0);
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.months(1);
      Period period1 = period0.normalizedStandard();
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      boolean boolean0 = period0.equals((Object) null);
      assertFalse(boolean0);
      
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      period0.equals((Object) null);
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      period0.get(durationFieldType0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = Period.fieldDifference(yearMonth0, yearMonth0);
      Period period1 = period0.normalizedStandard();
      boolean boolean0 = period0.equals(period1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Duration duration0 = Duration.ZERO;
      Period period0 = duration0.toPeriod();
      period0.negated();
      TimeZone timeZone0 = TimeZone.getTimeZone("YearWeekDayTime");
      Locale locale0 = Locale.ENGLISH;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(timeZone0, locale0);
      LocalDateTime localDateTime0 = LocalDateTime.fromCalendarFields(gregorianCalendar0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, yearMonth0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      period0.negated();
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = new Period();
      period0.plusMinutes(3725);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3725);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 3725, dateTimeZone0);
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = Period.months(1);
      Period period1 = period0.plusMinutes(0);
      Period period2 = period0.withFields((ReadablePeriod) null);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withFields((ReadablePeriod) null);
      Period period2 = period0.plusMinutes(1793);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = Period.months(1);
      Period period1 = period0.plusMinutes(0);
      Period period2 = period0.withFields(period0);
      assertNotSame(period2, period0);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = Period.months(1);
      Period period1 = period0.plusMinutes(1);
      Period period2 = period0.withFields(period1);
      assertFalse(period2.equals((Object)period0));
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Period period0 = Period.months(1);
      Period period1 = period0.plusMinutes(0);
      Period period2 = period0.withPeriodType((PeriodType) null);
      assertSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Period period0 = new Period((-42521587200000L), (-42521587200000L), periodType0, julianChronology0);
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period1.minusMinutes((-226));
      assertSame(period1, period0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = Period.months(0);
      Period period1 = period0.plusMinutes(0);
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period2 = period0.withPeriodType(periodType0);
      assertSame(period0, period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period0 = new Period();
      Period period1 = period0.withPeriodType(periodType0);
      Period period2 = period1.minusMinutes(20503125);
      assertNotSame(period2, period1);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      Period period1 = period0.plusMinutes(0);
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      period0.plusMinutes(3648);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      period0.getFieldTypes();
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      period0.getFieldTypes();
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      period0.minusSeconds(3648);
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      Period period1 = period0.minusSeconds(3648);
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.months(1);
      Period period1 = period0.normalizedStandard();
      period0.equals(period1);
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = Period.months(1);
      Period period1 = Period.days(0);
      period1.equals(period0);
      assertFalse(period0.equals((Object)period1));
      
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      period0.toString((PeriodFormatter) null);
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      period0.toString((PeriodFormatter) null);
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period();
      period0.toStandardDuration();
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period();
      period0.toStandardDuration();
      Period period1 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      period0.normalizedStandard();
      // Undeclared exception!
      try { 
        Period.fieldDifference(yearMonth0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(1, 0, 1, 1, 0, 1, 0, 0);
      Period period1 = period0.normalizedStandard();
      Period period2 = Period.fieldDifference(yearMonth0, yearMonth0);
      assertNotSame(period2, period1);
  }
}
