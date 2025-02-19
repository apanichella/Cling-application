/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 18:52:12 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadablePeriod;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TimeOfDay_ESTest extends TimeOfDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(2, 2, 2);
      MutablePeriod mutablePeriod0 = new MutablePeriod(2, 2, 0, 1, 3, 3, 1, 0);
      TimeOfDay timeOfDay1 = timeOfDay0.withPeriodAdded(mutablePeriod0, 0);
      assertSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.plus((ReadablePeriod) null);
      assertEquals(21, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      TimeOfDay timeOfDay1 = timeOfDay0.withField(dateTimeFieldType0, 0);
      assertSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withField(dateTimeFieldType0, 3);
      assertEquals(3, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.withChronologyRetainFields((Chronology) null);
      assertSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      // Undeclared exception!
      try { 
        timeOfDay0.MIDNIGHT.getField(153692453);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 153692453
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeOfDay.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        TimeOfDay.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.TimeOfDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      TimeOfDay timeOfDay0 = TimeOfDay.fromCalendarFields(calendar0);
      assertEquals(320, timeOfDay0.getMillisOfSecond());
      assertEquals(20, timeOfDay0.getHourOfDay());
      assertEquals(21, timeOfDay0.getMinuteOfHour());
      assertEquals(21, timeOfDay0.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      String string0 = timeOfDay0.toString();
      assertEquals("T00:00:00.000", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay((-1520), (-1520), buddhistChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1520 for hourOfDay must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      TimeOfDay timeOfDay0 = TimeOfDay.fromDateFields(mockDate0);
      assertEquals(320, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((DateTimeZone) null);
      assertEquals(21, timeOfDay0.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plusSeconds(3);
      assertEquals(3, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.minusMinutes(1);
      assertEquals(59, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plusMinutes(3);
      assertEquals(3, timeOfDay1.getMinuteOfHour());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(2, 2, 2);
      TimeOfDay timeOfDay1 = timeOfDay0.plusMillis(2);
      assertEquals(2, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      Days days0 = Days.SIX;
      TimeOfDay timeOfDay1 = timeOfDay0.plus(days0);
      assertNotSame(timeOfDay1, timeOfDay0);
      assertEquals(21, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withChronologyRetainFields(gJChronology0);
      assertEquals(2, TimeOfDay.SECOND_OF_MINUTE);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((Object) null);
      assertEquals(21, timeOfDay0.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.minusHours(2);
      assertEquals(22, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.minusSeconds(3);
      assertEquals(18, timeOfDay1.getSecondOfMinute());
      assertEquals(320, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      DateTime dateTime0 = timeOfDay0.toDateTimeToday();
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay(0, 0);
      TimeOfDay timeOfDay1 = timeOfDay0.withMillisOfSecond(1);
      assertEquals(1, timeOfDay1.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(object0, buddhistChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No partial converter found for type: java.lang.Object
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      assertEquals(21, timeOfDay0.getSecondOfMinute());
      
      timeOfDay0.toLocalTime();
      assertEquals(320, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withHourOfDay(1);
      assertEquals(1, timeOfDay1.getHourOfDay());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      DateTimeFieldType[] dateTimeFieldTypeArray0 = timeOfDay0.getFieldTypes();
      assertEquals(4, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      assertEquals(4, timeOfDay0.size());
      
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.minusMillis(0);
      assertSame(timeOfDay1, timeOfDay0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      assertEquals(21, timeOfDay0.getSecondOfMinute());
      
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.plusHours(2);
      assertEquals(4, timeOfDay0.size());
      assertEquals(2, timeOfDay1.getHourOfDay());
      assertEquals(320, timeOfDay0.getMillisOfSecond());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TimeOfDay timeOfDay0 = null;
      try {
        timeOfDay0 = new TimeOfDay(10125000, 10125000, 10125000, (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 10125000 for hourOfDay must not be larger than 23
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withMinuteOfHour(0);
      assertEquals(0, timeOfDay1.getMinuteOfHour());
      assertEquals(4, timeOfDay1.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay((-1732L));
      assertEquals(268, timeOfDay0.getMillisOfSecond());
      assertEquals(4, timeOfDay0.size());
      assertEquals(58, timeOfDay0.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TimeOfDay timeOfDay0 = new TimeOfDay();
      Hours hours0 = Hours.EIGHT;
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.minus(hours0);
      assertEquals(320, timeOfDay0.getMillisOfSecond());
      assertEquals(16, timeOfDay1.getHourOfDay());
      assertEquals(4, timeOfDay1.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.MIDNIGHT;
      TimeOfDay timeOfDay1 = timeOfDay0.MIDNIGHT.withSecondOfMinute(2);
      assertEquals(4, timeOfDay1.size());
      assertEquals(2, timeOfDay1.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      TimeOfDay timeOfDay0 = new TimeOfDay((Chronology) ethiopicChronology0);
      assertEquals(320, timeOfDay0.getMillisOfSecond());
      assertEquals(4, timeOfDay0.size());
      assertEquals(21, timeOfDay0.getSecondOfMinute());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TimeOfDay timeOfDay0 = TimeOfDay.fromMillisOfDay(0L);
      assertEquals(4, timeOfDay0.size());
  }
}
