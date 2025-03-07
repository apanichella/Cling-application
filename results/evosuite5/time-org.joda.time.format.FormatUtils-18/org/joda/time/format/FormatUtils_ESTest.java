/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 20:45:08 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.format.FormatUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FormatUtils_ESTest extends FormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = FormatUtils.createErrorMessage("", 1797);
      assertEquals("Invalid format: \"\" is too short", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = FormatUtils.createErrorMessage("T8p5WsIo3<$_~k!d|c", 1);
      assertEquals("Invalid format: \"T8p5WsIo3<$_~k!d|c\" is malformed at \"8p5WsIo3<$_~k!d|c\"", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = FormatUtils.createErrorMessage("T8p5WsIo3<$_~k!d|c", (-9));
      assertEquals("Invalid format: \"T8p5WsIo3<$_~k!d|c\"", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.createErrorMessage("", Integer.MIN_VALUE);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = FormatUtils.calculateDigitCount((-3066L));
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = FormatUtils.calculateDigitCount(100L);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = FormatUtils.calculateDigitCount(0L);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = FormatUtils.calculateDigitCount((-9223372036854775808L));
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = FormatUtils.calculateDigitCount((-2147195355));
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = FormatUtils.calculateDigitCount(27L);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(497);
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (long) 497);
      assertEquals("497", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (-9223372036854775808L));
      assertEquals("-9223372036854775808", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, 10);
      assertEquals("10", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, 4);
      assertEquals("4", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, (-2602));
      assertEquals("-2602", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writeUnpaddedInteger((Writer) stringWriter0, Integer.MIN_VALUE);
      assertEquals("-2147483648", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertNotNull(stringBuffer0);
      
      FormatUtils.appendUnpaddedInteger(stringBuffer0, (-9223372036854775808L));
      assertEquals(20, stringBuffer0.length());
      assertEquals("-9223372036854775808", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertNotNull(stringBuffer0);
      
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 1);
      assertEquals("1", stringBuffer0.toString());
      assertEquals(1, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertNotNull(stringBuffer0);
      
      FormatUtils.appendUnpaddedInteger(stringBuffer0, (-679L));
      assertEquals(4, stringBuffer0.length());
      assertEquals("-679", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertNotNull(stringBuffer0);
      
      FormatUtils.appendUnpaddedInteger(stringBuffer0, (long) Integer.MIN_VALUE);
      assertEquals("-2147483648", stringBuffer0.toString());
      assertEquals(11, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertNotNull(stringBuffer0);
      
      FormatUtils.appendUnpaddedInteger(stringBuffer0, 16L);
      assertEquals(2, stringBuffer0.length());
      assertEquals("16", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-9223372036854775808L), 1134);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writePaddedInteger((Writer) stringWriter0, 9223372036854775793L, 1134);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-9223372036854775808L), 1);
      assertEquals("-9223372036854775808", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) 1134, 1134);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) 29, 29);
      assertEquals("00000000000000000000000000029", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, 0L, 4785);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, Integer.MIN_VALUE, 48);
      assertEquals("-000000000000000000000000000000000000002147483648", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (-2147195365L), (-2147195355));
      assertEquals("-2147195365", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      FormatUtils.writePaddedInteger((Writer) stringWriter0, (long) 221, 221);
      assertEquals("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000221", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-9223372036854775808L), 981);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-9223372036854775808L), (-3321));
      assertEquals(20, stringBuffer0.length());
      assertEquals("-9223372036854775808", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, 9223372036854775807L, 981);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) (-2147483647), (-2147483647));
      assertEquals("-2147483647", stringBuffer0.toString());
      assertEquals(11, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) 981, 981);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) (-1910), (-1910));
      assertEquals(5, stringBuffer0.length());
      assertEquals("-1910", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (-1L), 981);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3282);
      StringBuffer stringBuffer0 = new StringBuffer(charBuffer0);
      FormatUtils.appendPaddedInteger(stringBuffer0, (-2147483648L), 3282);
      assertEquals(6565, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      FormatUtils.appendPaddedInteger(stringBuffer0, (long) 28, 28);
      assertEquals("0000000000000000000000000028", stringBuffer0.toString());
      assertEquals(28, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        FormatUtils.parseTwoDigits((String) null, 100);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.FormatUtils", e);
      }
  }
}
