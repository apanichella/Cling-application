/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 22:03:13 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      dateTimeField0.getMinimumValue((-12219292800109L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      dateTimeField0.getMinimumValue((-25907382000821L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      long long0 = dateTimeField0.getDifferenceAsLong((-12219638400006L), (-12219638400006L));
      assertEquals(0L, long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      long long0 = dateTimeField0.getDifferenceAsLong((-12219292800118L), (-12219292800118L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(2);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.getDifferenceAsLong(2, (-24771311999999L));
      assertEquals(9419L, long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      long long0 = dateTimeField0.getDifferenceAsLong((-12219638400006L), (-12219292800102L));
      assertEquals(0L, long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Period period0 = Period.years(1);
      long long0 = buddhistChronology0.add((ReadablePeriod) period0, (-12219638400000L), 1);
      assertEquals((-12188966400000L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Period period0 = new Period(1, 1, 1, 1, 1, 1, 1, 1);
      long long0 = buddhistChronology0.add((ReadablePeriod) period0, (long) (-938), (-938));
      assertEquals((-32718448419876L), long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      LocalDate localDate0 = new LocalDate(1117L, (Chronology) lenientChronology0);
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime();
      assertEquals(73281320L, dateTime0.getMillis());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-62104060800052L), 1, gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-1399L), (-62104060799982L), gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-61895893911992L), (-12219292800000L), gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = gJChronology0.minuteOfHour();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.roundHalfFloor((-12219292800154L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-12219292800000L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.roundHalfFloor((-12219302318675L));
      assertEquals((-12219033600000L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      long long0 = dateTimeField0.roundHalfFloor((-12219292800109L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-12219639572000L), long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      LocalDateTime localDateTime0 = new LocalDateTime();
      int[] intArray0 = new int[3];
      intArray0[0] = 1103;
      intArray0[1] = 335;
      // Undeclared exception!
      try { 
        dateTimeField0.getMaximumValue((ReadablePartial) localDateTime0, intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.addWrapField((-30356982000129L), 51);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-30326137200129L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.addWrapField((-4296L), 2);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(1209595704L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.addWrapField((-12219292800000L), (-1473));
      assertEquals((-12215664000000L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = gJChronology0.dayOfMonth();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, fixedDateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.addWrapField((-12219292800000L), 26);
      assertEquals((-12218515200000L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      dateTimeField0.getLeapAmount((-1L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      dateTimeField0.getLeapAmount((-29599612680928L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      dateTimeField0.isLeap(3599276L);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      dateTimeField0.isLeap((-12219272346680L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      long long0 = dateTimeField0.set((long) 3, "5");
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(10368000003L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      long long0 = dateTimeField0.set((-14958603628115L), "5");
      assertEquals((-14977093228115L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDate localDate0 = new LocalDate((-12219301146703L));
      // Undeclared exception!
      try { 
        gJChronology0.set(localDate0, (-12219301146703L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 14 for dayOfMonth is not supported
         //
         verifyException("org.joda.time.chrono.GJChronology$CutoverField", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      MonthDay monthDay0 = new MonthDay((Chronology) gJChronology0);
      PeriodType periodType0 = PeriodType.standard();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-62032867199996L), periodType0, (Chronology) gJChronology0);
      MonthDay monthDay1 = monthDay0.plus(mutablePeriod0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(14, monthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      Locale locale0 = Locale.forLanguageTag("");
      String string0 = dateTimeField0.getAsShortText((-2478L), locale0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      Locale locale0 = Locale.CHINA;
      String string0 = dateTimeField0.getAsShortText((-9223372036854775808L), locale0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals("\u5341\u4E8C\u6708", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      String string0 = dateTimeField0.getAsText((-2160L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      Locale locale0 = Locale.FRENCH;
      String string0 = dateTimeField0.getAsText((-30356982000129L), locale0);
      assertEquals("2", string0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTime dateTime0 = new DateTime(0L, (Chronology) buddhistChronology0);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[Europe/Amsterdam,cutover=1970-01-01]", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (long) 1, 1);
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[Europe/Amsterdam,cutover=1970-01-01T00:00:00.001Z,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      String string0 = gJChronology0.toString();
      assertEquals("GJChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(11, 11, 11, 11, 11, 11, 11);
      assertEquals((-61793068100989L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(2, 2, 29, 2, 29, 2, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 29 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(2, 2, (-6), 2, (-6), 2, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -6 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      try { 
        gJChronology0.getDateTimeMillis(3, 3, 3, 3, 3, (-2147483421), 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147483421 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) gJChronology0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateMidnight dateMidnight0 = localDate0.toDateMidnight(dateTimeZone0);
      assertEquals(1392332400000L, dateMidnight0.getMillis());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(1, 1, 1, 1);
      assertEquals((-62135770771999L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(3475, 8, 8, 8);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(47512130400008L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (long) 1, 1);
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      long long0 = dateTimeField0.roundHalfFloor(2224L);
      assertEquals(1, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (-12219292800000L), 2);
      assertEquals(2, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-117936000000L), (-12219302318647L), buddhistChronology0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      long long0 = dateTimeField0.getDifferenceAsLong(730L, 730L);
      assertEquals(0L, long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      Locale locale0 = Locale.GERMANY;
      String string0 = dateTimeField0.getAsText(74, locale0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals("74", string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      LocalDate localDate0 = new LocalDate((-12219292800000L), (Chronology) lenientChronology0);
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime();
      assertEquals((-12219217090680L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      MonthDay monthDay0 = new MonthDay((Chronology) gJChronology0);
      MonthDay monthDay1 = monthDay0.plusDays(1);
      assertEquals(2, monthDay1.getMonthOfYear());
      assertEquals(15, monthDay1.getDayOfMonth());
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      Locale locale0 = Locale.JAPANESE;
      dateTimeField0.getMaximumTextLength(locale0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      Partial partial0 = new Partial();
      int int0 = dateTimeField0.getMaximumValue((ReadablePartial) partial0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(53, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      Locale locale0 = Locale.JAPANESE;
      dateTimeField0.getMaximumShortTextLength(locale0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      dateTimeField0.getMinimumValue((ReadablePartial) yearMonth0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth(2, 2);
      yearMonth0.withChronologyRetainFields(gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      Locale locale0 = Locale.FRANCE;
      String string0 = dateTimeField0.getAsShortText(408, locale0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals("408", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null);
      gJChronology0.equals(gJChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      LocalDate localDate0 = new LocalDate((-12217820399985L), (Chronology) gJChronology0);
      DateTime dateTime0 = localDate0.toDateTimeAtCurrentTime();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-12217748290680L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      gJChronology0.hashCode();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = gJChronology0.weekyear();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, fixedDateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.roundHalfFloor((-12219292800076L));
      assertEquals((-12212380800000L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTime dateTime0 = new DateTime(0L, (Chronology) ethiopicChronology0);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0);
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertSame(gJChronology1, gJChronology0);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((-2577L), (Chronology) gJChronology0);
      LocalDate localDate1 = localDate0.withWeekyear(128);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertNotSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.monthOfYear();
      long long0 = dateTimeField0.set((-12219292800065L), "5");
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-12231648000065L), long0);
  }
}
