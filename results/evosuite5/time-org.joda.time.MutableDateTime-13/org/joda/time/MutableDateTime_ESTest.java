/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 19:12:40 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Interval;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.field.LenientDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableDateTime_ESTest extends MutableDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
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
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.property(dateTimeFieldType0);
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.add((DurationFieldType) null, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.MINUTES_TYPE;
      mutableDateTime0.add(durationFieldType0, (-158));
      assertEquals(1392399801320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.set((DateTimeFieldType) null, Integer.MIN_VALUE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      mutableDateTime0.set(dateTimeFieldType0, 371);
      assertEquals(1109041359681320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setZoneRetainFields((DateTimeZone) null);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight();
      LimitChronology limitChronology0 = LimitChronology.getInstance(ethiopicChronology0, (ReadableDateTime) null, dateMidnight0);
      Chronology chronology0 = limitChronology0.withUTC();
      assertNotSame(chronology0, limitChronology0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-95));
      mutableDateTime0.setZone(dateTimeZone0);
      assertEquals(0, MutableDateTime.ROUND_NONE);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      Seconds seconds0 = Seconds.secondsBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      mutableDateTime0.add((ReadablePeriod) seconds0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Duration duration0 = Duration.millis(0L);
      mutableDateTime0.add((ReadableDuration) duration0, 394);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      mutableDateTime0.setRounding(dateTimeField0, 5);
      assertEquals(5, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, buddhistChronology0);
      mutableDateTime0.setRounding(dateTimeField1, 4);
      assertEquals(4, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfEra();
      mutableDateTime0.setRounding(dateTimeField0, 3);
      assertEquals(3, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfEra();
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, (Chronology) null);
      mutableDateTime0.setRounding(dateTimeField1, 2);
      assertEquals(1420070400000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      // Undeclared exception!
      try { 
        mutableDateTime0.setRounding(dateTimeField0, 365);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal rounding mode: 365
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-897L));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      // Undeclared exception!
      try { 
        mutableDateTime0.setRounding(dateTimeField0, (-4086));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal rounding mode: -4086
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setRounding((DateTimeField) null, 0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
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
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = MutableDateTime.now(dateTimeZone0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.minuteOfDay();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfYear();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setMinuteOfHour(1);
      assertEquals(1392408081320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addWeeks(1915);
      assertEquals(2550597681320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.add((ReadableDuration) null);
      assertEquals(0, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime(432, 3, 3, 3, 5, 3, 3, islamicChronology0);
      assertEquals(2, MutableDateTime.ROUND_CEILING);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addMonths(1);
      assertEquals(1394828481320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setMillis((ReadableInstant) mutableDateTime0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.setWeekOfWeekyear((-727));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -727 for weekOfWeekyear must be in the range [1,52]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setDateTime(3, 3, 1, 3, 3, 1, 1);
      assertEquals((-62067417390999L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.setMonthOfYear((-2273));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2273 for monthOfYear must be in the range [1,12]
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
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addMillis(2);
      assertEquals(1392409281322L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((Object) null, (DateTimeZone) null);
      assertEquals(2, MutableDateTime.ROUND_CEILING);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekyear();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setDayOfYear(3);
      assertEquals(1388780481320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime mutableDateTime1 = mutableDateTime0.toMutableDateTimeISO();
      assertEquals(5, MutableDateTime.ROUND_HALF_EVEN);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.secondOfDay();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setTime((ReadableInstant) mutableDateTime0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setHourOfDay(5);
      assertEquals(1392351681320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.era();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.setMillisOfSecond((-720));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -720 for millisOfSecond must be in the range [0,999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      String string0 = mutableDateTime0.toString();
      assertEquals("2014-02-14T21:21:21.320+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) null);
      mutableDateTime0.setMillisOfDay(97);
      assertEquals(1392332400097L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableDateTime.parse("7% ?;I0&RbB#YhNa");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"7% ?;I0&RbB#YhNa\" is malformed at \"% ?;I0&RbB#YhNa\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setDayOfMonth(2);
      assertEquals(1391372481320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      MutableDateTime mutableDateTime0 = new MutableDateTime(3, 3, 3, 3, 3, 3, 3, dateTimeZone0);
      int int0 = mutableDateTime0.getRoundingMode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.setDayOfWeek((-1365));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1365 for dayOfWeek must be in the range [1,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.hourOfDay();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setSecondOfMinute(5);
      assertEquals(1392409265320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setMinuteOfDay(2);
      assertEquals(1392332541320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.millisOfSecond();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addMinutes(844);
      assertEquals(1392459921320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setDate(5, 5, 5);
      assertEquals((-61998577090680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addSeconds(1);
      assertEquals(1392409282320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime(1, 1, 1, 1, 1, 1, 1);
      assertEquals((-62135594310999L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      MutableDateTime mutableDateTime1 = new MutableDateTime(mutableDateTime0, buddhistChronology0);
      assertEquals(5, MutableDateTime.ROUND_HALF_EVEN);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addHours((-258));
      assertEquals(1391480481320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.secondOfMinute();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.add((ReadablePeriod) null);
      assertEquals(0, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.centuryOfEra();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setWeekyear(3);
      assertEquals((-62068647490680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addYears((-233));
      assertEquals((-5960314690680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight();
      LimitChronology limitChronology0 = LimitChronology.getInstance(ethiopicChronology0, (ReadableDateTime) null, dateMidnight0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) limitChronology0);
      MutableDateTime mutableDateTime1 = mutableDateTime0.copy();
      assertEquals(0, mutableDateTime1.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setDate((ReadableInstant) mutableDateTime0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.setTime((-1409), (-1409), (-1409), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1409 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeField dateTimeField0 = mutableDateTime0.getRoundingField();
      assertNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime mutableDateTime1 = new MutableDateTime(mutableDateTime0);
      assertEquals(4, MutableDateTime.ROUND_HALF_CEILING);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addDays(Integer.MIN_VALUE);
      assertEquals((-185541194775490680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setZone((DateTimeZone) null);
      assertEquals(1, MutableDateTime.ROUND_FLOOR);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setYear((-1305));
      assertEquals((-103345124290680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      mutableDateTime0.setRounding(dateTimeField0);
      assertEquals(1392408000000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setSecondOfDay(1);
      assertEquals(1392332401320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addWeekyears(85);
      assertEquals(4074697281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.millisOfDay();
      MutableDateTime mutableDateTime1 = mutableDateTime_Property0.roundHalfCeiling();
      assertEquals(1392409281320L, mutableDateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime(0L, dateTimeZone0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfWeek();
      mutableDateTime_Property0.addWrapField(3);
      assertEquals(259200000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfEra();
      mutableDateTime_Property0.roundHalfFloor();
      assertEquals(1388530800000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfWeek();
      mutableDateTime_Property0.add((-2050L));
      assertEquals(1215285681320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime(0L, dateTimeZone0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfMonth();
      // Undeclared exception!
      try { 
        mutableDateTime_Property0.set(2232);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2232 for dayOfMonth must be in the range [1,31]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.minuteOfHour();
      Interval interval0 = mutableDateTime_Property0.toInterval();
      assertEquals(1392409260000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      mutableDateTime_Property0.add(3);
      assertEquals(1487103681320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfEra();
      // Undeclared exception!
      try { 
        mutableDateTime_Property0.set("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\" for yearOfEra is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.year();
      Chronology chronology0 = mutableDateTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime(0L, dateTimeZone0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfMonth();
      mutableDateTime_Property0.roundFloor();
      assertEquals((-3600000L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfEra();
      mutableDateTime_Property0.roundCeiling();
      assertEquals(1420059600000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) null);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      MutableDateTime mutableDateTime1 = mutableDateTime_Property0.getMutableDateTime();
      assertEquals(2, MutableDateTime.ROUND_CEILING);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      mutableDateTime_Property0.roundHalfEven();
      assertEquals(1388530800000L, mutableDateTime0.getMillis());
  }
}
