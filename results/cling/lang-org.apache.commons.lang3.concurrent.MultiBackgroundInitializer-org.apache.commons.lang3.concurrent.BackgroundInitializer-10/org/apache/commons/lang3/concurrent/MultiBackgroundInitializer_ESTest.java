/*

 * Tue Mar 03 16:01:22 GMT 2020
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
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.apache.commons.lang3.concurrent.BackgroundInitializer;
import org.apache.commons.lang3.concurrent.CallableBackgroundInitializer;
import org.apache.commons.lang3.concurrent.MultiBackgroundInitializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MultiBackgroundInitializer_ESTest extends MultiBackgroundInitializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExecutorService executorService0 = mock(ExecutorService.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(executorService0).toString();
      doReturn((Future) null).when(executorService0).submit(nullable(java.util.concurrent.Callable.class));
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer(executorService0);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1);
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer(scheduledThreadPoolExecutor0);
      multiBackgroundInitializer1.addInitializer("", multiBackgroundInitializer0);
      multiBackgroundInitializer1.getTaskCount();
      try { 
        multiBackgroundInitializer1.initialize();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // start() must be called first!
         //
         verifyException("org.apache.commons.lang3.concurrent.BackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.addInitializer("", multiBackgroundInitializer1);
      multiBackgroundInitializer0.initialize();
      Callable<Delayed> callable0 = (Callable<Delayed>) mock(Callable.class, new ViolatedAssumptionAnswer());
      CallableBackgroundInitializer<Delayed> callableBackgroundInitializer0 = new CallableBackgroundInitializer<Delayed>(callable0);
      // Undeclared exception!
      try { 
        multiBackgroundInitializer1.addInitializer("Not a checked exception: ", callableBackgroundInitializer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // addInitializer() must not be called after start()!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.addInitializer("", multiBackgroundInitializer1);
      ForkJoinPool forkJoinPool0 = new ForkJoinPool();
      multiBackgroundInitializer1.setExternalExecutor(forkJoinPool0);
      multiBackgroundInitializer0.initialize();
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer0.initialize();
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer1.addInitializer("", multiBackgroundInitializer0);
      int int0 = multiBackgroundInitializer1.getTaskCount();
      assertEquals(2, int0);
      
      MultiBackgroundInitializer.MultiBackgroundInitializerResults multiBackgroundInitializer_MultiBackgroundInitializerResults0 = multiBackgroundInitializer1.initialize();
      assertTrue(multiBackgroundInitializer_MultiBackgroundInitializerResults0.isSuccessful());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer(forkJoinPool0);
      multiBackgroundInitializer0.addInitializer("sIrp7(ypL.cFe$\";", multiBackgroundInitializer1);
      multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer1.addInitializer((String) null, multiBackgroundInitializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Name of child initializer must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer0.addInitializer("", multiBackgroundInitializer1);
      multiBackgroundInitializer0.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer("Z&q{", (BackgroundInitializer<?>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Child initializer must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MultiBackgroundInitializer multiBackgroundInitializer0 = new MultiBackgroundInitializer();
      MultiBackgroundInitializer multiBackgroundInitializer1 = new MultiBackgroundInitializer();
      multiBackgroundInitializer1.addInitializer("", multiBackgroundInitializer0);
      multiBackgroundInitializer1.initialize();
      // Undeclared exception!
      try { 
        multiBackgroundInitializer0.addInitializer((String) null, multiBackgroundInitializer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Name of child initializer must not be null!
         //
         verifyException("org.apache.commons.lang3.concurrent.MultiBackgroundInitializer", e);
      }
  }
}
