import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter26);
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory28.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node33 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = iRFactory0.transformTree(astRoot32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(astRoot32);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        java.io.Reader reader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory0.parse(reader21, "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 1);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons28, errorReporter29);
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = iRFactory32.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node37 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
        com.google.javascript.rhino.head.Node node38 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = iRFactory27.transformTree(astRoot36);
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = iRFactory27.parse("", "", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node44 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(astRoot36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(scriptNode39);
        org.junit.Assert.assertNotNull(astRoot43);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node23 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "hi!", 0);
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = iRFactory32.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = iRFactory31.transformTree(astRoot36);
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = iRFactory31.parse("", "", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node42 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(astRoot36);
        org.junit.Assert.assertNotNull(scriptNode37);
        org.junit.Assert.assertNotNull(astRoot41);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) '#');
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter19);
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory22.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node27 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        com.google.javascript.rhino.head.Node node28 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        com.google.javascript.rhino.head.Node node29 = iRFactory17.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory17.parse("", "", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = iRFactory0.transformTree(astRoot33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertNotNull(astRoot26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(astRoot33);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node23 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "hi!", 0);
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        boolean boolean31 = iRFactory0.eof();
        boolean boolean32 = iRFactory0.eof();
        boolean boolean33 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35, errorReporter36);
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = iRFactory39.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node44 = iRFactory38.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node45 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = iRFactory34.transformTree(astRoot43);
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = iRFactory34.parse("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node51 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(astRoot43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(scriptNode46);
        org.junit.Assert.assertNotNull(astRoot50);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons5, errorReporter6);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons8, errorReporter9);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node20 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node21 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node22 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node23 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node24 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory1.transformTree(astRoot19);
        com.google.javascript.rhino.head.Node node26 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse("", "", (int) (byte) 100);
        boolean boolean31 = iRFactory0.eof();
        boolean boolean32 = iRFactory0.eof();
        boolean boolean33 = iRFactory0.eof();
        boolean boolean34 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons37 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons37, errorReporter38);
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory41 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = iRFactory41.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node46 = iRFactory40.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
        com.google.javascript.rhino.head.Node node47 = iRFactory39.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = iRFactory36.transformTree(astRoot45);
        com.google.javascript.rhino.head.Node node49 = iRFactory35.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode48);
        com.google.javascript.rhino.head.ast.AstRoot astRoot53 = iRFactory35.parse("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode54 = iRFactory0.transformTree(astRoot53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(astRoot45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(scriptNode48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(astRoot53);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot11 = iRFactory0.parse(reader8, "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (short) 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory20.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory19.transformTree(astRoot24);
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory19.parse("", "hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = iRFactory0.transformTree(astRoot29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(astRoot24);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertNotNull(astRoot29);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 10);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        java.io.Reader reader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse(reader25, "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 1);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons30, errorReporter31);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons33, errorReporter34);
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = iRFactory37.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node42 = iRFactory36.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot41);
        com.google.javascript.rhino.head.Node node43 = iRFactory35.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot41);
        com.google.javascript.rhino.head.Node node44 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot41);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = iRFactory29.transformTree(astRoot41);
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = iRFactory29.parse("", "hi!", (int) '#');
        com.google.javascript.rhino.head.Node node50 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot49);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node51 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(astRoot41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(scriptNode45);
        org.junit.Assert.assertNotNull(astRoot49);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory0.parse("", "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot8 = iRFactory0.parse("hi!", "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons19, errorReporter20);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter26);
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory29.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node34 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node35 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node36 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node37 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode38 = iRFactory0.transformTree(astRoot33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(astRoot33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons5, errorReporter6);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons8, errorReporter9);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node20 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node21 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node22 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node23 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node24 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory1.transformTree(astRoot19);
        com.google.javascript.rhino.head.Node node26 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse("", "", (int) (byte) 100);
        boolean boolean31 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory0.parse("", "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory26.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = iRFactory25.transformTree(astRoot30);
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory25.parse("", "hi!", 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node36 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertNotNull(scriptNode31);
        org.junit.Assert.assertNotNull(astRoot35);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (int) '#');
        boolean boolean21 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory0.parse("hi!", "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (short) 100);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter19);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory31.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node36 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node37 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node38 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node39 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node40 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = iRFactory17.transformTree(astRoot35);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node42 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertNotNull(astRoot35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(scriptNode41);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons9, errorReporter10);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons12, errorReporter13);
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory16.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node21 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node22 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node23 = iRFactory11.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node24 = iRFactory8.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory0.transformTree(astRoot20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter15);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory18.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node23 = iRFactory17.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.Node node24 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.Node node25 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory13.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = iRFactory12.transformTree(astRoot29);
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory12.parse("", "", 65536);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = iRFactory0.transformTree(astRoot34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(astRoot29);
        org.junit.Assert.assertNotNull(scriptNode30);
        org.junit.Assert.assertNotNull(astRoot34);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory2 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter1);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons3 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons3, errorReporter4);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons6 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter7 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons6, errorReporter7);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons9, errorReporter10);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons12, errorReporter13);
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory16.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node21 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node22 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node23 = iRFactory11.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node24 = iRFactory8.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node25 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node26 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory2.parse("", "hi!", 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory2 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter1);
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory3.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.Node node20 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory2.parse("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = iRFactory33.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node38 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node39 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node40 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = iRFactory25.transformTree(astRoot37);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node42 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(astRoot37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(scriptNode41);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = iRFactory33.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node38 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node39 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = iRFactory28.transformTree(astRoot37);
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = iRFactory28.parse("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = iRFactory0.transformTree(astRoot44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(astRoot37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(scriptNode40);
        org.junit.Assert.assertNotNull(astRoot44);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (short) 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        java.io.Reader reader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory0.parse(reader20, "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13, errorReporter14);
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory17.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node22 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.Node node23 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.Node node24 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory12.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = iRFactory11.transformTree(astRoot28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory11.parse("", "", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node34 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(astRoot21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(scriptNode29);
        org.junit.Assert.assertNotNull(astRoot33);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node23 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "", (int) '#');
        boolean boolean29 = iRFactory0.eof();
        java.io.Reader reader30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory0.parse(reader30, "", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory0.parse("hi!", "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory0.parse(reader14, "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        java.io.Reader reader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse(reader19, "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons32, errorReporter33);
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory36.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node41 = iRFactory35.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node42 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node43 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node44 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node45 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = iRFactory22.transformTree(astRoot40);
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = iRFactory22.parse("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node51 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(astRoot40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(scriptNode46);
        org.junit.Assert.assertNotNull(astRoot50);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory2 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter1);
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory11.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node16 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.Node node17 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.Node node18 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = iRFactory3.transformTree(astRoot15);
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory3.parse("", "hi!", (int) '#');
        com.google.javascript.rhino.head.Node node24 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot23);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory2.parse("", "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(scriptNode19);
        org.junit.Assert.assertNotNull(astRoot23);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass23 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean5 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory0.parse("", "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = iRFactory0.transformTree(astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("", "hi!", (int) (short) 100);
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory31.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node36 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node37 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node38 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node39 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = iRFactory0.transformTree(astRoot35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(scriptNode14);
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(astRoot35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory0.parse("hi!", "hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        boolean boolean17 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter19);
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter26);
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory29.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node34 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node35 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node36 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = iRFactory21.transformTree(astRoot33);
        com.google.javascript.rhino.head.Node node38 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node39 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(astRoot33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(scriptNode37);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 1);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory0.parse("", "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) 'a');
        boolean boolean5 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons8, errorReporter9);
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory12.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node17 = iRFactory11.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot16);
        com.google.javascript.rhino.head.Node node18 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot16);
        com.google.javascript.rhino.head.Node node19 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot16);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = iRFactory6.transformTree(astRoot16);
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory6.parse("", "hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node25 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(scriptNode20);
        org.junit.Assert.assertNotNull(astRoot24);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (int) (short) 10);
        boolean boolean21 = iRFactory0.eof();
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory0.parse(reader22, "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13, errorReporter14);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons16, errorReporter17);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons19, errorReporter20);
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory23.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node28 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot27);
        com.google.javascript.rhino.head.Node node29 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot27);
        com.google.javascript.rhino.head.Node node30 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot27);
        com.google.javascript.rhino.head.Node node31 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot27);
        com.google.javascript.rhino.head.Node node32 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot27);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = iRFactory9.transformTree(astRoot27);
        com.google.javascript.rhino.head.Node node34 = iRFactory8.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot27);
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = iRFactory8.parse("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node39 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(astRoot27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(scriptNode33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(astRoot38);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) '#');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter26);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons28, errorReporter29);
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = iRFactory32.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node37 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
        com.google.javascript.rhino.head.Node node38 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
        com.google.javascript.rhino.head.Node node39 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node40 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(astRoot36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        boolean boolean31 = iRFactory0.eof();
        java.io.Reader reader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory0.parse(reader32, "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13, errorReporter14);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons16, errorReporter17);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons19, errorReporter20);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory26.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node31 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.Node node32 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.Node node33 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.Node node34 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.Node node35 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = iRFactory12.transformTree(astRoot30);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory12.parse("", "hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node41 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(scriptNode36);
        org.junit.Assert.assertNotNull(astRoot40);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory30.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node35 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot34);
        com.google.javascript.rhino.head.Node node36 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot34);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = iRFactory25.transformTree(astRoot34);
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = iRFactory25.parse("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node42 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(astRoot34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(scriptNode37);
        org.junit.Assert.assertNotNull(astRoot41);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 1);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons32, errorReporter33);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35, errorReporter36);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons38, errorReporter39);
        com.google.javascript.rhino.head.IRFactory iRFactory41 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory42 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot46 = iRFactory42.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node47 = iRFactory41.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node48 = iRFactory40.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node49 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node50 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node51 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode52 = iRFactory28.transformTree(astRoot46);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node53 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(astRoot46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(scriptNode52);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (byte) 100);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory0.parse(reader22, "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory30.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node35 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot34);
        com.google.javascript.rhino.head.Node node36 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot34);
        com.google.javascript.rhino.head.Node node37 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot34);
        com.google.javascript.rhino.head.Node node38 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot34);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = iRFactory0.transformTree(astRoot34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(astRoot34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory0.parse("", "hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13, errorReporter14);
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory17.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node22 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.Node node23 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.Node node24 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.Node node25 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory9.parse("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = iRFactory0.transformTree(astRoot29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(astRoot21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(astRoot29);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (short) 100);
        java.io.Reader reader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse(reader17, "", 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory11.parse("", "", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(astRoot15);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node23 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "", (int) '#');
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = iRFactory33.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node38 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node39 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode40 = iRFactory0.transformTree(astRoot37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(astRoot37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot13 = iRFactory0.parse(reader10, "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter10 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons9, errorReporter10);
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory13.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node18 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot17);
        com.google.javascript.rhino.head.Node node19 = iRFactory11.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot17);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = iRFactory8.transformTree(astRoot17);
        com.google.javascript.rhino.head.Node node21 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory7.parse("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = iRFactory0.transformTree(astRoot25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(scriptNode20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(astRoot25);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = iRFactory7.parse("", "", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(astRoot11);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) '#');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (int) '#');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = iRFactory33.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node38 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node39 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node40 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node41 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = iRFactory25.parse("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = iRFactory0.transformTree(astRoot45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(astRoot37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(astRoot45);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter15);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons17, errorReporter18);
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory21.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node26 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node27 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node28 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node29 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node30 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = iRFactory0.transformTree(astRoot25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(astRoot25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot13 = iRFactory0.parse(reader10, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory22.parse("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = iRFactory0.transformTree(astRoot26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(astRoot26);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 1);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        java.io.Reader reader29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory0.parse(reader29, "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons5, errorReporter6);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons8, errorReporter9);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node20 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node21 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node22 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node23 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node24 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory1.transformTree(astRoot19);
        com.google.javascript.rhino.head.Node node26 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse("", "", 1);
        boolean boolean31 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons34, errorReporter35);
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = iRFactory38.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node43 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.Node node44 = iRFactory36.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.Node node45 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = iRFactory33.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = iRFactory32.transformTree(astRoot49);
        com.google.javascript.rhino.head.ast.AstRoot astRoot54 = iRFactory32.parse("", "", 65536);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode55 = iRFactory0.transformTree(astRoot54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(astRoot42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(astRoot49);
        org.junit.Assert.assertNotNull(scriptNode50);
        org.junit.Assert.assertNotNull(astRoot54);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons12, errorReporter13);
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons16, errorReporter17);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons19, errorReporter20);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter26);
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory29.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node34 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node35 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node36 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node37 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node38 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = iRFactory15.transformTree(astRoot33);
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = iRFactory15.parse("", "hi!", 0);
        com.google.javascript.rhino.head.Node node44 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = iRFactory0.transformTree(astRoot43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(astRoot33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(scriptNode39);
        org.junit.Assert.assertNotNull(astRoot43);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons5, errorReporter6);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons8, errorReporter9);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node20 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node21 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node22 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node23 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node24 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory1.transformTree(astRoot19);
        com.google.javascript.rhino.head.Node node26 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory0.parse("hi!", "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot14 = iRFactory0.parse("", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory11.parse("", "", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(astRoot15);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons5, errorReporter6);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons8, errorReporter9);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node20 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node21 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node22 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node23 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node24 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory1.transformTree(astRoot19);
        com.google.javascript.rhino.head.Node node26 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse("", "", (int) (byte) 100);
        boolean boolean31 = iRFactory0.eof();
        boolean boolean32 = iRFactory0.eof();
        boolean boolean33 = iRFactory0.eof();
        boolean boolean34 = iRFactory0.eof();
        boolean boolean35 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons37 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons37, errorReporter38);
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory41 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = iRFactory41.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node46 = iRFactory40.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
        com.google.javascript.rhino.head.Node node47 = iRFactory39.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = iRFactory36.transformTree(astRoot45);
        com.google.javascript.rhino.head.ast.AstRoot astRoot52 = iRFactory36.parse("", "", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = iRFactory0.transformTree(astRoot52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(astRoot45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(scriptNode48);
        org.junit.Assert.assertNotNull(astRoot52);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 1);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        boolean boolean29 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons31, errorReporter32);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons34, errorReporter35);
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = iRFactory38.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node43 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.Node node44 = iRFactory36.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.Node node45 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = iRFactory30.transformTree(astRoot42);
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = iRFactory30.parse("", "hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node51 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(astRoot42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(scriptNode46);
        org.junit.Assert.assertNotNull(astRoot50);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons12, errorReporter13);
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory16.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node21 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node22 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node23 = iRFactory11.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory11.parse("", "hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node28 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(astRoot27);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter21);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = iRFactory33.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node38 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node39 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node40 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node41 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node42 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = iRFactory19.transformTree(astRoot37);
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = iRFactory19.parse("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node48 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(astRoot37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(scriptNode43);
        org.junit.Assert.assertNotNull(astRoot47);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory18.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node23 = iRFactory17.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = iRFactory14.transformTree(astRoot19);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node21 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(scriptNode20);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) '#');
        java.io.Reader reader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory0.parse(reader21, "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot14 = iRFactory0.parse("", "hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory0.parse("", "", 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons19, errorReporter20);
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory23.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node28 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot27);
        com.google.javascript.rhino.head.Node node29 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot27);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = iRFactory18.transformTree(astRoot27);
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory18.parse("", "", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node35 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(astRoot27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(scriptNode30);
        org.junit.Assert.assertNotNull(astRoot34);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        java.io.Reader reader26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory0.parse(reader26, "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass14 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (byte) 100);
        boolean boolean17 = iRFactory0.eof();
        java.io.Reader reader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory0.parse(reader18, "hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = iRFactory1.transformTree(astRoot10);
        com.google.javascript.rhino.head.Node node14 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("", "", 0);
        java.lang.Class<?> wildcardClass19 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(scriptNode13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory25.parse("", "", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node30 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(astRoot29);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "", (int) (byte) 1);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        boolean boolean17 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter21);
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory24.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node29 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node30 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node31 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = iRFactory18.transformTree(astRoot28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = iRFactory18.parse("", "hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = iRFactory0.transformTree(astRoot36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(scriptNode32);
        org.junit.Assert.assertNotNull(astRoot36);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node20 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node21 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = iRFactory10.transformTree(astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory10.parse("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node27 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(scriptNode22);
        org.junit.Assert.assertNotNull(astRoot26);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter19);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory31.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node36 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node37 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node38 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node39 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node40 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = iRFactory17.transformTree(astRoot35);
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = iRFactory17.parse("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node46 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertNotNull(astRoot35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(scriptNode41);
        org.junit.Assert.assertNotNull(astRoot45);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory26.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node31 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.Node node32 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = iRFactory21.transformTree(astRoot30);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node34 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(scriptNode33);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (short) 0);
        boolean boolean21 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass22 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (short) 100);
        boolean boolean17 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter21);
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory24.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node29 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node30 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node31 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory19.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = iRFactory18.transformTree(astRoot35);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory18.parse("", "hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node41 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(astRoot35);
        org.junit.Assert.assertNotNull(scriptNode36);
        org.junit.Assert.assertNotNull(astRoot40);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "hi!", (int) '4');
        java.io.Reader reader23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory0.parse(reader23, "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        boolean boolean17 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons19, errorReporter20);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory26.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node31 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.Node node32 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.Node node33 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.Node node34 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = iRFactory18.parse("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = iRFactory0.transformTree(astRoot38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(astRoot38);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", 65536);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory0.parse("hi!", "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = iRFactory1.transformTree(astRoot10);
        com.google.javascript.rhino.head.Node node14 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("hi!", "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: missing ; before statement");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(scriptNode13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node23 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "", (int) '#');
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        boolean boolean31 = iRFactory0.eof();
        boolean boolean32 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot36 = iRFactory0.parse("hi!", "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "", (int) (byte) 1);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("hi!", "", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons12, errorReporter13);
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory16.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node21 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node22 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node23 = iRFactory11.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory11.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = iRFactory10.transformTree(astRoot27);
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory10.parse("", "", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node33 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(astRoot27);
        org.junit.Assert.assertNotNull(scriptNode28);
        org.junit.Assert.assertNotNull(astRoot32);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons12, errorReporter13);
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory16.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node21 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.Node node22 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = iRFactory11.transformTree(astRoot20);
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory11.parse("", "hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = iRFactory0.transformTree(astRoot27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(scriptNode23);
        org.junit.Assert.assertNotNull(astRoot27);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot11 = iRFactory0.parse("hi!", "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (byte) 100);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory25.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node30 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode31 = iRFactory0.transformTree(astRoot29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(astRoot29);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = iRFactory0.transformTree(astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("", "hi!", (int) (short) 100);
        boolean boolean19 = iRFactory0.eof();
        java.io.Reader reader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory0.parse(reader20, "hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(scriptNode14);
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "hi!", (int) '4');
        boolean boolean23 = iRFactory0.eof();
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory0.parse(reader24, "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter26);
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory29.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node34 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node35 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.Node node36 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory24.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = iRFactory23.transformTree(astRoot40);
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = iRFactory23.parse("", "hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node46 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(astRoot33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(astRoot40);
        org.junit.Assert.assertNotNull(scriptNode41);
        org.junit.Assert.assertNotNull(astRoot45);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons28, errorReporter29);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons31, errorReporter32);
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = iRFactory35.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node40 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node41 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node42 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = iRFactory27.transformTree(astRoot39);
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = iRFactory27.parse("", "hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node48 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(astRoot39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(scriptNode43);
        org.junit.Assert.assertNotNull(astRoot47);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory28.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node33 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node34 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node35 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = iRFactory20.transformTree(astRoot32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node37 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(astRoot32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(scriptNode36);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        java.io.Reader reader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory0.parse(reader18, "hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) '4');
        boolean boolean5 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory6.parse("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node27 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(astRoot26);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons5, errorReporter6);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons8, errorReporter9);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node20 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node21 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node22 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node23 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node24 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory1.transformTree(astRoot19);
        com.google.javascript.rhino.head.Node node26 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse("", "", 1);
        boolean boolean31 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons34, errorReporter35);
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = iRFactory38.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node43 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.Node node44 = iRFactory36.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.Node node45 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = iRFactory33.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = iRFactory32.transformTree(astRoot49);
        com.google.javascript.rhino.head.ast.AstRoot astRoot54 = iRFactory32.parse("", "hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node55 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(astRoot42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(astRoot49);
        org.junit.Assert.assertNotNull(scriptNode50);
        org.junit.Assert.assertNotNull(astRoot54);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 1);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        boolean boolean29 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons31, errorReporter32);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons34, errorReporter35);
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = iRFactory38.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node43 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.Node node44 = iRFactory36.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.Node node45 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.Node node46 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = iRFactory30.parse("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = iRFactory0.transformTree(astRoot50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(astRoot42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(astRoot50);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter15);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons17, errorReporter18);
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory21.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node26 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node27 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node28 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node29 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory13.parse("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node34 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(astRoot25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(astRoot33);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory0.parse("hi!", "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory0.parse(reader9, "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons17, errorReporter18);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter21);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = iRFactory33.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node38 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node39 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node40 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node41 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node42 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node43 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = iRFactory0.transformTree(astRoot37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(astRoot37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node23 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "hi!", 0);
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        boolean boolean31 = iRFactory0.eof();
        boolean boolean32 = iRFactory0.eof();
        boolean boolean33 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35, errorReporter36);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons38, errorReporter39);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons41 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter42 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory43 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons41, errorReporter42);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons44 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter45 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory46 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons44, errorReporter45);
        com.google.javascript.rhino.head.IRFactory iRFactory47 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory48 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot52 = iRFactory48.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node53 = iRFactory47.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot52);
        com.google.javascript.rhino.head.Node node54 = iRFactory46.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot52);
        com.google.javascript.rhino.head.Node node55 = iRFactory43.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot52);
        com.google.javascript.rhino.head.Node node56 = iRFactory40.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot52);
        com.google.javascript.rhino.head.Node node57 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot52);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode58 = iRFactory34.transformTree(astRoot52);
        com.google.javascript.rhino.head.ast.AstRoot astRoot62 = iRFactory34.parse("", "hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode63 = iRFactory0.transformTree(astRoot62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(astRoot52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(scriptNode58);
        org.junit.Assert.assertNotNull(astRoot62);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons28, errorReporter29);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons31, errorReporter32);
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = iRFactory35.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node40 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node41 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node42 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = iRFactory27.transformTree(astRoot39);
        com.google.javascript.rhino.head.Node node44 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = iRFactory0.transformTree(astRoot39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(astRoot39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(scriptNode43);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons19, errorReporter20);
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons32, errorReporter33);
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory36.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node41 = iRFactory35.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node42 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node43 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node44 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node45 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode46 = iRFactory22.transformTree(astRoot40);
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = iRFactory22.parse("", "hi!", 0);
        com.google.javascript.rhino.head.Node node51 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot50);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node52 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(astRoot40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(scriptNode46);
        org.junit.Assert.assertNotNull(astRoot50);
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) '#');
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory0.parse("", "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory0.parse("hi!", "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse(reader13, "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory0.parse("hi!", "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 1);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass29 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons12, errorReporter13);
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons16, errorReporter17);
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory20.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node25 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot24);
        com.google.javascript.rhino.head.Node node26 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot24);
        com.google.javascript.rhino.head.Node node27 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot24);
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory15.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.Node node32 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node33 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(astRoot24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(astRoot31);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse(reader15, "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 10);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        com.google.javascript.rhino.head.ast.AstNode astNode28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node29 = iRFactory0.transform(astNode28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        java.io.Reader reader29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory0.parse(reader29, "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory0.parse("", "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (int) '#');
        boolean boolean21 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory23.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node28 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot27);
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory22.parse("", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = iRFactory0.transformTree(astRoot32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(astRoot27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(astRoot32);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (short) 100);
        boolean boolean5 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory11.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node16 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.Node node17 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.Node node18 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory6.parse("", "hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = iRFactory0.transformTree(astRoot22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(astRoot15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(astRoot22);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("hi!", "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (short) 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter21);
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory24.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node29 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node30 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node31 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory19.parse("", "", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = iRFactory0.transformTree(astRoot35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(astRoot35);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (byte) 100);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory28.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node33 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node34 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node35 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = iRFactory20.transformTree(astRoot32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node37 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(astRoot32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(scriptNode36);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        java.io.Reader reader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory0.parse(reader20, "hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "", (int) (byte) 0);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory22.parse("", "hi!", 65536);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = iRFactory0.transformTree(astRoot26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(astRoot26);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (byte) 100);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory27.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = iRFactory26.transformTree(astRoot31);
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = iRFactory26.parse("", "hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node37 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(astRoot31);
        org.junit.Assert.assertNotNull(scriptNode32);
        org.junit.Assert.assertNotNull(astRoot36);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) '#');
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory21.parse("", "", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node26 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(astRoot25);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 1);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory0.parse("", "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean21 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory23.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = iRFactory22.transformTree(astRoot27);
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory22.parse("", "", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node33 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(astRoot27);
        org.junit.Assert.assertNotNull(scriptNode28);
        org.junit.Assert.assertNotNull(astRoot32);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons30, errorReporter31);
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = iRFactory34.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node39 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node40 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node41 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = iRFactory26.transformTree(astRoot38);
        com.google.javascript.rhino.head.ast.AstRoot astRoot46 = iRFactory26.parse("", "hi!", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = iRFactory0.transformTree(astRoot46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(astRoot38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(scriptNode42);
        org.junit.Assert.assertNotNull(astRoot46);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory0.parse("", "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        java.io.Reader reader26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory0.parse(reader26, "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 10);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory27.parse("", "", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = iRFactory0.transformTree(astRoot31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(astRoot31);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", 65536);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        java.io.Reader reader26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory0.parse(reader26, "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 10);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons30, errorReporter31);
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = iRFactory34.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node39 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node40 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node41 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node42 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.ast.AstRoot astRoot46 = iRFactory26.parse("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node47 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(astRoot38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(astRoot46);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 0);
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        com.google.javascript.rhino.head.ast.AstNode astNode10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node11 = iRFactory0.transform(astNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory2 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter1);
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory11.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node16 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.Node node17 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.Node node18 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = iRFactory3.transformTree(astRoot15);
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory3.parse("", "hi!", (int) '#');
        com.google.javascript.rhino.head.Node node24 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot23);
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory30.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node35 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot34);
        com.google.javascript.rhino.head.Node node36 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot34);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = iRFactory25.transformTree(astRoot34);
        com.google.javascript.rhino.head.ast.AstRoot astRoot41 = iRFactory25.parse("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node42 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(scriptNode19);
        org.junit.Assert.assertNotNull(astRoot23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(astRoot34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(scriptNode37);
        org.junit.Assert.assertNotNull(astRoot41);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("hi!", "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type com.google.javascript.rhino.head.EvaluatorException; message: missing ; before statement");
        } catch (com.google.javascript.rhino.head.EvaluatorException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons17, errorReporter18);
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory21.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node26 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node27 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node28 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = iRFactory15.transformTree(astRoot25);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node30 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(astRoot25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(scriptNode29);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (short) 100);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter15);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory18.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node23 = iRFactory17.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.Node node24 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.Node node25 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.Node node26 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.Node node27 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node28 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory0.parse("hi!", "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons32, errorReporter33);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35, errorReporter36);
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot43 = iRFactory39.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node44 = iRFactory38.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node45 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node46 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node47 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.Node node48 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot43);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode49 = iRFactory25.transformTree(astRoot43);
        com.google.javascript.rhino.head.ast.AstRoot astRoot53 = iRFactory25.parse("", "hi!", 0);
        com.google.javascript.rhino.head.Node node54 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot53);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node55 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(astRoot43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(scriptNode49);
        org.junit.Assert.assertNotNull(astRoot53);
        org.junit.Assert.assertNotNull(node54);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory0.parse("", "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) '#');
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory0.parse(reader14, "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) '#');
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory27.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node32 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.Node node33 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.Node node34 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = iRFactory22.parse("", "", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode39 = iRFactory0.transformTree(astRoot38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(astRoot31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(astRoot38);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory0.parse("", "hi!", 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse(reader13, "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory0.parse("hi!", "hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13, errorReporter14);
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory17.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node22 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.Node node23 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.Node node24 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory12.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = iRFactory11.transformTree(astRoot28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory11.parse("", "hi!", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = iRFactory0.transformTree(astRoot33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(astRoot21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(scriptNode29);
        org.junit.Assert.assertNotNull(astRoot33);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons5, errorReporter6);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons8, errorReporter9);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node20 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node21 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node22 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node23 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node24 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory1.transformTree(astRoot19);
        com.google.javascript.rhino.head.Node node26 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse("", "", (int) (byte) 100);
        boolean boolean31 = iRFactory0.eof();
        boolean boolean32 = iRFactory0.eof();
        boolean boolean33 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter36 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons35, errorReporter36);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons38, errorReporter39);
        com.google.javascript.rhino.head.IRFactory iRFactory41 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory42 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot46 = iRFactory42.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node47 = iRFactory41.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node48 = iRFactory40.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node49 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.Node node50 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot46);
        com.google.javascript.rhino.head.ast.AstRoot astRoot54 = iRFactory34.parse("", "hi!", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node55 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(astRoot46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(astRoot54);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass25 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13, errorReporter14);
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons17, errorReporter18);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter21);
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory24.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node29 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node30 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node31 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = iRFactory16.transformTree(astRoot28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = iRFactory16.parse("", "hi!", (int) '#');
        com.google.javascript.rhino.head.Node node37 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node38 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(scriptNode32);
        org.junit.Assert.assertNotNull(astRoot36);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) 'a');
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter15);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory18.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node23 = iRFactory17.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.Node node24 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.Node node25 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot22);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = iRFactory10.transformTree(astRoot22);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory10.parse("", "hi!", (int) '#');
        com.google.javascript.rhino.head.Node node31 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode32 = iRFactory0.transformTree(astRoot30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(scriptNode26);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("hi!", "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = iRFactory0.transformTree(astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("", "hi!", (int) (short) 100);
        boolean boolean19 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory0.parse("", "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(scriptNode14);
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory11.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node16 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node17 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(astRoot15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory0.parse("hi!", "hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory31.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node36 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node37 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node38 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = iRFactory26.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.Node node43 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = iRFactory0.transformTree(astRoot42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(astRoot35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(astRoot42);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory28.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node33 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node34 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.Node node35 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot32);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = iRFactory20.transformTree(astRoot32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode37 = iRFactory0.transformTree(astRoot32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(astRoot32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(scriptNode36);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = iRFactory0.transformTree(astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("", "hi!", (int) (short) 100);
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory0.parse(reader22, "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(scriptNode14);
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons28, errorReporter29);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons31, errorReporter32);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons34, errorReporter35);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons37 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter38 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons37, errorReporter38);
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory41 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = iRFactory41.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node46 = iRFactory40.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
        com.google.javascript.rhino.head.Node node47 = iRFactory39.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
        com.google.javascript.rhino.head.Node node48 = iRFactory36.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
        com.google.javascript.rhino.head.Node node49 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
        com.google.javascript.rhino.head.Node node50 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode51 = iRFactory27.transformTree(astRoot45);
        com.google.javascript.rhino.head.Node node52 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node53 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(astRoot45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(scriptNode51);
        org.junit.Assert.assertNotNull(node52);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter19);
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory22.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node27 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        com.google.javascript.rhino.head.Node node28 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = iRFactory17.transformTree(astRoot26);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory17.parse("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = iRFactory0.transformTree(astRoot33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertNotNull(astRoot26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(scriptNode29);
        org.junit.Assert.assertNotNull(astRoot33);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node23 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "hi!", 0);
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        boolean boolean31 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory0.parse("hi!", "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "", (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = astRoot10.getClass();
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) 'a');
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons8, errorReporter9);
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory12.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node17 = iRFactory11.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot16);
        com.google.javascript.rhino.head.Node node18 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot16);
        com.google.javascript.rhino.head.Node node19 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node20 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons28, errorReporter29);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons31, errorReporter32);
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = iRFactory35.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node40 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node41 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node42 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node43 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.ast.AstRoot astRoot47 = iRFactory27.parse("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = iRFactory0.transformTree(astRoot47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(astRoot39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(astRoot47);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "", (int) (byte) 1);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        boolean boolean17 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons19, errorReporter20);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter26);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons28, errorReporter29);
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot36 = iRFactory32.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node37 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
        com.google.javascript.rhino.head.Node node38 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
        com.google.javascript.rhino.head.Node node39 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
        com.google.javascript.rhino.head.Node node40 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
        com.google.javascript.rhino.head.Node node41 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot36);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode42 = iRFactory18.transformTree(astRoot36);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = iRFactory0.transformTree(astRoot36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(astRoot36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(scriptNode42);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node20 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node21 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = iRFactory10.transformTree(astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory10.parse("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node27 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(scriptNode22);
        org.junit.Assert.assertNotNull(astRoot26);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory2 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter1);
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot8 = iRFactory4.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node9 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot8);
        com.google.javascript.rhino.head.Node node10 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot8);
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory11.parse("", "", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory2.transformTree(astRoot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(astRoot15);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        boolean boolean11 = iRFactory0.eof();
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory0.parse(reader12, "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) '#');
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory27.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node32 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.Node node33 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.Node node34 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode35 = iRFactory21.transformTree(astRoot31);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node36 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertNotNull(astRoot31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(scriptNode35);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (short) 1);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter19);
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory22.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node27 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        com.google.javascript.rhino.head.Node node28 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = iRFactory17.transformTree(astRoot26);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node30 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertNotNull(astRoot26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(scriptNode29);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons5, errorReporter6);
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot13 = iRFactory9.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node14 = iRFactory8.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot13);
        com.google.javascript.rhino.head.Node node15 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot13);
        com.google.javascript.rhino.head.Node node16 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot13);
        com.google.javascript.rhino.head.Node node17 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot13);
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node22 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        java.io.Reader reader23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory0.parse(reader23, "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(astRoot21);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = iRFactory0.transformTree(astRoot19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(astRoot19);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) '#');
        boolean boolean17 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory0.parse("", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (short) 100);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        java.io.Reader reader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory0.parse(reader20, "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 10);
        boolean boolean23 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory25.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = iRFactory24.transformTree(astRoot29);
        com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory24.parse("", "hi!", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node35 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(astRoot29);
        org.junit.Assert.assertNotNull(scriptNode30);
        org.junit.Assert.assertNotNull(astRoot34);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node23 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "hi!", (int) (short) 100);
        java.io.Reader reader29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot32 = iRFactory0.parse(reader29, "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 10);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        java.io.Reader reader26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory0.parse(reader26, "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", 10);
        boolean boolean17 = iRFactory0.eof();
        java.io.Reader reader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory0.parse(reader18, "hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node23 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "hi!", 0);
        boolean boolean29 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory0.parse("", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        com.google.javascript.rhino.head.ast.AstNode astNode17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node18 = iRFactory0.transform(astNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory24.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node29 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node30 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean21 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass22 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (byte) 100);
        boolean boolean17 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory0.parse("", "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory0.parse(reader24, "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter19);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory31.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node36 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node37 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node38 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node39 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.Node node40 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot35);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode41 = iRFactory17.transformTree(astRoot35);
        com.google.javascript.rhino.head.ast.AstRoot astRoot45 = iRFactory17.parse("", "hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node46 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(scriptNode41);
        org.junit.Assert.assertNotNull(astRoot45);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (int) '#');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory0.parse(reader24, "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = iRFactory0.transformTree(astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("", "hi!", (int) '#');
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        java.io.Reader reader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory0.parse(reader21, "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(scriptNode14);
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (short) 0);
        boolean boolean21 = iRFactory0.eof();
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory0.parse(reader22, "hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", 65536);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory29.parse("", "hi!", 65536);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node34 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(astRoot33);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        java.io.Reader reader19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse(reader19, "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        java.io.Reader reader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory0.parse(reader28, "", 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons5, errorReporter6);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons8, errorReporter9);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node20 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node21 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node22 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node23 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node24 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory1.transformTree(astRoot19);
        com.google.javascript.rhino.head.Node node26 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse("", "", (int) (byte) 100);
        java.io.Reader reader31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory0.parse(reader31, "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 1);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        java.io.Reader reader31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot34 = iRFactory0.parse(reader31, "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13, errorReporter14);
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory17.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node22 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.Node node23 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.Node node24 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory12.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode29 = iRFactory11.transformTree(astRoot28);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node30 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(astRoot21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(scriptNode29);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = iRFactory0.transformTree(astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("", "hi!", (int) (short) 100);
        boolean boolean19 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter26);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons28, errorReporter29);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons31, errorReporter32);
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = iRFactory35.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node40 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node41 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node42 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node43 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node44 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = iRFactory21.transformTree(astRoot39);
        com.google.javascript.rhino.head.Node node46 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode47 = iRFactory0.transformTree(astRoot39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(scriptNode14);
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(astRoot39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(scriptNode45);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = iRFactory0.transformTree(astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("", "hi!", (int) (short) 100);
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory0.parse("hi!", "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(scriptNode14);
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode14 = iRFactory0.transformTree(astRoot10);
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse(reader15, "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(scriptNode14);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (short) 100);
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter19);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot29 = iRFactory25.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node30 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
        com.google.javascript.rhino.head.Node node31 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
        com.google.javascript.rhino.head.Node node32 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot29);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode33 = iRFactory17.transformTree(astRoot29);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = iRFactory0.transformTree(astRoot29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertNotNull(astRoot29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(scriptNode33);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) '#');
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot31 = iRFactory27.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node32 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.Node node33 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode34 = iRFactory22.transformTree(astRoot31);
        com.google.javascript.rhino.head.Node node35 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node36 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(scriptNode16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertNotNull(astRoot31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(scriptNode34);
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (int) '#');
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory26.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node31 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.Node node32 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.Node node33 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = iRFactory21.parse("", "", 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node38 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(astRoot37);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons32, errorReporter33);
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory36.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node41 = iRFactory35.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node42 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node43 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node44 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        com.google.javascript.rhino.head.Node node45 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node46 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(astRoot40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node45);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons15, errorReporter16);
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot23 = iRFactory19.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node24 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot23);
        com.google.javascript.rhino.head.Node node25 = iRFactory17.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot23);
        com.google.javascript.rhino.head.Node node26 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot23);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory14.parse("", "hi!", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node31 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(astRoot23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons14, errorReporter15);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter18 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons17, errorReporter18);
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory21.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node26 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node27 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node28 = iRFactory16.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.Node node29 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory13.parse("", "hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node34 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(astRoot33);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (int) '#');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass28 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 10);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory21.parse("", "hi!", 65536);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node26 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(astRoot25);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 10);
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory29.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node34 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = iRFactory28.parse("", "hi!", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node39 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(astRoot33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(astRoot38);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons15, errorReporter16);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons18, errorReporter19);
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory22.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node27 = iRFactory21.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        com.google.javascript.rhino.head.Node node28 = iRFactory20.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        com.google.javascript.rhino.head.Node node29 = iRFactory17.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode30 = iRFactory14.transformTree(astRoot26);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node31 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(astRoot26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(scriptNode30);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) '#');
        boolean boolean17 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter21);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = iRFactory33.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node38 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node39 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node40 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node41 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node42 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = iRFactory19.transformTree(astRoot37);
        com.google.javascript.rhino.head.Node node44 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node45 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(astRoot37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(scriptNode43);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node23 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "hi!", (int) (short) 0);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons33, errorReporter34);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons36, errorReporter37);
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = iRFactory40.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node45 = iRFactory39.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot44);
        com.google.javascript.rhino.head.Node node46 = iRFactory38.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot44);
        com.google.javascript.rhino.head.Node node47 = iRFactory35.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot44);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode48 = iRFactory32.transformTree(astRoot44);
        com.google.javascript.rhino.head.Node node49 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot44);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode50 = iRFactory0.transformTree(astRoot44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(astRoot44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(scriptNode48);
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 10);
        boolean boolean17 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter21);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory25 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons23, errorReporter24);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory28 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons26, errorReporter27);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons29, errorReporter30);
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot37 = iRFactory33.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node38 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node39 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node40 = iRFactory28.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node41 = iRFactory25.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.Node node42 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode43 = iRFactory19.transformTree(astRoot37);
        com.google.javascript.rhino.head.Node node44 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot37);
        com.google.javascript.rhino.head.ast.AstRoot astRoot48 = iRFactory18.parse("", "", 1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node49 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(astRoot37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(scriptNode43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(astRoot48);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "hi!", (int) '4');
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (byte) 0);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons21, errorReporter22);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter25 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory26 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons24, errorReporter25);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter28 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons27, errorReporter28);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons30, errorReporter31);
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot38 = iRFactory34.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node39 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node40 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node41 = iRFactory29.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node42 = iRFactory26.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.Node node43 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode44 = iRFactory20.transformTree(astRoot38);
        com.google.javascript.rhino.head.Node node45 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot38);
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = iRFactory19.parse("", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node50 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(astRoot38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(scriptNode44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(astRoot49);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass23 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(scriptNode12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node6 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        boolean boolean17 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory22 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons20, errorReporter21);
        com.google.javascript.rhino.head.IRFactory iRFactory23 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory24.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node29 = iRFactory23.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node30 = iRFactory22.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.Node node31 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot28);
        com.google.javascript.rhino.head.ast.AstRoot astRoot35 = iRFactory19.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode36 = iRFactory18.transformTree(astRoot35);
        com.google.javascript.rhino.head.ast.AstRoot astRoot40 = iRFactory18.parse("", "", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node41 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(astRoot35);
        org.junit.Assert.assertNotNull(scriptNode36);
        org.junit.Assert.assertNotNull(astRoot40);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory0.parse("hi!", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        boolean boolean11 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons13, errorReporter14);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons16, errorReporter17);
        com.google.javascript.rhino.head.IRFactory iRFactory19 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory20 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory20.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node25 = iRFactory19.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot24);
        com.google.javascript.rhino.head.Node node26 = iRFactory18.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot24);
        com.google.javascript.rhino.head.Node node27 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot24);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode28 = iRFactory12.transformTree(astRoot24);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node29 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(astRoot24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(scriptNode28);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) '#');
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory0.parse("hi!", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "hi!", 1);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        java.io.Reader reader24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot27 = iRFactory0.parse(reader24, "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons5, errorReporter6);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons8, errorReporter9);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons11, errorReporter12);
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node20 = iRFactory14.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node21 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node22 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node23 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.Node node24 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory1.transformTree(astRoot19);
        com.google.javascript.rhino.head.Node node26 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse("", "", (int) (byte) 100);
        com.google.javascript.rhino.head.IRFactory iRFactory31 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons33, errorReporter34);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons36, errorReporter37);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons39 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter40 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory41 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons39, errorReporter40);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons42 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter43 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory44 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons42, errorReporter43);
        com.google.javascript.rhino.head.IRFactory iRFactory45 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory46 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = iRFactory46.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node51 = iRFactory45.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot50);
        com.google.javascript.rhino.head.Node node52 = iRFactory44.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot50);
        com.google.javascript.rhino.head.Node node53 = iRFactory41.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot50);
        com.google.javascript.rhino.head.Node node54 = iRFactory38.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot50);
        com.google.javascript.rhino.head.Node node55 = iRFactory35.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot50);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode56 = iRFactory32.transformTree(astRoot50);
        com.google.javascript.rhino.head.Node node57 = iRFactory31.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot50);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node58 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(scriptNode25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(astRoot30);
        org.junit.Assert.assertNotNull(astRoot50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(scriptNode56);
        org.junit.Assert.assertNotNull(node57);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot30 = iRFactory0.parse("hi!", "", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "", (int) '#');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("hi!", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node23 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "hi!", 0);
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        boolean boolean31 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory36 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons34, errorReporter35);
        com.google.javascript.rhino.head.IRFactory iRFactory37 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot42 = iRFactory38.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node43 = iRFactory37.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.Node node44 = iRFactory36.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot42);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = iRFactory33.transformTree(astRoot42);
        com.google.javascript.rhino.head.Node node46 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) scriptNode45);
        com.google.javascript.rhino.head.ast.AstRoot astRoot50 = iRFactory32.parse("", "", 0);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node51 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(astRoot42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(scriptNode45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(astRoot50);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot9 = iRFactory5.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node10 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node11 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot9);
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory0.parse("", "", (int) (short) 100);
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        boolean boolean19 = iRFactory0.eof();
        boolean boolean20 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory21 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory24 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons22, errorReporter23);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter26 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory27 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons25, errorReporter26);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory30 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons28, errorReporter29);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory33 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons31, errorReporter32);
        com.google.javascript.rhino.head.IRFactory iRFactory34 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot39 = iRFactory35.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node40 = iRFactory34.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node41 = iRFactory33.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node42 = iRFactory30.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node43 = iRFactory27.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.Node node44 = iRFactory24.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot39);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode45 = iRFactory21.transformTree(astRoot39);
        com.google.javascript.rhino.head.ast.AstRoot astRoot49 = iRFactory21.parse("", "", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node50 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(astRoot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(astRoot39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(scriptNode45);
        org.junit.Assert.assertNotNull(astRoot49);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "hi!", (int) (byte) 1);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        boolean boolean10 = iRFactory0.eof();
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        boolean boolean17 = iRFactory0.eof();
        boolean boolean18 = iRFactory0.eof();
        java.lang.Class<?> wildcardClass19 = iRFactory0.getClass();
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", (int) '4');
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        boolean boolean8 = iRFactory0.eof();
        boolean boolean9 = iRFactory0.eof();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot13 = iRFactory0.parse(reader10, "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse(reader7, "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory4 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons2, errorReporter3);
        com.google.javascript.rhino.head.IRFactory iRFactory5 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory6.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node11 = iRFactory5.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node12 = iRFactory4.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.Node node13 = iRFactory1.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot10);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory1.parse("", "hi!", (int) (byte) 10);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory0.parse("", "", (int) (short) 10);
        java.io.Reader reader23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory0.parse(reader23, "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(astRoot17);
        org.junit.Assert.assertNotNull(scriptNode18);
        org.junit.Assert.assertNotNull(astRoot22);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory29 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot33 = iRFactory29.parse("", "hi!", 65536);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.Node node34 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(astRoot33);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        boolean boolean25 = iRFactory0.eof();
        boolean boolean26 = iRFactory0.eof();
        boolean boolean27 = iRFactory0.eof();
        boolean boolean28 = iRFactory0.eof();
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        boolean boolean31 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory32 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter34 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory35 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons33, errorReporter34);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter37 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory38 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons36, errorReporter37);
        com.google.javascript.rhino.head.IRFactory iRFactory39 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory40 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot44 = iRFactory40.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node45 = iRFactory39.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot44);
        com.google.javascript.rhino.head.Node node46 = iRFactory38.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot44);
        com.google.javascript.rhino.head.Node node47 = iRFactory35.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot44);
        com.google.javascript.rhino.head.Node node48 = iRFactory32.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot44);
        com.google.javascript.rhino.head.ast.AstRoot astRoot52 = iRFactory32.parse("", "hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.ScriptNode scriptNode53 = iRFactory0.transformTree(astRoot52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: FAILED ASSERTION");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(astRoot44);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(astRoot52);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node13 = iRFactory7.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node14 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node15 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse("", "hi!", (int) 'a');
        boolean boolean21 = iRFactory0.eof();
        boolean boolean22 = iRFactory0.eof();
        boolean boolean23 = iRFactory0.eof();
        boolean boolean24 = iRFactory0.eof();
        java.io.Reader reader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse(reader25, "hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(astRoot20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter1 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory2 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons0, errorReporter1);
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.IRFactory iRFactory10 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory11.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node16 = iRFactory10.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.Node node17 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.Node node18 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = iRFactory3.transformTree(astRoot15);
        com.google.javascript.rhino.head.Node node20 = iRFactory2.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
        java.io.Reader reader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory2.parse(reader21, "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(scriptNode19);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot4 = iRFactory0.parse("", "", 65536);
        boolean boolean5 = iRFactory0.eof();
        boolean boolean6 = iRFactory0.eof();
        boolean boolean7 = iRFactory0.eof();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot11 = iRFactory0.parse("hi!", "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "", (int) (byte) 1);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        boolean boolean15 = iRFactory0.eof();
        boolean boolean16 = iRFactory0.eof();
        java.io.Reader reader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory0.parse(reader17, "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot5);
        org.junit.Assert.assertNotNull(scriptNode6);
        org.junit.Assert.assertNotNull(astRoot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons1 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory3 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons1, errorReporter2);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons4 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory6 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons4, errorReporter5);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory9 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons7, errorReporter8);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = null;
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = null;
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory(compilerEnvirons10, errorReporter11);
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node19 = iRFactory13.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node20 = iRFactory12.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node21 = iRFactory9.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node22 = iRFactory6.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.Node node23 = iRFactory3.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode24 = iRFactory0.transformTree(astRoot18);
        com.google.javascript.rhino.head.ast.AstRoot astRoot28 = iRFactory0.parse("", "", (int) '#');
        boolean boolean29 = iRFactory0.eof();
        boolean boolean30 = iRFactory0.eof();
        boolean boolean31 = iRFactory0.eof();
        boolean boolean32 = iRFactory0.eof();
        boolean boolean33 = iRFactory0.eof();
        java.io.Reader reader34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.ast.AstRoot astRoot37 = iRFactory0.parse(reader34, "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: parser reused");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(astRoot18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(scriptNode24);
        org.junit.Assert.assertNotNull(astRoot28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }
}

