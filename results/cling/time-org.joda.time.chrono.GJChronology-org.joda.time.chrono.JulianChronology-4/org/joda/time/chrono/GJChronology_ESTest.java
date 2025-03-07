/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 15:07:31 GMT 2019
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
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeZone0).getID();
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      GJChronology.getInstance(dateTimeZone1, (ReadableInstant) null);
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0, 4);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      long long0 = gJChronology0.getDateTimeMillis(4, 4, 4, 4, 4, 4, 2);
      assertEquals((-62033026527998L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.getDateTimeMillis(4, 4, 4, 4, 4, 4, 2);
      assertEquals((-62033025355998L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test3()  throws Throwable  {
      Instant instant0 = Instant.now();
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) instant0);
      String string0 = gJChronology0.toString();
      assertEquals(1563894437418L, instant0.getMillis());
      assertEquals("GJChronology[Europe/Amsterdam,cutover=2019-07-23T15:07:17.418Z]", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) null);
      gJChronology0.getDateTimeMillis(4, 4, 4, 4, 4, 4, 4);
      // Undeclared exception!
      try { 
        GJChronology.getInstance((DateTimeZone) null, (-62033026527996L), 1888);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid min days in first week: 1888
         //
         verifyException("org.joda.time.chrono.JulianChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null, 3);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.gregorianToJulianByYear((-79302585599970L));
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-79271567999970L), long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GJChronology.getInstanceUTC();
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null, 3);
      assertNotNull(julianChronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test8()  throws Throwable  {
      Instant instant0 = Instant.now();
      DateTimeZone dateTimeZone0 = instant0.getZone();
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) null);
      GJChronology.getInstance(dateTimeZone0, (ReadableInstant) instant0);
      assertEquals(1563894428792L, instant0.getMillis());
  }
}
