/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 03:34:25 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime_ESTest extends LocalTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) islamicChronology0);
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      LocalTime.Property localTime_Property0 = new LocalTime.Property(localTime0, dateTimeField0);
      // Undeclared exception!
      try { 
        localTime_Property0.addNoWrapToCopy(2146324093);
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
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) islamicChronology0);
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      LocalTime.Property localTime_Property0 = new LocalTime.Property(localTime0, dateTimeField0);
      LocalTime localTime1 = localTime_Property0.addNoWrapToCopy(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Locale locale0 = Locale.ENGLISH;
      String string0 = localTime0.MIDNIGHT.toString((String) null, locale0);
      assertEquals("00:00:00.000", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Locale locale0 = Locale.JAPAN;
      try { 
        localTime0.toString("Zxb2g{;kWf", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: b
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.toString("22mQs[fDJ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      LocalTime.Property localTime_Property0 = localTime0.property(dateTimeFieldType0);
      assertNotNull(localTime_Property0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.property((DateTimeFieldType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      LocalTime.Property localTime_Property0 = localTime0.MIDNIGHT.property(dateTimeFieldType0);
      assertNotNull(localTime_Property0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.MIDNIGHT.minusMillis(0);
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.minusMillis(3025);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.minusSeconds(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.minusSeconds(1403);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.minusMinutes(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.minusMinutes(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.minusHours(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.minusHours(692);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.plusMillis(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.plusMillis((-7));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.MIDNIGHT.plusSeconds(0);
      assertFalse(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.plusSeconds(1000);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.MIDNIGHT.plusMinutes(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.plusMinutes(40);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.plusHours(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.plusHours(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Hours hours0 = Hours.hours(0);
      LocalTime localTime1 = localTime0.withPeriodAdded(hours0, 0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      LocalTime localTime1 = localTime0.withFieldAdded(durationFieldType0, 0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      // Undeclared exception!
      try { 
        localTime0.withFieldAdded(durationFieldType0, 17887500);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'centuries' is not supported
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.withFieldAdded((DurationFieldType) null, 4615);
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
      LocalTime localTime0 = new LocalTime();
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      LocalTime localTime1 = localTime0.withFieldAdded(durationFieldType0, 17);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      // Undeclared exception!
      try { 
        localTime0.withField(dateTimeFieldType0, (-206));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -206 for halfdayOfDay must be in the range [0,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localTime0.withField((DateTimeFieldType) null, (-1805));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      // Undeclared exception!
      try { 
        localTime0.withField(dateTimeFieldType0, 116);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'weekyearOfCentury' is not supported
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.MIDNIGHT.withFields((ReadablePartial) null);
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) gregorianChronology0);
      LocalTime localTime1 = localTime0.withFields(localTime0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = new LocalTime();
      int int0 = localTime0.compareTo((ReadablePartial) localTime1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 1);
      LocalTime localTime1 = new LocalTime();
      int int0 = localTime0.compareTo((ReadablePartial) localTime1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) islamicChronology0);
      LocalTime localTime1 = localTime0.withSecondOfMinute(1);
      boolean boolean0 = localTime1.isAfter(localTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.isBefore(localDateTime0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 1, 1, 1);
      int int0 = localTime0.compareTo((ReadablePartial) localTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalTime localTime0 = new LocalTime((Chronology) julianChronology0);
      boolean boolean0 = localTime0.MIDNIGHT.isAfter(localTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((Chronology) null);
      LocalTime localTime1 = new LocalTime();
      boolean boolean0 = localTime0.equals(localTime1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((Chronology) null);
      LocalTime localTime1 = LocalTime.MIDNIGHT;
      boolean boolean0 = localTime0.equals(localTime1);
      assertFalse(localTime1.equals((Object)localTime0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = LocalTime.fromMillisOfDay(1L, (Chronology) gregorianChronology0);
      boolean boolean0 = localTime0.equals(localTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      boolean boolean0 = localTime0.equals(buddhistChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      boolean boolean0 = localTime0.MIDNIGHT.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      boolean boolean0 = localTime0.isSupported((DateTimeFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
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
  public void test47()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.getValue(1020);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 1020
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.getField((-1591));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -1591
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
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
  public void test50()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      LocalTime localTime0 = LocalTime.fromDateFields(mockDate0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
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
  public void test52()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      LocalTime localTime0 = LocalTime.fromCalendarFields(calendar0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
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
  public void test54()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalTime localTime0 = LocalTime.now((Chronology) gJChronology0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
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
  public void test56()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        localTime0.withMinuteOfHour((-2615));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2615 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalTime localTime0 = new LocalTime(753L, (DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((long) 1);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      int int0 = localTime0.getHourOfDay();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      assertNotNull(localTime_Property0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      String string0 = localTime0.toString((String) null);
      assertEquals("21:21:21.320", string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.withMillisOfSecond(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      int int0 = localTime0.MIDNIGHT.getMillisOfSecond();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test64()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = new LocalTime(localTime0, (DateTimeZone) null);
      assertTrue(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.plus((ReadablePeriod) null);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      int int0 = localTime0.getSecondOfMinute();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      int int0 = localTime0.getMinuteOfHour();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.MIDNIGHT.withMillisOfDay(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test69()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      assertEquals(4, localTime0.size());
      
      LocalTime localTime1 = new LocalTime(localTime0);
      assertTrue(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      int int0 = localTime0.MIDNIGHT.getMillisOfDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Hours hours0 = Hours.ONE;
      LocalTime localTime1 = localTime0.minus(hours0);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay(0L);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      // Undeclared exception!
      try { 
        localTime0.withHourOfDay(2356);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2356 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalTime.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      DateTime dateTime0 = localTime0.toDateTimeToday();
      assertEquals(4, localTime0.size());
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) islamicChronology0);
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      LocalTime localTime1 = localTime_Property0.addWrapFieldToCopy(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.getLocalTime();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      LocalTime localTime1 = localTime_Property0.addCopy((-490L));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 1, 1, 1);
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      LocalTime localTime1 = localTime_Property0.roundHalfCeilingCopy();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.roundHalfEvenCopy();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      LocalTime localTime1 = localTime_Property0.roundCeilingCopy();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      LocalTime localTime1 = localTime_Property0.roundHalfFloorCopy();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      LocalTime localTime1 = localTime_Property0.addCopy(3419);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 1, 1);
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      // Undeclared exception!
      try { 
        localTime_Property0.setCopy("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\" for secondOfMinute is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalTime localTime0 = new LocalTime((Chronology) islamicChronology0);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.withMinimumValue();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      Chronology chronology0 = localTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0, 0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.withMaximumValue();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.MIDNIGHT.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.roundFloorCopy();
      assertNotSame(localTime0, localTime1);
  }
}
