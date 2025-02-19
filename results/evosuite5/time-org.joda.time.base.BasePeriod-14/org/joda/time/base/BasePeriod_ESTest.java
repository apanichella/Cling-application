/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 18:58:56 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Duration duration0 = new Duration(0L, 1800000L);
      Seconds seconds0 = Seconds.seconds((-2388));
      PeriodType periodType0 = seconds0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, duration0, periodType0);
      Minutes minutes0 = Minutes.MIN_VALUE;
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) minutes0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'minutes'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Duration duration0 = new Duration(524L, (-1082L));
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, duration0, (PeriodType) null);
      mutablePeriod0.add((ReadableDuration) duration0);
      assertEquals(0L, duration0.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Days days0 = Days.SIX;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      mutablePeriod0.mergePeriod(days0);
      assertEquals(6, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L, (PeriodType) null);
      // Undeclared exception!
      try { 
        mutablePeriod0.add((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period(479L);
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, (-355));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'halfdays'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.addMinutes(0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.setMonths(0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDay();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.setMillis(2000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'millis'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.setMinutes(4);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = new Period((Object) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = new Period(localTime0, localTime0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      PeriodType periodType0 = PeriodType.months();
      LocalDateTime localDateTime0 = new LocalDateTime(0L, (Chronology) null);
      Period period0 = null;
      try {
        period0 = new Period(localDateTime0, monthDay0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) julianChronology0);
      LocalTime localTime0 = new LocalTime();
      PeriodType periodType0 = PeriodType.months();
      Period period0 = null;
      try {
        period0 = new Period(localDateTime0, localTime0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Period period0 = null;
      try {
        period0 = new Period(monthDay0, (ReadablePartial) null, (PeriodType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = null;
      try {
        period0 = new Period((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateTime0, (PeriodType) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Instant instant0 = Instant.now();
      MutablePeriod mutablePeriod0 = new MutablePeriod(instant0, instant0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((-1L));
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusYears(1);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((-1L));
      Period period0 = new Period(yearMonth0, yearMonth0);
      MutablePeriod mutablePeriod0 = period0.toMutablePeriod();
      mutablePeriod0.setPeriod(0, 1, (-2606), 1, 0, (-2606), 1, (-2606));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((-1L));
      Period period0 = new Period(yearMonth0, yearMonth0);
      MutablePeriod mutablePeriod0 = period0.toMutablePeriod();
      mutablePeriod0.addMillis(0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(0L);
      Duration duration0 = mutablePeriod0.toDurationFrom((ReadableInstant) null);
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(705L, 705L);
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Duration duration0 = new Duration(524L, (-1082L));
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, duration0, (PeriodType) null);
      // Undeclared exception!
      try { 
        mutablePeriod0.set((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Instant instant0 = new Instant((Object) null);
      PeriodType periodType0 = PeriodType.yearDayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableDuration) null, instant0, periodType0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = new Period((-3417), (-3417), (-3417), (-3417));
      PeriodType periodType0 = PeriodType.weeks();
      // Undeclared exception!
      try { 
        period0.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      // Undeclared exception!
      try { 
        mutablePeriod0.setValue((-107), (-107));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -107
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Duration duration0 = new Duration(0L, 1800000L);
      Seconds seconds0 = Seconds.seconds((-2388));
      PeriodType periodType0 = seconds0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, duration0, periodType0);
      Duration duration1 = mutablePeriod0.toDurationTo((ReadableInstant) null);
      assertEquals(30L, duration1.getStandardMinutes());
  }
}
