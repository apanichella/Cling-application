import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0Minimized {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        iRFactory0.eof();
    }

    @Test
    public void test02() throws Throwable {
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        iRFactory0.eof();
    }

    @Test
    public void test03() throws Throwable {
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        iRFactory0.eof();
    }

    @Test
    public void test04() throws Throwable {
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = null;
        iRFactory0.transformTree(astRoot11);
    }

    @Test
    public void test05() throws Throwable {
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = null;
        iRFactory0.transformTree(astRoot16);
    }

    @Test
    public void test06() throws Throwable {
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = null;
        iRFactory0.transformTree(astRoot22);
    }

    @Test
    public void test07() throws Throwable {
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) (byte) 100);
        iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot19);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory15.parse("", "hi!", 100);
        iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot25);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory16.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node21 = iRFactory15.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot20);
        com.google.javascript.rhino.head.ast.AstRoot astRoot25 = iRFactory15.parse("", "hi!", (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode26 = iRFactory0.transformTree(astRoot25);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory8 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot12 = iRFactory8.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode13 = iRFactory7.transformTree(astRoot12);
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory7.parse("", "hi!", (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node18 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot17);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        boolean boolean14 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot20 = iRFactory16.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode21 = iRFactory15.transformTree(astRoot20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = iRFactory0.transformTree(astRoot20);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        boolean boolean11 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory12.parse("", "hi!", (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node17 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot16);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = iRFactory7.parse("", "hi!", (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot11);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory13.parse("", "", 65536);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory12.parse("", "hi!", (int) (byte) 1);
        com.google.javascript.rhino.head.Node node17 = iRFactory11.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot16);
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory11.parse("", "hi!", (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = iRFactory0.transformTree(astRoot21);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory12.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = iRFactory11.transformTree(astRoot16);
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory11.parse("", "hi!", (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node22 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) '#');
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory12.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = iRFactory11.transformTree(astRoot16);
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory11.parse("", "hi!", (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = iRFactory0.transformTree(astRoot21);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot17 = iRFactory13.parse("", "hi!", (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode18 = iRFactory0.transformTree(astRoot17);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) '#');
        boolean boolean11 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory12 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot16 = iRFactory12.parse("", "hi!", (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode17 = iRFactory0.transformTree(astRoot16);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = iRFactory7.parse("", "", 65536);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node12 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot11);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory17.parse("", "hi!", (int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node22 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot21);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) '#');
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory11.parse("", "hi!", (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) (byte) 0);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "", 65536);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node19 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot18);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        com.google.javascript.rhino.head.IRFactory iRFactory18 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot22 = iRFactory18.parse("", "", (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode23 = iRFactory0.transformTree(astRoot22);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory17.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = iRFactory16.transformTree(astRoot21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory16.parse("", "hi!", (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = iRFactory0.transformTree(astRoot26);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = iRFactory14.transformTree(astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory14.parse("", "hi!", 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory0.transformTree(astRoot24);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) '#');
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory13 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = iRFactory13.transformTree(astRoot18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = iRFactory0.transformTree(astRoot18);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "", (int) (byte) 1);
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory11.parse("", "", (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode16 = iRFactory0.transformTree(astRoot15);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", 100);
        com.google.javascript.rhino.head.IRFactory iRFactory11 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot15 = iRFactory11.parse("", "", (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.Node node16 = iRFactory0.transform((com.google.javascript.rhino.head.ast.AstNode) astRoot15);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) '#');
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot18 = iRFactory14.parse("", "", (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode19 = iRFactory0.transformTree(astRoot18);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.IRFactory iRFactory7 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot11 = iRFactory7.parse("", "", (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode12 = iRFactory0.transformTree(astRoot11);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.rhino.head.IRFactory iRFactory0 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory1 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot5 = iRFactory1.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode6 = iRFactory0.transformTree(astRoot5);
        com.google.javascript.rhino.head.ast.AstRoot astRoot10 = iRFactory0.parse("", "hi!", (int) '#');
        boolean boolean11 = iRFactory0.eof();
        boolean boolean12 = iRFactory0.eof();
        boolean boolean13 = iRFactory0.eof();
        com.google.javascript.rhino.head.IRFactory iRFactory14 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory15 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot19 = iRFactory15.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode20 = iRFactory14.transformTree(astRoot19);
        com.google.javascript.rhino.head.ast.AstRoot astRoot24 = iRFactory14.parse("", "hi!", (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode25 = iRFactory0.transformTree(astRoot24);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
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
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory17.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = iRFactory16.transformTree(astRoot21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory16.parse("", "", (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = iRFactory0.transformTree(astRoot26);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
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
        com.google.javascript.rhino.head.IRFactory iRFactory16 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.IRFactory iRFactory17 = new com.google.javascript.rhino.head.IRFactory();
        com.google.javascript.rhino.head.ast.AstRoot astRoot21 = iRFactory17.parse("", "hi!", (int) 'a');
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode22 = iRFactory16.transformTree(astRoot21);
        com.google.javascript.rhino.head.ast.AstRoot astRoot26 = iRFactory16.parse("", "", (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.head.ast.ScriptNode scriptNode27 = iRFactory0.transformTree(astRoot26);
    }
}
