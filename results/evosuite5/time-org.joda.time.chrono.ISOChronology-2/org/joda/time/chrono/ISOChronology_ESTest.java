/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:40:07 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.YearMonth;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISOChronology_ESTest extends ISOChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      String string0 = iSOChronology0.toString();
      assertEquals("ISOChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Chronology chronology0 = iSOChronology0.withZone((DateTimeZone) null);
      assertSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Chronology chronology0 = iSOChronology0.withZone(dateTimeZone0);
      assertNotSame(chronology0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance((DateTimeZone) null);
      assertNotNull(iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      iSOChronology0.hashCode();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth((Object) null);
      assertEquals(0, YearMonth.YEAR);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      boolean boolean0 = iSOChronology0.equals(iSOChronology0);
      assertTrue(boolean0);
  }
}
