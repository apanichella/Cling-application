/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 21:49:11 GMT 2019
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
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(757);
      classWriter0.index = 757;
      Item item0 = classWriter0.newMethodItem("/AT", "/AT", "/AT", true);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1699);
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.ClassWriter", "java/lang/Object");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1810);
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.ClassWriter", "org.mockito.asm.ClassWriter");
      assertEquals("org.mockito.asm.ClassWriter", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(24117260);
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.ClassWriter", "org.mockito.asm.ClassAdapter");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1708);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType((byte)29, (byte)29);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1708);
      Item[] itemArray0 = new Item[2];
      classWriter0.typeTable = itemArray0;
      classWriter0.addUninitializedType("(H)iZ(\"@ik?.^", 1708);
      int int0 = classWriter0.addUninitializedType("Deprecated", (byte)9);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(190);
      int int0 = classWriter0.addUninitializedType("", 190);
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("", 190);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(25);
      int int0 = classWriter0.addType("eS82*G3m1]_9DlC");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("eS82*G3m1]_9DlC");
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(744);
      Item item0 = classWriter0.newMethodItem("uNaw|tpEvU_h", "&O|7HjN=*", "jX_x7{!OiV{A^", false);
      Item item1 = classWriter0.newMethodItem("org.mockito.asm.Handler", "&O|7HjN=*", "jX_x7{!OiV{A^", false);
      assertNotSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-837));
      Item item0 = classWriter0.newConstItem("");
      Item item1 = classWriter0.newConstItem("");
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = classWriter0.newDouble(0);
      Item item1 = classWriter0.newDouble(0);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1810);
      Item item0 = classWriter0.newLong(0L);
      Item item1 = classWriter0.newLong(0L);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(168);
      Item item0 = classWriter0.newFloat(2);
      Item item1 = classWriter0.newFloat(2);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = classWriter0.newInteger(0);
      Item item1 = classWriter0.newInteger(0);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      Item item0 = classWriter0.newMethodItem("SourceDebugExtension", "SourceDebugExtension", "SourceDebugExtension", true);
      Item item1 = classWriter0.newMethodItem("SourceDebugExtension", "SourceDebugExtension", "SourceDebugExtension", true);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1810);
      Item item0 = classWriter0.newFieldItem("DCxcR^hwUZ~Om6al", "DCxcR^hwUZ~Om6al", "DCxcR^hwUZ~Om6al");
      Item item1 = classWriter0.newFieldItem("DCxcR^hwUZ~Om6al", "DCxcR^hwUZ~Om6al", "DCxcR^hwUZ~Om6al");
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(34);
      Class<Boolean> class0 = Boolean.class;
      Type type0 = Type.getType(class0);
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2915);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        classWriter0.newConst(object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@2a306ecd
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(354);
      Double double0 = new Double((-1046.19730862));
      int int0 = classWriter0.newConst(double0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2526));
      Long long0 = new Long(1);
      int int0 = classWriter0.newConst(long0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1712);
      Float float0 = new Float(1333.7367995);
      int int0 = classWriter0.newConst(float0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      Boolean boolean0 = Boolean.TRUE;
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      Boolean boolean0 = Boolean.FALSE;
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1690);
      Short short0 = Short.valueOf((short)41);
      int int0 = classWriter0.newConst(short0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(197);
      Character character0 = new Character('H');
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      Byte byte0 = new Byte((byte) (-39));
      int int0 = classWriter0.newConst(byte0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(235);
      Item item0 = classWriter0.newConstItem(classWriter0.COMPUTE_MAXS);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
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
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(190);
      String[] stringArray0 = new String[0];
      classWriter0.visit(190, (-1980), "9-1!Ww", "{]!y|=dgf-IcQ7r", "9-1!Ww", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(21);
      String[] stringArray0 = new String[0];
      classWriter0.visit(21, (-176), "$BO`SQCC9PPGvHL]", "value ", "$BO`SQCC9PPGvHL]", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(112, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      classWriter0.visitOuterClass("Y", "Y", "Y");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(64, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(235);
      classWriter0.visitInnerClass((String) null, (String) null, (String) null, 2);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(235);
      classWriter0.visitInnerClass("sbteLVbtotyB(2!]Q", (String) null, "", 235);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(220);
      classWriter0.visitInnerClass((String) null, "eRDCGL-:v#R.g", "eRDCGL-:v#R.g", 220);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(235);
      classWriter0.visitInnerClass("LineNumberTable", "LineNumberTable", "", 235);
      classWriter0.visitInnerClass("", "", "", 235);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1705);
      classWriter0.visitAnnotation("g*", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(69, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(18);
      classWriter0.visitAnnotation("^?O4$W)Y j", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(79, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(262144);
      classWriter0.visitOuterClass("@e%.4T49nsx0T", "DCxcR^hwUZ~Om6al", (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      classWriter0.visitOuterClass("", (String) null, "I");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(21);
      classWriter0.visitSource("", "");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4489));
      classWriter0.visitSource((String) null, (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.ClassWriter";
      classWriter0.visit(16, 16, "hzPSln`5<", "=_{z(", "org.mockito.asm.ClassWriter", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(102, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(190);
      classWriter0.visit(190, 40, "9-1!Ww", "{]!y|=dgf-IcQ7r", "9-1!Ww", (String[]) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3522));
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        classWriter0.visit((-3522), 252, "", (String) null, (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1699);
      classWriter0.visitField(1699, "org.mockito.asm.ClassAdapter", "org.mockito.asm.ClassAdapter", "org.mockito.asm.ClassAdapter", "org.mockito.asm.ClassAdapter");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(110, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1567);
      Type type0 = Type.getReturnType("SourceFile");
      int int0 = classWriter0.newConst(type0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(890);
      int int0 = classWriter0.newMethod("1*N6#BtQ&:Xum", "1*N6#BtQ&:Xum", "1*N6#BtQ&:Xum", false);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1736);
      classWriter0.visitMethod(14, "Ua3&e<u]Y[", "", "Ua3&e<u]Y[", (String[]) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(68, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4489));
      Attribute attribute0 = new Attribute("EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE");
      classWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-837));
      int int0 = classWriter0.newField("ukeRoPB3djQO/`o", "ukeRoPB3djQO/`o", "ukeRoPB3djQO/`o");
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.ClassWriter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 2);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(8, 380);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.visitEnd();
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }
}
