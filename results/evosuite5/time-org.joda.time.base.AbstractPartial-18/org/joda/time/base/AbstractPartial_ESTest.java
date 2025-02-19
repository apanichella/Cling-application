/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 14:38:41 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractPartial_ESTest extends AbstractPartial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      String string0 = localDateTime0.toString((DateTimeFormatter) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      Partial partial0 = new Partial(localDateTime0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      String string0 = localDateTime0.toString(dateTimeFormatter0);
      assertEquals("2014-02-14", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      boolean boolean0 = monthDay0.isEqual(monthDay0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance((DateTimeZone) null);
      MonthDay monthDay0 = new MonthDay(3090L, (Chronology) ethiopicChronology0);
      // Undeclared exception!
      try { 
        monthDay0.isEqual((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial cannot be null
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(259200000L, (DateTimeZone) null);
      LocalDateTime localDateTime1 = LocalDateTime.now();
      boolean boolean0 = localDateTime0.isBefore(localDateTime1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      Date date0 = localDateTime0.toDate();
      assertEquals("Thu Jan 01 01:00:00 GMT 1970", date0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(259200000L, (DateTimeZone) null);
      // Undeclared exception!
      try { 
        localDateTime0.isBefore((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial cannot be null
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      MonthDay monthDay1 = monthDay0.plusDays(1);
      boolean boolean0 = monthDay1.isAfter(monthDay0);
      assertEquals(2, monthDay1.getMonthOfYear());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      // Undeclared exception!
      try { 
        monthDay0.isAfter((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial cannot be null
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay monthDay1 = monthDay0.plusMonths(4);
      boolean boolean0 = monthDay0.isAfter(monthDay1);
      assertEquals(6, monthDay1.getMonthOfYear());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay monthDay1 = MonthDay.now();
      boolean boolean0 = monthDay1.isAfter(monthDay0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalDateTime localDateTime0 = new LocalDateTime();
      // Undeclared exception!
      try { 
        localDateTime0.isBefore(localTime0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      MonthDay monthDay0 = MonthDay.now();
      // Undeclared exception!
      try { 
        monthDay0.isAfter(localDateTime0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      yearMonth0.hashCode();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      LocalTime localTime0 = new LocalTime();
      boolean boolean0 = localDateTime0.equals(localTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      boolean boolean0 = localTime0.equals(mutableDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      Partial partial0 = new Partial(localDateTime0);
      boolean boolean0 = localDateTime0.equals(partial0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Partial partial0 = new Partial();
      boolean boolean0 = localDateTime0.equals(partial0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      YearMonth yearMonth0 = YearMonth.now();
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      // Undeclared exception!
      try { 
        yearMonth0.withFieldAdded(durationFieldType0, 4);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'halfdays' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
      // Undeclared exception!
      try { 
        monthDay0.property((DateTimeFieldType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'null' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      Partial partial0 = new Partial(localDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      boolean boolean0 = partial0.isSupported(dateTimeFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      int[] intArray0 = localDateTime0.getValues();
      assertArrayEquals(new int[] {2014, 2, 14, 76881320}, intArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      DateTimeField[] dateTimeFieldArray0 = monthDay0.getFields();
      assertEquals(2, dateTimeFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = localTime0.getFieldTypes();
      assertEquals(4, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      String string0 = monthDay0.toString();
      assertEquals("--02-14", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      MonthDay monthDay1 = monthDay0.plusDays(1);
      boolean boolean0 = monthDay1.isEqual(monthDay0);
      assertFalse(boolean0);
      assertEquals(2, monthDay1.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) null);
      Partial partial0 = new Partial(localDateTime0);
      DateTime dateTime0 = partial0.toDateTime((ReadableInstant) null);
      assertEquals(1392409281320L, dateTime0.getMillis());
  }
}
