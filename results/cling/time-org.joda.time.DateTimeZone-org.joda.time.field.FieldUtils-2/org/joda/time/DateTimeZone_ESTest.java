/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 15:33:27 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.getName((long) 0, locale0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(442);
      DateTimeZone.forID((String) null);
      Locale locale0 = Locale.JAPANESE;
      String string0 = dateTimeZone0.getName((long) 442, locale0);
      assertEquals("+442:00", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(416);
      DateTimeZone.forID("UTC");
      Locale locale0 = Locale.TAIWAN;
      String string0 = dateTimeZone0.getName((long) 416, locale0);
      assertEquals("+416:00", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone0);
      
      Locale locale0 = Locale.CHINESE;
      String string0 = dateTimeZone0.getName((long) 416, locale0);
      assertEquals("+01:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.UTC.getShortName((long) 0);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      assertNotNull(dateTimeZone0);
      
      String string0 = dateTimeZone0.getShortName((-1018L));
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }
}
