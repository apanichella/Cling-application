/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 14:21:56 GMT 2019
 */

package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.FractionFormat;
import org.apache.commons.math.fraction.ProperFractionFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FractionFormat_ESTest extends FractionFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance();
      // Undeclared exception!
      try { 
        fractionFormat0.setNumeratorFormat((NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // numerator format can not be null.
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance();
      DecimalFormat decimalFormat0 = (DecimalFormat)FractionFormat.getDefaultNumberFormat();
      fractionFormat0.setNumeratorFormat(decimalFormat0);
      assertTrue(decimalFormat0.isParseIntegerOnly());
      assertEquals("#,##0", decimalFormat0.toPattern());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FractionFormat fractionFormat0 = new FractionFormat();
      // Undeclared exception!
      try { 
        fractionFormat0.setDenominatorFormat((NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // denominator format can not be null.
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance();
      DecimalFormat decimalFormat0 = (DecimalFormat)NumberFormat.getNumberInstance();
      fractionFormat0.setDenominatorFormat(decimalFormat0);
      assertFalse(decimalFormat0.isParseBigDecimal());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = properFractionFormat0.parse("1$");
      assertEquals(1, fraction0.intValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      try { 
        properFractionFormat0.parse(" 5/ ");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \" 5/ \"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      // Undeclared exception!
      try { 
        properFractionFormat0.format((Object) properFractionFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given object as a fraction
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance();
      try { 
        fractionFormat0.parseObject("");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FractionFormat fractionFormat0 = new FractionFormat();
      Short short0 = new Short((short)18);
      AttributedCharacterIterator attributedCharacterIterator0 = fractionFormat0.formatToCharacterIterator(short0);
      assertEquals(6, attributedCharacterIterator0.getRunLimit());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getProperInstance();
      try { 
        fractionFormat0.parse("1M4f{,ck NuG");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"1M4f{,ck NuG\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = properFractionFormat0.parse("0 / 1");
      assertNotNull(fraction0);
      assertEquals(0, fraction0.intValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      String string0 = FractionFormat.formatFraction(fraction0);
      assertEquals("0 / 1", string0);
  }
}
