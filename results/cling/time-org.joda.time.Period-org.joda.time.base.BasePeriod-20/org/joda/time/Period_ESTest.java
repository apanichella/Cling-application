/*

 * Tue Mar 03 17:22:34 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      // Undeclared exception!
      try { 
        period0.ZERO.withFieldAdded(durationFieldType0, (-3079));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weekyears'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(8262L);
      LocalTime localTime0 = new LocalTime(1, 1, 7);
      Period period0 = null;
      try {
        period0 = new Period(localTime0, monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusMonths((-346));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Months months0 = Months.parseMonths((String) null);
      MutablePeriod mutablePeriod0 = months0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withFields(period0);
      assertTrue(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.ZERO;
      MonthDay monthDay0 = new MonthDay((long) (-346));
      Period period1 = new Period(monthDay0, monthDay0);
      Period period2 = period0.minusMinutes(1);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  @Ignore
  public void test10()  throws Throwable  {
      Instant instant0 = Instant.now();
      Period period0 = new Period(instant0, (ReadableInstant) null);
      assertEquals(1583256131886L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = new Period();
      period0.negated();
      LocalTime localTime0 = new LocalTime(12, 1, 12, 12);
      DateTime dateTime0 = localTime0.toDateTimeToday();
      LocalDate localDate0 = dateTime0.toLocalDate();
      PeriodType periodType0 = PeriodType.yearDay();
      Period period1 = null;
      try {
        period1 = new Period(localDate0, localTime0, periodType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusYears((-716));
      Period period2 = period1.normalizedStandard();
      assertTrue(period2.equals((Object)period1));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.withMonths(1);
      Period period2 = period1.negated();
      assertFalse(period2.equals((Object)period0));
      assertFalse(period2.equals((Object)period1));
      assertNotSame(period2, period1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period();
      YearMonth yearMonth0 = new YearMonth();
      Period period1 = new Period(yearMonth0, yearMonth0);
      Period period2 = period0.minusHours(0);
      assertSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      MutablePeriod mutablePeriod0 = hours0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 1172);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.ZERO.plusHours(27);
      MonthDay monthDay0 = new MonthDay((long) (-346));
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusSeconds((-2241));
      MonthDay monthDay0 = new MonthDay((long) (-2241));
      Period period2 = new Period(monthDay0, monthDay0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      Period period0 = new Period(yearMonth0, yearMonth0);
      Period period1 = period0.minusMillis(3);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = new Period();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) gJChronology0);
      Period period1 = new Period(yearMonth0, yearMonth0);
      Period period2 = period0.minus(period1);
      assertNotSame(period2, period0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.seconds();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      // Undeclared exception!
      try { 
        period0.withField(durationFieldType0, 1172);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'eras'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }
}
