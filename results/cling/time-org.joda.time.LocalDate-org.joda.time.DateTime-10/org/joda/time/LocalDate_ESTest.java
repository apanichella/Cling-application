/*

 * Tue Mar 03 17:57:12 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTime(dateTimeZone0);
      assertEquals(1583258227725L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test1()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) gJChronology0);
      assertEquals(1583258227576L, dateTime1.getMillis());
  }
}
