/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:19:28 GMT 2019
 */

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class StrSubstitutor_ESTest extends StrSubstitutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.setVariableSuffix((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable suffix must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.setVariableSuffixMatcher((StrMatcher) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable suffix matcher must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      StrSubstitutor strSubstitutor0 = null;
      try {
        strSubstitutor0 = new StrSubstitutor((Map<String, Object>) hashMap0, (String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable prefix must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      // Undeclared exception!
      try { 
        strSubstitutor0.setVariablePrefixMatcher((StrMatcher) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Variable prefix matcher must not be null!
         //
         verifyException("org.apache.commons.lang3.text.StrSubstitutor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, Locale.FilteringMode> hashMap0 = new HashMap<String, Locale.FilteringMode>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Locale.FilteringMode>) hashMap0);
      strSubstitutor0.setVariablePrefix('');
      strSubstitutor0.setVariableSuffix('');
      char[] charArray0 = new char[4];
      charArray0[0] = '';
      charArray0[3] = '';
      strSubstitutor0.replace(charArray0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.setEnableSubstitutionInVariables(true);
      strSubstitutor0.setVariablePrefix('=');
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariableSuffix('$');
      char[] charArray0 = new char[4];
      charArray0[0] = '=';
      charArray0[1] = '=';
      charArray0[2] = '$';
      String string0 = strSubstitutor1.replace(charArray0);
      assertTrue(strSubstitutor0.isEnableSubstitutionInVariables());
      assertEquals("==$\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('$');
      strSubstitutor1.setEnableSubstitutionInVariables(true);
      strSubstitutor0.replace("$}");
      assertTrue(strSubstitutor0.isEnableSubstitutionInVariables());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null, 1, 42);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder('$');
      // Undeclared exception!
      try { 
        strSubstitutor0.replaceIn(strBuilder0, (int) '$', (int) '$');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 36
         //
         verifyException("org.apache.commons.lang3.text.StrMatcher$StringMatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      boolean boolean0 = strSubstitutor0.replaceIn((StrBuilder) null);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder();
      boolean boolean0 = strSubstitutor0.replaceIn(strBuilder0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('$');
      strSubstitutor0.setVariableSuffix('$');
      StringBuffer stringBuffer0 = new StringBuffer("3$g$");
      stringBuffer0.replace(1, 1, "3$g$");
      boolean boolean0 = strSubstitutor1.replaceIn(stringBuffer0);
      assertEquals(7, stringBuffer0.length());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, Locale.FilteringMode> hashMap0 = new HashMap<String, Locale.FilteringMode>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Locale.FilteringMode>) hashMap0);
      boolean boolean0 = strSubstitutor0.replaceIn((StringBuffer) null, (int) '$', (int) '$');
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      boolean boolean0 = strSubstitutor0.replaceIn((StringBuffer) null);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer("3$g$");
      boolean boolean0 = strSubstitutor0.replaceIn(stringBuffer0);
      assertFalse(boolean0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = StrSubstitutor.replaceSystemProperties((Object) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      String string0 = strSubstitutor0.replace((StrBuilder) null, (int) '$', (int) '$');
      assertNull(string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StrBuilder) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrBuilder strBuilder0 = new StrBuilder('$');
      String string0 = strSubstitutor0.replace(strBuilder0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      String string0 = strSubstitutor0.replace((StringBuffer) null, 42, 42);
      assertNull(string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      try { 
        strSubstitutor0.replace(stringBuffer0, (int) '$', (int) '$');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // startIndex must be valid
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((StringBuffer) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StringBuffer stringBuffer0 = new StringBuffer("wMsJ|g/y3=@TXT?_");
      String string0 = strSubstitutor0.replace(stringBuffer0);
      assertNotNull(string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      String string0 = strSubstitutor0.replace((char[]) null, 38, 38);
      assertNull(string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        strSubstitutor0.replace(charArray0, (-2898), (-2898));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // Invalid startIndex: -2898
         //
         verifyException("org.apache.commons.lang3.text.StrBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((char[]) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HashMap<String, Locale.FilteringMode> hashMap0 = new HashMap<String, Locale.FilteringMode>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Locale.FilteringMode>) hashMap0);
      strSubstitutor0.setVariablePrefix('');
      String string0 = strSubstitutor0.replace("$$", 2, 2);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((String) null, (int) '$', (int) '$');
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      HashMap<String, Locale.FilteringMode> hashMap0 = new HashMap<String, Locale.FilteringMode>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, Locale.FilteringMode>) hashMap0);
      String string0 = strSubstitutor0.replace("$$", 2, 2);
      assertEquals('$', strSubstitutor0.getEscapeChar());
      assertEquals("$", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      StrSubstitutor strSubstitutor1 = strSubstitutor0.setVariablePrefix('$');
      strSubstitutor1.setVariableSuffix('$');
      String string0 = strSubstitutor1.replace("$|$$e$$l");
      assertEquals("$|$e$$l", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      strSubstitutor0.replace((String) null);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = new Object();
      Properties properties0 = new Properties();
      properties0.put("", object0);
      String string0 = StrSubstitutor.replace(object0, properties0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      String string0 = StrSubstitutor.replace(object0, (Properties) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrSubstitutor strSubstitutor0 = new StrSubstitutor();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String string0 = StrSubstitutor.replace((Object) strSubstitutor0, (Map<String, Object>) hashMap0, "j0", "j0");
      assertNotNull(string0);
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      StrSubstitutor strSubstitutor0 = new StrSubstitutor((Map<String, String>) hashMap0, "$$", "$$", '$');
      assertEquals('$', strSubstitutor0.getEscapeChar());
  }
}
