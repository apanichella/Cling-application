/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 19:24:13 GMT 2019
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
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime_ESTest extends LocalTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      // Undeclared exception!
      try { 
        localTime_Property0.addNoWrapToCopy(76881320);
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
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalTime localTime0 = LocalTime.now((Chronology) buddhistChronology0);
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      LocalTime localTime1 = localTime_Property0.addNoWrapToCopy(1);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Locale locale0 = Locale.forLanguageTag("");
      String string0 = localTime0.MIDNIGHT.toString((String) null, locale0);
      assertEquals("00:00:00.000", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      try { 
        localTime0.toString("org.joda.time.chrono.GregorianChronology", (Locale) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localTime0.toString("The date must not be null");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
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
  public void test06()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(0L, (Chronology) iSOChronology0);
      LocalTime localTime1 = localTime0.minusMillis(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.minusMillis((-661));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.MIDNIGHT.minusSeconds(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.minusSeconds((-985));
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
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.MIDNIGHT.minusMinutes((-1));
      assertFalse(localTime1.equals((Object)localTime0));
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
      LocalTime localTime1 = localTime0.plusMillis(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.plusMillis(3342);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.plusSeconds(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.plusSeconds(874);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.plusMinutes(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.plusHours(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(0L, (Chronology) iSOChronology0);
      LocalTime localTime1 = localTime0.plusHours((-676));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 1, 1);
      Months months0 = Months.SEVEN;
      LocalTime localTime1 = localTime0.MIDNIGHT.withPeriodAdded(months0, 0);
      assertFalse(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      LocalTime localTime1 = localTime0.withFieldAdded(durationFieldType0, 3055);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      // Undeclared exception!
      try { 
        localTime0.withFieldAdded(durationFieldType0, 12825000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'months' is not supported
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localTime0.withFieldAdded((DurationFieldType) null, (-1059));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      LocalTime localTime1 = localTime0.MIDNIGHT.withFieldAdded(durationFieldType0, 0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      LocalTime localTime1 = localTime0.withField(dateTimeFieldType0, 13);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.withField((DateTimeFieldType) null, 1687);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      LocalTime localTime1 = localTime0.withField(dateTimeFieldType0, 19);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.MIDNIGHT.withFields((ReadablePartial) null);
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.withFields(localTime0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = LocalTime.now();
      boolean boolean0 = localTime1.isAfter(localTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.minusHours(2147483618);
      int int0 = localTime0.compareTo((ReadablePartial) localTime1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LocalTime localTime1 = new LocalTime(76878320L, (Chronology) gregorianChronology0);
      boolean boolean0 = localTime0.MIDNIGHT.isBefore(localTime1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
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
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.plusMinutes((-1610));
      int int0 = localTime0.compareTo((ReadablePartial) localTime1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = new LocalTime();
      boolean boolean0 = localTime0.equals(localTime1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = LocalTime.now();
      boolean boolean0 = localTime0.equals(localTime1);
      assertFalse(boolean0);
      assertFalse(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      boolean boolean0 = localTime0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null);
      LocalTime localTime1 = new LocalTime(0L, (Chronology) ethiopicChronology0);
      boolean boolean0 = localTime0.equals(localTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      boolean boolean0 = localTime0.MIDNIGHT.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.property(dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'era' is not supported
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      boolean boolean0 = localTime0.isSupported((DateTimeFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = new LocalTime(localTime0);
      assertTrue(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
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
  public void test44()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localTime0.getValue((-1318));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -1318
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localTime0.MIDNIGHT.getField(2478);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 2478
         //
         verifyException("org.joda.time.LocalTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
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
  public void test47()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      LocalTime localTime0 = LocalTime.fromDateFields(mockDate0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
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
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        localTime0.withMinuteOfHour(2052);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2052 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1258L, (DateTimeZone) null);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localTime0.withSecondOfMinute(3342);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3342 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay(1126L);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      int int0 = localTime0.MIDNIGHT.getHourOfDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      String string0 = localTime0.MIDNIGHT.toString((String) null);
      assertEquals("00:00:00.000", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.MIDNIGHT.withMillisOfSecond(117);
      assertNotSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      int int0 = localTime0.MIDNIGHT.getMillisOfSecond();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      LocalTime localTime0 = null;
      try {
        localTime0 = new LocalTime(dateTimeFieldType0, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Hours hours0 = Hours.MIN_VALUE;
      LocalTime localTime1 = localTime0.MIDNIGHT.plus(hours0);
      assertFalse(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      int int0 = localTime0.getSecondOfMinute();
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      int int0 = localTime0.MIDNIGHT.getMinuteOfHour();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime localTime1 = localTime0.withMillisOfDay(3342);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      int int0 = localTime0.MIDNIGHT.getMillisOfDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalTime localTime0 = LocalTime.now((DateTimeZone) fixedDateTimeZone0);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(4, 4);
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      // Undeclared exception!
      try { 
        localTime0.withHourOfDay((-350));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -350 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalTime.parse((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      DateTime dateTime0 = localTime0.toDateTimeToday();
      assertEquals(1392332400000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime localTime1 = localTime0.minus((ReadablePeriod) null);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((Object) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      LocalTime.Property localTime_Property0 = new LocalTime.Property(localTime0, dateTimeField0);
      LocalTime localTime1 = localTime_Property0.addWrapFieldToCopy(1);
      assertTrue(localTime1.equals((Object)localTime0));
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalTime localTime0 = LocalTime.now((Chronology) iSOChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(iSOChronology0);
      LocalTime.Property localTime_Property0 = new LocalTime.Property(localTime0, dateTimeField0);
      LocalTime localTime1 = localTime_Property0.getLocalTime();
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 0, 3525);
      LocalTime localTime0 = LocalTime.fromCalendarFields(mockGregorianCalendar0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      LocalTime.Property localTime_Property0 = localTime0.property(dateTimeFieldType0);
      LocalTime localTime1 = localTime_Property0.addCopy(1385L);
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1126L);
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.roundHalfCeilingCopy();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalTime localTime0 = LocalTime.now((Chronology) iSOChronology0);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.roundHalfEvenCopy();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      LocalTime localTime0 = LocalTime.fromMillisOfDay(0L, (Chronology) iSOChronology0);
      LocalTime.Property localTime_Property0 = localTime0.MIDNIGHT.millisOfSecond();
      LocalTime localTime1 = localTime_Property0.roundCeilingCopy();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.roundHalfFloorCopy();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      LocalTime localTime1 = localTime_Property0.addCopy(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 1, 1);
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      // Undeclared exception!
      try { 
        localTime_Property0.setCopy("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\" for millisOfDay is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.withMinimumValue();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      Chronology chronology0 = localTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.withMaximumValue();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.roundFloorCopy();
      assertSame(localTime1, localTime0);
  }
}
