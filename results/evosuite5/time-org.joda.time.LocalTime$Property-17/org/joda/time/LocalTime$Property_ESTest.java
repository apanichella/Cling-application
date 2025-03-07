/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 18:26:10 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime$Property_ESTest extends LocalTime$Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      // Undeclared exception!
      try { 
        localTime_Property0.addNoWrapToCopy(4219);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The addition exceeded the boundaries of LocalTime
         //
         verifyException("org.joda.time.LocalTime$Property", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.addNoWrapToCopy(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.addWrapFieldToCopy(0);
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.getLocalTime();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.addCopy(0L);
      assertSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.roundHalfCeilingCopy();
      assertSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      LocalTime localTime1 = localTime_Property0.roundHalfEvenCopy();
      assertSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.withMaximumValue();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) iSOChronology0);
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      LocalTime localTime1 = localTime_Property0.roundCeilingCopy();
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.roundHalfFloorCopy();
      assertSame(localTime0, localTime1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.minuteOfHour();
      LocalTime localTime1 = localTime_Property0.addCopy((-23));
      assertEquals(4, localTime1.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      // Undeclared exception!
      try { 
        localTime_Property0.setCopy("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\" for secondOfMinute is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      LocalTime localTime0 = new LocalTime((Chronology) islamicChronology0);
      LocalTime.Property localTime_Property0 = localTime0.millisOfDay();
      Chronology chronology0 = localTime_Property0.getChronology();
      assertSame(chronology0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      LocalTime localTime1 = localTime_Property0.withMinimumValue();
      assertNotSame(localTime1, localTime0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(16L);
      LocalTime.Property localTime_Property0 = localTime0.hourOfDay();
      LocalTime localTime1 = localTime_Property0.roundFloorCopy();
      assertEquals(4, localTime1.size());
  }
}
