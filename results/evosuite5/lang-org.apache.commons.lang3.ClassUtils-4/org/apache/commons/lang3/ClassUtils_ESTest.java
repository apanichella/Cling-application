/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 00:21:51 GMT 2019
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getShortCanonicalName("[java.lang.Class");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("[");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle[]", true);
      String string0 = ClassUtils.getPackageCanonicalName(class0);
      assertEquals("org.apache.commons.lang3.builder", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      String string0 = ClassUtils.getPackageCanonicalName(objectArray0[1], "u#6a3f");
      assertEquals("u#6a3f", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName((Object) "u#6a3f", "1C4aH-)");
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Long> class0 = Long.class;
      String string0 = ClassUtils.getShortCanonicalName(class0);
      assertEquals("Long", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) null, "ZlSXGt:");
      assertEquals("ZlSXGt:", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((Object) ".", "oG]N498?/#");
      assertEquals("String", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      assertEquals(5, classArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
      assertEquals(0, classArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        ClassUtils.getClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className must not be null.
         //
         verifyException("org.apache.commons.lang3.ClassUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      try { 
        ClassUtils.getClass("Nd3.");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("char");
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<String> class0 = String.class;
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = ClassUtils.isInnerClass((Class<?>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertEquals(1, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.wrappersToPrimitives((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 0);
      Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
      assertNotNull(classArray1);
      
      Class<?>[] classArray2 = ClassUtils.wrappersToPrimitives(classArray1);
      Class<?>[] classArray3 = ClassUtils.primitivesToWrappers(classArray2);
      assertSame(classArray3, classArray1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
      assertNull(classArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<ClassUtils> class0 = ClassUtils.class;
      Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
      assertEquals("class org.apache.commons.lang3.ClassUtils", class1.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
      assertEquals(1, classArray1.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Boolean> class1 = Boolean.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Byte> class1 = Byte.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Byte> class1 = Byte.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Short> class1 = Short.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Short> class0 = Short.class;
      Class<Character> class1 = Character.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Double> class1 = Double.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Class<Double> class1 = Double.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Character> class1 = Character.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Character> class1 = Character.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<Character> class0 = Character.TYPE;
      Class<Double> class1 = Double.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Character> class1 = Character.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Character> class1 = Character.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Float> class1 = Float.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Boolean> class0 = Boolean.TYPE;
      Class<Double> class1 = Double.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Boolean> class1 = Boolean.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<Long> class0 = Long.class;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Long> class1 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      Class<Long> class1 = Long.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Integer> class1 = Integer.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Double> class1 = Double.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Object> class1 = Object.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<ClassUtils> class1 = ClassUtils.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      Class<Integer> class1 = Integer.class;
      boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Class<Short> class1 = Short.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Class<Short> class0 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, class0, false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Class<Float> class0 = Float.TYPE;
      boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, class0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 1);
      Class<Short> class0 = Short.class;
      classArray0[0] = class0;
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Class<Integer>[] classArray0 = (Class<Integer>[]) Array.newInstance(Class.class, 4);
      Class<Double>[] classArray1 = (Class<Double>[]) Array.newInstance(Class.class, 8);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("java.vm.specification");
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertFalse(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      List<String> list0 = ClassUtils.convertClassesToClassNames((List<Class<?>>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
      List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
      assertNotNull(list1);
      assertEquals(2, list1.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllInterfaces((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses((Class<?>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
      assertNotNull(list0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("L)LK");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle[]", true);
      String string0 = ClassUtils.getPackageName(class0);
      assertEquals("org.apache.commons.lang3.builder", string0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String string0 = ClassUtils.getPackageName((Object) "(1*brKp", "(1*brKp");
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName("I");
      assertEquals("int", string0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = ClassUtils.getClass(classLoader0, "org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle[]", false);
      String string0 = ClassUtils.getShortClassName(class0);
      assertEquals("ToStringStyle.NoFieldNameToStringStyle[]", string0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[java.lang.Short");
      assertEquals("Short[]", string0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("[L");
      assertEquals("L[]", string0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      String string0 = ClassUtils.getShortCanonicalName((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Class<?>) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      String string0 = ClassUtils.getShortClassName((Object) null, "? ?nq2t1e8");
      assertEquals("? ?nq2t1e8", string0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      String string0 = ClassUtils.getShortClassName((Object) class0, "Windows");
      assertEquals("Class", string0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      try { 
        ClassUtils.getClass(classLoader0, "bx[RO]v[e8lKe`y1");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassUtils classUtils0 = new ClassUtils();
      assertEquals('$', ClassUtils.INNER_CLASS_SEPARATOR_CHAR);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 1);
      boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Class<?> class0 = ClassUtils.getClass("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle");
      boolean boolean0 = ClassUtils.isInnerClass(class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      String string0 = ClassUtils.getPackageCanonicalName("[L");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Class<Long> class0 = Long.TYPE;
      Class<Short> class1 = Short.class;
      boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Class<Double> class0 = Double.TYPE;
      boolean boolean0 = ClassUtils.isAssignable(class0, class0);
      assertTrue(boolean0);
  }
}
