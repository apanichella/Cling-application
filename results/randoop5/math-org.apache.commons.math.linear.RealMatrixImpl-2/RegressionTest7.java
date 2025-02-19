import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.copy();
        boolean boolean12 = realMatrixImpl3.isSingular();
        boolean boolean13 = realMatrixImpl3.isSingular();
        double double14 = realMatrixImpl3.getNorm();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[][] doubleArray24 = realMatrixImpl18.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl25.copy();
        double[] doubleArray28 = realMatrixImpl25.getRow((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = realMatrixImpl3.solve(doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: constant vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0]");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        double[][] doubleArray10 = realMatrixImpl3.getData();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl3.luDecompose();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: LU decomposition requires that the matrix be square.");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double double23 = realMatrixImpl13.getNorm();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double double43 = realMatrixImpl31.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl31.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl31.scalarMultiply((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        java.lang.String str48 = realMatrixImpl13.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl13.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl13.scalarMultiply((-1.0d));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.0d + "'", double23 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str48, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(realMatrix51);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        int int15 = realMatrixImpl13.getColumnDimension();
        double[][] doubleArray16 = realMatrixImpl13.getDataRef();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray28 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray29 = realMatrixImpl20.preMultiply(doubleArray28);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        boolean boolean31 = realMatrixImpl30.isSquare();
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl35.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        boolean boolean41 = realMatrixImpl35.isSquare();
        int int42 = realMatrixImpl35.getColumnDimension();
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray54 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray55 = realMatrixImpl46.preMultiply(doubleArray54);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray57 = realMatrixImpl35.preMultiply(doubleArray54);
        boolean boolean58 = realMatrixImpl30.equals((java.lang.Object) realMatrixImpl35);
        double[] doubleArray61 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl62.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        double[] doubleArray70 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray71 = realMatrixImpl62.preMultiply(doubleArray70);
        double[] doubleArray72 = realMatrixImpl30.preMultiply(doubleArray71);
        double[] doubleArray75 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        double[] doubleArray79 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl76.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl80);
        double[] doubleArray84 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl85 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray84);
        double[] doubleArray88 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl89 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray88);
        org.apache.commons.math.linear.RealMatrix realMatrix90 = realMatrixImpl85.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl89);
        org.apache.commons.math.linear.RealMatrix realMatrix91 = realMatrixImpl80.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl89);
        boolean boolean92 = realMatrixImpl80.isSquare();
        double double93 = realMatrixImpl80.getNorm();
        double[] doubleArray95 = realMatrixImpl80.getRow((int) (short) 1);
        double[] doubleArray96 = realMatrixImpl30.operate(doubleArray95);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl97 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray96);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl98 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray96);
        double[] doubleArray99 = realMatrixImpl13.solve(doubleArray96);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix90);
        org.junit.Assert.assertNotNull(realMatrix91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 1.0d + "'", double93 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray96), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray99);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray99), "[1.0]");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        int int22 = realMatrixImpl7.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.transpose();
        double[][] doubleArray24 = realMatrixImpl7.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double double26 = realMatrixImpl25.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            double double29 = realMatrixImpl25.getEntry((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl16.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl16.copy();
        double[][] doubleArray21 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double double27 = realMatrixImpl26.getNorm();
        boolean boolean28 = realMatrixImpl26.isSingular();
        int int29 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.scalarAdd(1.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        int int33 = realMatrixImpl26.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        java.lang.String str16 = realMatrixImpl13.toString();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double double21 = realMatrixImpl20.getNorm();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double double26 = realMatrixImpl25.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl25.transpose();
        double[] doubleArray29 = realMatrixImpl25.getColumn(0);
        double[] doubleArray30 = realMatrixImpl20.preMultiply(doubleArray29);
        double[] doubleArray31 = realMatrixImpl13.preMultiply(doubleArray29);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl40.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        boolean boolean52 = realMatrixImpl40.isSquare();
        int int53 = realMatrixImpl40.getColumnDimension();
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl66.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl61.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl40.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl61.scalarMultiply((double) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl61.scalarAdd(100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl61.copy();
        boolean boolean79 = realMatrixImpl32.equals((java.lang.Object) realMatrixImpl61);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str16, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray33 = realMatrixImpl7.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        boolean boolean35 = realMatrixImpl34.isSquare();
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl39.scalarMultiply((double) (short) -1);
        boolean boolean47 = realMatrixImpl34.equals((java.lang.Object) realMatrixImpl39);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl39.copy();
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl52.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        double[][] doubleArray58 = realMatrixImpl52.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double[][] doubleArray60 = realMatrixImpl59.getData();
        boolean boolean61 = realMatrixImpl59.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        // The following exception was thrown during execution in test generation
        try {
            double double63 = realMatrixImpl39.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(realMatrix62);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean18 = realMatrixImpl12.isSquare();
        int int19 = realMatrixImpl12.getColumnDimension();
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray31 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray32 = realMatrixImpl23.preMultiply(doubleArray31);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray34 = realMatrixImpl12.preMultiply(doubleArray31);
        java.lang.String str35 = realMatrixImpl12.toString();
        double double38 = realMatrixImpl12.getEntry(0, 0);
        double[] doubleArray40 = realMatrixImpl12.getRow(0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray41 = realMatrixImpl8.preMultiply(doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str35, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0]");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[][] doubleArray11 = realMatrixImpl10.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = realMatrixImpl13.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl29.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray53 = realMatrixImpl44.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray55 = realMatrixImpl29.preMultiply(doubleArray52);
        double[] doubleArray56 = realMatrixImpl7.preMultiply(doubleArray52);
        java.lang.String str57 = realMatrixImpl7.toString();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray59 = realMatrixImpl7.getRow(97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str57, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        double[] doubleArray8 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl9.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean25 = realMatrixImpl13.isSquare();
        int int26 = realMatrixImpl13.getColumnDimension();
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double double47 = realMatrixImpl13.getNorm();
        boolean boolean48 = realMatrixImpl13.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl13.copy();
        java.lang.Class<?> wildcardClass51 = realMatrixImpl13.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double double19 = realMatrixImpl7.getNorm();
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl27.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        boolean boolean39 = realMatrixImpl27.isSquare();
        double double40 = realMatrixImpl27.getNorm();
        boolean boolean41 = realMatrixImpl27.isSingular();
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        double[] doubleArray57 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl54.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl49.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl64.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        double[] doubleArray72 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray73 = realMatrixImpl64.preMultiply(doubleArray72);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        double[] doubleArray75 = realMatrixImpl49.preMultiply(doubleArray72);
        double[] doubleArray76 = realMatrixImpl27.preMultiply(doubleArray72);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray80 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray82 = realMatrixImpl7.solve(doubleArray80);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 1.0]");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray33 = realMatrixImpl7.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl34.copy();
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        double[] doubleArray57 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        double[] doubleArray61 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl58.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl62);
        double[] doubleArray66 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray67 = realMatrixImpl58.preMultiply(doubleArray66);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        double[] doubleArray71 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        double[] doubleArray75 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl72.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl76);
        boolean boolean78 = realMatrixImpl72.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl72.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl58.subtract(realMatrix80);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl58.scalarAdd((double) 10.0f);
        boolean boolean84 = realMatrixImpl34.equals((java.lang.Object) 10.0f);
        boolean boolean85 = realMatrixImpl34.isSquare();
        double double86 = realMatrixImpl34.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 11.0d + "'", double86 == 11.0d);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl10.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        boolean boolean26 = realMatrixImpl14.isSquare();
        double double27 = realMatrixImpl14.getNorm();
        double[] doubleArray33 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        boolean boolean36 = realMatrixImpl14.equals((java.lang.Object) realMatrixImpl35);
        int int37 = realMatrixImpl14.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl14.scalarAdd((-1.0d));
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl14);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl3.scalarAdd((double) (byte) -1);
        double[][] doubleArray43 = realMatrixImpl3.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray43);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        double[] doubleArray26 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        boolean boolean29 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl28);
        int int30 = realMatrixImpl7.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl7.getSubMatrix(2, (int) (byte) 100, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[][] doubleArray33 = realMatrixImpl16.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double double36 = realMatrixImpl35.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            double double37 = realMatrixImpl35.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl7.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl7.copy();
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl19.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        double[] doubleArray42 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray43 = realMatrixImpl34.preMultiply(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        boolean boolean45 = realMatrixImpl28.isSingular();
        boolean boolean46 = realMatrixImpl28.isSquare();
        double[][] doubleArray47 = realMatrixImpl28.getData();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl7.setSubMatrix(doubleArray47, 2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        int int6 = realMatrixImpl3.getColumnDimension();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        double[][] doubleArray8 = realMatrixImpl3.getDataRef();
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray20 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray21 = realMatrixImpl12.preMultiply(doubleArray20);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        boolean boolean23 = realMatrixImpl22.isSingular();
        double double24 = realMatrixImpl22.getNorm();
        int int25 = realMatrixImpl22.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.scalarMultiply((double) 5);
        double[][] doubleArray28 = realMatrixImpl22.getDataRef();
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray40 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray41 = realMatrixImpl32.preMultiply(doubleArray40);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl46.scalarMultiply((double) (short) 100);
        double[] doubleArray50 = realMatrixImpl46.getRow(0);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl42.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        int int53 = realMatrixImpl42.getColumnDimension();
        boolean boolean54 = realMatrixImpl42.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl3.transpose();
        // The following exception was thrown during execution in test generation
        try {
            double double57 = realMatrixImpl3.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 11.0d + "'", double24 == 11.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        boolean boolean6 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl3.transpose();
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double double12 = realMatrixImpl11.getNorm();
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl16.transpose();
        double[] doubleArray20 = realMatrixImpl16.getColumn(0);
        double[] doubleArray21 = realMatrixImpl11.preMultiply(doubleArray20);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[][] doubleArray23 = realMatrixImpl22.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl22.getRowMatrix(0);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.scalarAdd((double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl3.subtract(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        java.lang.String str6 = realMatrixImpl3.toString();
        double double7 = realMatrixImpl3.getNorm();
        java.lang.String str8 = realMatrixImpl3.toString();
        double[][] doubleArray9 = realMatrixImpl3.getData();
        double double10 = realMatrixImpl3.getNorm();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray23 = realMatrixImpl14.preMultiply(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        boolean boolean25 = realMatrixImpl24.isSingular();
        double double26 = realMatrixImpl24.getNorm();
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl24.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        int int47 = realMatrixImpl24.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl24.scalarAdd(1.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl24.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl3.subtract(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str6, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str8, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 11.0d + "'", double26 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix51);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        boolean boolean11 = realMatrixImpl10.isSquare();
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl19.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double double31 = realMatrixImpl19.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl10.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        boolean boolean33 = realMatrixImpl19.isSingular();
        double[] doubleArray39 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray45 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray51 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[][] doubleArray52 = new double[][] { doubleArray39, doubleArray45, doubleArray51 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        int int55 = realMatrixImpl54.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl54.scalarAdd(300.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl19.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect row dimension");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNotNull(realMatrix57);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray22 = realMatrixImpl7.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray25 = realMatrixImpl23.getRow(0);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl23.scalarAdd((double) (byte) 100);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[] doubleArray39 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray40 = realMatrixImpl31.preMultiply(doubleArray39);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        java.lang.String str42 = realMatrixImpl41.toString();
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl46.scalarMultiply((double) (short) 100);
        double[][] doubleArray49 = realMatrixImpl46.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl41.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        double double51 = realMatrixImpl41.getNorm();
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl55.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl64.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl59.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        double double71 = realMatrixImpl59.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl59.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl59.scalarMultiply((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl41.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        double[][] doubleArray76 = realMatrixImpl41.getDataRef();
        double[][] doubleArray77 = realMatrixImpl41.getData();
        double[] doubleArray79 = realMatrixImpl41.getColumn(0);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray80 = realMatrixImpl23.solve(doubleArray79);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str42, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 11.0d + "'", double51 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.0d + "'", double71 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[10.0, -1.0]");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) (short) -1);
        double double12 = realMatrixImpl3.getNorm();
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl16.transpose();
        double[][] doubleArray19 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        int[] intArray23 = new int[] { (short) 1 };
        int[] intArray28 = new int[] { (-1), (-1), 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl3.getSubMatrix(intArray23, intArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, -1, 100, 1]");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        boolean boolean10 = realMatrixImpl9.isSingular();
        double[][] doubleArray11 = realMatrixImpl9.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl9.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarMultiply(100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl13.getColumnMatrix(0);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 100, 10);
        int int3 = realMatrixImpl2.getColumnDimension();
        boolean boolean4 = realMatrixImpl2.isSingular();
        double[][] doubleArray5 = realMatrixImpl2.getDataRef();
        int int6 = realMatrixImpl2.getColumnDimension();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        double[][] doubleArray18 = realMatrixImpl16.getDataRef();
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean28 = realMatrixImpl22.isSquare();
        int int29 = realMatrixImpl22.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean31 = realMatrixImpl22.isSingular();
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl35.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl39.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        double[] doubleArray57 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl54.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        double[] doubleArray62 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray63 = realMatrixImpl54.preMultiply(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl48.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        double double69 = realMatrixImpl68.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl68.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl68.scalarAdd((double) 1.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl22.getColumnMatrix(0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix76);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double double23 = realMatrixImpl13.getNorm();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double double43 = realMatrixImpl31.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl31.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl31.scalarMultiply((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        int[] intArray51 = new int[] { 5, (byte) 10, 2 };
        int[] intArray54 = new int[] { (byte) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl13.getSubMatrix(intArray51, intArray54);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.0d + "'", double23 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[5, 10, 2]");
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[10, 100]");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double double15 = realMatrixImpl13.getNorm();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        boolean boolean55 = realMatrixImpl43.isSquare();
        int int56 = realMatrixImpl43.getColumnDimension();
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl60.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        double[] doubleArray68 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        double[] doubleArray72 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl69.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl64.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl73);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        double double77 = realMatrixImpl43.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl43.getRowMatrix((int) (byte) 1);
        boolean boolean80 = realMatrixImpl43.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        int int82 = realMatrixImpl32.getRowDimension();
        java.lang.String str83 = realMatrixImpl32.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl32.scalarAdd((double) (-1L));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str83, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix85);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        boolean boolean6 = realMatrixImpl3.isSingular();
        double[][] doubleArray7 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.getColumnMatrix(97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl16.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl16.copy();
        int int21 = realMatrixImpl16.getRowDimension();
        int int22 = realMatrixImpl16.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl16.getRowMatrix((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, 10);
        java.lang.String str3 = realMatrixImpl2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0}}" + "'", str3, "RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0}}");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(1, 10);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = realMatrixImpl2.getTrace();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix is not square");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        double[] doubleArray8 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl9.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean25 = realMatrixImpl13.isSquare();
        int int26 = realMatrixImpl13.getColumnDimension();
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double double47 = realMatrixImpl13.getNorm();
        boolean boolean48 = realMatrixImpl13.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl3.scalarAdd((double) 0L);
        double[][] doubleArray52 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray52);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        int int15 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl13.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.scalarAdd((double) 0);
        int int19 = realMatrixImpl13.getColumnDimension();
        double[][] doubleArray20 = realMatrixImpl13.getDataRef();
        int int21 = realMatrixImpl13.getRowDimension();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[][] doubleArray31 = realMatrixImpl25.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl33.getColumnMatrix((int) (short) 0);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl43.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl33.multiply(realMatrix55);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl33.scalarMultiply((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl13.solve(realMatrix58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect row dimension");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix58);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarMultiply((double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl7.copy();
        int int11 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl7.scalarMultiply((double) ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 100, 10);
        int int3 = realMatrixImpl2.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl2.scalarMultiply((double) '#');
        double[] doubleArray8 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double double10 = realMatrixImpl9.getNorm();
        boolean boolean11 = realMatrixImpl9.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl9.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl9.scalarMultiply((double) 100);
        java.lang.String str16 = realMatrixImpl9.toString();
        double[][] doubleArray17 = realMatrixImpl9.getDataRef();
        realMatrixImpl2.setSubMatrix(doubleArray17, 2, 0);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl2.copy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str16, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double double11 = realMatrixImpl3.getNorm();
        java.lang.String str12 = realMatrixImpl3.toString();
        int int13 = realMatrixImpl3.getRowDimension();
        double[] doubleArray15 = realMatrixImpl3.getRow(1);
        int int16 = realMatrixImpl3.getColumnDimension();
        java.lang.String str17 = realMatrixImpl3.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str12, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str17, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.scalarMultiply((double) (short) -1);
        double double13 = realMatrixImpl3.getEntry((int) (short) 0, (int) (short) 0);
        double[][] doubleArray14 = realMatrixImpl3.getData();
        double double15 = realMatrixImpl3.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean24 = realMatrixImpl18.isSquare();
        int int25 = realMatrixImpl18.getColumnDimension();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray40 = realMatrixImpl18.preMultiply(doubleArray37);
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        double[][] doubleArray42 = realMatrixImpl18.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        boolean boolean44 = realMatrixImpl43.isSquare();
        int int45 = realMatrixImpl43.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double double15 = realMatrixImpl13.getNorm();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        boolean boolean55 = realMatrixImpl43.isSquare();
        int int56 = realMatrixImpl43.getColumnDimension();
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl60.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        double[] doubleArray68 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        double[] doubleArray72 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl69.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl64.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl73);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        double double77 = realMatrixImpl43.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl43.getRowMatrix((int) (byte) 1);
        boolean boolean80 = realMatrixImpl43.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[][] doubleArray82 = realMatrixImpl32.getData();
        double double83 = realMatrixImpl32.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl29.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray53 = realMatrixImpl44.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray55 = realMatrixImpl29.preMultiply(doubleArray52);
        double[] doubleArray56 = realMatrixImpl7.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(3, (int) (short) 1);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl64.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        double[] doubleArray72 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray73 = realMatrixImpl64.preMultiply(doubleArray72);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        boolean boolean75 = realMatrixImpl74.isSingular();
        double[][] doubleArray76 = realMatrixImpl74.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        boolean boolean78 = realMatrixImpl60.equals((java.lang.Object) realMatrixImpl77);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl57.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl60);
        double double80 = realMatrixImpl57.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        int int6 = realMatrixImpl3.getColumnDimension();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        double[][] doubleArray8 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        java.lang.String str19 = realMatrixImpl13.toString();
        boolean boolean20 = realMatrixImpl13.isSquare();
        double[] doubleArray22 = realMatrixImpl13.getColumn((int) (short) 0);
        boolean boolean23 = realMatrixImpl9.equals((java.lang.Object) realMatrixImpl13);
        java.lang.Class<?> wildcardClass24 = realMatrixImpl13.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str19, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl3.scalarMultiply((double) (short) 0);
        java.lang.String str10 = realMatrixImpl3.toString();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = realMatrixImpl3.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str10, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(3, (int) (short) 1);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        boolean boolean40 = realMatrixImpl39.isSingular();
        double[][] doubleArray41 = realMatrixImpl39.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        boolean boolean43 = realMatrixImpl25.equals((java.lang.Object) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl25.scalarAdd((double) 10L);
        boolean boolean46 = realMatrixImpl18.equals((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl18.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        int int15 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl13.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.scalarAdd((double) 0);
        int int19 = realMatrixImpl13.getColumnDimension();
        double[][] doubleArray20 = realMatrixImpl13.getDataRef();
        int int21 = realMatrixImpl13.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray23 = realMatrixImpl13.getColumn(1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double double11 = realMatrixImpl10.getNorm();
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double double16 = realMatrixImpl15.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl15.transpose();
        double[] doubleArray19 = realMatrixImpl15.getColumn(0);
        double[] doubleArray20 = realMatrixImpl10.preMultiply(doubleArray19);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl21.transpose();
        boolean boolean23 = realMatrixImpl3.equals((java.lang.Object) realMatrix22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray36 = realMatrixImpl27.preMultiply(doubleArray35);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl41.scalarMultiply((double) (short) 100);
        double[] doubleArray45 = realMatrixImpl41.getRow(0);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        boolean boolean48 = realMatrixImpl37.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl37.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl37.getColumnMatrix(2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(realMatrix49);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[][] doubleArray33 = realMatrixImpl16.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double double35 = realMatrixImpl34.getNorm();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(100, (int) (byte) 1);
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl42.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        boolean boolean48 = realMatrixImpl42.isSquare();
        int int49 = realMatrixImpl42.getColumnDimension();
        double double50 = realMatrixImpl42.getNorm();
        boolean boolean51 = realMatrixImpl38.equals((java.lang.Object) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl34.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        double[][] doubleArray53 = realMatrixImpl42.getDataRef();
        double[] doubleArray55 = realMatrixImpl42.getRow((int) (byte) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl42.copy();
        int int57 = realMatrixImpl42.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarMultiply(100.0d);
        int int16 = realMatrixImpl13.getRowDimension();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray28 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray29 = realMatrixImpl20.preMultiply(doubleArray28);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        boolean boolean31 = realMatrixImpl30.isSquare();
        int int32 = realMatrixImpl30.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl30.transpose();
        double double34 = realMatrixImpl30.getTrace();
        boolean boolean35 = realMatrixImpl30.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl13.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double double41 = realMatrixImpl40.getNorm();
        boolean boolean42 = realMatrixImpl40.isSingular();
        int int43 = realMatrixImpl40.getColumnDimension();
        double double44 = realMatrixImpl40.getNorm();
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl48.scalarMultiply((double) (short) 100);
        java.lang.String str51 = realMatrixImpl48.toString();
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl55.scalarMultiply((double) (short) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl48.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl55.scalarMultiply((double) '#');
        boolean boolean61 = realMatrixImpl55.isSingular();
        double[][] doubleArray62 = realMatrixImpl55.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        boolean boolean65 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl63);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str51, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        java.lang.String str15 = realMatrixImpl13.toString();
        int int16 = realMatrixImpl13.getRowDimension();
        double[][] doubleArray17 = realMatrixImpl13.getData();
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl21.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        double[] doubleArray29 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray30 = realMatrixImpl21.preMultiply(doubleArray29);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        boolean boolean32 = realMatrixImpl31.isSquare();
        int int33 = realMatrixImpl31.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl31.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.scalarAdd((double) 0);
        int int37 = realMatrixImpl31.getColumnDimension();
        double[][] doubleArray38 = realMatrixImpl31.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl31.scalarAdd((double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl31.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.copy();
        boolean boolean43 = realMatrixImpl13.equals((java.lang.Object) realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str15, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        int int7 = realMatrixImpl6.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl6.copy();
        java.lang.String str9 = realMatrixImpl6.toString();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{10.0},{1.0},{0.0},{-1.0},{0.0}}" + "'", str9, "RealMatrixImpl{{10.0},{1.0},{0.0},{-1.0},{0.0}}");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray33 = realMatrixImpl7.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl38.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl47.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl42.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        double[] doubleArray65 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray66 = realMatrixImpl57.preMultiply(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl51.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        double[][] doubleArray68 = realMatrixImpl51.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        double double70 = realMatrixImpl69.getNorm();
        double[] doubleArray73 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        double[] doubleArray77 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl74.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl78);
        double[] doubleArray82 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray83 = realMatrixImpl74.preMultiply(doubleArray82);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray83);
        boolean boolean85 = realMatrixImpl84.isSquare();
        int int86 = realMatrixImpl84.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl69.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl84);
        boolean boolean88 = realMatrixImpl34.equals((java.lang.Object) realMatrixImpl84);
        double double89 = realMatrixImpl84.getNorm();
        double[][] doubleArray90 = realMatrixImpl84.getDataRef();
        int int91 = realMatrixImpl84.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertNotNull(realMatrix87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 1.0d + "'", double89 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean17 = realMatrixImpl16.isSingular();
        int int18 = realMatrixImpl16.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) ' ', 5);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[] doubleArray18 = realMatrixImpl16.getRow((int) (byte) 1);
        double[][] doubleArray19 = realMatrixImpl16.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl16.scalarMultiply(0.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double double5 = realMatrixImpl3.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        java.lang.String str6 = realMatrixImpl3.toString();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl10.scalarMultiply((double) (short) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl10);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl10.scalarMultiply((double) '#');
        boolean boolean16 = realMatrixImpl10.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl10.scalarMultiply((double) 100L);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl22.scalarMultiply((double) (short) 100);
        double[][] doubleArray25 = realMatrixImpl22.getDataRef();
        double double26 = realMatrixImpl22.getNorm();
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray38 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray39 = realMatrixImpl30.preMultiply(doubleArray38);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl40.scalarMultiply(100.0d);
        boolean boolean43 = realMatrixImpl22.equals((java.lang.Object) realMatrixImpl40);
        java.lang.String str44 = realMatrixImpl40.toString();
        double[][] doubleArray45 = realMatrixImpl40.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl10.setSubMatrix(doubleArray45, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str6, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str44, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray45);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.scalarMultiply((double) (short) -1);
        double double13 = realMatrixImpl3.getEntry((int) (short) 0, (int) (short) 0);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl17.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl21.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[] doubleArray44 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray45 = realMatrixImpl36.preMultiply(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl30.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl30.scalarMultiply(0.0d);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double double53 = realMatrixImpl52.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl52.transpose();
        double[][] doubleArray55 = realMatrixImpl52.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        boolean boolean57 = realMatrixImpl30.equals((java.lang.Object) realMatrixImpl56);
        boolean boolean58 = realMatrixImpl56.isSquare();
        int int59 = realMatrixImpl56.getRowDimension();
        double[] doubleArray62 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        double[] doubleArray66 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl63.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl67);
        double[][] doubleArray69 = realMatrixImpl63.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        boolean boolean71 = realMatrixImpl70.isSquare();
        double double72 = realMatrixImpl70.getNorm();
        boolean boolean73 = realMatrixImpl56.equals((java.lang.Object) realMatrixImpl70);
        double[] doubleArray76 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray76);
        double[] doubleArray80 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = realMatrixImpl77.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl81);
        double[] doubleArray85 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray86 = realMatrixImpl77.preMultiply(doubleArray85);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl87 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray85);
        boolean boolean88 = realMatrixImpl87.isSingular();
        double[][] doubleArray89 = realMatrixImpl87.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray89);
        int int91 = realMatrixImpl90.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix92 = realMatrixImpl56.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl90);
        org.apache.commons.math.linear.RealMatrix realMatrix93 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl90);
        java.lang.Class<?> wildcardClass94 = realMatrixImpl90.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 2 + "'", int91 == 2);
        org.junit.Assert.assertNotNull(realMatrix92);
        org.junit.Assert.assertNotNull(realMatrix93);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[] doubleArray7 = realMatrixImpl3.getRow(0);
        java.lang.String str8 = realMatrixImpl3.toString();
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl21.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[] doubleArray39 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray40 = realMatrixImpl31.preMultiply(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl25.scalarMultiply(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        boolean boolean45 = realMatrixImpl3.isSingular();
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl49.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        java.lang.String str55 = realMatrixImpl49.toString();
        double[][] doubleArray56 = realMatrixImpl49.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str8, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str55, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(realMatrix57);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        boolean boolean6 = realMatrixImpl3.isSingular();
        double[][] doubleArray7 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.copy();
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSquare();
        boolean boolean22 = realMatrixImpl7.isSquare();
        double[][] doubleArray23 = realMatrixImpl7.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl16.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl16.copy();
        double[][] doubleArray21 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = realMatrixImpl23.getRow((int) (byte) 1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl26.inverse();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[] doubleArray7 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double double9 = realMatrixImpl8.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl8.transpose();
        double[] doubleArray12 = realMatrixImpl8.getColumn(0);
        double[] doubleArray13 = realMatrixImpl3.preMultiply(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl3.scalarAdd((double) (short) 10);
        boolean boolean16 = realMatrixImpl3.isSingular();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl20.scalarMultiply((double) (short) 100);
        double[][] doubleArray23 = realMatrixImpl20.getDataRef();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        boolean boolean43 = realMatrixImpl31.isSquare();
        double double44 = realMatrixImpl31.getNorm();
        double[] doubleArray50 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        boolean boolean53 = realMatrixImpl31.equals((java.lang.Object) realMatrixImpl52);
        int int54 = realMatrixImpl31.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl31.scalarAdd((-1.0d));
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl20.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl3.copy();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray61 = realMatrixImpl3.getColumn((int) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        int int22 = realMatrixImpl7.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.transpose();
        double[][] doubleArray24 = realMatrixImpl7.getDataRef();
        double double25 = realMatrixImpl7.getNorm();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double double30 = realMatrixImpl29.getNorm();
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double double35 = realMatrixImpl34.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl34.transpose();
        double[] doubleArray38 = realMatrixImpl34.getColumn(0);
        double[] doubleArray39 = realMatrixImpl29.preMultiply(doubleArray38);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        boolean boolean41 = realMatrixImpl40.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        int int43 = realMatrixImpl7.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double double37 = realMatrixImpl36.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl16.copy();
        boolean boolean41 = realMatrixImpl16.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl16.scalarMultiply((double) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(realMatrix43);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        int int22 = realMatrixImpl7.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.transpose();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double double28 = realMatrixImpl27.getNorm();
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double double33 = realMatrixImpl32.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl32.transpose();
        double[] doubleArray36 = realMatrixImpl32.getColumn(0);
        double[] doubleArray37 = realMatrixImpl27.preMultiply(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl38.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.copy();
        boolean boolean41 = realMatrixImpl7.equals((java.lang.Object) realMatrix40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        double[][] doubleArray51 = realMatrixImpl45.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl45.scalarAdd((double) 1L);
        boolean boolean54 = realMatrixImpl45.isSquare();
        double[] doubleArray57 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        double[][] doubleArray59 = realMatrixImpl58.getDataRef();
        int int60 = realMatrixImpl58.getRowDimension();
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl64.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl68);
        double[] doubleArray72 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray73 = realMatrixImpl64.preMultiply(doubleArray72);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        double[] doubleArray76 = realMatrixImpl58.preMultiply(doubleArray72);
        double[] doubleArray77 = realMatrixImpl45.preMultiply(doubleArray72);
        java.lang.String str78 = realMatrixImpl45.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl45.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl7.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        // The following exception was thrown during execution in test generation
        try {
            double double81 = realMatrixImpl45.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str78, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(realMatrix80);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.scalarAdd((double) ' ');
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl40.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[][] doubleArray45 = realMatrixImpl40.getData();
        java.lang.String str46 = realMatrixImpl40.toString();
        double[][] doubleArray47 = realMatrixImpl40.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str46, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray47);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double double15 = realMatrixImpl13.getNorm();
        int int16 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.getColumnMatrix((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl13.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl13.scalarAdd((double) (byte) 0);
        double[] doubleArray27 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl28.getRowMatrix(0);
        java.lang.String str31 = realMatrixImpl28.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.scalarMultiply((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl13.preMultiply(realMatrix33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "RealMatrixImpl{{10.0},{1.0},{0.0},{-1.0},{0.0}}" + "'", str31, "RealMatrixImpl{{10.0},{1.0},{0.0},{-1.0},{0.0}}");
        org.junit.Assert.assertNotNull(realMatrix33);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        boolean boolean6 = realMatrixImpl3.isSingular();
        boolean boolean7 = realMatrixImpl3.isSingular();
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl11.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        double[][] doubleArray17 = realMatrixImpl11.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl19.getColumnMatrix((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl19.transpose();
        boolean boolean23 = realMatrixImpl3.equals((java.lang.Object) realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        java.lang.String str9 = realMatrixImpl3.toString();
        boolean boolean10 = realMatrixImpl3.isSquare();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl18.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        boolean boolean30 = realMatrixImpl18.isSquare();
        double double31 = realMatrixImpl18.getNorm();
        double[] doubleArray37 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        boolean boolean40 = realMatrixImpl18.equals((java.lang.Object) realMatrixImpl39);
        int int41 = realMatrixImpl18.getRowDimension();
        boolean boolean42 = realMatrixImpl3.equals((java.lang.Object) realMatrixImpl18);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl3.scalarMultiply((double) 100.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl3.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl3.getColumnMatrix((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl10.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl14.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray40 = realMatrixImpl14.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        boolean boolean42 = realMatrixImpl41.isSquare();
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl46.scalarMultiply((double) (short) -1);
        boolean boolean54 = realMatrixImpl41.equals((java.lang.Object) realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl46.copy();
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double[] doubleArray62 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl59.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
        double[][] doubleArray65 = realMatrixImpl59.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[][] doubleArray67 = realMatrixImpl66.getData();
        boolean boolean68 = realMatrixImpl66.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        boolean boolean70 = realMatrixImpl3.equals((java.lang.Object) realMatrixImpl66);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl7.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl7.scalarMultiply((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl7.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        int int6 = realMatrixImpl3.getColumnDimension();
        double double7 = realMatrixImpl3.getNorm();
        double[] doubleArray13 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl14.getRowMatrix(0);
        boolean boolean17 = realMatrixImpl14.isSingular();
        double[] doubleArray19 = realMatrixImpl14.getRow(3);
        double[][] doubleArray20 = realMatrixImpl14.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl3.setSubMatrix(doubleArray20, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl8.scalarAdd((double) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) 1L);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        boolean boolean21 = realMatrixImpl15.isSquare();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl29.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        boolean boolean41 = realMatrixImpl29.isSquare();
        double double42 = realMatrixImpl29.getNorm();
        boolean boolean43 = realMatrixImpl15.equals((java.lang.Object) double42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double double48 = realMatrixImpl47.getNorm();
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double double53 = realMatrixImpl52.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl52.transpose();
        double[] doubleArray56 = realMatrixImpl52.getColumn(0);
        double[] doubleArray57 = realMatrixImpl47.preMultiply(doubleArray56);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray59 = realMatrixImpl15.preMultiply(doubleArray56);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl60);
        int int62 = realMatrixImpl3.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl10.copy();
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl19.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        boolean boolean31 = realMatrixImpl19.isSquare();
        int int32 = realMatrixImpl19.getColumnDimension();
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl40.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl19.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double double53 = realMatrixImpl19.getNorm();
        boolean boolean54 = realMatrixImpl19.isSquare();
        double[] doubleArray56 = realMatrixImpl19.getRow((int) (byte) 1);
        java.lang.String str57 = realMatrixImpl19.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl10.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0]");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str57, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix58);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        int int7 = realMatrixImpl3.getRowDimension();
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl11.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl15.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl24.transpose();
        boolean boolean28 = realMatrixImpl24.isSingular();
        double[][] doubleArray29 = realMatrixImpl24.getData();
        double[][] doubleArray30 = realMatrixImpl24.getDataRef();
        realMatrixImpl3.setSubMatrix(doubleArray30, (int) (byte) 0, (int) (short) 0);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray45 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray46 = realMatrixImpl37.preMultiply(doubleArray45);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        boolean boolean48 = realMatrixImpl47.isSingular();
        double[][] doubleArray49 = realMatrixImpl47.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        double double51 = realMatrixImpl50.getNorm();
        double[][] doubleArray52 = realMatrixImpl50.getDataRef();
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl56.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl60);
        boolean boolean62 = realMatrixImpl56.isSquare();
        int int63 = realMatrixImpl56.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl50.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl50.scalarMultiply((double) ' ');
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        double double71 = realMatrixImpl70.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl70.transpose();
        double[][] doubleArray73 = realMatrixImpl70.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl70.scalarAdd(0.0d);
        double[] doubleArray78 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        double[] doubleArray82 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray82);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl79.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl83);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl70.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl79);
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl50.subtract(realMatrix85);
        org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 11.0d + "'", double51 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.0d + "'", double71 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertNotNull(realMatrix87);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        boolean boolean42 = realMatrixImpl36.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl36.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl22.subtract(realMatrix44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl22.scalarAdd((double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl22.scalarMultiply((double) (-1));
        java.lang.String str50 = realMatrixImpl22.toString();
        boolean boolean51 = realMatrixImpl22.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double52 = realMatrixImpl22.getDeterminant();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str50, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix4 = realMatrixImpl2.scalarMultiply((double) (-1));
        double[][] doubleArray5 = realMatrixImpl2.getDataRef();
        boolean boolean6 = realMatrixImpl2.isSingular();
        int[] intArray11 = new int[] { '4', 5, 0, (byte) 100 };
        int[] intArray16 = new int[] { 10, '4', 3, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl2.getSubMatrix(intArray11, intArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(realMatrix4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 5, 0, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 52, 3, 0]");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl34.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl29.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl38);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray53 = realMatrixImpl44.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray55 = realMatrixImpl29.preMultiply(doubleArray52);
        double[] doubleArray56 = realMatrixImpl7.preMultiply(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl59.scalarAdd((double) '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix61);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        double[][] doubleArray18 = realMatrixImpl16.getDataRef();
        int int19 = realMatrixImpl16.getColumnDimension();
        double[][] doubleArray20 = realMatrixImpl16.getData();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray33 = realMatrixImpl24.preMultiply(doubleArray32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        boolean boolean35 = realMatrixImpl34.isSingular();
        double[][] doubleArray36 = realMatrixImpl34.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double double38 = realMatrixImpl37.getNorm();
        double[][] doubleArray39 = realMatrixImpl37.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray53 = realMatrixImpl44.preMultiply(doubleArray52);
        boolean boolean54 = realMatrixImpl44.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        int int56 = realMatrixImpl44.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl44.getColumnMatrix(2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 11.0d + "'", double38 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(realMatrix57);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        double[] doubleArray20 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl21.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl25);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        double[] doubleArray48 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray49 = realMatrixImpl40.preMultiply(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl34.scalarMultiply(0.0d);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        double double57 = realMatrixImpl56.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl56.transpose();
        double[][] doubleArray59 = realMatrixImpl56.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        boolean boolean61 = realMatrixImpl34.equals((java.lang.Object) realMatrixImpl60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double double63 = realMatrixImpl16.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl16.copy();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl16.luDecompose();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: LU decomposition requires that the matrix be square.");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 11.0d + "'", double63 == 11.0d);
        org.junit.Assert.assertNotNull(realMatrix64);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        double[][] doubleArray18 = realMatrixImpl16.getDataRef();
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean28 = realMatrixImpl22.isSquare();
        int int29 = realMatrixImpl22.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double double31 = realMatrixImpl16.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl16.scalarMultiply(0.0d);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[][] doubleArray43 = realMatrixImpl37.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl45.getColumnMatrix((int) (short) 0);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl51.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl60.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl55.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl55.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl45.multiply(realMatrix67);
        int int69 = realMatrixImpl45.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl16.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 11.0d + "'", double31 == 11.0d);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean24 = realMatrixImpl18.isSquare();
        int int25 = realMatrixImpl18.getColumnDimension();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray40 = realMatrixImpl18.preMultiply(doubleArray37);
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        double[][] doubleArray42 = realMatrixImpl18.getData();
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl55.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl50.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        boolean boolean62 = realMatrixImpl50.isSquare();
        int int63 = realMatrixImpl50.getColumnDimension();
        double[] doubleArray65 = realMatrixImpl50.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl66);
        double[] doubleArray70 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        double double72 = realMatrixImpl71.getNorm();
        double[] doubleArray75 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        double double77 = realMatrixImpl76.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix78 = realMatrixImpl76.transpose();
        double[] doubleArray80 = realMatrixImpl76.getColumn(0);
        double[] doubleArray81 = realMatrixImpl71.preMultiply(doubleArray80);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        double[][] doubleArray83 = realMatrixImpl82.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl82.getRowMatrix(0);
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl66.multiply(realMatrix85);
        double[] doubleArray87 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray88 = realMatrixImpl66.preMultiply(doubleArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 1.0d + "'", double72 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix86);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        boolean boolean42 = realMatrixImpl36.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl36.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl22.subtract(realMatrix44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl22.scalarAdd((double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl22.scalarMultiply((double) (-1));
        java.lang.String str50 = realMatrixImpl22.toString();
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl54.transpose();
        double[][] doubleArray56 = realMatrixImpl54.getDataRef();
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double double61 = realMatrixImpl60.getNorm();
        double[][] doubleArray62 = realMatrixImpl60.getDataRef();
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl66.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        double[] doubleArray74 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray75 = realMatrixImpl66.preMultiply(doubleArray74);
        boolean boolean76 = realMatrixImpl66.isSingular();
        double[] doubleArray78 = realMatrixImpl66.getColumn((int) (byte) 0);
        double[] doubleArray79 = realMatrixImpl60.preMultiply(doubleArray78);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        double[] doubleArray82 = realMatrixImpl54.preMultiply(doubleArray78);
        double[] doubleArray83 = realMatrixImpl22.preMultiply(doubleArray78);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str50, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0]");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        int int16 = realMatrixImpl15.getColumnDimension();
        double[][] doubleArray17 = realMatrixImpl15.getData();
        double[][] doubleArray18 = realMatrixImpl15.getDataRef();
        double[][] doubleArray19 = realMatrixImpl15.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.transpose();
        java.lang.String str21 = realMatrixImpl15.toString();
        java.lang.String str22 = realMatrixImpl15.toString();
        double double23 = realMatrixImpl15.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RealMatrixImpl{{-1.0}}" + "'", str21, "RealMatrixImpl{{-1.0}}");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RealMatrixImpl{{-1.0}}" + "'", str22, "RealMatrixImpl{{-1.0}}");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarMultiply((double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.scalarMultiply((double) (byte) 1);
        int int14 = realMatrixImpl3.getRowDimension();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl22.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        boolean boolean34 = realMatrixImpl31.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl31.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix36);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray33 = realMatrixImpl7.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl7.scalarMultiply((double) 100);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        boolean boolean55 = realMatrixImpl52.isSquare();
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        double double60 = realMatrixImpl59.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl59.transpose();
        double[][] doubleArray62 = realMatrixImpl59.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl63.scalarMultiply((double) (byte) 100);
        boolean boolean66 = realMatrixImpl52.equals((java.lang.Object) realMatrix65);
        int int67 = realMatrixImpl52.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl7.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        int[] intArray71 = new int[] { (byte) 1, (-1) };
        int[] intArray76 = new int[] { 100, 97, 0, 2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl52.getSubMatrix(intArray71, intArray76);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[100, 97, 0, 2]");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl11.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        boolean boolean17 = realMatrixImpl11.isSquare();
        int int18 = realMatrixImpl11.getColumnDimension();
        double double19 = realMatrixImpl11.getNorm();
        java.lang.String str20 = realMatrixImpl11.toString();
        int int21 = realMatrixImpl11.getRowDimension();
        double[] doubleArray23 = realMatrixImpl11.getRow(1);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = realMatrixImpl7.operate(doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str20, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0]");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean24 = realMatrixImpl18.isSquare();
        int int25 = realMatrixImpl18.getColumnDimension();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray40 = realMatrixImpl18.preMultiply(doubleArray37);
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        double[] doubleArray48 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl49 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray48);
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl45.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl49);
        double[] doubleArray53 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray54 = realMatrixImpl45.preMultiply(doubleArray53);
        double[] doubleArray55 = realMatrixImpl13.preMultiply(doubleArray54);
        double[][] doubleArray56 = realMatrixImpl13.getData();
        double[][] doubleArray57 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl13.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix50);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertNotNull(realMatrix58);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[] doubleArray7 = realMatrixImpl3.getRow(0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double[][] doubleArray9 = realMatrixImpl8.getDataRef();
        java.lang.String str10 = realMatrixImpl8.toString();
        java.lang.String str11 = realMatrixImpl8.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RealMatrixImpl{{0.0}}" + "'", str10, "RealMatrixImpl{{0.0}}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RealMatrixImpl{{0.0}}" + "'", str11, "RealMatrixImpl{{0.0}}");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarMultiply(100.0d);
        int int16 = realMatrixImpl13.getRowDimension();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray28 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray29 = realMatrixImpl20.preMultiply(doubleArray28);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        boolean boolean31 = realMatrixImpl30.isSquare();
        int int32 = realMatrixImpl30.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl30.transpose();
        double double34 = realMatrixImpl30.getTrace();
        boolean boolean35 = realMatrixImpl30.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl13.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray38 = realMatrixImpl30.getColumn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(realMatrix36);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        int int6 = realMatrixImpl3.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.scalarAdd(1.0d);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double double13 = realMatrixImpl12.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl12.transpose();
        double[][] doubleArray15 = realMatrixImpl12.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        boolean boolean17 = realMatrixImpl16.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean28 = realMatrixImpl22.isSquare();
        int int29 = realMatrixImpl22.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl22.copy();
        boolean boolean31 = realMatrixImpl22.isSingular();
        boolean boolean32 = realMatrixImpl22.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        boolean boolean43 = realMatrixImpl41.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl41.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl41.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl22.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl18.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray41 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray42 = realMatrixImpl33.preMultiply(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl27.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl47.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
        boolean boolean53 = realMatrixImpl47.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl47.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl33.subtract(realMatrix55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl10.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        boolean boolean58 = realMatrixImpl10.isSingular();
        double[] doubleArray60 = realMatrixImpl10.getRow((int) (byte) 0);
        int int61 = realMatrixImpl10.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl10.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        java.lang.String str16 = realMatrixImpl13.toString();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double double21 = realMatrixImpl20.getNorm();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double double26 = realMatrixImpl25.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl25.transpose();
        double[] doubleArray29 = realMatrixImpl25.getColumn(0);
        double[] doubleArray30 = realMatrixImpl20.preMultiply(doubleArray29);
        double[] doubleArray31 = realMatrixImpl13.preMultiply(doubleArray29);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        java.lang.String str33 = realMatrixImpl32.toString();
        double[][] doubleArray34 = realMatrixImpl32.getDataRef();
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl38.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl47.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl42.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        double[] doubleArray65 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray66 = realMatrixImpl57.preMultiply(doubleArray65);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[] doubleArray68 = realMatrixImpl42.preMultiply(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = realMatrixImpl42.copy();
        boolean boolean70 = realMatrixImpl42.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl32.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str16, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "RealMatrixImpl{{-1.0}}" + "'", str33, "RealMatrixImpl{{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(realMatrix71);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        boolean boolean35 = realMatrixImpl23.isSquare();
        int int36 = realMatrixImpl23.getColumnDimension();
        double[] doubleArray38 = realMatrixImpl23.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray40 = realMatrixImpl13.preMultiply(doubleArray38);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl13.getColumnMatrix((int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl18.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray41 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray42 = realMatrixImpl33.preMultiply(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl27.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[][] doubleArray44 = realMatrixImpl33.getData();
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        double[] doubleArray66 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        double[] doubleArray70 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl67.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl71);
        double[] doubleArray75 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray76 = realMatrixImpl67.preMultiply(doubleArray75);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        double[] doubleArray78 = realMatrixImpl52.preMultiply(doubleArray75);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        boolean boolean80 = realMatrixImpl79.isSquare();
        boolean boolean81 = realMatrixImpl33.equals((java.lang.Object) realMatrixImpl79);
        boolean boolean82 = realMatrixImpl79.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl10.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl79);
        boolean boolean84 = realMatrixImpl10.isSingular();
        java.lang.String str85 = realMatrixImpl10.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str85, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.scalarAdd((double) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl7.transpose();
        double[][] doubleArray25 = realMatrixImpl7.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            double double28 = realMatrixImpl7.getEntry(2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray25);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl16.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl16.copy();
        double[][] doubleArray21 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        double double27 = realMatrixImpl26.getNorm();
        boolean boolean28 = realMatrixImpl26.isSingular();
        int int29 = realMatrixImpl26.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix31 = realMatrixImpl26.scalarAdd(1.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        java.lang.String str33 = realMatrixImpl26.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl26.scalarMultiply((double) 5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(realMatrix31);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str33, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(realMatrix35);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double double19 = realMatrixImpl7.getNorm();
        int int20 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl7.copy();
        int int22 = realMatrixImpl7.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl7.transpose();
        // The following exception was thrown during execution in test generation
        try {
            double double27 = realMatrixImpl7.getEntry((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix entry does not exist");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        java.lang.String str6 = realMatrixImpl3.toString();
        double double7 = realMatrixImpl3.getNorm();
        java.lang.String str8 = realMatrixImpl3.toString();
        boolean boolean9 = realMatrixImpl3.isSquare();
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        double[] doubleArray21 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray22 = realMatrixImpl13.preMultiply(doubleArray21);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        boolean boolean24 = realMatrixImpl23.isSingular();
        double double25 = realMatrixImpl23.getNorm();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl38.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl33.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl42.getRowMatrix((int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl42.copy();
        java.lang.String str49 = realMatrixImpl42.toString();
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl53.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        double[] doubleArray61 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray62 = realMatrixImpl53.preMultiply(doubleArray61);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        boolean boolean64 = realMatrixImpl63.isSingular();
        double[][] doubleArray65 = realMatrixImpl63.getDataRef();
        java.lang.String str66 = realMatrixImpl63.toString();
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        double double71 = realMatrixImpl70.getNorm();
        double[] doubleArray74 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        double double76 = realMatrixImpl75.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl75.transpose();
        double[] doubleArray79 = realMatrixImpl75.getColumn(0);
        double[] doubleArray80 = realMatrixImpl70.preMultiply(doubleArray79);
        double[] doubleArray81 = realMatrixImpl63.preMultiply(doubleArray79);
        double[] doubleArray82 = realMatrixImpl42.preMultiply(doubleArray79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        double[] doubleArray84 = realMatrixImpl3.preMultiply(doubleArray79);
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl3.scalarMultiply((double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str6, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str8, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 11.0d + "'", double25 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str49, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str66, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.0d + "'", double71 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix86);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.scalarAdd(0.0d);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl12);
        boolean boolean19 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl3.copy();
        boolean boolean21 = realMatrixImpl3.isSquare();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[][] doubleArray31 = realMatrixImpl25.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl32.copy();
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl37.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl41.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        boolean boolean53 = realMatrixImpl41.isSquare();
        double double54 = realMatrixImpl41.getNorm();
        boolean boolean55 = realMatrixImpl41.isSingular();
        int int56 = realMatrixImpl41.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl41.transpose();
        double[][] doubleArray58 = realMatrixImpl41.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        realMatrixImpl32.setSubMatrix(doubleArray58, (int) (short) 0, (int) (byte) 0);
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl66.scalarMultiply((double) (short) 100);
        java.lang.String str69 = realMatrixImpl66.toString();
        double double70 = realMatrixImpl66.getNorm();
        java.lang.String str71 = realMatrixImpl66.toString();
        double[][] doubleArray72 = realMatrixImpl66.getData();
        boolean boolean73 = realMatrixImpl32.equals((java.lang.Object) realMatrixImpl66);
        double double74 = realMatrixImpl66.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl66.copy();
        double[] doubleArray77 = realMatrixImpl66.getColumn(0);
        double[] doubleArray80 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray80);
        double double82 = realMatrixImpl81.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl81.transpose();
        double[][] doubleArray84 = realMatrixImpl81.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl81.scalarAdd(0.0d);
        double[] doubleArray89 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray89);
        double[] doubleArray93 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl94 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray93);
        org.apache.commons.math.linear.RealMatrix realMatrix95 = realMatrixImpl90.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl94);
        org.apache.commons.math.linear.RealMatrix realMatrix96 = realMatrixImpl81.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl90);
        boolean boolean97 = realMatrixImpl66.equals((java.lang.Object) realMatrixImpl90);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix98 = realMatrixImpl3.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str69, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 1.0d + "'", double70 == 1.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str71, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 1.0d + "'", double82 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix95);
        org.junit.Assert.assertNotNull(realMatrix96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 100, 10);
        double[] doubleArray4 = realMatrixImpl2.getColumn(1);
        boolean boolean5 = realMatrixImpl2.isSingular();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.scalarMultiply((double) (short) -1);
        double[][] doubleArray11 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        int int14 = realMatrixImpl13.getColumnDimension();
        double[] doubleArray20 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray20);
        boolean boolean23 = realMatrixImpl22.isSingular();
        boolean boolean24 = realMatrixImpl22.isSingular();
        double[] doubleArray26 = realMatrixImpl22.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl35.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        boolean boolean47 = realMatrixImpl35.isSquare();
        int int48 = realMatrixImpl35.getColumnDimension();
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl52.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        double[] doubleArray64 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl61.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = realMatrixImpl56.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl35.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl56.scalarMultiply((double) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl56.scalarMultiply((double) ' ');
        boolean boolean73 = realMatrixImpl27.equals((java.lang.Object) realMatrixImpl56);
        java.lang.String str74 = realMatrixImpl27.toString();
        double double75 = realMatrixImpl27.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl13.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "RealMatrixImpl{{10.0},{1.0},{0.0},{-1.0},{0.0}}" + "'", str74, "RealMatrixImpl{{10.0},{1.0},{0.0},{-1.0},{0.0}}");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 12.0d + "'", double75 == 12.0d);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double double15 = realMatrixImpl13.getNorm();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        double[][] doubleArray36 = realMatrixImpl32.getDataRef();
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        double[] doubleArray48 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray49 = realMatrixImpl40.preMultiply(doubleArray48);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        boolean boolean51 = realMatrixImpl50.isSquare();
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl55.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        boolean boolean61 = realMatrixImpl55.isSquare();
        int int62 = realMatrixImpl55.getColumnDimension();
        double[] doubleArray65 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl66 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = realMatrixImpl66.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl70);
        double[] doubleArray74 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray75 = realMatrixImpl66.preMultiply(doubleArray74);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl76 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        double[] doubleArray77 = realMatrixImpl55.preMultiply(doubleArray74);
        boolean boolean78 = realMatrixImpl50.equals((java.lang.Object) realMatrixImpl55);
        double[] doubleArray81 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray81);
        double double83 = realMatrixImpl82.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix84 = realMatrixImpl82.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl50.solve(realMatrix84);
        int int86 = realMatrixImpl50.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix87 = realMatrixImpl32.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: matrix dimension mismatch");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 1.0d + "'", double83 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.scalarMultiply(0.0d);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double double39 = realMatrixImpl38.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.transpose();
        double[][] doubleArray41 = realMatrixImpl38.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        boolean boolean43 = realMatrixImpl16.equals((java.lang.Object) realMatrixImpl42);
        boolean boolean44 = realMatrixImpl42.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl42.scalarMultiply(300.0d);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl50.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        boolean boolean56 = realMatrixImpl54.isSquare();
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl60.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        boolean boolean66 = realMatrixImpl60.isSquare();
        int int67 = realMatrixImpl60.getColumnDimension();
        double[] doubleArray70 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        double[] doubleArray74 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray74);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl71.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl75);
        double[] doubleArray79 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray80 = realMatrixImpl71.preMultiply(doubleArray79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl81 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        double[] doubleArray82 = realMatrixImpl60.preMultiply(doubleArray79);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl83 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        double[] doubleArray84 = realMatrixImpl54.preMultiply(doubleArray79);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray85 = realMatrixImpl42.preMultiply(doubleArray84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0]");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        double[] doubleArray26 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        boolean boolean29 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl28);
        int int30 = realMatrixImpl7.getRowDimension();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray32 = realMatrixImpl7.getColumn(2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        double double20 = realMatrixImpl7.getNorm();
        boolean boolean21 = realMatrixImpl7.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl7.scalarAdd((double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray25 = realMatrixImpl7.getColumn(2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        int int15 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl13.transpose();
        double double17 = realMatrixImpl13.getDeterminant();
        int int18 = realMatrixImpl13.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl16.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl16.copy();
        boolean boolean21 = realMatrixImpl16.isSingular();
        int int22 = realMatrixImpl16.getRowDimension();
        int int23 = realMatrixImpl16.getColumnDimension();
        boolean boolean24 = realMatrixImpl16.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl3.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl3.scalarMultiply((double) 100);
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl17.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray40 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray41 = realMatrixImpl32.preMultiply(doubleArray40);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double[] doubleArray43 = realMatrixImpl17.preMultiply(doubleArray40);
        boolean boolean44 = realMatrixImpl3.equals((java.lang.Object) doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        double[][] doubleArray54 = realMatrixImpl48.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        boolean boolean56 = realMatrixImpl55.isSquare();
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl60.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        double[] doubleArray68 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        double[] doubleArray72 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl73 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl69.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl64.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl73);
        double double76 = realMatrixImpl64.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix77 = realMatrixImpl55.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl64);
        boolean boolean78 = realMatrixImpl64.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix80 = realMatrixImpl64.scalarMultiply((double) 3);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl3.subtract(realMatrix80);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix81);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[][] doubleArray5 = realMatrixImpl3.getDataRef();
        double[] doubleArray8 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl9 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray8);
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = realMatrixImpl9.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl13);
        double[] doubleArray17 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray18 = realMatrixImpl9.preMultiply(doubleArray17);
        boolean boolean19 = realMatrixImpl9.isSingular();
        double[] doubleArray21 = realMatrixImpl9.getColumn((int) (byte) 0);
        double[] doubleArray22 = realMatrixImpl3.preMultiply(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl3.scalarAdd(300.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl3.transpose();
        java.lang.Class<?> wildcardClass26 = realMatrixImpl3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        boolean boolean6 = realMatrixImpl3.isSingular();
        double[][] doubleArray7 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.getSubMatrix(10, (int) (byte) 10, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarAdd((double) (short) -1);
        double double12 = realMatrixImpl3.getNorm();
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl16.transpose();
        double[][] doubleArray19 = realMatrixImpl16.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl20);
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        double[][] doubleArray31 = realMatrixImpl25.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl25.copy();
        boolean boolean33 = realMatrixImpl20.equals((java.lang.Object) realMatrix32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl20.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl17.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean29 = realMatrixImpl17.isSquare();
        double double30 = realMatrixImpl17.getNorm();
        boolean boolean31 = realMatrixImpl3.equals((java.lang.Object) double30);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl3.scalarMultiply((double) 0L);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl3.transpose();
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl38.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl42);
        double[] doubleArray46 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray47 = realMatrixImpl38.preMultiply(doubleArray46);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        boolean boolean49 = realMatrixImpl48.isSingular();
        double double50 = realMatrixImpl48.getNorm();
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        double double55 = realMatrixImpl54.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl54.transpose();
        double[][] doubleArray57 = realMatrixImpl54.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray57);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl58.scalarMultiply((double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl58.copy();
        double[][] doubleArray62 = realMatrixImpl58.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl48.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl58);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl3.multiply(realMatrix63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 11.0d + "'", double50 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(realMatrix63);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        double[] doubleArray5 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray11 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray17 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[][] doubleArray18 = new double[][] { doubleArray5, doubleArray11, doubleArray17 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        boolean boolean20 = realMatrixImpl19.isSingular();
        java.lang.String str21 = realMatrixImpl19.toString();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl19.transpose();
        java.lang.String str23 = realMatrixImpl19.toString();
        double double24 = realMatrixImpl19.getNorm();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}" + "'", str21, "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}");
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}" + "'", str23, "RealMatrixImpl{{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0},{-1.0,100.0,1.0,10.0,-1.0}}");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 300.0d + "'", double24 == 300.0d);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        boolean boolean13 = realMatrixImpl3.isSingular();
        double[] doubleArray15 = realMatrixImpl3.getColumn((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double[][] doubleArray17 = realMatrixImpl16.getData();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        int int12 = realMatrixImpl11.getColumnDimension();
        double[][] doubleArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl11.setSubMatrix(doubleArray13, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        boolean boolean9 = realMatrixImpl8.isSquare();
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl17.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean29 = realMatrixImpl17.isSquare();
        double double30 = realMatrixImpl17.getNorm();
        boolean boolean31 = realMatrixImpl17.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl8.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        double[][] doubleArray33 = realMatrixImpl8.getData();
        double double34 = realMatrixImpl8.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl8.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix35);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.scalarAdd(0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.scalarMultiply((double) 1.0f);
        boolean boolean11 = realMatrixImpl3.isSingular();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl22.getRowMatrix((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl22.copy();
        double double36 = realMatrixImpl22.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double double37 = realMatrixImpl36.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl16.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        double[] doubleArray51 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray52 = realMatrixImpl43.preMultiply(doubleArray51);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        boolean boolean54 = realMatrixImpl53.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl53);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl16.transpose();
        double[] doubleArray59 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl60 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl60.scalarMultiply((double) (short) 100);
        java.lang.String str63 = realMatrixImpl60.toString();
        double double64 = realMatrixImpl60.getNorm();
        java.lang.String str65 = realMatrixImpl60.toString();
        double[][] doubleArray66 = realMatrixImpl60.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        boolean boolean68 = realMatrixImpl16.equals((java.lang.Object) doubleArray66);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str63, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str65, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double double15 = realMatrixImpl13.getNorm();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray28 = realMatrixImpl19.preMultiply(doubleArray27);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        java.lang.String str30 = realMatrixImpl29.toString();
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl34.scalarMultiply((double) (short) 100);
        double[][] doubleArray37 = realMatrixImpl34.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl29.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl43.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl52.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl47.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        boolean boolean59 = realMatrixImpl47.isSquare();
        double double60 = realMatrixImpl47.getNorm();
        double[] doubleArray66 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        boolean boolean69 = realMatrixImpl47.equals((java.lang.Object) realMatrixImpl68);
        int int70 = realMatrixImpl47.getRowDimension();
        int int71 = realMatrixImpl47.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl47);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl47.getRowMatrix((int) (short) 0);
        double[] doubleArray77 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        double[] doubleArray81 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray81);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl78.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl82);
        double[][] doubleArray84 = realMatrixImpl78.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl78.scalarAdd((double) 1L);
        int int87 = realMatrixImpl78.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix88 = realMatrixImpl47.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl78);
        int int89 = realMatrixImpl78.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix91 = realMatrixImpl78.getRowMatrix(0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str30, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2 + "'", int70 == 2);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
        org.junit.Assert.assertNotNull(realMatrix88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertNotNull(realMatrix91);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        java.lang.String str6 = realMatrixImpl3.toString();
        double double7 = realMatrixImpl3.getNorm();
        java.lang.String str8 = realMatrixImpl3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.getSubMatrix((int) (short) 10, (int) (short) -1, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str6, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str8, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        int int11 = realMatrixImpl10.getRowDimension();
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        double[][] doubleArray21 = realMatrixImpl15.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[][] doubleArray23 = realMatrixImpl22.getData();
        boolean boolean24 = realMatrixImpl22.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl22.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl10.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        int int27 = realMatrixImpl10.getRowDimension();
        double[] doubleArray28 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = realMatrixImpl10.operate(doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        java.lang.String str9 = realMatrixImpl3.toString();
        boolean boolean10 = realMatrixImpl3.isSquare();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl18.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        boolean boolean30 = realMatrixImpl27.isSquare();
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        double double35 = realMatrixImpl34.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl34.transpose();
        double[][] doubleArray37 = realMatrixImpl34.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.scalarMultiply((double) (byte) 100);
        boolean boolean41 = realMatrixImpl27.equals((java.lang.Object) realMatrix40);
        java.lang.String str42 = realMatrixImpl27.toString();
        int int43 = realMatrixImpl27.getRowDimension();
        double[] doubleArray46 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl47 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray46);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl47.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl51);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl47.scalarMultiply((double) (short) -1);
        double[][] doubleArray55 = realMatrixImpl47.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        boolean boolean57 = realMatrixImpl27.equals((java.lang.Object) doubleArray55);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl3.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str42, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        int int15 = realMatrixImpl13.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl13.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.scalarAdd((double) 0);
        int int19 = realMatrixImpl13.getColumnDimension();
        double[] doubleArray25 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.getRowMatrix(0);
        boolean boolean29 = realMatrixImpl26.isSingular();
        double[] doubleArray31 = realMatrixImpl26.getRow(3);
        double[] doubleArray32 = realMatrixImpl13.solve(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double[] doubleArray44 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray45 = realMatrixImpl36.preMultiply(doubleArray44);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        boolean boolean47 = realMatrixImpl46.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl46.transpose();
        double[][] doubleArray49 = realMatrixImpl46.getData();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl13.setSubMatrix(doubleArray49, (int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray49);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        double[] doubleArray21 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray22 = realMatrixImpl13.preMultiply(doubleArray21);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        boolean boolean24 = realMatrixImpl23.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl23.transpose();
        double double26 = realMatrixImpl23.getNorm();
        int int27 = realMatrixImpl23.getColumnDimension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl3.preMultiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 11.0d + "'", double26 == 11.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        boolean boolean19 = realMatrixImpl7.isSquare();
        int int20 = realMatrixImpl7.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double double41 = realMatrixImpl7.getNorm();
        boolean boolean42 = realMatrixImpl7.isSquare();
        double[] doubleArray44 = realMatrixImpl7.getRow((int) (byte) 1);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double double49 = realMatrixImpl48.getNorm();
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double double54 = realMatrixImpl53.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl53.transpose();
        double[] doubleArray57 = realMatrixImpl53.getColumn(0);
        double[] doubleArray58 = realMatrixImpl48.preMultiply(doubleArray57);
        boolean boolean59 = realMatrixImpl7.equals((java.lang.Object) realMatrixImpl48);
        java.lang.String str60 = realMatrixImpl7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl7.getSubMatrix((int) (short) 100, 5, (int) (byte) -1, 5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str60, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.transpose();
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.scalarAdd(0.0d);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl12);
        boolean boolean19 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl3.copy();
        boolean boolean21 = realMatrixImpl3.isSquare();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrixImpl25.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl29);
        java.lang.String str31 = realMatrixImpl25.toString();
        boolean boolean32 = realMatrixImpl25.isSquare();
        double[] doubleArray34 = realMatrixImpl25.getColumn((int) (short) 0);
        double[] doubleArray35 = realMatrixImpl3.preMultiply(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl3.scalarAdd((double) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str31, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray33 = realMatrixImpl7.preMultiply(doubleArray30);
        boolean boolean34 = realMatrixImpl7.isSingular();
        double[][] doubleArray35 = realMatrixImpl7.getDataRef();
        int[] intArray39 = new int[] { (-1), 100, 100 };
        int[] intArray45 = new int[] { (byte) 10, 0, 100, 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl7.getSubMatrix(intArray39, intArray45);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: matrix dimension mismatch");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[10, 0, 100, 0, 10]");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl6.getRowMatrix(0);
        boolean boolean9 = realMatrixImpl6.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl6.scalarMultiply(300.0d);
        boolean boolean12 = realMatrixImpl6.isSingular();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl11.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl15.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray38 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray39 = realMatrixImpl30.preMultiply(doubleArray38);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray41 = realMatrixImpl15.preMultiply(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl15.scalarMultiply((double) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        boolean boolean45 = realMatrixImpl15.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl15.scalarAdd((double) 1.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(realMatrix47);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray23 = realMatrixImpl14.preMultiply(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray25 = realMatrixImpl3.preMultiply(doubleArray22);
        boolean boolean26 = realMatrixImpl3.isSquare();
        double[][] doubleArray27 = realMatrixImpl3.getDataRef();
        double[][] doubleArray28 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl42.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl37.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl52.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        double[] doubleArray60 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray61 = realMatrixImpl52.preMultiply(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl46.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl46.scalarMultiply(0.0d);
        double[] doubleArray67 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        double double69 = realMatrixImpl68.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl68.transpose();
        double[][] doubleArray71 = realMatrixImpl68.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl72 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray71);
        boolean boolean73 = realMatrixImpl46.equals((java.lang.Object) realMatrixImpl72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl72.transpose();
        double[] doubleArray77 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        double[] doubleArray81 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl82 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray81);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl78.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl82);
        double[] doubleArray86 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray87 = realMatrixImpl78.preMultiply(doubleArray86);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl88 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray86);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl89 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray86);
        double[] doubleArray90 = realMatrixImpl72.preMultiply(doubleArray86);
        double[] doubleArray91 = realMatrixImpl29.preMultiply(doubleArray86);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0d + "'", double69 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[-1.0]");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.scalarMultiply(0.0d);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double double39 = realMatrixImpl38.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.transpose();
        double[][] doubleArray41 = realMatrixImpl38.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        boolean boolean43 = realMatrixImpl16.equals((java.lang.Object) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl42.transpose();
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        double[] doubleArray56 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray57 = realMatrixImpl48.preMultiply(doubleArray56);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = realMatrixImpl42.preMultiply(doubleArray56);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl61.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0]");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarMultiply((double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.scalarMultiply((double) (byte) 1);
        int int14 = realMatrixImpl3.getRowDimension();
        boolean boolean15 = realMatrixImpl3.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double double15 = realMatrixImpl13.getNorm();
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        double[][] doubleArray36 = realMatrixImpl32.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl((int) (short) 1, (int) (byte) 10);
        int int42 = realMatrixImpl41.getColumnDimension();
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double double47 = realMatrixImpl46.getNorm();
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double double52 = realMatrixImpl51.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl51.transpose();
        double[] doubleArray55 = realMatrixImpl51.getColumn(0);
        double[] doubleArray56 = realMatrixImpl46.preMultiply(doubleArray55);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl57.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl57.copy();
        double[] doubleArray62 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray62);
        double[] doubleArray66 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = realMatrixImpl63.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl67);
        boolean boolean69 = realMatrixImpl63.isSquare();
        int int70 = realMatrixImpl63.getColumnDimension();
        double[] doubleArray73 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        double[] doubleArray77 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray77);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = realMatrixImpl74.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl78);
        double[] doubleArray82 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray83 = realMatrixImpl74.preMultiply(doubleArray82);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray82);
        double[] doubleArray85 = realMatrixImpl63.preMultiply(doubleArray82);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl86 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray82);
        double[] doubleArray87 = realMatrixImpl57.preMultiply(doubleArray82);
        double[] doubleArray88 = realMatrixImpl41.preMultiply(doubleArray87);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl89 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray87);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray90 = realMatrixImpl38.solve(doubleArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: constant vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        int int16 = realMatrixImpl15.getColumnDimension();
        realMatrixImpl15.luDecompose();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl15.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        boolean boolean42 = realMatrixImpl36.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl36.scalarAdd((double) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl22.subtract(realMatrix44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl22.scalarAdd((double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl22.scalarMultiply(10.0d);
        double[] doubleArray51 = realMatrixImpl22.getRow((int) (short) 0);
        int int52 = realMatrixImpl22.getRowDimension();
        java.lang.String str53 = realMatrixImpl22.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl22.getSubMatrix((int) '4', (int) '4', (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str53, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(100, 1);
        int int3 = realMatrixImpl2.getRowDimension();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.scalarMultiply((double) (byte) 100);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl15.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl19);
        double[] doubleArray23 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray24 = realMatrixImpl15.preMultiply(doubleArray23);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        boolean boolean26 = realMatrixImpl25.isSingular();
        double double27 = realMatrixImpl25.getNorm();
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl35.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl25.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double double53 = realMatrixImpl52.getNorm();
        boolean boolean54 = realMatrixImpl52.isSingular();
        int int55 = realMatrixImpl52.getColumnDimension();
        java.lang.Class<?> wildcardClass56 = realMatrixImpl52.getClass();
        boolean boolean57 = realMatrixImpl3.equals((java.lang.Object) realMatrixImpl52);
        boolean boolean58 = realMatrixImpl3.isSquare();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 11.0d + "'", double27 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        int int6 = realMatrixImpl3.getColumnDimension();
        double[][] doubleArray7 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double[][] doubleArray9 = realMatrixImpl8.getDataRef();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarMultiply(100.0d);
        int int16 = realMatrixImpl13.getRowDimension();
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray28 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray29 = realMatrixImpl20.preMultiply(doubleArray28);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        boolean boolean31 = realMatrixImpl30.isSquare();
        int int32 = realMatrixImpl30.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl30.transpose();
        double double34 = realMatrixImpl30.getTrace();
        boolean boolean35 = realMatrixImpl30.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl13.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl30);
        int int37 = realMatrixImpl30.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl30.scalarAdd((double) '4');
        realMatrixImpl30.luDecompose();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl30.scalarMultiply(10.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl30.inverse();
        realMatrixImpl30.luDecompose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix43);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        int int7 = realMatrixImpl6.getColumnDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl6.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl6.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        java.lang.String str6 = realMatrixImpl3.toString();
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl10.scalarMultiply((double) (short) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = realMatrixImpl3.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl10);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl10.scalarMultiply((double) '#');
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = realMatrixImpl28.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl32);
        double double35 = realMatrixImpl23.getNorm();
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl43.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        boolean boolean55 = realMatrixImpl43.isSquare();
        double double56 = realMatrixImpl43.getNorm();
        boolean boolean57 = realMatrixImpl43.isSingular();
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        double[] doubleArray64 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl61.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl65);
        double[] doubleArray69 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl70 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray69);
        double[] doubleArray73 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl74 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl70.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl74);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl65.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl74);
        double[] doubleArray79 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl80 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray79);
        double[] doubleArray83 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl84 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray83);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = realMatrixImpl80.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl84);
        double[] doubleArray88 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray89 = realMatrixImpl80.preMultiply(doubleArray88);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl90 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray88);
        double[] doubleArray91 = realMatrixImpl65.preMultiply(doubleArray88);
        double[] doubleArray92 = realMatrixImpl43.preMultiply(doubleArray88);
        org.apache.commons.math.linear.RealMatrix realMatrix93 = realMatrixImpl23.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix94 = realMatrixImpl10.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        int int95 = realMatrixImpl10.getRowDimension();
        double double96 = realMatrixImpl10.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str6, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray91), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix93);
        org.junit.Assert.assertNotNull(realMatrix94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 2 + "'", int95 == 2);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 1.0d + "'", double96 == 1.0d);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl3.isSquare();
        int int10 = realMatrixImpl3.getColumnDimension();
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray23 = realMatrixImpl14.preMultiply(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray25 = realMatrixImpl3.preMultiply(doubleArray22);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl26.transpose();
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray34 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl35 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = realMatrixImpl31.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl40.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl35.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl44);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        double[] doubleArray53 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl54 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray53);
        org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl50.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl54);
        double[] doubleArray58 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray59 = realMatrixImpl50.preMultiply(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl44.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[][] doubleArray61 = realMatrixImpl44.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl63 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray61);
        double double64 = realMatrixImpl63.getNorm();
        java.lang.String str65 = realMatrixImpl63.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl26.solve((org.apache.commons.math.linear.RealMatrix) realMatrixImpl63);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix55);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str65, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(100, (int) (byte) 1);
        double[] doubleArray5 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl6.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl10);
        boolean boolean12 = realMatrixImpl6.isSquare();
        int int13 = realMatrixImpl6.getColumnDimension();
        double double14 = realMatrixImpl6.getNorm();
        boolean boolean15 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl6);
        boolean boolean16 = realMatrixImpl6.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl6.scalarMultiply((-1.0d));
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl36.scalarMultiply((double) (short) 100);
        double[] doubleArray40 = realMatrixImpl36.getRow(0);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl6.add(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        double[] doubleArray30 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray31 = realMatrixImpl22.preMultiply(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl16.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl16.scalarMultiply(0.0d);
        double[] doubleArray37 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl38 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double double39 = realMatrixImpl38.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrixImpl38.transpose();
        double[][] doubleArray41 = realMatrixImpl38.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        boolean boolean43 = realMatrixImpl16.equals((java.lang.Object) realMatrixImpl42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl42.transpose();
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        double[] doubleArray56 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray57 = realMatrixImpl48.preMultiply(doubleArray56);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl58 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = realMatrixImpl42.preMultiply(doubleArray56);
        double[] doubleArray63 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl64 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl64.scalarMultiply((double) (short) 100);
        double[][] doubleArray67 = realMatrixImpl64.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl42.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(realMatrix70);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarMultiply(100.0d);
        int int16 = realMatrixImpl13.getRowDimension();
        int int17 = realMatrixImpl13.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl13.getRowMatrix(0);
        double double20 = realMatrixImpl13.getNorm();
        int[] intArray24 = new int[] { 10, (short) 1, 10 };
        int[] intArray25 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl13.getSubMatrix(intArray24, intArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: selected row and column index arrays must be non-empty");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 11.0d + "'", double20 == 11.0d);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 1, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        java.lang.String str9 = realMatrixImpl3.toString();
        double[][] doubleArray10 = realMatrixImpl3.getDataRef();
        int int11 = realMatrixImpl3.getRowDimension();
        double[][] doubleArray12 = realMatrixImpl3.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double double21 = realMatrixImpl20.getNorm();
        double[] doubleArray24 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl25 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray24);
        double double26 = realMatrixImpl25.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl25.transpose();
        double[] doubleArray29 = realMatrixImpl25.getColumn(0);
        double[] doubleArray30 = realMatrixImpl20.preMultiply(doubleArray29);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl20.scalarAdd((double) (short) 10);
        boolean boolean33 = realMatrixImpl20.isSingular();
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl37.scalarMultiply((double) (short) 100);
        double[][] doubleArray40 = realMatrixImpl37.getDataRef();
        double[] doubleArray43 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl44 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray43);
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        org.apache.commons.math.linear.RealMatrix realMatrix49 = realMatrixImpl44.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        double[] doubleArray52 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl53 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray52);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        org.apache.commons.math.linear.RealMatrix realMatrix58 = realMatrixImpl53.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrixImpl48.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl57);
        boolean boolean60 = realMatrixImpl48.isSquare();
        double double61 = realMatrixImpl48.getNorm();
        double[] doubleArray67 = new double[] { (short) 10, 1.0d, 0.0f, (-1.0f), 0.0d };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl68 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray67);
        boolean boolean70 = realMatrixImpl48.equals((java.lang.Object) realMatrixImpl69);
        int int71 = realMatrixImpl48.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix73 = realMatrixImpl48.scalarAdd((-1.0d));
        org.apache.commons.math.linear.RealMatrix realMatrix74 = realMatrixImpl37.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = realMatrixImpl20.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl48);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix76 = realMatrixImpl16.multiply(realMatrix75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix49);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix58);
        org.junit.Assert.assertNotNull(realMatrix59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0, 1.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl3.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl3.scalarMultiply((double) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.copy();
        java.lang.String str11 = realMatrixImpl3.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str11, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean14 = realMatrixImpl13.isSquare();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl18.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        boolean boolean24 = realMatrixImpl18.isSquare();
        int int25 = realMatrixImpl18.getColumnDimension();
        double[] doubleArray28 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl29 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = realMatrixImpl29.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[] doubleArray37 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray38 = realMatrixImpl29.preMultiply(doubleArray37);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray37);
        double[] doubleArray40 = realMatrixImpl18.preMultiply(doubleArray37);
        boolean boolean41 = realMatrixImpl13.equals((java.lang.Object) realMatrixImpl18);
        double[][] doubleArray42 = realMatrixImpl18.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        boolean boolean44 = realMatrixImpl43.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl43.getRowMatrix(100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl12 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        double[] doubleArray15 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl12.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl7.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl16);
        double double19 = realMatrixImpl7.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl7.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl7.scalarMultiply((double) (short) 10);
        boolean boolean23 = realMatrixImpl7.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl7.scalarMultiply(300.0d);
        boolean boolean26 = realMatrixImpl7.isSingular();
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray38 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl39 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray42 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl43 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl39.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = realMatrixImpl34.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl43);
        double double46 = realMatrixImpl34.getNorm();
        int int47 = realMatrixImpl34.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl34.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrixImpl34.scalarAdd((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl7.solve(realMatrix50);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(realMatrix50);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        boolean boolean9 = realMatrixImpl7.isSquare();
        double[] doubleArray12 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl17 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = realMatrixImpl13.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl17);
        boolean boolean19 = realMatrixImpl13.isSquare();
        int int20 = realMatrixImpl13.getColumnDimension();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray33 = realMatrixImpl24.preMultiply(doubleArray32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray35 = realMatrixImpl13.preMultiply(doubleArray32);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray37 = realMatrixImpl7.preMultiply(doubleArray32);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl7.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl7.scalarMultiply((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl7.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix41);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        boolean boolean5 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = realMatrixImpl3.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl3.scalarMultiply((double) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl3.copy();
        boolean boolean11 = realMatrixImpl3.isSingular();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = realMatrixImpl3.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[] doubleArray7 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double double9 = realMatrixImpl8.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl8.transpose();
        double[] doubleArray12 = realMatrixImpl8.getColumn(0);
        double[] doubleArray13 = realMatrixImpl3.preMultiply(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        double[][] doubleArray15 = realMatrixImpl14.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = realMatrixImpl14.getRowMatrix(0);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.scalarAdd((double) (byte) 100);
        double[][] doubleArray20 = realMatrixImpl14.getData();
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl28 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl24.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl28);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrixImpl28.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        boolean boolean40 = realMatrixImpl28.isSquare();
        double double41 = realMatrixImpl28.getNorm();
        boolean boolean42 = realMatrixImpl28.isSingular();
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        double[] doubleArray49 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl50 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = realMatrixImpl46.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl50);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        double[] doubleArray58 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl59 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray58);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrixImpl55.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        org.apache.commons.math.linear.RealMatrix realMatrix61 = realMatrixImpl50.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl59);
        double[] doubleArray64 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl65 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray64);
        double[] doubleArray68 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl69 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = realMatrixImpl65.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl69);
        double[] doubleArray73 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray74 = realMatrixImpl65.preMultiply(doubleArray73);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl75 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        double[] doubleArray76 = realMatrixImpl50.preMultiply(doubleArray73);
        double[] doubleArray77 = realMatrixImpl28.preMultiply(doubleArray73);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl78 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray73);
        boolean boolean79 = realMatrixImpl78.isSingular();
        java.lang.String str80 = realMatrixImpl78.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix81 = realMatrixImpl14.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str80, "RealMatrixImpl{{10.0},{-1.0}}");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double double4 = realMatrixImpl3.getNorm();
        double[] doubleArray7 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double double9 = realMatrixImpl8.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = realMatrixImpl8.transpose();
        double[] doubleArray12 = realMatrixImpl8.getColumn(0);
        double[] doubleArray13 = realMatrixImpl3.preMultiply(doubleArray12);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray12);
        boolean boolean15 = realMatrixImpl14.isSquare();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl14.getSubMatrix((int) (short) 10, (int) (short) 0, 97, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        boolean boolean8 = realMatrixImpl3.isSquare();
        java.lang.String str9 = realMatrixImpl3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl3.getRowMatrix((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RealMatrixImpl{{0.0},{1.0}}" + "'", str9, "RealMatrixImpl{{0.0},{1.0}}");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double double7 = realMatrixImpl3.getNorm();
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl11.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        double[] doubleArray19 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray20 = realMatrixImpl11.preMultiply(doubleArray19);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl21.scalarMultiply(100.0d);
        boolean boolean24 = realMatrixImpl3.equals((java.lang.Object) realMatrixImpl21);
        int int25 = realMatrixImpl21.getColumnDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double[][] doubleArray15 = realMatrixImpl13.getDataRef();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl16 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray15);
        double double17 = realMatrixImpl16.getNorm();
        double[][] doubleArray18 = realMatrixImpl16.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl16.getSubMatrix((int) (byte) 1, (int) (byte) -1, 5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 11.0d + "'", double17 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double[][] doubleArray7 = realMatrixImpl3.getDataRef();
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl11.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        double[] doubleArray19 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl20 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        double[] doubleArray23 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl24 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = realMatrixImpl20.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl15.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl24);
        double[] doubleArray29 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl30 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray29);
        double[] doubleArray33 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl34 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrixImpl30.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl34);
        double[] doubleArray38 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray39 = realMatrixImpl30.preMultiply(doubleArray38);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray38);
        double[] doubleArray41 = realMatrixImpl15.preMultiply(doubleArray38);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl15.scalarMultiply((double) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        boolean boolean45 = realMatrixImpl3.isSquare();
        double double46 = realMatrixImpl3.getNorm();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 1.0d + "'", double46 == 1.0d);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrixImpl13.scalarMultiply(100.0d);
        java.lang.String str16 = realMatrixImpl13.toString();
        boolean boolean18 = realMatrixImpl13.equals((java.lang.Object) (-1.0d));
        double[] doubleArray21 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl22 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrixImpl22.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl26);
        boolean boolean28 = realMatrixImpl22.isSquare();
        double[] doubleArray31 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl32 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = realMatrixImpl32.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl36);
        double[] doubleArray40 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl41 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray40);
        double[] doubleArray44 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl45 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray44);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl41.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl36.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl45);
        boolean boolean48 = realMatrixImpl36.isSquare();
        double double49 = realMatrixImpl36.getNorm();
        boolean boolean50 = realMatrixImpl22.equals((java.lang.Object) double49);
        org.apache.commons.math.linear.RealMatrix realMatrix52 = realMatrixImpl22.scalarMultiply((double) 0L);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl22.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix54 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix55 = realMatrixImpl22.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str16, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(realMatrix52);
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(realMatrix54);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        boolean boolean14 = realMatrixImpl13.isSingular();
        double double15 = realMatrixImpl13.getNorm();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl13.getSubMatrix((int) '4', 10, 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 11.0d + "'", double15 == 11.0d);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray11 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = realMatrixImpl3.preMultiply(doubleArray11);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl13 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray11);
        java.lang.String str14 = realMatrixImpl13.toString();
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = realMatrixImpl18.scalarMultiply((double) (short) 100);
        double[][] doubleArray21 = realMatrixImpl18.getDataRef();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double double23 = realMatrixImpl13.getNorm();
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        double[] doubleArray30 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl31 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = realMatrixImpl27.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray35 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl36 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray35);
        double[] doubleArray39 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl40 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = realMatrixImpl36.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrixImpl31.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl40);
        double double43 = realMatrixImpl31.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix44 = realMatrixImpl31.transpose();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = realMatrixImpl31.scalarMultiply((double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl13.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl31);
        double[] doubleArray50 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl51 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray50);
        double[] doubleArray54 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl55 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray54);
        org.apache.commons.math.linear.RealMatrix realMatrix56 = realMatrixImpl51.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl55);
        double[] doubleArray59 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray60 = realMatrixImpl51.preMultiply(doubleArray59);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray59);
        boolean boolean62 = realMatrixImpl61.isSingular();
        double double63 = realMatrixImpl61.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix64 = realMatrixImpl61.copy();
        org.apache.commons.math.linear.RealMatrix realMatrix65 = realMatrixImpl13.add(realMatrix64);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = realMatrixImpl13.transpose();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RealMatrixImpl{{10.0},{-1.0}}" + "'", str14, "RealMatrixImpl{{10.0},{-1.0}}");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 11.0d + "'", double23 == 11.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix44);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 11.0d + "'", double63 == 11.0d);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix66);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl2 = new org.apache.commons.math.linear.RealMatrixImpl(100, (int) (byte) 1);
        double[] doubleArray5 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl6 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray5);
        double[] doubleArray9 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl6.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl10);
        boolean boolean12 = realMatrixImpl6.isSquare();
        int int13 = realMatrixImpl6.getColumnDimension();
        double double14 = realMatrixImpl6.getNorm();
        boolean boolean15 = realMatrixImpl2.equals((java.lang.Object) realMatrixImpl6);
        double[] doubleArray18 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.RealMatrix realMatrix24 = realMatrixImpl19.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl23);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = realMatrixImpl19.scalarMultiply((double) (short) -1);
        double double29 = realMatrixImpl19.getEntry((int) (short) 0, (int) (short) 0);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray41 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl42 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray41);
        double[] doubleArray45 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl46 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrixImpl42.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrixImpl37.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl46);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        double[] doubleArray55 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl56 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix57 = realMatrixImpl52.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl56);
        double[] doubleArray60 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray61 = realMatrixImpl52.preMultiply(doubleArray60);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl62 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        double[] doubleArray63 = realMatrixImpl37.preMultiply(doubleArray60);
        double[] doubleArray64 = realMatrixImpl19.preMultiply(doubleArray60);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray65 = realMatrixImpl6.operate(doubleArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix57);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0]");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[] doubleArray10 = realMatrixImpl7.getRow(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl7.inverse();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.InvalidMatrixException; message: coefficient matrix is not square");
        } catch (org.apache.commons.math.linear.InvalidMatrixException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        double[] doubleArray6 = new double[] { 2, 10.0f, 300.0d, 0.0d, 11.0d, 1L };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = realMatrixImpl7.scalarAdd(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix11 = realMatrixImpl7.getColumnMatrix((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[2.0, 10.0, 300.0, 0.0, 11.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        double[] doubleArray6 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl7 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray6);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = realMatrixImpl3.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl7);
        double[][] doubleArray9 = realMatrixImpl3.getData();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl10 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray9);
        double[] doubleArray13 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl14 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray13);
        double[] doubleArray17 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl18 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = realMatrixImpl14.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl18);
        double[] doubleArray22 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl23 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray22);
        double[] doubleArray26 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl27 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl23.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = realMatrixImpl18.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl27);
        double[] doubleArray32 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl33 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray32);
        double[] doubleArray36 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl37 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrixImpl33.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl37);
        double[] doubleArray41 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray42 = realMatrixImpl33.preMultiply(doubleArray41);
        org.apache.commons.math.linear.RealMatrix realMatrix43 = realMatrixImpl27.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl33);
        double[][] doubleArray44 = realMatrixImpl33.getData();
        double[] doubleArray47 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl48 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl52 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray51);
        org.apache.commons.math.linear.RealMatrix realMatrix53 = realMatrixImpl48.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl52);
        double[] doubleArray56 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl57 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray56);
        double[] doubleArray60 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl61 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray60);
        org.apache.commons.math.linear.RealMatrix realMatrix62 = realMatrixImpl57.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        org.apache.commons.math.linear.RealMatrix realMatrix63 = realMatrixImpl52.subtract((org.apache.commons.math.linear.RealMatrix) realMatrixImpl61);
        double[] doubleArray66 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl67 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray66);
        double[] doubleArray70 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl71 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray70);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = realMatrixImpl67.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl71);
        double[] doubleArray75 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray76 = realMatrixImpl67.preMultiply(doubleArray75);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl77 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray75);
        double[] doubleArray78 = realMatrixImpl52.preMultiply(doubleArray75);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl79 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray78);
        boolean boolean80 = realMatrixImpl79.isSquare();
        boolean boolean81 = realMatrixImpl33.equals((java.lang.Object) realMatrixImpl79);
        boolean boolean82 = realMatrixImpl79.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix83 = realMatrixImpl10.multiply((org.apache.commons.math.linear.RealMatrix) realMatrixImpl79);
        int int84 = realMatrixImpl79.getColumnDimension();
        double double85 = realMatrixImpl79.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix86 = realMatrixImpl79.copy();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix43);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix53);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix62);
        org.junit.Assert.assertNotNull(realMatrix63);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1.0d + "'", double85 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix86);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        double[] doubleArray2 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarMultiply((double) (short) 100);
        double[][] doubleArray6 = realMatrixImpl3.getDataRef();
        double double7 = realMatrixImpl3.getNorm();
        double[] doubleArray10 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl11 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray10);
        double[] doubleArray14 = new double[] { 0, 1 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl15 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = realMatrixImpl11.add((org.apache.commons.math.linear.RealMatrix) realMatrixImpl15);
        double[] doubleArray19 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray20 = realMatrixImpl11.preMultiply(doubleArray19);
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl21 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = realMatrixImpl21.scalarMultiply(100.0d);
        boolean boolean24 = realMatrixImpl3.equals((java.lang.Object) realMatrixImpl21);
        int int25 = realMatrixImpl21.getRowDimension();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        double[] doubleArray5 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray11 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[] doubleArray17 = new double[] { (-1L), 100.0d, 1.0f, 10L, (-1.0f) };
        double[][] doubleArray18 = new double[][] { doubleArray5, doubleArray11, doubleArray17 };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl19 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray18);
        boolean boolean20 = realMatrixImpl19.isSquare();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = realMatrixImpl19.getRowMatrix(2);
        double double23 = realMatrixImpl19.getNorm();
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl26 = new org.apache.commons.math.linear.RealMatrixImpl((int) (byte) 10, (int) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix28 = realMatrixImpl26.scalarMultiply((double) (-1));
        double[][] doubleArray29 = realMatrixImpl26.getDataRef();
        // The following exception was thrown during execution in test generation
        try {
            realMatrixImpl19.setSubMatrix(doubleArray29, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: invalid row or column index selection");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 300.0d + "'", double23 == 300.0d);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray29);
    }
}

