/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:58:21 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Years years0 = Years.ONE;
      int[] intArray0 = gJChronology0.get((ReadablePeriod) years0, 1L, (-12244089597048L));
      assertArrayEquals(new int[] {(-388)}, intArray0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Months months0 = Months.FOUR;
      int[] intArray0 = gJChronology0.get((ReadablePeriod) months0, (-28810944002739L), (-63051004742213L));
      assertArrayEquals(new int[] {(-13019)}, intArray0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Months months0 = Months.SIX;
      long long0 = gJChronology0.add((ReadablePeriod) months0, (-62134732799989L), 2237);
      assertEquals((-26837740799989L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Months months0 = Months.FOUR;
      long long0 = gJChronology0.add((ReadablePeriod) months0, (long) (-2739), (-2739));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-28810944002739L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      LocalDate localDate0 = LocalDate.now((Chronology) lenientChronology0);
      LocalDate localDate1 = localDate0.withMonthOfYear(100);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertNotSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Months months0 = Months.ONE;
      int[] intArray0 = gJChronology0.get((ReadablePeriod) months0, (-72028825199982L), (-12219292800000L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertArrayEquals(new int[] {22743}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Instant instant0 = new Instant(31536000000L);
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      YearMonth yearMonth0 = new YearMonth(instant0, gJChronology0);
      YearMonth yearMonth1 = yearMonth0.minusMonths(1);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(1970, yearMonth1.getYear());
      assertEquals(12, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Instant instant0 = new Instant(1199L);
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      DateMidnight dateMidnight0 = new DateMidnight(1199L, (Chronology) gJChronology0);
      assertEquals(0L, dateMidnight0.getMillis());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Instant instant0 = new Instant((-63161411903999888L));
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      DateMidnight dateMidnight0 = new DateMidnight((-63161411903999888L), (Chronology) gJChronology0);
      assertEquals((-63162676281600000L), dateMidnight0.getMillis());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldType0, 0, gJChronology0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(9223372036854775807L, 10, (-803), 10, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 10 for hourOfDay is not supported
         //
         verifyException("org.joda.time.chrono.GJChronology$CutoverField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-12219292800000L));
      long long0 = gJChronology0.set(localDateTime0, 1073741823L);
      assertEquals((-12219292800000L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = YearMonth.now((Chronology) gJChronology0);
      Period period0 = Period.weeks(0);
      YearMonth yearMonth1 = yearMonth0.plus(period0);
      assertEquals(2014, yearMonth1.getYear());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) dateMidnight0, 1);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[UTC,cutover=2014-02-13T23:00:00.000Z,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateMidnight0);
      String string0 = gJChronology1.toString();
      assertEquals("GJChronology[UTC,cutover=2014-02-14]", string0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      DateMidnight dateMidnight0 = new DateMidnight();
      GJChronology gJChronology1 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) dateMidnight0);
      String string0 = gJChronology1.toString();
      assertEquals("GJChronology[Europe/Amsterdam,cutover=2014-02-13T23:00:00.000Z]", string0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.getDateTimeMillis(1, 1, 1, 1, 1, 1, 1);
      assertEquals((-62135765938999L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((Chronology) gJChronology0);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(1392332400000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      try { 
        gJChronology0.getDateTimeMillis(2, 2, 41, 2, 2, 41, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 41 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(39, 39, 39, 39, 39, 39, 39);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 39 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      try { 
        gJChronology0.getDateTimeMillis(29, 2, 29, 2, 29, 2, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 29 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((-79271567942213L), (Chronology) gJChronology0);
      LocalDateTime localDateTime1 = new LocalDateTime(localDateTime0);
      assertTrue(localDateTime1.equals((Object)localDateTime0));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(2120, 12, 12, 2120);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(4763401202120L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Instant instant0 = new Instant(1217L);
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      YearMonth yearMonth0 = new YearMonth(instant0, gJChronology0);
      // Undeclared exception!
      try { 
        yearMonth0.toInterval(dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Specified date does not exist
         //
         verifyException("org.joda.time.chrono.GJChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) null, 2292L, (-138));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -138
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(560);
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, (-12219292800000L), 560);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 560
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Years years0 = Years.THREE;
      long long0 = gJChronology0.add((ReadablePeriod) years0, (-12241482900886L), 1);
      assertEquals((-12147652500886L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Period period0 = new Period((-1773), 2301L, gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      MonthDay monthDay0 = MonthDay.now((Chronology) gJChronology0);
      Days days0 = Days.TWO;
      MonthDay monthDay1 = monthDay0.plus(days0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(16, monthDay1.getDayOfMonth());
      assertEquals(2, monthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      LocalDate localDate0 = LocalDate.now((Chronology) lenientChronology0);
      LocalDate localDate1 = localDate0.withWeekOfWeekyear(139);
      assertNotSame(localDate1, localDate0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((-1445L), (Chronology) gJChronology0);
      LocalDateTime localDateTime1 = new LocalDateTime((-79271567942213L), (Chronology) gJChronology0);
      localDateTime1.isEqual(localDateTime0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      gJChronology0.hashCode();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Instant instant0 = new Instant(2629800000L);
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      YearMonth yearMonth0 = new YearMonth(instant0, gJChronology0);
      YearMonth yearMonth1 = yearMonth0.minusMonths((-883));
      assertEquals(2043, yearMonth1.getYear());
      assertEquals(8, yearMonth1.getMonthOfYear());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = null;
      try {
        partial0 = new Partial(dateTimeFieldType0, 0, gJChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for year is not supported
         //
         verifyException("org.joda.time.field.SkipDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.julianToGregorianByWeekyear(10L);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-1209599990L), long0);
  }
}
