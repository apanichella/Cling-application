/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 20:42:47 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeZone_ESTest extends DateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone.getDefault();
      LocalDate localDate0 = new LocalDate();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.getDefault();
      Locale locale0 = Locale.ITALIAN;
      String string0 = dateTimeZone0.getName(9223372036854775807L, locale0);
      assertEquals("+02:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(15);
      dateTimeZone0.getName((long) 15, (Locale) null);
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getName(9223372036847575808L);
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      dateTimeZone0.getName(1000L, locale0);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1930);
      String string0 = dateTimeZone0.getName((-24073L));
      assertEquals("+00:00:01.930", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      String string0 = dateTimeZone0.getName((-465L));
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      Locale locale0 = Locale.FRENCH;
      String string0 = dateTimeZone0.getName((-736L), locale0);
      assertNotNull(string0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      DateTimeZone.forID((String) null);
      String string0 = dateTimeZone0.getName((long) 1);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      Locale locale0 = Locale.ROOT;
      String string0 = dateTimeZone0.getName(22761109L, locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      DateTimeZone.setDefault(dateTimeZone0);
      String string0 = dateTimeZone0.getName((-2856L));
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.FRANCE;
      dateTimeZone0.getName(26664192L, locale0);
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(28181250);
      String string0 = dateTimeZone0.getName(4688L);
      assertEquals("+07:49:41.250", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getName(1000L);
      assertEquals("+00:00", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      Locale locale0 = Locale.ROOT;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      String string0 = dateTimeZone0.getName((long) 1, locale0);
      assertEquals("+00:00", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-3215));
      dateTimeZone0.getShortName(5960320L);
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(39);
      String string0 = dateTimeZone0.getShortName((long) 39);
      assertEquals("+39:00", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-560));
      String string0 = dateTimeZone0.getShortName(1000L);
      assertEquals("-00:00:00.560", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone.getDefault();
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+02:00");
      // Undeclared exception!
      try { 
        dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(39);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone1);
      // Undeclared exception!
      try { 
        dateTimeZone0.getMillisKeepLocal(cachedDateTimeZone0, 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(15);
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeZone.getDefault();
      String string0 = dateTimeZone0.getShortName((long) 15);
      assertEquals("+15:00", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getShortName(26664192L);
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      dateTimeZone0.getShortName(124L);
      DateTimeZone dateTimeZone1 = DateTimeZone.forID((String) null);
      assertEquals("Europe/Amsterdam", dateTimeZone1.getID());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone.forID("UTC");
      LocalDate localDate0 = new LocalDate();
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDate localDate0 = new LocalDate();
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test26()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertUTCToLocal((-350L));
      assertEquals((-350L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("Pacific/Guadalcanal");
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC((-9223372036854775808L), false);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(15);
      DateTimeZone.setDefault(dateTimeZone0);
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal(15);
      assertEquals(54000000, int0);
      assertEquals("+15:00", cachedDateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTimeZone dateTimeZone1 = DateTimeZone.forID("+02:00");
      assertNotNull(dateTimeZone1);
      assertEquals("+02:00", dateTimeZone1.getID());
      
      long long0 = dateTimeZone0.convertLocalToUTC(2009L, true, 9223372036854775807L);
      assertEquals((-3597991L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC((-3338L), true, 9223372036847575808L);
      assertEquals((-3603338L), long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      DateTimeZone.forID("UTC");
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC((-9223372036854775808L), true, (-9223372036854775808L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.convertLocalToUTC(776620000001L, true, (-3338L));
      assertEquals(776612800001L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.convertLocalToUTC(766619995770L, false, 2225L);
      DateTimeZone.setDefault(dateTimeZone0);
      assertEquals("Europe/Amsterdam", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      DateTimeZone.forID((String) null);
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      DateTime dateTime0 = new DateTime((Chronology) iSOChronology0);
      DateTime dateTime1 = dateTime0.minusYears(1050);
      assertEquals((-31569010647401L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffsetFromLocal(1642L);
      // Undeclared exception!
      try { 
        DateTimeZone.setDefault((DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal(54000000L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test37()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone.setProvider(uTCProvider0);
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      CachedDateTimeZone cachedDateTimeZone0 = CachedDateTimeZone.forZone(dateTimeZone0);
      int int0 = cachedDateTimeZone0.getOffsetFromLocal((-7198720L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.isStandardOffset(1000000000000000L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("d9[2");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'd9[2' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      LocalDate localDate0 = new LocalDate();
      boolean boolean0 = dateTimeZone0.isStandardOffset(9223372036847575808L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(999999999999996L);
      assertFalse(boolean0);
      
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetHours(1);
      DateTimeZone.setDefault(dateTimeZone1);
      assertEquals("+01:00", dateTimeZone1.getID());
      assertEquals("+01:00", dateTimeZone1.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn("America/Puerto_Rico").when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      Locale locale0 = Locale.CANADA_FRENCH;
      dateTimeZone0.getShortName((-3598720L), locale0);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("d9[2");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'd9[2' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn("6").when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      DateTimeZone.setDefault(dateTimeZone0);
      String string0 = dateTimeZone0.getShortName(1000L);
      assertEquals("6", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      NameProvider nameProvider0 = mock(NameProvider.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(nameProvider0).getShortName(any(java.util.Locale.class) , anyString() , anyString());
      DateTimeZone.setNameProvider(nameProvider0);
      Locale locale0 = Locale.CANADA_FRENCH;
      dateTimeZone0.getShortName((-3598720L), locale0);
      DateTimeZone dateTimeZone1 = DateTimeZone.getDefault();
      assertSame(dateTimeZone1, dateTimeZone0);
  }
}
