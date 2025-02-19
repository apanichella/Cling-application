/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 17:25:05 GMT 2019
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.text.StrTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrTokenizer_ESTest extends StrTokenizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      char[] charArray0 = new char[4];
      charArray0[2] = 'c';
      StrMatcher strMatcher1 = StrMatcher.charSetMatcher(charArray0);
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, strMatcher0, strMatcher1);
      // Undeclared exception!
      try { 
        strTokenizer0.previous();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance(", Length: ");
      strTokenizer0.nextToken();
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher((char[]) null);
      assertNotNull(strMatcher0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("mlE{t9,'t{)AZ9");
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      
      char[] charArray0 = new char[6];
      StrTokenizer strTokenizer1 = strTokenizer0.setEmptyTokenAsNull(true);
      strTokenizer1.reset(charArray0);
      int int0 = strTokenizer1.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("#W-V\"Aoz_b|Q");
      StrTokenizer strTokenizer1 = strTokenizer0.setDelimiterString("#W-V\"Aoz_b|Q");
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("#W-V\"Aoz_b|Q");
      strTokenizer1.setTrimmerMatcher(strMatcher0);
      // Undeclared exception!
      try { 
        strTokenizer1.previous();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("h0d'O7g\"Sgz\"@", (StrMatcher) null);
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("#W-V\"Aoz_b|Q");
      StrMatcher strMatcher0 = StrMatcher.charSetMatcher("#W-V\"Aoz_b|Q");
      strTokenizer0.setTrimmerMatcher(strMatcher0);
      // Undeclared exception!
      try { 
        strTokenizer0.previous();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("startIndex must be valid", "startIndex must be valid");
      StrTokenizer strTokenizer1 = strTokenizer0.setTrimmerMatcher((StrMatcher) null);
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
      assertFalse(strTokenizer1.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      char[] charArray0 = new char[4];
      StrMatcher strMatcher1 = StrMatcher.charSetMatcher(charArray0);
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, strMatcher0, strMatcher1);
      // Undeclared exception!
      try { 
        strTokenizer0.previous();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("n/ER9';U<|VR");
      StrMatcher strMatcher0 = StrMatcher.quoteMatcher();
      strTokenizer0.setIgnoredMatcher(strMatcher0);
      boolean boolean0 = strTokenizer0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("#W-V\"Aoz_b|Q");
      strTokenizer0.setDelimiterString("#W-V\"Aoz_b|Q");
      strTokenizer0.next();
      assertEquals(0, strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", "");
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance();
      assertEquals((-1), strTokenizer0.previousIndex());
      
      strTokenizer0.previousToken();
      String string0 = strTokenizer0.toString();
      assertEquals("StrTokenizer[]", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("#W-V\"Aoz_b|Q");
      strTokenizer0.next();
      String string0 = strTokenizer0.previous();
      assertEquals("#W-V\"Aoz_b|Q", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      strTokenizer0.next();
  }
}
