/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 16:09:19 GMT 2019
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import org.apache.commons.lang3.concurrent.CallableBackgroundInitializer;
import org.apache.commons.lang3.concurrent.MultiBackgroundInitializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BackgroundInitializer_ESTest extends BackgroundInitializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExecutorService executorService0 = null;
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.start();
      multiBackgroundInitializer0.getFuture();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.setExternalExecutor((ExecutorService) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot set ExecutorService after start()!
         //
         verifyException("org.apache.commons.lang3.concurrent.BackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Callable<Integer> callable0 = (Callable<Integer>) mock(Callable.class, new ViolatedAssumptionAnswer());
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      CallableBackgroundInitializer<Integer> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Integer>(callable0, forkJoinPool0);
      callableBackgroundInitializer0.start();
      boolean boolean0 = callableBackgroundInitializer0.start();
      assertTrue(callableBackgroundInitializer0.isStarted());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<Object> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Object>(callable0);
      // Undeclared exception!
      try { 
        callableBackgroundInitializer0.get();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // start() must be called first!
         //
         verifyException("org.apache.commons.lang3.concurrent.BackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer((-379));
      Callable<Integer> callable0 = (Callable<Integer>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<Integer> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Integer>(callable0);
      boolean boolean0 = callableBackgroundInitializer0.start();
      assertTrue(callableBackgroundInitializer0.isStarted());
      assertTrue(boolean0);
  }
}
