/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 17:40:26 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AssembledChronology_ESTest extends AssembledChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      long long0 = buddhistChronology0.getDateTimeMillis((long) 1, 1, 1, 1, 1);
      assertEquals(61001L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      long long0 = buddhistChronology0.getDateTimeMillis(1, 1, 1, 1, 1, 1, 1);
      assertEquals((-79271564338999L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      long long0 = buddhistChronology0.getDateTimeMillis(1, 1, 1, 1);
      assertEquals((-79271567999999L), long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(iSOChronology0);
      long long0 = lenientChronology0.getDateTimeMillis(1561L, 122, 122, 122, 122);
      assertEquals(443042122L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(iSOChronology0);
      assertNotNull(strictChronology0);
  }
}
