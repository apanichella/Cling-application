/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:07:07 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ReflectionToStringBuilder_ESTest extends ReflectionToStringBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(object0);
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        reflectionToStringBuilder0.setUpToClass(class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Specified class is not a superclass of the object
         //
         verifyException("org.apache.commons.lang3.builder.ReflectionToStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      Class<Object> class0 = Object.class;
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder((Object) null, toStringStyle0, stringBuffer0, (Class<? super Object>) class0, true, true);
      assertTrue(reflectionToStringBuilder0.isAppendStatics());
      assertTrue(reflectionToStringBuilder0.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) standardToStringStyle0, (String[]) null);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      Class<String> class0 = String.class;
      String string0 = ReflectionToStringBuilder.toString("INUX", (ToStringStyle) standardToStringStyle0, true, true, (Class<? super String>) class0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string0 = ReflectionToStringBuilder.toString((Object) linkedList0);
      assertFalse(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) null, (String) null);
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = ReflectionToStringBuilder.toNoNullStringArray((Collection<String>) null);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(standardToStringStyle0);
      // Undeclared exception!
      try { 
        reflectionToStringBuilder0.reflectionAppendArray(standardToStringStyle0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument is not an array
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string0 = ReflectionToStringBuilder.toString((Object) linkedList0, (ToStringStyle) standardToStringStyle0, true);
      assertFalse(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string0 = ReflectionToStringBuilder.toStringExclude(object0, (Collection<String>) linkedList0);
      assertFalse(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      String string0 = ReflectionToStringBuilder.toString(object0, toStringStyle0, true, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      Class<String> class0 = String.class;
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder("T-Kn.?2L", toStringStyle0, (StringBuffer) null, (Class<? super String>) class0, true, true);
      // Undeclared exception!
      try { 
        reflectionToStringBuilder0.getExcludeFieldNames();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.builder.ReflectionToStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(standardToStringStyle0, standardToStringStyle0);
      assertFalse(reflectionToStringBuilder0.isAppendStatics());
      assertFalse(reflectionToStringBuilder0.isAppendTransients());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      String string0 = ToStringBuilder.reflectionToString(object0, toStringStyle0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ReflectionToStringBuilder reflectionToStringBuilder0 = new ReflectionToStringBuilder(standardToStringStyle0, standardToStringStyle0, (StringBuffer) null);
      assertFalse(reflectionToStringBuilder0.isAppendTransients());
      assertFalse(reflectionToStringBuilder0.isAppendStatics());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = ReflectionToStringBuilder.toStringExclude((Object) "kDh ", "kDh ");
      assertNotNull(string0);
  }
}
