/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 19:13:15 GMT 2019
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
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Interval;
import org.joda.time.MutableDateTime;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.FixedDateTimeZone;
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
      MutableDateTime mutableDateTime0 = new MutableDateTime((-3513L), (DateTimeZone) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.property(dateTimeFieldType0);
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.add((DurationFieldType) null, 561);
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
      MutableDateTime mutableDateTime0 = new MutableDateTime((-3513L), (DateTimeZone) null);
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      mutableDateTime0.add(durationFieldType0, 0);
      assertEquals((-3513L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.set((DateTimeFieldType) null, 2000);
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
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      mutableDateTime0.set(dateTimeFieldType0, 5);
      assertEquals(1392332400005L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      mutableDateTime0.setZoneRetainFields(dateTimeZone0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      mutableDateTime0.setZoneRetainFields(fixedDateTimeZone0);
      assertEquals(1392412881320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) copticChronology0);
      mutableDateTime0.setZone((DateTimeZone) null);
      assertEquals(3, MutableDateTime.ROUND_HALF_FLOOR);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.add((ReadablePeriod) null);
      assertEquals(0, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.add((ReadableDuration) null);
      assertEquals(2, MutableDateTime.ROUND_CEILING);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-3513L), (DateTimeZone) null);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      DateTimeField dateTimeField0 = partial0.getField(0, (Chronology) copticChronology0);
      mutableDateTime0.setRounding(dateTimeField0, 5);
      assertEquals(5, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-3513L), (DateTimeZone) null);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 1);
      DateTimeField dateTimeField0 = partial0.getField(0, (Chronology) copticChronology0);
      mutableDateTime0.setRounding(dateTimeField0, 4);
      assertEquals(4, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      mutableDateTime0.setRounding(dateTimeField0, 3);
      assertEquals(3, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      mutableDateTime0.setRounding(dateTimeField0, 2);
      assertEquals(2, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(2);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      mutableDateTime0.setRounding(dateTimeField0, 0);
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-3513L), (DateTimeZone) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      try { 
        mutableDateTime0.setRounding(dateTimeField0, 2000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal rounding mode: 2000
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      MutableDateTime mutableDateTime0 = new MutableDateTime(dateTimeZone0);
      // Undeclared exception!
      try { 
        mutableDateTime0.setRounding(dateTimeField0, (-774));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal rounding mode: -774
         //
         verifyException("org.joda.time.MutableDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setRounding((DateTimeField) null, 400);
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = MutableDateTime.now(dateTimeZone0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.minuteOfDay();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.year();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfYear();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfMonth();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setMinuteOfHour(2);
      assertEquals(1392408141320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addWeeks(129);
      assertEquals(1470424881320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      Duration duration0 = new Duration(mutableDateTime0, mutableDateTime0);
      mutableDateTime0.add((ReadableDuration) duration0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      MutableDateTime mutableDateTime0 = new MutableDateTime(1, 1, 1, 1, 1, 1, 609, islamicChronology0);
      assertEquals(0, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addMonths(7678125);
      assertEquals(20192910841281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTime dateTime0 = mutableDateTime0.toDateTimeISO();
      mutableDateTime0.setMillis((ReadableInstant) dateTime0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.setWeekOfWeekyear(452);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 452 for weekOfWeekyear must be in the range [1,52]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.setDateTime(326565, 326565, 326565, 326565, 3952, 3952, 3952);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 326565 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setMonthOfYear(3);
      assertEquals(1394828481320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addMillis(1000);
      assertEquals(1392409282320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime1 = new MutableDateTime(mutableDateTime0, dateTimeZone0);
      assertEquals(3, MutableDateTime.ROUND_HALF_FLOOR);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setDayOfYear(2);
      assertEquals(1388694081320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime mutableDateTime1 = mutableDateTime0.toMutableDateTimeISO();
      assertEquals(3, MutableDateTime.ROUND_HALF_FLOOR);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.secondOfDay();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) null);
      mutableDateTime0.setTime((ReadableInstant) dateMidnight0);
      assertEquals(1392332400000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setHourOfDay(2);
      assertEquals(1392340881320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.era();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-3513L), (DateTimeZone) null);
      mutableDateTime0.setMillisOfSecond(5);
      assertEquals((-3995L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      String string0 = mutableDateTime0.toString();
      assertEquals("2014-02-14T21:21:21.320+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setMillisOfDay(1968);
      assertEquals(1392332401968L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableDateTime.parse("minutes");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"minutes\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setDayOfMonth(5);
      assertEquals(1391631681320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-2457L));
      assertEquals(3, MutableDateTime.ROUND_HALF_FLOOR);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) null);
      int int0 = mutableDateTime0.getRoundingMode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.setDayOfWeek(1859);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1859 for dayOfWeek must be in the range [1,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.hourOfDay();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      // Undeclared exception!
      try { 
        mutableDateTime0.setSecondOfMinute((-773));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -773 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setMinuteOfDay(1);
      assertEquals(1392332481320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.millisOfSecond();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addMinutes(2691);
      assertEquals(1392570741320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setDate(4, 3, 2);
      assertEquals((-62035642690680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MutableDateTime mutableDateTime0 = new MutableDateTime(5, 5, 3, 0, 0, 0, 0, dateTimeZone0);
      assertEquals(2, MutableDateTime.ROUND_CEILING);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.millisOfDay();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addSeconds((-2244));
      assertEquals(1392407037320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime(1, 3, 2, 4, 0, 4, 2);
      assertEquals(3, MutableDateTime.ROUND_HALF_FLOOR);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = new MutableDateTime((Object) null, copticChronology0);
      assertEquals(3, MutableDateTime.ROUND_HALF_FLOOR);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addHours(0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.secondOfMinute();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      Duration duration0 = Duration.millis(5);
      Period period0 = new Period(mutableDateTime0, duration0);
      mutableDateTime0.add((ReadablePeriod) period0);
      assertEquals(1392409281325L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setWeekyear(1561);
      assertEquals((-12902641090680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addYears(26);
      assertEquals(2212863681320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime mutableDateTime1 = mutableDateTime0.copy();
      assertNotSame(mutableDateTime1, mutableDateTime0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) null);
      mutableDateTime0.setDate((ReadableInstant) dateMidnight0);
      assertEquals(1392409281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      // Undeclared exception!
      try { 
        mutableDateTime0.setTime(1679, 1679, 1679, 1679);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1679 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) copticChronology0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.minuteOfHour();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeField dateTimeField0 = mutableDateTime0.getRoundingField();
      assertNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((Object) null);
      assertEquals(4, MutableDateTime.ROUND_HALF_CEILING);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfWeek();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfEra();
      assertNotNull(mutableDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.addDays((-2690));
      assertEquals(1159989681320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setZone((DateTimeZone) null);
      assertEquals(1, MutableDateTime.ROUND_FLOOR);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.setYear(4);
      assertEquals((-62037111490680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      mutableDateTime0.setRounding(dateTimeField0);
      assertEquals(1, mutableDateTime0.getRoundingMode());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.setSecondOfDay(2000);
      assertEquals(1392334400320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.addWeekyears(2822);
      assertEquals(90446185281320L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) copticChronology0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.centuryOfEra();
      mutableDateTime_Property0.roundHalfCeiling();
      assertEquals(463701600000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) copticChronology0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      MutableDateTime mutableDateTime1 = mutableDateTime_Property0.addWrapField(0);
      assertEquals(1392409281320L, mutableDateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.monthOfYear();
      mutableDateTime_Property0.roundHalfFloor();
      assertEquals(1391209200000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-3513L), (DateTimeZone) null);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      MutableDateTime mutableDateTime1 = mutableDateTime_Property0.add(0L);
      assertEquals((-3513L), mutableDateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) copticChronology0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.centuryOfEra();
      mutableDateTime_Property0.set(1);
      assertEquals((-52255508290680L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) copticChronology0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      Interval interval0 = mutableDateTime_Property0.toInterval();
      assertEquals(1392595200000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-3513L), (DateTimeZone) null);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      mutableDateTime_Property0.add((-2792));
      assertEquals((-1688602775513L), mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekyear();
      // Undeclared exception!
      try { 
        mutableDateTime_Property0.set("org.joda.time.format.DateTimeFormatterBuilder$Fraction");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"org.joda.time.format.DateTimeFormatterBuilder$Fraction\" for weekyear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      Chronology chronology0 = mutableDateTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      mutableDateTime_Property0.roundFloor();
      assertEquals(1391986800000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) copticChronology0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      mutableDateTime_Property0.roundCeiling();
      assertEquals(1392595200000L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-3513L), (DateTimeZone) null);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      MutableDateTime mutableDateTime1 = mutableDateTime_Property0.getMutableDateTime();
      assertEquals(0, MutableDateTime.ROUND_NONE);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((-3513L), (DateTimeZone) null);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      mutableDateTime_Property0.roundHalfEven();
      assertEquals((-3600000L), mutableDateTime0.getMillis());
  }
}
