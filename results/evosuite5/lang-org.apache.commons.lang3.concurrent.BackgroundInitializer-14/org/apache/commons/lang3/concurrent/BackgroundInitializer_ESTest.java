/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 16:02:38 GMT 2019
 */

package org.apache.commons.lang3.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import org.apache.commons.lang3.concurrent.CallableBackgroundInitializer;
import org.apache.commons.lang3.concurrent.MultiBackgroundInitializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BackgroundInitializer_ESTest extends BackgroundInitializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Callable<Object> callable0 = (Callable<Object>) mock(Callable.class, new ViolatedAssumptionAnswer());
      ExecutorService executorService0 = null;
      CallableBackgroundInitializer<Object> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Object>(callable0, (ExecutorService) null);
      callableBackgroundInitializer0.start();
      callableBackgroundInitializer0.start();
      // Undeclared exception!
      try { 
        callableBackgroundInitializer0.setExternalExecutor((ExecutorService) null);
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
      Callable<Delayed> callable0 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      Callable<Callable<Object>> callable1 = (Callable<Callable<Object>>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable1).call();
      CallableBackgroundInitializer<Callable<Object>> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Callable<Object>>(callable1, forkJoinPool0);
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MockThread.currentThread();
      Callable<Integer> callable2 = (Callable<Integer>) mock(Callable.class, new ViolatedAssumptionAnswer());
      multiBackgroundInitializer0.addInitializer("Callable must not be null!", callableBackgroundInitializer0);
      multiBackgroundInitializer0.initialize();
      String string0 = "[Gm4{<W0FAB7KB X!";
      multiBackgroundInitializer0.addInitializer(string0, callableBackgroundInitializer0);
      assertFalse(multiBackgroundInitializer0.isStarted());
  }
}
