/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:15:07 GMT 2019
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import org.apache.commons.lang3.text.StrBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrBuilder$StrBuilderReader_ESTest extends StrBuilder$StrBuilderReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      long long0 = strBuilder_StrBuilderReader0.skip((-395L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      long long0 = strBuilder_StrBuilderReader0.skip(1L);
      assertFalse(strBuilder_StrBuilderReader0.ready());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.append(true);
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) strBuilder0);
      // Undeclared exception!
      try { 
        strBuilder_StrBuilderReader0.read(charBuffer0);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.StringCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      char[] charArray0 = new char[3];
      int int0 = strBuilder_StrBuilderReader0.read(charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("gOxUUA1(V&rqqVD*eX");
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      CharBuffer charBuffer0 = CharBuffer.allocate(117);
      int int0 = strBuilder_StrBuilderReader0.read(charBuffer0);
      assertFalse(strBuilder_StrBuilderReader0.ready());
      assertEquals(18, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      char[] charArray0 = new char[4];
      // Undeclared exception!
      try { 
        strBuilder_StrBuilderReader0.read(charArray0, 1, Integer.MAX_VALUE);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder$StrBuilderReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      char[] charArray0 = new char[0];
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      // Undeclared exception!
      try { 
        strBuilder_StrBuilderReader0.read(charArray0, 0, 117);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder$StrBuilderReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        strBuilder_StrBuilderReader0.read(charArray0, 2189, 2189);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder$StrBuilderReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        strBuilder_StrBuilderReader0.read(charArray0, 0, (-198));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder$StrBuilderReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[0];
      StrBuilder strBuilder0 = new StrBuilder("gOxUUA1(V&rqqVD*eX");
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      int int0 = strBuilder_StrBuilderReader0.read(charArray0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-3772));
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        strBuilder_StrBuilderReader0.read(charArray0, (-3772), (-3772));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder$StrBuilderReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-3759));
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      assertFalse(strBuilder_StrBuilderReader0.ready());
      
      int int0 = strBuilder_StrBuilderReader0.read();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      boolean boolean0 = strBuilder_StrBuilderReader0.markSupported();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      strBuilder_StrBuilderReader0.mark(0);
      assertFalse(strBuilder_StrBuilderReader0.ready());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      strBuilder_StrBuilderReader0.reset();
      assertFalse(strBuilder_StrBuilderReader0.ready());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("");
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      strBuilder_StrBuilderReader0.close();
      assertFalse(strBuilder_StrBuilderReader0.ready());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder("gOxUUA1(V&rqqVD*eX");
      StrBuilder.StrBuilderReader strBuilder_StrBuilderReader0 = strBuilder0.new StrBuilderReader();
      int int0 = strBuilder_StrBuilderReader0.read();
      assertEquals(103, int0);
  }
}
