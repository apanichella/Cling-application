/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:45:24 GMT 2019
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.field.ScaledDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractReadableInstantFieldProperty_ESTest extends AbstractReadableInstantFieldProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfYear();
      MutableDateTime.Property mutableDateTime_Property1 = mutableDateTime0.dayOfYear();
      boolean boolean0 = mutableDateTime_Property0.equals(mutableDateTime_Property1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTime dateTime0 = DateTime.now();
      LocalDate localDate0 = dateTime0.toLocalDate();
      LocalDate.Property localDate_Property0 = localDate0.weekyear();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.year();
      boolean boolean0 = mutableDateTime_Property0.equals(localDate_Property0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTime dateTime0 = DateTime.now();
      LocalDate localDate0 = dateTime0.toLocalDate();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      LocalDate.Property localDate_Property0 = localDate0.yearOfCentury();
      boolean boolean0 = mutableDateTime_Property0.equals(localDate_Property0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      boolean boolean0 = mutableDateTime_Property0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTime dateTime0 = DateTime.now();
      LocalDate localDate0 = dateTime0.toLocalDate();
      LocalDate.Property localDate_Property0 = localDate0.weekyear();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      boolean boolean0 = mutableDateTime_Property0.equals(localDate_Property0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(buddhistChronology0);
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) strictChronology0);
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      int int0 = localTime_Property0.compareTo((ReadablePartial) localTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(buddhistChronology0);
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) strictChronology0);
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      LocalTime localTime1 = new LocalTime((Chronology) buddhistChronology0);
      int int0 = localTime_Property0.compareTo((ReadablePartial) localTime1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1, 1, 1);
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
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
      DateTime dateTime0 = DateTime.now();
      DateMidnight dateMidnight0 = dateTime0.toDateMidnight();
      LocalDate localDate0 = dateMidnight0.toLocalDate();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) lenientChronology0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      int int0 = mutableDateTime_Property0.compareTo((ReadablePartial) localDate0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfDay();
      DateTime dateTime1 = dateTime0.withTimeAtStartOfDay();
      int int0 = dateTime_Property0.compareTo((ReadableInstant) dateTime1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.dayOfMonth();
      DateTime dateTime0 = DateTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTime.Property dateTime_Property0 = dateTime0.property(dateTimeFieldType0);
      DateTime dateTime1 = dateTime_Property0.setCopy(85093);
      int int0 = localDate_Property0.compareTo((ReadableInstant) dateTime1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.year();
      // Undeclared exception!
      try { 
        mutableDateTime_Property0.compareTo((ReadableInstant) null);
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
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      int int0 = mutableDateTime_Property0.compareTo((ReadableInstant) mutableDateTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      LocalDate localDate0 = monthDay0.toLocalDate(1);
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      long long0 = localDate_Property0.getDifferenceAsLong((ReadableInstant) null);
      assertEquals((-20L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      long long0 = mutableDateTime_Property0.getDifferenceAsLong(mutableDateTime0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.secondOfDay();
      int int0 = mutableDateTime_Property0.getDifference((ReadableInstant) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) buddhistChronology0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.secondOfDay();
      int int0 = mutableDateTime_Property0.getDifference(mutableDateTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      LocalTime localTime1 = localTime_Property0.withMinimumValue();
      assertFalse(localTime1.equals((Object)localTime0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfDay();
      DateTime dateTime1 = dateTime_Property0.withMaximumValue();
      assertEquals(1392418799999L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.yearOfCentury();
      ScaledDurationField scaledDurationField0 = (ScaledDurationField)localDateTime_Property0.getRangeDurationField();
      assertEquals(100, scaledDurationField0.getScalar());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.property(dateTimeFieldType0);
      long long0 = localDateTime_Property0.remainder();
      assertEquals(3600000L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) buddhistChronology0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.secondOfDay();
      DurationField durationField0 = mutableDateTime_Property0.getLeapDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfDay();
      Interval interval0 = dateTime_Property0.toInterval();
      assertEquals(1392409281321L, interval0.getEndMillis());
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((long) 1);
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      String string0 = localTime_Property0.toString();
      assertEquals("Property[minuteOfHour]", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.millisOfSecond();
      int int0 = localDateTime_Property0.getMaximumValueOverall();
      assertEquals(999, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      String string0 = mutableDateTime_Property0.getAsString();
      assertEquals("14", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.dayOfYear();
      String string0 = localDate_Property0.getAsShortText();
      assertEquals("45", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-4148L));
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.hourOfDay();
      Locale locale0 = Locale.TAIWAN;
      int int0 = localDateTime_Property0.getMaximumShortTextLength(locale0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) buddhistChronology0);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.secondOfDay();
      String string0 = mutableDateTime_Property0.getAsText();
      assertEquals("76881", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfDay();
      int int0 = dateTime_Property0.getMinimumValueOverall();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime(0L);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.dayOfWeek();
      DurationField durationField0 = mutableDateTime_Property0.getDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.yearOfCentury();
      Locale locale0 = Locale.PRC;
      int int0 = mutableDateTime_Property0.getMaximumTextLength(locale0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalTime localTime0 = new LocalTime((Chronology) julianChronology0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfSecond();
      int int0 = localTime_Property0.getLeapAmount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.dayOfMonth();
      localDateTime_Property0.hashCode();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.dayOfMonth();
      boolean boolean0 = localDateTime_Property0.isLeap();
      assertFalse(boolean0);
  }
}
