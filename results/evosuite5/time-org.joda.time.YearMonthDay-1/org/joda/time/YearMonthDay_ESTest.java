/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 02:12:51 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
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
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonthDay_ESTest extends YearMonthDay_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Hours hours0 = Hours.hours(2);
      YearMonthDay yearMonthDay1 = yearMonthDay0.withPeriodAdded(hours0, 0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3044L);
      YearMonthDay yearMonthDay0 = YearMonthDay.fromDateFields(mockDate0);
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusMonths(0);
      assertSame(yearMonthDay1, yearMonthDay0);
      assertEquals(1970, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusMonths(3);
      assertEquals(5, yearMonthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withField(dateTimeFieldType0, 2);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withField(dateTimeFieldType0, 1);
      assertEquals(1, yearMonthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withChronologyRetainFields(iSOChronology0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      // Undeclared exception!
      try { 
        yearMonthDay0.getField(22);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: 22
         //
         verifyException("org.joda.time.YearMonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonthDay.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.YearMonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonthDay.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.YearMonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      Calendar calendar0 = MockCalendar.getInstance(locale0);
      YearMonthDay yearMonthDay0 = YearMonthDay.fromCalendarFields(calendar0);
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(2014, yearMonthDay0.getYear());
      assertEquals(14, yearMonthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusDays(2);
      assertEquals(12, yearMonthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minusYears(1);
      assertEquals(2013, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      YearMonthDay yearMonthDay0 = new YearMonthDay((long) 1, (Chronology) gregorianChronology0);
      assertEquals(3, yearMonthDay0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.minus((ReadablePeriod) null);
      assertEquals(1, YearMonthDay.MONTH_OF_YEAR);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonthDay yearMonthDay0 = new YearMonthDay(dateTimeZone0);
      assertEquals(2, yearMonthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      YearMonthDay yearMonthDay1 = new YearMonthDay(yearMonthDay0, gregorianChronology0);
      assertEquals(3, yearMonthDay1.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withMonthOfYear(1);
      assertEquals(1, yearMonthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      yearMonthDay0.toLocalDate();
      assertEquals(14, yearMonthDay0.getDayOfMonth());
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Period period0 = Period.ZERO;
      YearMonthDay yearMonthDay1 = yearMonthDay0.plus(period0);
      assertNotSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withDayOfMonth(2);
      assertEquals(2, yearMonthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusYears(2);
      assertEquals(2016, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      assertEquals(14, yearMonthDay0.getDayOfMonth());
      
      YearMonthDay yearMonthDay1 = yearMonthDay0.plusDays(0);
      assertSame(yearMonthDay1, yearMonthDay0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      GJChronology gJChronology0 = GJChronology.getInstance();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withChronologyRetainFields(gJChronology0);
      assertNotSame(yearMonthDay1, yearMonthDay0);
      assertEquals(2014, yearMonthDay1.getYear());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      yearMonthDay0.getFieldTypes();
      assertEquals(2014, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      Interval interval0 = yearMonthDay0.toInterval();
      assertEquals(1392418800000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((long) 0);
      assertEquals(1970, yearMonthDay0.getYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      String string0 = yearMonthDay0.toString();
      assertEquals("2014-02-14", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      YearMonthDay yearMonthDay1 = yearMonthDay0.withYear(2);
      assertEquals(2, yearMonthDay1.getYear());
      assertEquals(14, yearMonthDay1.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtMidnight();
      assertEquals(1392332400000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      YearMonthDay yearMonthDay0 = new YearMonthDay((Chronology) ethiopicChronology0);
      assertEquals(7, yearMonthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      assertEquals(2, yearMonthDay0.getMonthOfYear());
      assertEquals(3, yearMonthDay0.size());
      
      yearMonthDay0.toDateMidnight();
      assertEquals(2014, yearMonthDay0.getYear());
      assertEquals(14, yearMonthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay();
      DateTime dateTime0 = yearMonthDay0.toDateTimeAtCurrentTime();
      assertEquals(3, yearMonthDay0.size());
      assertEquals(1392409281320L, dateTime0.getMillis());
      assertEquals(2014, yearMonthDay0.getYear());
      assertEquals(2, yearMonthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      YearMonthDay yearMonthDay0 = new YearMonthDay((Object) null);
      assertEquals(3, yearMonthDay0.size());
      assertEquals(14, yearMonthDay0.getDayOfMonth());
      assertEquals(2, yearMonthDay0.getMonthOfYear());
  }
}
