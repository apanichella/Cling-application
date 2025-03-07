/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 03:37:05 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime_ESTest extends LocalTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      // Undeclared exception!
      try { 
        localTime_Property0.addNoWrapToCopy(623191204);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The addition exceeded the boundaries of LocalTime
         //
         verifyException("org.joda.time.LocalTime$Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      try { 
        localTime0.toString("Invalid index: ", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      String string0 = localTime0.toString((String) null);
      assertEquals("00:00:00.000", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.toString("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern specification
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      LocalTime.Property localTime_Property0 = localTime0.property(dateTimeFieldType0);
      assertNotNull(localTime_Property0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localTime0.property((DateTimeFieldType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.minusMillis(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.MIDNIGHT.minusMillis(25734374);
      assertNotSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.minusSeconds(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.minusSeconds((-2117));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.minusMinutes(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      LocalTime localTime1 = localTime0.minusMinutes((-5));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.minusHours(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.minusHours(543);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.plusMillis(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.plusMillis((-71));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.plusSeconds(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      LocalTime localTime1 = localTime0.plusSeconds(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.plusMinutes(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.MIDNIGHT.plusHours(0);
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.plusHours(2036);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Minutes minutes0 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      Hours hours0 = minutes0.toStandardHours();
      LocalTime localTime1 = localTime0.withPeriodAdded(hours0, 0);
      assertSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      LocalTime localTime1 = localTime0.withFieldAdded(durationFieldType0, 2618);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      // Undeclared exception!
      try { 
        localTime0.withFieldAdded(durationFieldType0, (-2147483618));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'weeks' is not supported
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        localTime0.withFieldAdded((DurationFieldType) null, 667);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      LocalTime localTime1 = localTime0.withFieldAdded(durationFieldType0, 0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      // Undeclared exception!
      try { 
        localTime0.withField(dateTimeFieldType0, (-2147381390));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147381390 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.withField((DateTimeFieldType) null, (-3622));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.withFields((ReadablePartial) null);
      assertSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      LocalTime localTime1 = localTime0.withFields(localTime0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      LocalTime localTime1 = localTime0.plusMinutes(4);
      int int0 = localTime1.compareTo((ReadablePartial) localTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.plusMinutes(41);
      int int0 = localTime0.compareTo((ReadablePartial) localTime1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.plusMinutes(86400000);
      int int0 = localTime0.compareTo((ReadablePartial) localTime1);
      assertNotSame(localTime1, localTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.compareTo((ReadablePartial) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalTime localTime1 = new LocalTime((Chronology) buddhistChronology0);
      boolean boolean0 = localTime0.isAfter(localTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = LocalTime.now();
      boolean boolean0 = localTime0.equals(localTime1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      boolean boolean0 = localTime0.MIDNIGHT.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      boolean boolean0 = localTime0.MIDNIGHT.equals(localTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      boolean boolean0 = localTime0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      // Undeclared exception!
      try { 
        localTime0.withField(dateTimeFieldType0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'dayOfMonth' is not supported
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      boolean boolean0 = localTime0.isSupported((DateTimeFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test41()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = new LocalTime(localTime0);
      assertTrue(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.get((DateTimeFieldType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.getValue(100);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 100
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        localTime0.getFieldType(4691);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 4691
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalTime.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      LocalTime localTime0 = LocalTime.fromDateFields(mockDate0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalTime.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      LocalTime localTime0 = LocalTime.fromCalendarFields(calendar0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalTime.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalTime.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      LocalTime localTime1 = LocalTime.now((Chronology) buddhistChronology0);
      boolean boolean0 = localTime0.equals(localTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.withMinuteOfHour(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      LocalTime localTime1 = localTime_Property0.addNoWrapToCopy(1886);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime((long) 58, dateTimeZone0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.withSecondOfMinute((-30));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -30 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 1, 1);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(488L);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      int int0 = localTime0.MIDNIGHT.getHourOfDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Locale locale0 = Locale.ITALIAN;
      String string0 = localTime0.MIDNIGHT.toString((String) null, locale0);
      assertEquals("00:00:00.000", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.withMillisOfSecond(10);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      int int0 = localTime0.getMillisOfSecond();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalTime localTime0 = null;
      try {
        localTime0 = new LocalTime(dateTimeFieldType0, fixedDateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Months months0 = Months.FOUR;
      LocalTime localTime1 = localTime0.plus(months0);
      assertTrue(localTime1.equals((Object)localTime0));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      int int0 = localTime0.getSecondOfMinute();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      int int0 = localTime0.MIDNIGHT.getMinuteOfHour();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.withMillisOfDay(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      int int0 = localTime0.getMillisOfDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(10, 10);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.minus((ReadablePeriod) null);
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((-878L));
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.withHourOfDay(1281);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1281 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalTime.parse("Rk'");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Rk'\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      DateTime dateTime0 = localTime0.MIDNIGHT.toDateTimeToday();
      assertEquals(1392332400000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.MIDNIGHT.minuteOfHour();
      assertNotNull(localTime_Property0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.addWrapFieldToCopy(13);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      LocalTime localTime0 = LocalTime.parse("", dateTimeFormatter0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.getLocalTime();
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.addCopy((long) (-1153));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.roundHalfCeilingCopy();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.roundHalfEvenCopy();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((Object) null);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.roundCeilingCopy();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      LocalTime.Property localTime_Property0 = localTime0.property(dateTimeFieldType0);
      LocalTime localTime1 = localTime_Property0.roundHalfFloorCopy();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.addCopy(281);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      LocalTime.Property localTime_Property0 = localTime0.property(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        localTime_Property0.setCopy("The addition exceeded the boundaries of LocalTime");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"The addition exceeded the boundaries of LocalTime\" for hourOfHalfday is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime(4, 4, 4, 4, copticChronology0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.withMinimumValue();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      Chronology chronology0 = localTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.withMaximumValue();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      LocalTime localTime0 = LocalTime.now((Chronology) iSOChronology0);
      DateTimeField dateTimeField0 = localTime0.getField(2, (Chronology) iSOChronology0);
      LocalTime.Property localTime_Property0 = new LocalTime.Property(localTime0, dateTimeField0);
      LocalTime localTime1 = localTime_Property0.roundFloorCopy();
      assertNotSame(localTime1, localTime0);
  }
}
