/*

 * Tue Mar 03 17:37:24 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class GJChronology_ESTest extends GJChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = new DateMidnight((long) 1, (Chronology) buddhistChronology0);
      DateMidnight dateMidnight1 = dateMidnight0.withYearOfEra(1);
      assertEquals((-79271568000000L), dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(1, 1, 1, 1, 1, 1, 1);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
      assertEquals((-62135767110999L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      GJChronology gJChronology1 = (GJChronology)gJChronology0.withZone((DateTimeZone) null);
      assertEquals(4, gJChronology1.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(1, 1, 1, 1);
      assertEquals((-62135770771999L), long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      long long0 = gJChronology0.getDateTimeMillis(2480, 1, 1, 2480);
      assertEquals(16094070002480L, long0);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) fixedDateTimeZone0, (ReadableInstant) null);
      assertEquals(4, gJChronology0.getMinimumDaysInFirstWeek());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (long) 1, 1);
      YearMonth yearMonth0 = new YearMonth((long) 1, (Chronology) gJChronology0);
      YearMonth yearMonth1 = yearMonth0.plusMonths((-580));
      assertEquals(9, yearMonth1.getMonthOfYear());
  }
}
