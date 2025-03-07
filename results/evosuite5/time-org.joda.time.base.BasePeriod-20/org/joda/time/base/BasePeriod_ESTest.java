/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 19:05:37 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePeriod_ESTest extends BasePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      Period period0 = Period.years(0);
      Period period1 = period0.minusDays((-1080));
      // Undeclared exception!
      try { 
        mutablePeriod0.add((ReadablePeriod) period1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'days'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.add((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Days days0 = Days.SEVEN;
      mutablePeriod0.mergePeriod(days0);
      assertEquals(7, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2814), (-2814), (-2814), (-2814));
      mutablePeriod0.mergePeriod((ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
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
      PeriodType periodType0 = PeriodType.dayTime();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      // Undeclared exception!
      try { 
        mutablePeriod0.addYears(841);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.addYears(292272708);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
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
  public void test08()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2798), (-2798), (-2798), (-2798), (-2798), (-2798), (-2798), (-2798));
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      // Undeclared exception!
      try { 
        mutablePeriod0.set(durationFieldType0, (-2798));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.setMillis(4);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.months((-2778));
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      // Undeclared exception!
      try { 
        period0.withPeriodType(periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'months'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.time();
      Period period1 = period0.withPeriodType(periodType0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutablePeriod mutablePeriod0 = null;
      try {
        mutablePeriod0 = new MutablePeriod("oY");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"oY\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      Period period0 = new Period((Object) null, periodType0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      LocalTime localTime0 = new LocalTime((-3157L));
      Period period0 = null;
      try {
        period0 = new Period(localDateTime0, localTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      MonthDay monthDay0 = MonthDay.parse("");
      Period period0 = null;
      try {
        period0 = new Period(localDateTime0, monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = new Period(localDate0, localDate0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) buddhistChronology0);
      Period period0 = null;
      try {
        period0 = new Period(localDateTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      DateMidnight dateMidnight0 = new DateMidnight();
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, dateMidnight0, periodType0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTime dateTime0 = DateTime.now((Chronology) buddhistChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, dateTime0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((Chronology) null);
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(monthDay0, monthDay0, periodType0);
      Period period1 = period0.withYears(1439);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.setPeriod(808, 808, 808, 808, 808, 808, 808, 808);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      mutablePeriod0.add((long) (-2770));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      PeriodType periodType0 = hours0.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      mutablePeriod0.addMillis(0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null);
      Duration duration0 = mutablePeriod0.toDurationFrom((ReadableInstant) null);
      assertEquals(0L, duration0.getStandardDays());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((long) (-2778));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1, (-12219292800000L), periodType0);
      mutablePeriod0.setDays(0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((Chronology) null);
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period(monthDay0, monthDay0, periodType0);
      Duration duration0 = period0.toDurationTo((ReadableInstant) null);
      assertEquals(0L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Duration duration0 = new Duration((ReadableInstant) null, (ReadableInstant) null);
      MutablePeriod mutablePeriod0 = new MutablePeriod(duration0, (ReadableInstant) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      // Undeclared exception!
      try { 
        mutablePeriod0.setValue((-784), (-784));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -784
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Duration duration0 = Duration.millis((-2026L));
      Period period0 = new Period((ReadableInstant) null, duration0);
  }
}
