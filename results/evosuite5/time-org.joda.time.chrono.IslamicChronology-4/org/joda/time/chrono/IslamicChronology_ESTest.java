/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 01:53:15 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
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
        islamicChronology0.setYear(1, 623191204);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Year is too large: 623191204 > 292271022
         //
         verifyException("org.joda.time.chrono.IslamicChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getMonthOfYear(21987376732800000L);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      int int0 = islamicChronology0.getDaysInMonthMax((-276));
      assertEquals(29, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDaysInMonthMax(1);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDaysInYearMonth(1, 1);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInMonthMax(5097600012L);
      assertEquals(29, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDaysInYear(719522);
      assertEquals(355, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInYear(1);
      assertEquals(354, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      IslamicChronology islamicChronology1 = new IslamicChronology(islamicChronology0, islamicChronology0, islamicChronology0.LEAP_YEAR_HABASH_AL_HASIB);
      int int0 = islamicChronology1.getDayOfMonth((-41021424000000L));
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDayOfMonth((-41021424000000L));
      assertEquals(29, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDayOfMonth(536544000000L, 29);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.getYearDifference((-264L), 1);
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
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      IslamicChronology islamicChronology1 = new IslamicChronology(islamicChronology0, islamicChronology0, islamicChronology0.LEAP_YEAR_HABASH_AL_HASIB);
      long long0 = islamicChronology1.setYear((-41021424000000L), (-830));
      assertEquals((-67291084800000L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      IslamicChronology islamicChronology1 = new IslamicChronology(islamicChronology0, islamicChronology0, islamicChronology0.LEAP_YEAR_HABASH_AL_HASIB);
      long long0 = islamicChronology1.setYear((-41021424000000L), 3600000);
      assertEquals(110179686326400000L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = new IslamicChronology.LeapYearPatternType(719527, 719527);
      IslamicChronology islamicChronology1 = new IslamicChronology(islamicChronology0, islamicChronology0, islamicChronology_LeapYearPatternType0);
      int int0 = islamicChronology1.getDaysInMonthMaxForSet(5097600025L, 1431);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Chronology chronology0 = islamicChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      Chronology chronology0 = islamicChronology0.withZone((DateTimeZone) null);
      assertNotSame(chronology0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      int int0 = islamicChronology0.getDaysInMonthMax(12);
      assertEquals(30, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getDaysInYearMax();
      assertEquals(355, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int int0 = islamicChronology0.getMinYear();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      long long0 = islamicChronology0.getApproxMillisAtEpochDividedByTwo();
      assertEquals(21260793600000L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      long long0 = islamicChronology0.getAverageMillisPerYearDividedByTwo();
      assertEquals(15308640144L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IslamicChronology islamicChronology0 = new IslamicChronology((Chronology) null, (Object) null, (IslamicChronology.LeapYearPatternType) null);
      assertEquals(1, IslamicChronology.AH);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Chronology chronology0 = islamicChronology0.withZone(fixedDateTimeZone0);
      assertNotSame(chronology0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      islamicChronology0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      int int0 = islamicChronology0.getDaysInMonthMax();
      assertEquals(30, int0);
  }
}
