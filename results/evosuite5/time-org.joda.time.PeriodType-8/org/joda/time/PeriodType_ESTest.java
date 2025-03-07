/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 03:32:15 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Seconds;
import org.joda.time.Years;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      assertNotNull(periodType0);
      
      Object object0 = new Object();
      boolean boolean0 = periodType0.equals(object0);
      assertEquals("Hours", periodType0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      PeriodType periodType1 = periodType0.withDaysRemoved();
      assertEquals(0, periodType1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      PeriodType periodType1 = periodType0.withSecondsRemoved();
      assertEquals("Millis", periodType1.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      Period period0 = new Period(22L, 22L, periodType0);
      // Undeclared exception!
      try { 
        period0.minusYears((-2584));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PeriodType periodType0 = PeriodType.weeks();
      Seconds seconds0 = Seconds.ZERO;
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        periodType0.setIndexedField(seconds0, 0, intArray0, 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.years((-15));
      Period period1 = period0.withYears((-15));
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Years years0 = Years.TWO;
      PeriodType periodType0 = years0.getPeriodType();
      Period period0 = new Period((-1L), (-1L), periodType0);
      Period period1 = period0.normalizedStandard();
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      assertNotNull(periodType0);
      
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      boolean boolean0 = periodType0.isSupported(durationFieldType0);
      assertEquals(7, periodType0.size());
      assertEquals("YearMonthDayTime", periodType0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      assertNotNull(periodType0);
      
      DurationFieldType durationFieldType0 = DurationFieldType.seconds();
      boolean boolean0 = periodType0.isSupported(durationFieldType0);
      assertEquals("Years", periodType0.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [millis]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      durationFieldTypeArray0[0] = durationFieldType0;
      DurationFieldType durationFieldType1 = DurationFieldType.seconds();
      durationFieldTypeArray0[1] = durationFieldType1;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      assertEquals(2, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.MINUTES_TYPE;
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [minutes]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [hours]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      assertEquals("Days", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.weeks();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [weeks]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [months]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType.forFields(durationFieldTypeArray0);
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      assertEquals("Millis", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[8];
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not contain null
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[0];
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        PeriodType.forFields((DurationFieldType[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Types array must not be null or empty
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = new Period((-3L), (PeriodType) null);
      Period period1 = period0.plus(period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      assertNotNull(periodType0);
      
      String string0 = periodType0.toString();
      assertEquals("PeriodType[Millis]", string0);
  }
}
