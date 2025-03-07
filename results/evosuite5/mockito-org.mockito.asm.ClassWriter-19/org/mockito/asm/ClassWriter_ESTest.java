/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 13:51:26 GMT 2019
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Attribute;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Label;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      String string0 = classWriter0.getCommonSuperClass("java/lang/String", "java/lang/Object");
      assertNotNull(string0);
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.ClassAdapter", "org.mockito.asm.ClassAdapter");
      assertEquals("org.mockito.asm.ClassAdapter", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/String");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 9);
      String string0 = classWriter0.getCommonSuperClass("java/lang/String", "org.mockito.asm.ClassReader");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(12, 92);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      classWriter0.newConstItem("org.mockito.asm.ClassAdapter");
      int int0 = classWriter0.newConst("org.mockito.asm.ClassAdapter");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      Item item0 = classWriter0.newDouble(10);
      Item item1 = classWriter0.newDouble(10);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(160);
      Item item0 = classWriter0.newLong(0L);
      Item item1 = classWriter0.newLong(0L);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(92);
      Item item0 = classWriter0.newFloat((byte) (-25));
      Item item1 = classWriter0.newFloat((byte) (-25));
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      Item item0 = classWriter0.newInteger(35);
      Item item1 = classWriter0.newInteger(35);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-30));
      Type type0 = Type.VOID_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        classWriter0.newConst(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@6829c85b
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(635);
      Type type0 = Type.getObjectType("aYGu=A]?");
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2707);
      Double double0 = new Double(2);
      int int0 = classWriter0.newConst(double0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262192);
      Long long0 = new Long(2);
      Item item0 = classWriter0.newConstItem(long0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      Float float0 = new Float((float) 1);
      Item item0 = classWriter0.newConstItem(float0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      Boolean boolean0 = new Boolean("wGcy64DLCs8-;wz8");
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(761);
      Boolean boolean0 = Boolean.TRUE;
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(602);
      Short short0 = Short.valueOf((short)19);
      Item item0 = classWriter0.newConstItem(short0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64);
      Character character0 = Character.valueOf('t');
      int int0 = classWriter0.newConst(character0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262140);
      Byte byte0 = new Byte((byte)40);
      Item item0 = classWriter0.newConstItem(byte0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(884);
      classWriter0.invalidFrames = true;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("java/lang/String");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 9);
      Attribute attribute0 = new Attribute("RuntimeVisibleParameterAnnotations");
      char[] charArray0 = new char[6];
      Label[] labelArray0 = new Label[0];
      Attribute attribute1 = attribute0.read(classReader0, 6, 2, charArray0, 1, labelArray0);
      classWriter0.visitAttribute(attribute1);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(6951, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1000);
      classWriter0.visitInnerClass("EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", "u@-AT6", 1000);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(273, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(77);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit(1, (-2968), "", "", "", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2507);
      String[] stringArray0 = new String[0];
      classWriter0.visit(16777216, 16777216, "*nz`>", "SourceFile", "SourceFile", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1072);
      String[] stringArray0 = new String[0];
      classWriter0.visitMethod(2, "W{]", "#kOIS^~HadR", "", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1072);
      classWriter0.visitField(1072, ".class", ".class", ".class", ".class");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(88, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(224);
      classWriter0.visitInnerClass((String) null, (String) null, (String) null, 7);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      classWriter0.visitInnerClass(" }Vqlt/{,HHx", " }Vqlt/{,HHx", "(Ek?{HVD=", 4096);
      classWriter0.visitInnerClass("(Ek?{HVD=", "!2nD9^|\"5<", "O$ %_Mt%R6LB", 38);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3696);
      classWriter0.visitAnnotation("pE", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      classWriter0.visitAnnotation("0ng!-~6uh.L-Dfb", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(84, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(34);
      classWriter0.visitOuterClass("6@]0*S| 6:8q&_3", "", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4));
      classWriter0.visitOuterClass("V8uKhX\"SCbf)yj", "V8uKhX\"SCbf)yj", "V8uKhX\"SCbf)yj");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(635);
      classWriter0.visitOuterClass("=9fjyi@m*-bKX4S", (String) null, "=9fjyi@m*-bKX4S");
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(41);
      classWriter0.visitSource("tba\"K", "tba\"K");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1676);
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(77);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit((-797), (-2968), "", "", "", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(71, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1614));
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        classWriter0.visit((-418), (-1614), "", "", (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(9);
      classWriter0.visit(9, 9, "org.mockito.asm.ClassAdapter", "org.mockito.asm.ClassAdapter", "org.mockito.asm.ClassAdapter", (String[]) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-983));
      int int0 = classWriter0.newMethod("Si'j2%ATYjHN<z", "Si'j2%ATYjHN<z", "", true);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2507);
      int int0 = classWriter0.newField("", "", "");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.Type");
      ClassWriter classWriter0 = new ClassWriter(2);
      Attribute[] attributeArray0 = new Attribute[3];
      classReader0.accept((ClassVisitor) classWriter0, attributeArray0, 512);
      assertEquals(2, ClassReader.SKIP_DEBUG);
  }
}
