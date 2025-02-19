/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 17:47:43 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IslamicChronology_ESTest extends IslamicChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        islamicChronology0.setYear((-9223372036854775808L), 1);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too small: -301245869 < -292269337
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      // Undeclared exception!
      try { 
        islamicChronology0.setYear(1, 2147483622);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too large: 2147483622 > 292271022
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      IslamicChronology islamicChronology1 = new IslamicChronology(islamicChronology0, islamicChronology0, islamicChronology0.LEAP_YEAR_16_BASED);
      long long0 = islamicChronology1.setYear(1, 1);
      assertEquals((-42496790399999L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInMonthMax(232);
      assertEquals(29, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInMonthMax(12);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInMonthMax(1);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInYearMonth(1, 1);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInMonthMax(100000000000000L);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInMonthMax(5097600000L);
      assertEquals(29, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDaysInYear(65);
      assertEquals(355, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDaysInYear(1);
      assertEquals(354, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.getYearDifference(1, 88L);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.getYearDifference(1, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1244));
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      Chronology chronology0 = islamicChronology0.withZone((DateTimeZone) null);
      assertSame(islamicChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(2308, (-2270));
      IslamicChronology islamicChronology0 = new IslamicChronology((Chronology) null, (Object) null, islamicChronology_LeapYearPatternType0);
      int int0 = islamicChronology0.getYear(1);
      assertEquals(1389, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInYearMax();
      assertEquals(355, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getApproxMillisAtEpochDividedByTwo();
      assertEquals(21260793600000L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getAverageMillisPerYearDividedByTwo();
      assertEquals(15308640144L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Chronology chronology0 = islamicChronology0.withZone(fixedDateTimeZone0);
      assertNotSame(chronology0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      islamicChronology0.hashCode();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      LocalDate localDate0 = LocalDate.now();
      long long0 = islamicChronology0.set(localDate0, 1);
      assertEquals(19114700400001L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInMonthMax();
      assertEquals(30, int0);
  }
}
