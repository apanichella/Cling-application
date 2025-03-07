/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:40:12 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator;
import org.apache.commons.math.ode.SwitchState;
import org.apache.commons.math.ode.SwitchingFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SwitchState_ESTest extends SwitchState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((-388.42724), 2716.4141591201924, (-388.42724), 2716.4141591201924, 2716.4141591201924).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-388.42724), (-388.42724), 3439);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertNotNull(switchState0);
      
      double[] doubleArray0 = new double[1];
      switchState0.stepAccepted(3439, doubleArray0);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(1, doubleArray0.length);
      assertNotNull(dummyStepInterpolator0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      boolean boolean0 = switchState0.evaluateStep(dummyStepInterpolator0);
      assertEquals(3439.0, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
      assertTrue(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(3439.0, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertTrue(boolean0);
      
      switchState0.stepAccepted(2716.4141591201924, doubleArray0);
      assertEquals(3439.0, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      boolean boolean1 = switchState0.reset(415.173632, doubleArray0);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertEquals(1, doubleArray0.length);
      assertTrue(boolean1 == boolean0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((-388.42724), 2716.4141591201924, (-388.42724), 2716.4141591201924, 2716.4141591201924).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-388.42724), (-388.42724), 3439);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertNotNull(switchState0);
      
      double[] doubleArray0 = new double[5];
      switchState0.stepAccepted(2716.4141591201924, doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertEquals(5, doubleArray0.length);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double[][] doubleArray1 = new double[24][0];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertFalse(graggBulirschStoerStepInterpolator0.isForward());
      assertEquals(5, doubleArray0.length);
      assertEquals(24, doubleArray1.length);
      assertNotNull(graggBulirschStoerStepInterpolator0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      boolean boolean0 = switchState0.evaluateStep(graggBulirschStoerStepInterpolator0);
      assertEquals(2716.4141591201924, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertEquals(2716.4141591201924, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertFalse(graggBulirschStoerStepInterpolator0.isForward());
      assertEquals(5, doubleArray0.length);
      assertEquals(24, doubleArray1.length);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(boolean0);
      
      switchState0.stepAccepted((-388.42724), doubleArray1[3]);
      assertEquals(2716.4141591201924, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertEquals(24, doubleArray1.length);
      
      boolean boolean1 = switchState0.reset(0.0, doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertEquals(5, doubleArray0.length);
      assertTrue(boolean1 == boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-3605), (-3605), (-3605));
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertNotNull(switchState0);
      
      double[] doubleArray0 = new double[0];
      boolean boolean0 = switchState0.reset(867.9353951704973, doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertEquals(0, doubleArray0.length);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-388.42724), 2716.4141591201924, (-388.42724), 2716.4141591201924, 2716.4141591201924).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-388.42724), (-388.42724), 3439);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertNotNull(switchState0);
      
      double[] doubleArray0 = new double[5];
      switchState0.stepAccepted(2716.4141591201924, doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertEquals(5, doubleArray0.length);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      double[][] doubleArray1 = new double[24][0];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertFalse(graggBulirschStoerStepInterpolator0.isForward());
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(5, doubleArray0.length);
      assertEquals(24, doubleArray1.length);
      assertNotNull(graggBulirschStoerStepInterpolator0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      
      boolean boolean0 = switchState0.evaluateStep(graggBulirschStoerStepInterpolator0);
      assertFalse(switchState0.stop());
      assertEquals(2716.4141591201924, switchState0.getEventTime(), 0.01);
      assertEquals(2716.4141591201924, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertFalse(graggBulirschStoerStepInterpolator0.isForward());
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(5, doubleArray0.length);
      assertEquals(24, doubleArray1.length);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertTrue(boolean0);
      
      boolean boolean1 = switchState0.reset(0.0, doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertEquals(5, doubleArray0.length);
      assertFalse(boolean1 == boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((-388.42724), 2716.684, (-388.42724), 2716.684, 2716.684).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 2716.684, 2716.684, 3451);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertNotNull(switchState0);
      
      double[] doubleArray0 = new double[1];
      switchState0.stepAccepted(104.0996495089623, doubleArray0);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      double[][] doubleArray1 = new double[1][6];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator(doubleArray0, doubleArray0, doubleArray0, doubleArray0, doubleArray1, false);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertFalse(graggBulirschStoerStepInterpolator0.isForward());
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(1, doubleArray0.length);
      assertEquals(1, doubleArray1.length);
      assertNotNull(graggBulirschStoerStepInterpolator0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      boolean boolean0 = switchState0.evaluateStep(graggBulirschStoerStepInterpolator0);
      assertEquals(104.0996495089623, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getCurrentTime(), 0.01);
      assertFalse(graggBulirschStoerStepInterpolator0.isForward());
      assertEquals(104.0996495089623, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(1, doubleArray0.length);
      assertEquals(1, doubleArray1.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertTrue(boolean0);
      
      switchState0.stepAccepted(2716.684, doubleArray0);
      assertEquals(104.0996495089623, switchState0.getEventTime(), 0.01);
      assertTrue(switchState0.stop());
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      boolean boolean1 = switchState0.stop();
      assertEquals(104.0996495089623, switchState0.getEventTime(), 0.01);
      assertTrue(switchState0.stop());
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-388.42724), (-388.42724), 3439);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertNotNull(switchState0);
      
      boolean boolean0 = switchState0.stop();
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 1804.4271914414335, 1804.4271914414335, 1583);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertNotNull(switchState0);
      
      switchState0.stepAccepted(1804.4271914414335, (double[]) null);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn((-388.42724), 2716.4141591201924, (-388.42724), 2716.4141591201924, 2716.4141591201924).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-388.42724), (-388.42724), 3439);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertNotNull(switchState0);
      
      double[] doubleArray0 = new double[1];
      switchState0.stepAccepted(3439, doubleArray0);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(dummyStepInterpolator0.isForward());
      assertEquals(1, doubleArray0.length);
      assertNotNull(dummyStepInterpolator0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      boolean boolean0 = switchState0.evaluateStep(dummyStepInterpolator0);
      assertFalse(switchState0.stop());
      assertEquals(3439.0, switchState0.getEventTime(), 0.01);
      assertEquals(3439.0, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
      assertTrue(dummyStepInterpolator0.isForward());
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertTrue(boolean0);
      
      switchState0.stepAccepted(2716.4141591201924, doubleArray0);
      assertFalse(switchState0.stop());
      assertEquals(3439.0, switchState0.getEventTime(), 0.01);
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      boolean boolean1 = switchState0.evaluateStep(dummyStepInterpolator0);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(dummyStepInterpolator0.isForward());
      assertEquals(1, doubleArray0.length);
      assertFalse(boolean1 == boolean0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-396.61214373077144), 2716.4141591201924, (-396.61214373077144), 2716.4141591201924, 2716.4141591201924).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-396.61214373077144), (-396.61214373077144), 3439);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertNotNull(switchState0);
      
      double[] doubleArray0 = new double[1];
      switchState0.stepAccepted((-396.61214373077144), doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      assertEquals(Double.NaN, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertFalse(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, dummyStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(1, doubleArray0.length);
      assertNotNull(dummyStepInterpolator0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      dummyStepInterpolator0.storeTime(3439);
      assertEquals(3439.0, dummyStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(3439.0, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertFalse(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      
      boolean boolean0 = switchState0.evaluateStep(dummyStepInterpolator0);
      assertEquals((-396.61214373077144), switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertEquals(3439.0, dummyStepInterpolator0.getCurrentTime(), 0.01);
      assertFalse(dummyStepInterpolator0.isForward());
      assertEquals(Double.NaN, dummyStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals((-198.30607186538572), dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-3600), (-3600), (-3600));
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertNotNull(switchState0);
      
      double[] doubleArray0 = new double[1];
      switchState0.reinitializeBegin((-3600), doubleArray0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
      assertEquals(1, doubleArray0.length);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2255.76)).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-2255.76), (-2255.76), 3451);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertNotNull(switchState0);
      
      switchState0.reinitializeBegin((-2255.76), (double[]) null);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      SwitchState switchState0 = new SwitchState(switchingFunction0, 2716.684, 2716.684, 3451);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertNotNull(switchState0);
      
      double double0 = switchState0.getEventTime();
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-396.61214373077144), 2716.4141591201924, (-396.61214373077144), 2716.4141591201924, 2716.4141591201924).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, (-396.61214373077144), (-396.61214373077144), 3439);
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      try { 
        switchState0.evaluateStep(dummyStepInterpolator0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximal number of iterations (3,439) exceeded
         //
         verifyException("org.apache.commons.math.analysis.BrentSolver", e);
      }
  }
}
