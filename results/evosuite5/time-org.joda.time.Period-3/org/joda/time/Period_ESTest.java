/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:51:07 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
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
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.years((-25));
      PeriodType periodType0 = PeriodType.standard();
      Period period1 = period0.normalizedStandard(periodType0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.months(1);
      PeriodType periodType0 = PeriodType.millis();
      // Undeclared exception!
      try { 
        period0.normalizedStandard(periodType0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = new Period(47, 47, 47, 47, 47, 2840, 47, 2840);
      PeriodType periodType0 = PeriodType.yearWeekDay();
      // Undeclared exception!
      try { 
        period0.normalizedStandard(periodType0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = Period.years(102);
      // Undeclared exception!
      try { 
        period0.toStandardDays();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Days as this period contains years and years vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.months(53);
      // Undeclared exception!
      try { 
        period0.toStandardWeeks();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Weeks as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.weeks(3);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.minus((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(3493).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      Period period0 = periodFormatter0.parsePeriod("");
      Months months0 = Months.TWELVE;
      Period period1 = period0.minus(months0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.plusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = new Period(0L, 0L);
      Period period1 = period0.plusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.ZERO.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.hours(0);
      Period period1 = period0.minusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.ZERO.plusMonths(0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.ZERO.plus((ReadablePeriod) null);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.ZERO;
      Minutes minutes0 = Minutes.ONE;
      Period period1 = period0.plus(minutes0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      // Undeclared exception!
      try { 
        period0.ZERO.withFieldAdded((DurationFieldType) null, 140);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      Period period1 = period0.withFieldAdded(durationFieldType0, (-1104));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      // Undeclared exception!
      try { 
        period0.withField((DurationFieldType) null, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      // Undeclared exception!
      try { 
        period0.ZERO.withField(durationFieldType0, 4657);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'weekyears'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.withFields((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Weeks weeks0 = Weeks.standardWeeksIn(period0);
      Period period1 = period0.withFields(weeks0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.ZERO.withPeriodType((PeriodType) null);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[9];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
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
  public void test25()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Date date0 = localDateTime0.toDate();
      LocalTime localTime0 = LocalTime.fromDateFields(date0);
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
      LocalDate localDate0 = new LocalDate();
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        Period.fieldDifference(localTime0, localDate0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[0];
      int[] intArray0 = new int[5];
      PeriodType periodType0 = new PeriodType("Cannot have two adjacent separators", durationFieldTypeArray0, intArray0);
      Period period0 = new Period(dateTime0, dateTime0, periodType0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.ZERO.minusSeconds(952);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.ZERO.minusWeeks((-592));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusDays(328);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = new Period(8L);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = new Period(1235, (-754), (-80), (-80));
      DateMidnight dateMidnight0 = DateMidnight.now();
      Duration duration0 = period0.toDurationFrom(dateMidnight0);
      Period period1 = duration0.toPeriodFrom((ReadableInstant) dateMidnight0, (PeriodType) null);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Period period0 = new Period(0L, 0L, periodType0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Duration duration0 = period0.ZERO.toStandardDuration();
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      Period period0 = new Period((-3095L), (-3095L), periodType0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Duration duration0 = Duration.standardHours(62035200000L);
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period0 = duration0.toPeriodTo((ReadableInstant) null, periodType0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      Period period0 = new Period((-4294967296L), (Chronology) gregorianChronology0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Minutes minutes0 = period0.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      Weeks weeks0 = minutes0.toStandardWeeks();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      PeriodType periodType0 = PeriodType.yearDay();
      Period period0 = new Period(weeks0, periodType0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-506L));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(10000);
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      Period period0 = duration0.toPeriodFrom((ReadableInstant) dateTime0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Period period0 = Period.days(1);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      PeriodType periodType0 = PeriodType.minutes();
      Period period0 = new Period(localDate0, localDate0, periodType0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(3493).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      Period period0 = periodFormatter0.parsePeriod("");
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Instant instant0 = new Instant((Object) null);
      Period period0 = new Period(instant0, instant0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Period period0 = Period.seconds(0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Period period0 = Period.hours(0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Hours hours0 = period0.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) gJChronology0);
      Period period0 = new Period((ReadableDuration) null, mutableDateTime0);
      Period period1 = period0.multipliedBy(2);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      // Undeclared exception!
      try { 
        period0.minusHours((-1432));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Period period0 = Period.millis(0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Period period0 = Period.minutes(2);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.toPeriod();
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Period period0 = Period.weeks(3);
      Period period1 = period0.minusMinutes(2346);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Period period0 = new Period(0L, 1000L, julianChronology0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withMillis(9);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.ZERO.minusMonths(14);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Duration duration0 = Duration.millis((-1L));
      PeriodType periodType0 = PeriodType.years();
      Period period0 = duration0.toPeriod(periodType0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Seconds seconds0 = period0.ZERO.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      Period period0 = new Period(0, 0, 0, 0, 0, 0, 0, 0, periodType0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.minusYears(6);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Period period0 = new Period((Object) null, (Chronology) null);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = new Period(localDate0, localDate0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      // Undeclared exception!
      try { 
        Period.parse("x:b[|@- _r\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"x:b[|@- _r\"\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      PeriodType periodType0 = PeriodType.yearDay();
      Period period1 = period0.ZERO.withPeriodType(periodType0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      // Undeclared exception!
      try { 
        period0.withSeconds(2);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.ZERO.withWeeks(613);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.ZERO.withHours((-116));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.ZERO.minusMillis(3537);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Period period0 = Period.fieldDifference(localDate0, localDate0);
      Period period1 = period0.ZERO.withMinutes((-1443));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Period period0 = Period.years((-22));
      Period period1 = period0.withDays((-22));
      assertNotSame(period0, period1);
  }
}
