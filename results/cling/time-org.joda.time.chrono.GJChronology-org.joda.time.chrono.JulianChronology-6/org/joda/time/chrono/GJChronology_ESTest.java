/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 01:46:56 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("fllE6eX<>DsXxV|", "fllE6eX<>DsXxV|").when(dateTimeZone0).getID();
      GJChronology.getInstance(dateTimeZone0);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Chronology chronology0 = julianChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, julianChronology0);
      
      GJChronology gJChronology0 = GJChronology.getInstance();
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      gJChronology0.getDateTimeMillis(9, 9, 9, 9, 9, 9, 9);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(9, 9);
      // Undeclared exception!
      try { 
        GJChronology.getInstance(dateTimeZone0, 2384L, 9);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 9
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.gregorianToJulianByYear(1000000000000000000L);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals(1000020535465600000L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      julianChronology0.withZone((DateTimeZone) null);
      Instant instant0 = Instant.now();
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) instant0);
      assertEquals(1563932807789L, instant0.getMillis());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeZone0).getID();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      try { 
        gJChronology0.gregorianToJulianByYear((-62135769599999L));
        fail("Expecting exception: IllegalFieldValueException");
      
      } catch(IllegalFieldValueException e) {
         //
         // Value 0 for year is not supported
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test7()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) julianChronology0);
      DateTime dateTime0 = localDateTime0.toDateTime();
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0);
      String string0 = gJChronology0.toString();
      assertEquals(1563925605585L, dateTime0.getMillis());
      assertEquals("GJChronology[Europe/Amsterdam,cutover=2019-07-23T23:46:45.585Z]", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test8()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn("'7Cv#k(PnVO) mImB^", (String) null, (String) null, (String) null).when(dateTimeZone0).getID();
      doReturn((String) null).when(dateTimeZone0).toString();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      DateTimeZone dateTimeZone1 = gJChronology0.getZone();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone1);
      assertNotNull(julianChronology0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      gJChronology0.assemble(assembledChronology_Fields0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }
}
