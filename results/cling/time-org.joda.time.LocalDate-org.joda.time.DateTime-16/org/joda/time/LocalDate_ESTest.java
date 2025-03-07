/*

 * Tue Mar 03 17:59:47 GMT 2020
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
import org.joda.time.LocalDate;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalDate_ESTest extends LocalDate_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test0()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay((DateTimeZone) null);
      DateTime dateTime1 = dateTime0.toDateTime((DateTimeZone) null);
      assertNotSame(dateTime1, dateTime0);
      assertEquals(1583190000000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, 1);
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) buddhistChronology0);
      assertNotSame(dateTime1, dateTime0);
  }
}
