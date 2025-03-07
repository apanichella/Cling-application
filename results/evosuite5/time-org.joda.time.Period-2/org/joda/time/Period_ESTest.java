/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:51:40 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.years((-295));
      // Undeclared exception!
      try { 
        period0.toStandardMinutes();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Minutes as this period contains years and years vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Period period0 = new Period((-507L), (Chronology) gregorianChronology0);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period((Object) null, (PeriodType) null);
      Period period1 = period0.minus((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Years years0 = Years.years(1466);
      Period period1 = period0.minus(years0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.weeks(0);
      Period period1 = period0.ZERO.plusSeconds(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.seconds((-295));
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.days((-2014));
      Period period1 = period0.minusHours((-2014));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((-4007L));
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.ZERO.minusDays(0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = new Period(0L);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.seconds((-2233));
      Period period1 = period0.minusMonths((-2233));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.months(1785);
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plus((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      // Undeclared exception!
      try { 
        period0.withFieldAdded(durationFieldType0, 2353);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.withFieldAdded((DurationFieldType) null, 3969);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.weeks(0);
      DurationFieldType durationFieldType0 = DurationFieldType.SECONDS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period(0L, (-568L), (Chronology) null);
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, 148);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.minutes((-2251));
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      Period period1 = period0.withField(durationFieldType0, (-2251));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Hours hours0 = Hours.SEVEN;
      // Undeclared exception!
      try { 
        period0.withFields(hours0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[7];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
      int[] intArray0 = new int[3];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      // Undeclared exception!
      try { 
        Period.fieldDifference(partial0, partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not have overlapping fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDate localDate0 = localDateTime0.toLocalDate();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDateTime0, localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      // Undeclared exception!
      try { 
        Period.fieldDifference(localDate0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        Period.fieldDifference((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PeriodType periodType0 = PeriodType.time();
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, periodType0);
      Period period1 = period0.normalizedStandard(periodType0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.minusSeconds(1718);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.ZERO.minusWeeks(85);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.minusDays((-821));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = new Period(1, 1, 0, 0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTime dateTime0 = new DateTime(509L);
      Duration duration0 = new Duration(509L);
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period0 = new Period(dateTime0, duration0, periodType0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      PeriodType periodType0 = PeriodType.years();
      Period period0 = new Period(31083597720000L, 31083597720000L, periodType0, gregorianChronology0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = new Period((-226L), (-226L), (PeriodType) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes((-1322L));
      Instant instant0 = new Instant();
      Months months0 = Months.FIVE;
      PeriodType periodType0 = months0.getPeriodType();
      Period period0 = duration0.toPeriodTo((ReadableInstant) instant0, periodType0);
      Period period1 = period0.plus(months0);
      Period period2 = period1.normalizedStandard();
      assertNotSame(period0, period2);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = new Period();
      Minutes minutes0 = period0.ZERO.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Period period0 = new Period((Object) null, periodType0, buddhistChronology0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) iSOChronology0);
      Duration duration0 = new Duration(1440L);
      Period period0 = new Period(dateMidnight0, duration0);
      Seconds seconds0 = period0.toStandardSeconds();
      assertEquals(1, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = Period.days(109);
      Duration duration0 = period0.toStandardDuration();
      assertEquals(9417600000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = Period.months(1785);
      Period period1 = period0.normalizedStandard();
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      PeriodType periodType0 = PeriodType.months();
      Period period0 = new Period(localDateTime0, localDateTime0, periodType0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = new Period((-226L), (-226L));
      Period period1 = period0.withPeriodType((PeriodType) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Instant instant0 = Instant.now();
      Period period0 = new Period(instant0, instant0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = Period.months(1785);
      Weeks weeks0 = period0.ZERO.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      // Undeclared exception!
      try { 
        period0.minusMinutes((-1186));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Duration duration0 = new Duration(1000000000000L);
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) null);
      Period period0 = duration0.toPeriodTo((ReadableInstant) mutableDateTime0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Period period0 = Period.weeks(0);
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 1, 0, 0, 1, 0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = Period.millis(118);
      Period period1 = period0.withFields((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Period period0 = new Period(870L, 870L, gJChronology0);
      Period period1 = period0.toPeriod();
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.withMillis((-128));
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Duration duration0 = new Duration(1400L, 1400L);
      DateTime dateTime0 = DateTime.now();
      MutablePeriod mutablePeriod0 = new MutablePeriod(duration0, dateTime0);
      Period period0 = mutablePeriod0.toPeriod();
      Period period1 = period0.minusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      Period period0 = new Period(24L, periodType0);
      Period period1 = period0.negated();
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Period period0 = Period.ZERO;
      Days days0 = period0.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Period period0 = Period.years(154);
      Period period1 = period0.normalizedStandard((PeriodType) null);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Hours hours0 = period0.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Period period0 = new Period(40, 40, 40, 40, 40, 1119, (-2656), 2508, (PeriodType) null);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Period period0 = Period.hours((-2014));
      Period period1 = period0.minusYears((-2014));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Duration duration0 = new Duration(1400L, (-18L));
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      Period period0 = new Period(duration0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = new Period(localDateTime0, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      // Undeclared exception!
      try { 
        Period.parse("org.joda.time.format.DateTimeFormatter");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.format.DateTimeFor...\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.ZERO.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.dayTime();
      Period period1 = period0.withPeriodType(periodType0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.withSeconds(43);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Period period0 = Period.seconds((-295));
      Period period1 = period0.withWeeks((-295));
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.ZERO.withHours(1525);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.ZERO.minusMillis(2805);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Period period0 = Period.fieldDifference(localDateTime0, localDateTime0);
      Period period1 = period0.ZERO.withMinutes((-904));
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.ZERO.withDays((-6));
      assertNotSame(period1, period0);
  }
}
