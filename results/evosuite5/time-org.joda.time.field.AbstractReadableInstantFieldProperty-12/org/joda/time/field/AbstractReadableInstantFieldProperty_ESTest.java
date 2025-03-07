/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:29:25 GMT 2019
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractReadableInstantFieldProperty_ESTest extends AbstractReadableInstantFieldProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfMonth();
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.yearOfEra();
      LocalDateTime localDateTime1 = localDateTime_Property0.roundHalfFloorCopy();
      LocalDateTime.Property localDateTime_Property1 = localDateTime1.dayOfMonth();
      boolean boolean0 = dateMidnight_Property0.equals(localDateTime_Property1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfMonth();
      DateMidnight.Property dateMidnight_Property1 = dateMidnight0.dayOfMonth();
      boolean boolean0 = dateMidnight_Property0.equals(dateMidnight_Property1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfMonth();
      DateMidnight.Property dateMidnight_Property1 = dateMidnight0.dayOfWeek();
      boolean boolean0 = dateMidnight_Property0.equals(dateMidnight_Property1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfMonth();
      boolean boolean0 = dateMidnight_Property0.equals(dateTimeZone0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfMonth();
      DateMidnight.Property dateMidnight_Property1 = dateMidnight0.dayOfWeek();
      boolean boolean0 = dateMidnight_Property0.equals(dateMidnight_Property1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      LocalTime localTime1 = localTime_Property0.setCopy(0);
      int int0 = localTime_Property0.compareTo((ReadablePartial) localTime1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      int int0 = localTime_Property0.compareTo((ReadablePartial) localTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      LocalTime localTime0 = LocalTime.fromCalendarFields(mockGregorianCalendar0);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      // Undeclared exception!
      try { 
        localTime_Property0.compareTo((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.field.AbstractReadableInstantFieldProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(63158400000L);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.year();
      LocalDate localDate0 = new LocalDate();
      int int0 = dateMidnight_Property0.compareTo((ReadablePartial) localDate0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime localTime1 = localTime0.plusMillis((-946));
      LocalTime.Property localTime_Property0 = localTime1.minuteOfHour();
      DateTime dateTime0 = DateTime.now();
      int int0 = localTime_Property0.compareTo((ReadableInstant) dateTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      DateTime dateTime0 = DateTime.now();
      int int0 = localTime_Property0.compareTo((ReadableInstant) dateTime0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1, (Chronology) islamicChronology0);
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      // Undeclared exception!
      try { 
        localTime_Property0.compareTo((ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant must not be null
         //
         verifyException("org.joda.time.field.AbstractReadableInstantFieldProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfMonth();
      long long0 = dateMidnight_Property0.getDifferenceAsLong((ReadableInstant) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.yearOfCentury();
      long long0 = dateMidnight_Property0.getDifferenceAsLong(dateMidnight0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 28);
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      int int0 = localTime_Property0.getDifference((ReadableInstant) null);
      assertEquals((-1392404001), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      DateTime dateTime0 = DateTime.now();
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      // Undeclared exception!
      try { 
        localTime_Property0.getDifference(dateTime0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -1392332400000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(63158400000L);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.year();
      DateMidnight dateMidnight1 = dateMidnight_Property0.withMinimumValue();
      assertEquals((-9223372016957972000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(10000L);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.weekyear();
      LocalDateTime localDateTime1 = localDateTime_Property0.withMaximumValue();
      assertFalse(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      DurationField durationField0 = localTime_Property0.getRangeDurationField();
      assertTrue(durationField0.isPrecise());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      long long0 = localTime_Property0.remainder();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.year();
      localDate_Property0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(10000L);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.weekyear();
      DurationField durationField0 = localDateTime_Property0.getLeapDurationField();
      assertEquals(604800000L, durationField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfMonth();
      Interval interval0 = dateMidnight_Property0.toInterval();
      assertEquals((-62135511572000L), interval0.getEndMillis());
      assertEquals((-62135597972000L), interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      int int0 = localTime_Property0.getMaximumValueOverall();
      assertEquals(59, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((DateTimeZone) null);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.centuryOfEra();
      String string0 = mutableDateTime_Property0.getAsString();
      assertEquals("20", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      String string0 = localTime_Property0.getAsShortText();
      assertEquals("76881320", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.property(dateTimeFieldType0);
      Locale locale0 = Locale.PRC;
      int int0 = dateMidnight_Property0.getMaximumShortTextLength(locale0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.millisOfSecond();
      String string0 = localDateTime_Property0.getAsText();
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.weekyear();
      int int0 = dateMidnight_Property0.getMinimumValueOverall();
      assertEquals((-292275054), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      DurationField durationField0 = localTime_Property0.getDurationField();
      assertTrue(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      int int0 = localTime_Property0.getMaximumTextLength((Locale) null);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.era();
      int int0 = mutableDateTime_Property0.getLeapAmount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.era();
      String string0 = mutableDateTime_Property0.toString();
      assertEquals("Property[era]", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.era();
      int int0 = mutableDateTime_Property0.compareTo((ReadableInstant) mutableDateTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.weekyear();
      boolean boolean0 = localDate_Property0.isLeap();
      assertFalse(boolean0);
  }
}
