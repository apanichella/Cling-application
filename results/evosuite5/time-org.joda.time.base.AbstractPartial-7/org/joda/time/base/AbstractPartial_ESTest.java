/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 14:34:23 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractPartial_ESTest extends AbstractPartial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      String string0 = monthDay0.toString((DateTimeFormatter) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((long) 1, (Chronology) copticChronology0);
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      String string0 = localDate0.toString(dateTimeFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Partial partial0 = new Partial(copticChronology0);
      // Undeclared exception!
      try { 
        partial0.isEqual((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial cannot be null
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((long) 1, (Chronology) copticChronology0);
      LocalDate localDate1 = localDate0.plusWeeks(1);
      boolean boolean0 = localDate0.isBefore(localDate1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((long) 1, (Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        localDate0.isBefore((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial cannot be null
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      boolean boolean0 = localTime0.isAfter(localTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) copticChronology0);
      // Undeclared exception!
      try { 
        localTime0.isAfter((ReadablePartial) null);
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
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) copticChronology0);
      LocalTime localTime1 = LocalTime.MIDNIGHT;
      Partial partial0 = new Partial(localTime1);
      boolean boolean0 = partial0.isEqual(localTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) copticChronology0);
      LocalTime localTime1 = LocalTime.MIDNIGHT;
      boolean boolean0 = localTime0.isAfter(localTime1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) copticChronology0);
      LocalDateTime localDateTime0 = LocalDateTime.now();
      // Undeclared exception!
      try { 
        localTime0.isBefore(localDateTime0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(16, 16, 16);
      LocalDate localDate0 = new LocalDate();
      // Undeclared exception!
      try { 
        localTime0.compareTo((ReadablePartial) localDate0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // ReadablePartial objects must have matching field types
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Partial partial0 = new Partial();
      boolean boolean0 = partial0.isEqual(partial0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate localDate0 = new LocalDate((long) 16, (Chronology) copticChronology0);
      localDate0.hashCode();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) copticChronology0);
      LocalTime localTime1 = LocalTime.MIDNIGHT;
      boolean boolean0 = localTime0.equals(localTime1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((long) 1, (Chronology) copticChronology0);
      Partial partial0 = new Partial(copticChronology0);
      boolean boolean0 = localDate0.equals(partial0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Partial partial0 = new Partial();
      boolean boolean0 = partial0.equals("[]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Partial partial0 = new Partial();
      boolean boolean0 = partial0.equals(partial0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDate localDate0 = new LocalDate((long) 1, (Chronology) copticChronology0);
      Date date0 = localDate0.toDate();
      assertEquals("Tue Apr 23 00:00:00 GMT 1686", date0.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) null);
      Interval interval0 = yearMonth0.toInterval();
      assertEquals(1393628400000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Partial partial0 = new Partial();
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      // Undeclared exception!
      try { 
        partial0.withFieldAdded(durationFieldType0, (-92));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'millis' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Partial partial0 = new Partial();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      // Undeclared exception!
      try { 
        partial0.get(dateTimeFieldType0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field 'minuteOfHour' is not supported
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Partial partial0 = new Partial();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      boolean boolean0 = partial0.isSupported(dateTimeFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      int[] intArray0 = localDate0.getValues();
      assertArrayEquals(new int[] {2014, 2, 14}, intArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) copticChronology0);
      DateTimeFieldType[] dateTimeFieldTypeArray0 = localTime0.getFieldTypes();
      assertEquals(4, dateTimeFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      String string0 = monthDay0.toString();
      assertEquals("--02-14", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1, 1, 1);
      DateTimeField[] dateTimeFieldArray0 = localDate0.getFields();
      assertEquals(3, dateTimeFieldArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Instant instant0 = new Instant();
      DateTime dateTime0 = localTime0.toDateTime(instant0);
      assertEquals(1392412881320L, dateTime0.getMillis());
  }
}
