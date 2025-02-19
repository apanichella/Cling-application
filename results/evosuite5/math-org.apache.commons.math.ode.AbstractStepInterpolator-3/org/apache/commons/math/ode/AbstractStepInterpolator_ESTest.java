/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:39:18 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectOutputStream;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.apache.commons.math.ode.EulerStepInterpolator;
import org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator;
import org.apache.commons.math.ode.MidpointStepInterpolator;
import org.apache.commons.math.ode.StepInterpolator;
import org.apache.commons.math.ode.ThreeEighthesStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractStepInterpolator_ESTest extends AbstractStepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double[][] doubleArray1 = new double[1][5];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, true);
      graggBulirschStoerStepInterpolator0.finalizeStep();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("-^dyzIAj&8");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      graggBulirschStoerStepInterpolator0.writeBaseExternal(objectOutputStream0);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(graggBulirschStoerStepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EulerStepInterpolator eulerStepInterpolator0 = new EulerStepInterpolator();
      // Undeclared exception!
      try { 
        eulerStepInterpolator0.storeTime((-186.00349869512195));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      DummyStepInterpolator dummyStepInterpolator1 = new DummyStepInterpolator(dummyStepInterpolator0);
      assertEquals(Double.NaN, dummyStepInterpolator1.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator1.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator1.getInterpolatedTime(), 0.01);
      assertTrue(dummyStepInterpolator1.isForward());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      double[] doubleArray0 = new double[0];
      threeEighthesStepInterpolator0.reinitialize(doubleArray0, true);
      assertTrue(threeEighthesStepInterpolator0.isForward());
      assertEquals(Double.NaN, threeEighthesStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, threeEighthesStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, threeEighthesStepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EulerStepInterpolator eulerStepInterpolator0 = new EulerStepInterpolator();
      // Undeclared exception!
      try { 
        eulerStepInterpolator0.setInterpolatedTime((-2814.808817));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.EulerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EulerStepInterpolator eulerStepInterpolator0 = new EulerStepInterpolator();
      double double0 = eulerStepInterpolator0.getCurrentTime();
      assertEquals(Double.NaN, eulerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(eulerStepInterpolator0.isForward());
      assertEquals(Double.NaN, eulerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MidpointStepInterpolator midpointStepInterpolator0 = new MidpointStepInterpolator();
      double double0 = midpointStepInterpolator0.getPreviousTime();
      assertTrue(midpointStepInterpolator0.isForward());
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, midpointStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, midpointStepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EulerStepInterpolator eulerStepInterpolator0 = new EulerStepInterpolator();
      eulerStepInterpolator0.shift();
      assertEquals(Double.NaN, eulerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, eulerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(eulerStepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MidpointStepInterpolator midpointStepInterpolator0 = new MidpointStepInterpolator();
      boolean boolean0 = midpointStepInterpolator0.isForward();
      assertEquals(Double.NaN, midpointStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, midpointStepInterpolator0.getCurrentTime(), 0.01);
      assertTrue(boolean0);
      assertEquals(Double.NaN, midpointStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MidpointStepInterpolator midpointStepInterpolator0 = new MidpointStepInterpolator();
      double double0 = midpointStepInterpolator0.getInterpolatedTime();
      assertTrue(midpointStepInterpolator0.isForward());
      assertEquals(Double.NaN, midpointStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, midpointStepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      StepInterpolator stepInterpolator0 = threeEighthesStepInterpolator0.copy();
      assertEquals(Double.NaN, stepInterpolator0.getCurrentTime(), 0.01);
      assertTrue(stepInterpolator0.isForward());
      assertEquals(Double.NaN, stepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, stepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EulerStepInterpolator eulerStepInterpolator0 = new EulerStepInterpolator();
      // Undeclared exception!
      try { 
        eulerStepInterpolator0.getInterpolatedState();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractStepInterpolator", e);
      }
  }
}
