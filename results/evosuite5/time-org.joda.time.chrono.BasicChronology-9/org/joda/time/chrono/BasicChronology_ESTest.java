/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 03:44:55 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasicChronology_ESTest extends BasicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getWeekOfWeekyear(1, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.setYear(1, 1);
      assertEquals((-42496790399999L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getWeekyear(1);
      assertEquals(1962, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      long long0 = gregorianChronology0.getYearDifference(5774920920000L, 5774920920000L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int int0 = gregorianChronology0.getWeekyear(31083599550000L);
      assertEquals(2955, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      int int0 = gregorianChronology0.getMonthOfYear((-8135403147049406464L));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int int0 = gregorianChronology0.getWeekyear(31536000000L);
      assertEquals(1970, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      int int0 = gregorianChronology0.getDaysInYear(80);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getDaysInYear(1);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      EthiopicChronology ethiopicChronology1 = new EthiopicChronology(ethiopicChronology0, ethiopicChronology0, 1);
      String string0 = ethiopicChronology1.toString();
      assertEquals("EthiopicChronology[UTC,mdfw=1]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(89);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      try { 
        julianChronology0.getDateTimeMillis(89, 89, 89, 89);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 89 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      String string0 = ethiopicChronology0.toString();
      assertEquals("EthiopicChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      EthiopicChronology ethiopicChronology0 = null;
      try {
        ethiopicChronology0 = new EthiopicChronology(copticChronology0, copticChronology0, (-2469));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: -2469
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      gregorianChronology0.hashCode();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime(31622400000L, (Chronology) gregorianChronology0);
      boolean boolean0 = dateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      boolean boolean0 = gregorianChronology0.equals(julianChronology0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      MonthDay monthDay0 = MonthDay.fromCalendarFields(calendar0);
      assertEquals(14, monthDay0.getDayOfMonth());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalDateTime localDateTime1 = localDateTime0.withDayOfYear(67);
      assertNotSame(localDateTime0, localDateTime1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = null;
      try {
        ethiopicChronology0 = new EthiopicChronology((Chronology) null, (Object) null, 120);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 120
         //
         verifyException("org.joda.time.chrono.BasicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = ethiopicChronology0.getDayOfMonth(1, 1);
      assertEquals(28, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      int int0 = ethiopicChronology0.getDaysInMonthMaxForSet(1, 1);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      long long0 = ethiopicChronology0.getYearMonthMillis(1, 1);
      assertEquals((-61894108800000L), long0);
  }
}
