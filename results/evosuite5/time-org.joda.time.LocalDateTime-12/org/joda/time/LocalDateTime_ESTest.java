/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:55:44 GMT 2019
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDateTime_ESTest extends LocalDateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Locale locale0 = Locale.GERMAN;
      localDateTime0.toString((String) null, locale0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Locale locale0 = Locale.UK;
      try { 
        localDateTime0.toString("", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern specification
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.toString((String) null);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        localDateTime0.toString("qq\"kL2@x&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: qq
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.property((DateTimeFieldType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.minusMillis(0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.minusMillis((-55));
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.minusSeconds(0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.minusSeconds(1);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.minusMinutes(0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.minusMinutes(2164);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.minusHours(0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.minusDays(0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.minusDays(1);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.minusWeeks(0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.minusWeeks(317351851);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.minusMonths(0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.minusYears(0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        localDateTime0.minusYears((-2147482723));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2014 + 2147482723
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusMillis(0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusMillis((-1));
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusSeconds(0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusSeconds(2147482413);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusMinutes(0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusHours(0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusHours(1);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      localDateTime0.plusDays(0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusDays((-57));
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusWeeks(0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusWeeks(1);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.plusMonths(0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusMonths(1);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusYears(0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.plusYears(1);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Days days0 = Days.THREE;
      localDateTime0.withPeriodAdded(days0, 0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Duration duration0 = Duration.parse((String) null);
      localDateTime0.withDurationAdded(duration0, 0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      localDateTime0.withFieldAdded(durationFieldType0, 0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        localDateTime0.withFieldAdded((DurationFieldType) null, (-182));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      localDateTime0.withFieldAdded(durationFieldType0, (-1));
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        localDateTime0.withField((DateTimeFieldType) null, (-1438));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      // Undeclared exception!
      try { 
        localDateTime0.withField(dateTimeFieldType0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for centuryOfEra must be in the range [0,2922789]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.withFields((ReadablePartial) null);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.withFields(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.plusMinutes((-3697));
      localDateTime0.isAfter(localDateTime1);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.minusMonths(4585);
      localDateTime1.isAfter(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDate localDate0 = localDateTime0.toLocalDate();
      // Undeclared exception!
      try { 
        localDateTime0.isAfter(localDate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.minusHours(633);
      localDateTime1.equals(localDateTime0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      localDateTime0.isSupported((DurationFieldType) null);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
      localDateTime0.isSupported(durationFieldType0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      localDateTime0.isSupported((DateTimeFieldType) null);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.get((DateTimeFieldType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        localDateTime0.getValue((-3508));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -3508
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        localDateTime0.getField((-2147482833));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -2147482833
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalDateTime.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalDateTime.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      LocalDateTime.fromCalendarFields(calendar0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalDateTime.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test058()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) gJChronology0);
      Date date0 = localDateTime0.toDate();
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalDateTime.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.LocalDateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      int int0 = localDateTime0.getDayOfWeek();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.plus((ReadablePeriod) null);
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        localDateTime0.withTime((-2147480664), (-2147480664), (-2147480664), (-2147480664));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147480664 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.withMinuteOfHour(87);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 87 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      int int0 = localDateTime0.getWeekyear();
      assertEquals(2014, int0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      int int0 = localDateTime0.getCenturyOfEra();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.withSecondOfMinute(1900);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1900 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.withEra((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for era must be in the range [0,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.withDate(2164, 2164, 2164);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2164 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.withCenturyOfEra((-2147483631));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147483631 for centuryOfEra must be in the range [0,2922789]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      int int0 = localDateTime0.getMillisOfDay();
      assertEquals(76881320, int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1, 1);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.centuryOfEra();
      assertNotNull(localDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.yearOfCentury();
      assertNotNull(localDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      int int0 = localDateTime0.getYearOfEra();
      assertEquals(2014, int0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Days days0 = Days.THREE;
      Duration duration0 = days0.toStandardDuration();
      LocalDateTime localDateTime1 = localDateTime0.plus((ReadableDuration) duration0);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.withYearOfEra(1);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.dayOfWeek();
      assertNotNull(localDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadableDuration) null);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTime dateTime0 = localDateTime0.toDateTime();
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.withDayOfWeek(2);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.withWeekyear(1);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.weekOfWeekyear();
      assertNotNull(localDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        localDateTime0.withWeekOfWeekyear(5409);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 5409 for weekOfWeekyear must be in the range [1,52]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(1, 1, 1, 1, 1);
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.monthOfYear();
      assertNotNull(localDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertEquals(4, localDateTime0.size());
      
      LocalDateTime localDateTime1 = new LocalDateTime(localDateTime0);
      assertTrue(localDateTime1.equals((Object)localDateTime0));
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      int int0 = localDateTime0.getYearOfCentury();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.minuteOfHour();
      assertNotNull(localDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = null;
      try {
        localDateTime0 = new LocalDateTime(islamicChronology0, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: org.joda.time.chrono.IslamicChronology
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.withHourOfDay((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.millisOfDay();
      assertNotNull(localDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        localDateTime0.withMonthOfYear(292272708);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 292272708 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      int int0 = localDateTime0.getDayOfYear();
      assertEquals(45, int0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.year();
      assertNotNull(localDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      int int0 = localDateTime0.getEra();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.withDayOfYear(585);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 585 for dayOfYear must be in the range [1,365]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.withYearOfCentury(1);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      int int0 = localDateTime0.getWeekOfWeekyear();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Minutes minutes0 = Minutes.MAX_VALUE;
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadablePeriod) minutes0);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.secondOfMinute();
      assertNotNull(localDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalTime localTime0 = localDateTime0.toLocalTime();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.withMillisOfSecond((-14));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -14 for millisOfSecond must be in the range [0,999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.withDayOfMonth(1);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-1556L), (DateTimeZone) null);
      Date date0 = localDateTime0.toDate();
      assertEquals("Thu Jan 01 00:59:58 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.withYear((-2147483610));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147483610 for year must be in the range [-292275054,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime localDateTime1 = localDateTime0.withMillisOfDay(2849);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.hourOfDay();
      assertNotNull(localDateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocalDateTime.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.property(dateTimeFieldType0);
      LocalDateTime localDateTime1 = localDateTime_Property0.withMaximumValue();
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((-639L));
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.era();
      Chronology chronology0 = localDateTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.property(dateTimeFieldType0);
      LocalDateTime localDateTime1 = localDateTime_Property0.roundFloorCopy();
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.property(dateTimeFieldType0);
      LocalDateTime localDateTime1 = localDateTime_Property0.roundHalfFloorCopy();
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.weekyear();
      LocalDateTime localDateTime1 = localDateTime_Property0.addToCopy((-3395));
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      LocalDateTime localDateTime0 = LocalDateTime.now(dateTimeZone0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.dayOfMonth();
      LocalDateTime localDateTime1 = localDateTime_Property0.getLocalDateTime();
      assertSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.yearOfEra();
      LocalDateTime localDateTime1 = localDateTime_Property0.roundCeilingCopy();
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.yearOfEra();
      LocalDateTime localDateTime1 = localDateTime_Property0.roundHalfEvenCopy();
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.era();
      LocalDateTime localDateTime1 = localDateTime_Property0.addWrapFieldToCopy(218);
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(mockDate0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.property(dateTimeFieldType0);
      LocalDateTime localDateTime1 = localDateTime_Property0.addToCopy((long) 5570);
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.yearOfEra();
      LocalDateTime localDateTime1 = localDateTime_Property0.roundHalfCeilingCopy();
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(mockDate0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.dayOfYear();
      LocalDateTime localDateTime1 = localDateTime_Property0.withMinimumValue();
      assertNotSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.millisOfSecond();
      // Undeclared exception!
      try { 
        localDateTime_Property0.setCopy("FL G^<+p}.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"FL G^<+p}.\" for millisOfSecond is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }
}
