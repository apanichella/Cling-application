/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 19:20:41 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      PeriodType periodType0 = PeriodType.weeks();
      assertNotNull(periodType0);
      
      boolean boolean0 = periodType0.equals(durationFieldType0);
      assertFalse(boolean0);
      assertEquals("Weeks", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDay();
      PeriodType periodType1 = periodType0.withDaysRemoved();
      assertEquals("YearDayNoDays", periodType1.getName());
      assertEquals(1, periodType1.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      PeriodType periodType1 = periodType0.withMonthsRemoved();
      assertEquals("DayTime", periodType1.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Months months0 = Months.TWELVE;
      PeriodType periodType0 = PeriodType.days();
      // Undeclared exception!
      try { 
        periodType0.addIndexedField(months0, 6, (int[]) null, 1926);
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
      Minutes minutes0 = Minutes.THREE;
      PeriodType periodType0 = minutes0.getPeriodType();
      assertNotNull(periodType0);
      
      int[] intArray0 = new int[5];
      boolean boolean0 = periodType0.addIndexedField(minutes0, 0, intArray0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.years((-90));
      Period period1 = period0.minusDays((-90));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Months months0 = Months.TEN;
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        periodType0.setIndexedField(months0, 4, intArray0, 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Field is not supported
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.seconds((-85));
      Period period1 = period0.withHours((-85));
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      PeriodType periodType0 = PeriodType.days();
      assertNotNull(periodType0);
      
      int int0 = periodType0.getIndexedField(minutes0, 6);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = new Period((-85), (-85), (-85), (-85), (-85), (-85), (-85), (-85));
      // Undeclared exception!
      try { 
        period0.toStandardDays();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Cannot convert to Days as this period contains months and months vary in length
         //
         verifyException("org.joda.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodType periodType0 = PeriodType.standard();
      assertNotNull(periodType0);
      
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      boolean boolean0 = periodType0.isSupported(durationFieldType0);
      assertEquals(8, periodType0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      assertNotNull(periodType0);
      
      DurationFieldType durationFieldType0 = DurationFieldType.centuries();
      boolean boolean0 = periodType0.isSupported(durationFieldType0);
      assertFalse(boolean0);
      assertEquals("DayTime", periodType0.getName());
      assertEquals(5, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      assertEquals(1, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.MILLIS_TYPE;
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
  public void test14()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      DurationFieldType durationFieldType1 = DurationFieldType.seconds();
      durationFieldTypeArray0[1] = durationFieldType1;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [halfdays]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
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
  public void test16()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      DurationFieldType durationFieldType1 = DurationFieldType.HOURS_TYPE;
      durationFieldTypeArray0[1] = durationFieldType1;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [halfdays]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKS_TYPE;
      durationFieldTypeArray0[0] = durationFieldType0;
      DurationFieldType durationFieldType1 = DurationFieldType.DAYS_TYPE;
      durationFieldTypeArray0[1] = durationFieldType1;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      assertEquals(2, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      DurationFieldType durationFieldType1 = DurationFieldType.months();
      durationFieldTypeArray0[0] = durationFieldType1;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [halfdays]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[2];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      // Undeclared exception!
      try { 
        PeriodType.forFields(durationFieldTypeArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // PeriodType does not support fields: [years]
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      durationFieldTypeArray0[0] = durationFieldType0;
      PeriodType periodType0 = PeriodType.forFields(durationFieldTypeArray0);
      PeriodType periodType1 = PeriodType.forFields(durationFieldTypeArray0);
      assertSame(periodType1, periodType0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[1];
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
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDayTime();
      // Undeclared exception!
      try { 
        periodType0.getFieldType(470);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 470
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      assertNotNull(periodType0);
      
      String string0 = periodType0.toString();
      assertEquals("PeriodType[Millis]", string0);
  }
}
