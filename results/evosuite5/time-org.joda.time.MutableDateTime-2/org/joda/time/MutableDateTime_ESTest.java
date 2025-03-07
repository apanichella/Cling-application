/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 03:22:17 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Interval;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableDateTime_ESTest extends MutableDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.property((DateTimeFieldType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.add((DurationFieldType) null, (-1797));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      mutableDateTime0.add(durationFieldType0, 366);
      assertEquals(1613766081320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.set((DateTimeFieldType) null, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      // Undeclared exception!
      try { 
        mutableDateTime0.set(dateTimeFieldType0, 3600000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3600000 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      mutableDateTime0.setZoneRetainFields(dateTimeZone0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      mutableDateTime0.setZone(dateTimeZone0);
      assertEquals(0, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      mutableDateTime0.setZone(dateTimeZone0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      Period period0 = Period.years(3);
      mutableDateTime0.add((ReadablePeriod) period0);
      assertEquals(1487103681320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      Duration duration0 = Duration.ZERO;
      mutableDateTime0.add((ReadableDuration) duration0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      mutableDateTime0.setRounding(dateTimeField0, 5);
      assertEquals(1392408000000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      mutableDateTime0.setRounding(dateTimeField0, 4);
      assertEquals(1388530800000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      mutableDateTime0.setRounding(dateTimeField0, 2);
      assertEquals(1392411600000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      mutableDateTime0.setRounding(dateTimeField0, 1);
      assertEquals(1, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      mutableDateTime0.setRounding(dateTimeField0, 0);
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      try { 
        mutableDateTime0.setRounding(dateTimeField0, 173);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal rounding mode: 173
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      try { 
        mutableDateTime0.setRounding(dateTimeField0, (-1741));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal rounding mode: -1741
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfHalfday();
      mutableDateTime0.setRounding(dateTimeField0, 3);
      assertEquals(3, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableDateTime.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableDateTime.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.year();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfYear();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setMinuteOfHour(0);
      assertEquals(1392408021320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addWeeks(2);
      assertEquals(1393618881320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.add((ReadableDuration) null);
      assertEquals(5, MutableDateTime.ROUND_HALF_EVEN);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      MutableDateTime mutableDateTime0 = new MutableDateTime(5, 4, 3, 5, 5, 1, 1, gJChronology0);
      assertEquals(2, MutableDateTime.ROUND_CEILING);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addMonths(5);
      assertEquals(1405365681320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTime dateTime0 = new DateTime(5, 5, 1, 5, 1, 2);
      mutableDateTime0.setMillis((ReadableInstant) dateTime0);
      assertEquals((-61998981510000L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setWeekOfWeekyear(4);
      assertEquals(1390594881320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.setDateTime((-1123), 5, 5, 5, (-1123), 5, (-1123));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1123 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime mutableDateTime1 = mutableDateTime0.toMutableDateTime();
      assertNotSame(mutableDateTime0, mutableDateTime1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.setMonthOfYear(356);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 356 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.monthOfYear();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addMillis(8);
      assertEquals(1392409281328L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime mutableDateTime1 = new MutableDateTime(mutableDateTime0, (DateTimeZone) null);
      assertEquals(4, MutableDateTime.ROUND_HALF_CEILING);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.setDayOfYear(1589);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1589 for dayOfYear must be in the range [1,365]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.secondOfDay();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setTime((ReadableInstant) mutableDateTime0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setHourOfDay(0);
      assertEquals(1392333681320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.era();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.setMillisOfSecond((-276));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -276 for millisOfSecond must be in the range [0,999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      String string0 = mutableDateTime0.toString();
      assertEquals("2014-02-14T21:21:21.320+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setMillisOfDay(2);
      assertEquals(1392332400002L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableDateTime.parse("O8B(l^JfHP");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"O8B(l^JfHP\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.setDayOfMonth((-3905));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -3905 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      int int0 = mutableDateTime0.getRoundingMode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setDayOfWeek(4);
      assertEquals(1392322881320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.hourOfDay();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setSecondOfMinute(5);
      assertEquals(1392409265320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.setMinuteOfDay(20503125);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 20503125 for minuteOfDay must be in the range [0,1439]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.millisOfSecond();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addMinutes(2);
      assertEquals(1392409401320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.setDate(4, 4, (-1213));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1213 for dayOfMonth must be in the range [1,30]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime(1, 3, 4, 4, 1, 2, 5, dateTimeZone0);
      assertEquals((-62130226709995L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addSeconds(2);
      assertEquals(1392409283320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime(0, 1, 5, 4, 0, 0, 2);
      assertEquals(1, MutableDateTime.ROUND_FLOOR);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((Object) null, (Chronology) null);
      assertEquals(4, MutableDateTime.ROUND_HALF_CEILING);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addHours(2);
      assertEquals(1392416481320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.secondOfMinute();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.add((ReadablePeriod) null);
      assertEquals(4, MutableDateTime.ROUND_HALF_CEILING);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setWeekyear(0);
      assertEquals((-62162996290680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-569L));
      mutableDateTime0.addYears(1208);
      assertEquals(38120803199431L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime mutableDateTime1 = mutableDateTime0.copy();
      assertEquals(4, MutableDateTime.ROUND_HALF_CEILING);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setDate((ReadableInstant) mutableDateTime0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setTime(3, 4, 3, 3);
      assertEquals(1392343443003L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.minuteOfHour();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeField dateTimeField0 = mutableDateTime0.getRoundingField();
      assertNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime mutableDateTime1 = new MutableDateTime(mutableDateTime0);
      assertEquals(1, MutableDateTime.ROUND_FLOOR);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfWeek();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfEra();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addDays(432);
      assertEquals(1429730481320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      mutableDateTime0.setZoneRetainFields(dateTimeZone0);
      assertEquals(1392402081320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setYear(537);
      assertEquals((-45217191490680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setRounding((DateTimeField) null);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setSecondOfDay(3);
      assertEquals(1392332403320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addWeekyears(1);
      assertEquals(1423858881320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.millisOfDay();
      MutableDateTime mutableDateTime1 = mutableDateTime_Property0.roundHalfCeiling();
      assertEquals(1392409281320L, mutableDateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-539L));
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.centuryOfEra();
      mutableDateTime_Property0.addWrapField(4);
      assertEquals(12622780799461L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-539L));
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.centuryOfEra();
      mutableDateTime_Property0.roundHalfFloor();
      assertEquals(946681200000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-539L));
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.centuryOfEra();
      mutableDateTime_Property0.add((-683L));
      assertEquals((-2155339754372539L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.minuteOfDay();
      mutableDateTime_Property0.set(0);
      assertEquals(1392332421320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekyear();
      Interval interval0 = mutableDateTime_Property0.toInterval();
      assertEquals(1388358000000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) gregorianChronology0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.property(dateTimeFieldType0);
      mutableDateTime_Property0.add(3);
      assertEquals(1487362881320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.property(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        mutableDateTime_Property0.set("-B");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"-B\" for year is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      Chronology chronology0 = mutableDateTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      mutableDateTime_Property0.roundFloor();
      assertEquals(1388530800000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MutableDateTime mutableDateTime0 = MutableDateTime.now(dateTimeZone0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      mutableDateTime_Property0.roundCeiling();
      assertEquals(1420070400000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MutableDateTime mutableDateTime0 = MutableDateTime.now(dateTimeZone0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      MutableDateTime mutableDateTime1 = mutableDateTime_Property0.getMutableDateTime();
      assertEquals(1392409281320L, mutableDateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(islamicChronology0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(1336L, (Chronology) strictChronology0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfMonth();
      MutableDateTime mutableDateTime1 = mutableDateTime_Property0.roundHalfEven();
      assertSame(mutableDateTime0, mutableDateTime1);
  }
}
