/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 02:21:00 GMT 2019
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class YearMonth_ESTest extends YearMonth_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      String string0 = yearMonth0.toString((String) null, (Locale) null);
      assertEquals("2014-02", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Locale locale0 = Locale.JAPAN;
      try { 
        yearMonth0.toString("wC#6cg6/[]00J", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      String string0 = yearMonth0.toString("h");
      assertEquals("\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Period period0 = new Period(0L);
      YearMonth yearMonth1 = yearMonth0.minus(period0);
      assertNotSame(yearMonth1, yearMonth0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Calendar calendar0 = MockCalendar.getInstance();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(calendar0);
      YearMonth yearMonth1 = yearMonth0.withPeriodAdded(hours0, 0);
      assertEquals(2, yearMonth1.getMonthOfYear());
      assertSame(yearMonth1, yearMonth0);
      assertEquals(2014, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2, 2);
      YearMonth yearMonth1 = yearMonth0.plusMonths(2);
      assertEquals(4, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2, 2);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      YearMonth yearMonth1 = yearMonth0.withField(dateTimeFieldType0, 2);
      assertSame(yearMonth1, yearMonth0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      YearMonth yearMonth1 = yearMonth0.withField(dateTimeFieldType0, 1);
      assertEquals(1, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonth.fromDateFields((Date) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The date must not be null
         //
         verifyException("org.joda.time.YearMonth", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      YearMonth yearMonth0 = YearMonth.fromDateFields(mockDate0);
      assertEquals(2014, yearMonth0.getYear());
      assertEquals(2, yearMonth0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonth.fromCalendarFields((Calendar) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The calendar must not be null
         //
         verifyException("org.joda.time.YearMonth", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonth.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.YearMonth", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      YearMonth yearMonth0 = YearMonth.now((Chronology) buddhistChronology0);
      assertEquals(2, yearMonth0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonth.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.YearMonth", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2, 2);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      YearMonth.Property yearMonth_Property0 = yearMonth0.property(dateTimeFieldType0);
      assertEquals(2, yearMonth_Property0.get());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((Object) null, ethiopicChronology0);
      YearMonth yearMonth1 = yearMonth0.withChronologyRetainFields(ethiopicChronology0);
      assertSame(yearMonth1, yearMonth0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      String string0 = yearMonth0.toString((String) null);
      assertEquals("2014-02", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = yearMonth0.getFieldTypes();
      assertEquals(2, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((-3155L));
      assertEquals(1, yearMonth0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      YearMonth yearMonth1 = yearMonth0.withYear(0);
      assertEquals(0, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(5L, (Chronology) null);
      assertEquals(1, YearMonth.MONTH_OF_YEAR);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth yearMonth1 = yearMonth0.minusYears(0);
      assertSame(yearMonth1, yearMonth0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1));
      YearMonth yearMonth0 = new YearMonth(dateTimeZone0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      YearMonth yearMonth1 = yearMonth0.withChronologyRetainFields(islamicChronology0);
      assertNotSame(yearMonth1, yearMonth0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth yearMonth1 = yearMonth0.minus((ReadablePeriod) null);
      assertSame(yearMonth0, yearMonth1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      assertEquals(2014, yearMonth0.getYear());
      
      YearMonth yearMonth1 = yearMonth0.plusYears(0);
      assertSame(yearMonth1, yearMonth0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Hours hours0 = Hours.THREE;
      YearMonth yearMonth1 = yearMonth0.plus(hours0);
      assertEquals(2014, yearMonth1.getYear());
      assertNotSame(yearMonth1, yearMonth0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        YearMonth.parse("[0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"[0\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      assertEquals(2014, yearMonth0.getYear());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth yearMonth1 = yearMonth0.withMonthOfYear(1);
      assertEquals(2014, yearMonth1.getYear());
      assertFalse(yearMonth1.equals((Object)yearMonth0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((Object) null);
      assertEquals(2014, yearMonth0.getYear());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth yearMonth1 = yearMonth0.minusMonths(1);
      assertEquals(1, yearMonth1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(2, 2);
      Interval interval0 = yearMonth0.toInterval();
      assertEquals((-62101383572000L), interval0.getStartMillis());
      assertEquals((-62098964372000L), interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      YearMonth.Property yearMonth_Property0 = new YearMonth.Property(yearMonth0, 1);
      // Undeclared exception!
      try { 
        yearMonth_Property0.setCopy(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      YearMonth yearMonth0 = new YearMonth((Chronology) julianChronology0);
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      String string0 = yearMonth_Property0.getAsShortText();
      assertEquals(2, yearMonth_Property0.get());
      assertEquals("Feb", string0);
      assertEquals(2014, yearMonth0.getYear());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      assertEquals(2, yearMonth0.size());
      
      YearMonth yearMonth1 = yearMonth_Property0.addWrapFieldToCopy(0);
      assertEquals(2014, yearMonth1.getYear());
      assertEquals(2, yearMonth_Property0.get());
      assertTrue(yearMonth1.equals((Object)yearMonth0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = yearMonth0.year();
      YearMonth yearMonth1 = yearMonth_Property0.addToCopy(0);
      assertEquals(2, yearMonth1.size());
      assertEquals(2, yearMonth1.getMonthOfYear());
      assertEquals(2014, yearMonth_Property0.get());
      assertEquals(2014, yearMonth1.getYear());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      YearMonth.Property yearMonth_Property0 = yearMonth0.monthOfYear();
      YearMonth yearMonth1 = yearMonth_Property0.getYearMonth();
      assertEquals(2014, yearMonth1.getYear());
      assertEquals(2, yearMonth1.size());
      assertEquals(2, yearMonth_Property0.get());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      YearMonth.Property yearMonth_Property0 = new YearMonth.Property(yearMonth0, (-384));
      // Undeclared exception!
      try { 
        yearMonth_Property0.setCopy("Parsing not supported");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index: -384
         //
         verifyException("org.joda.time.YearMonth", e);
      }
  }
}
