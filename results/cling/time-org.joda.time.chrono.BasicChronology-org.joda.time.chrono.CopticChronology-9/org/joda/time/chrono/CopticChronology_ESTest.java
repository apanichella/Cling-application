/*

 * Tue Mar 03 17:14:19 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.CopticChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CopticChronology_ESTest extends CopticChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getDaysInYear(47);
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      int int0 = copticChronology0.getDaysInYear(1);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      int int0 = copticChronology0.getWeeksInYear(1);
      assertEquals(52, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimeZone0).getID();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      assertNotNull(copticChronology0);
      
      int int0 = copticChronology0.getWeeksInYear(4);
      assertEquals(52, int0);
  }
}
