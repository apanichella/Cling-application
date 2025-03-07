import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        java.math.BigDecimal bigDecimal16 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl15.getDataRef();
        int int18 = bigMatrixImpl15.getColumnDimension();
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl15.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20);
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl35.getData();
        bigMatrixImpl35.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray39 = bigMatrixImpl35.getData();
        int int40 = bigMatrixImpl35.getScale();
        boolean boolean41 = bigMatrixImpl35.isSingular();
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[][] doubleArray54 = new double[][] { doubleArray44, doubleArray47, doubleArray50, doubleArray53 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray54);
        java.math.BigDecimal[][] bigDecimalArray56 = bigMatrixImpl55.getData();
        java.math.BigDecimal[][] bigDecimalArray57 = bigMatrixImpl55.getData();
        int int58 = bigMatrixImpl55.getRoundingMode();
        org.apache.commons.math.linear.BigMatrix bigMatrix60 = bigMatrixImpl55.getRowMatrix(2);
        org.apache.commons.math.linear.BigMatrix bigMatrix61 = bigMatrixImpl35.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl55);
        boolean boolean62 = bigMatrixImpl55.isSquare();
        boolean boolean63 = bigMatrixImpl21.equals((java.lang.Object) bigMatrixImpl55);
        java.math.BigDecimal[] bigDecimalArray65 = bigMatrixImpl55.getColumn((int) (short) 1);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray65);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray68 = bigMatrixImpl66.getRowAsDoubleArray((-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(bigDecimal19);
        org.junit.Assert.assertNotNull(bigDecimalArray20);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(bigDecimalArray36);
        org.junit.Assert.assertNotNull(bigDecimalArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertNotNull(bigDecimalArray56);
        org.junit.Assert.assertNotNull(bigDecimalArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4 + "'", int58 == 4);
        org.junit.Assert.assertNotNull(bigMatrix60);
        org.junit.Assert.assertNotNull(bigMatrix61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(bigDecimalArray65);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        java.math.BigDecimal[][] bigDecimalArray49 = bigMatrixImpl48.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl34.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl51);
        java.lang.String str53 = bigMatrixImpl34.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray55 = bigMatrixImpl34.getRow(4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertNotNull(bigDecimalArray49);
        org.junit.Assert.assertNotNull(bigMatrix52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "BigMatrixImpl{{400},{400}}" + "'", str53, "BigMatrixImpl{{400},{400}}");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[][] doubleArray26 = new double[][] { doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray26);
        double[][] doubleArray28 = bigMatrixImpl27.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        int int30 = bigMatrixImpl29.getColumnDimension();
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl29.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.scalarAdd(bigDecimal31);
        boolean boolean33 = bigMatrixImpl13.isSquare();
        double[][] doubleArray34 = bigMatrixImpl13.getDataAsDoubleArray();
        double[] doubleArray36 = bigMatrixImpl13.getColumnAsDoubleArray(0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigMatrix32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 10.0, 10.0, 10.0]");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl13.copy();
        boolean boolean16 = bigMatrixImpl13.isSquare();
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[][] doubleArray29 = new double[][] { doubleArray19, doubleArray22, doubleArray25, doubleArray28 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray29);
        java.math.BigDecimal[][] bigDecimalArray31 = bigMatrixImpl30.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray31);
        java.math.BigDecimal bigDecimal33 = bigMatrixImpl32.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl13.scalarAdd(bigDecimal33);
        java.lang.String str35 = bigMatrixImpl13.toString();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigMatrix15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(bigDecimalArray31);
        org.junit.Assert.assertNotNull(bigDecimal33);
        org.junit.Assert.assertNotNull(bigMatrix34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str35, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl22.getRowMatrix((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal row argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        bigMatrixImpl13.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl13.getData();
        double[][] doubleArray18 = bigMatrixImpl13.getDataAsDoubleArray();
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl32.copy();
        int int34 = bigMatrixImpl32.getRowDimension();
        boolean boolean35 = bigMatrixImpl32.isSquare();
        int int36 = bigMatrixImpl32.getScale();
        int int37 = bigMatrixImpl32.getRoundingMode();
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl13.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl32);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(bigMatrix33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 4 + "'", int34 == 4);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 64 + "'", int36 == 64);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(bigMatrix38);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl13.copy();
        int int15 = bigMatrixImpl13.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl13.transpose();
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[][] doubleArray29 = new double[][] { doubleArray19, doubleArray22, doubleArray25, doubleArray28 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        boolean boolean32 = bigMatrixImpl13.equals((java.lang.Object) bigDecimal31);
        double[] doubleArray35 = new double[] { (short) 10, 100L };
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[][] doubleArray45 = new double[][] { doubleArray35, doubleArray38, doubleArray41, doubleArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        java.math.BigDecimal[][] bigDecimalArray47 = bigMatrixImpl46.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl46.copy();
        boolean boolean49 = bigMatrixImpl46.isSquare();
        double[] doubleArray52 = new double[] { (short) 10, 100L };
        double[] doubleArray55 = new double[] { (short) 10, 100L };
        double[] doubleArray58 = new double[] { (short) 10, 100L };
        double[] doubleArray61 = new double[] { (short) 10, 100L };
        double[][] doubleArray62 = new double[][] { doubleArray52, doubleArray55, doubleArray58, doubleArray61 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray62);
        java.math.BigDecimal[][] bigDecimalArray64 = bigMatrixImpl63.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray64);
        java.math.BigDecimal bigDecimal66 = bigMatrixImpl65.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix67 = bigMatrixImpl46.scalarAdd(bigDecimal66);
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl13.scalarMultiply(bigDecimal66);
        org.apache.commons.math.linear.BigMatrix bigMatrix69 = bigMatrixImpl13.transpose();
        int int70 = bigMatrixImpl13.getRowDimension();
        double[] doubleArray73 = new double[] { (short) 10, 100L };
        double[] doubleArray76 = new double[] { (short) 10, 100L };
        double[] doubleArray79 = new double[] { (short) 10, 100L };
        double[] doubleArray82 = new double[] { (short) 10, 100L };
        double[][] doubleArray83 = new double[][] { doubleArray73, doubleArray76, doubleArray79, doubleArray82 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl84 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray83);
        java.math.BigDecimal[][] bigDecimalArray85 = bigMatrixImpl84.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl86 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray85);
        java.math.BigDecimal bigDecimal87 = bigMatrixImpl86.getNorm();
        java.math.BigDecimal[][] bigDecimalArray88 = bigMatrixImpl86.getDataRef();
        int int89 = bigMatrixImpl86.getColumnDimension();
        java.math.BigDecimal bigDecimal90 = bigMatrixImpl86.getNorm();
        java.math.BigDecimal[][] bigDecimalArray91 = bigMatrixImpl86.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl92 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray91);
        java.math.BigDecimal[][] bigDecimalArray93 = bigMatrixImpl92.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray94 = bigMatrixImpl92.getDataRef();
        int int95 = bigMatrixImpl92.getColumnDimension();
        java.lang.String str96 = bigMatrixImpl92.toString();
        java.math.BigDecimal[] bigDecimalArray98 = bigMatrixImpl92.getColumn(1);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal[] bigDecimalArray99 = bigMatrixImpl13.operate(bigDecimalArray98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: vector has wrong length");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigMatrix14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(bigMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertNotNull(bigDecimalArray47);
        org.junit.Assert.assertNotNull(bigMatrix48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(bigDecimalArray64);
        org.junit.Assert.assertNotNull(bigDecimal66);
        org.junit.Assert.assertNotNull(bigMatrix67);
        org.junit.Assert.assertNotNull(bigMatrix68);
        org.junit.Assert.assertNotNull(bigMatrix69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 4 + "'", int70 == 4);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertNotNull(bigDecimalArray85);
        org.junit.Assert.assertNotNull(bigDecimal87);
        org.junit.Assert.assertNotNull(bigDecimalArray88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2 + "'", int89 == 2);
        org.junit.Assert.assertNotNull(bigDecimal90);
        org.junit.Assert.assertNotNull(bigDecimalArray91);
        org.junit.Assert.assertNotNull(bigDecimalArray93);
        org.junit.Assert.assertNotNull(bigDecimalArray94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 2 + "'", int95 == 2);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}" + "'", str96, "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}");
        org.junit.Assert.assertNotNull(bigDecimalArray98);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        java.math.BigDecimal bigDecimal5 = bigMatrixImpl2.getEntry((int) (byte) 10, 0);
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[][] doubleArray18 = new double[][] { doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl19.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20);
        bigMatrixImpl22.setRoundingMode((int) (short) 100);
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[][] doubleArray37 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        java.math.BigDecimal[][] bigDecimalArray39 = bigMatrixImpl38.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        java.math.BigDecimal bigDecimal41 = bigMatrixImpl40.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl22.scalarAdd(bigDecimal41);
        java.math.BigDecimal[][] bigDecimalArray43 = bigMatrixImpl22.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl2.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Matrices are not multiplication compatible.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertNotNull(bigDecimalArray20);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertNotNull(bigDecimalArray39);
        org.junit.Assert.assertNotNull(bigDecimal41);
        org.junit.Assert.assertNotNull(bigMatrix42);
        org.junit.Assert.assertNotNull(bigDecimalArray43);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl34.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl34.transpose();
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[][] doubleArray49 = new double[][] { doubleArray39, doubleArray42, doubleArray45, doubleArray48 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray49);
        java.math.BigDecimal[][] bigDecimalArray51 = bigMatrixImpl50.getData();
        bigMatrixImpl50.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray54 = bigMatrixImpl50.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray54);
        java.math.BigDecimal bigDecimal58 = bigMatrixImpl55.getEntry(0, (int) (short) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix59 = bigMatrixImpl34.scalarMultiply(bigDecimal58);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray61 = bigMatrixImpl34.getColumnAsDoubleArray((int) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.linear.MatrixIndexException; message: illegal column argument");
        } catch (org.apache.commons.math.linear.MatrixIndexException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(bigDecimalArray29);
        org.junit.Assert.assertNotNull(bigDecimal31);
        org.junit.Assert.assertNotNull(bigDecimalArray32);
        org.junit.Assert.assertNotNull(bigMatrix35);
        org.junit.Assert.assertNotNull(bigMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(bigDecimalArray51);
        org.junit.Assert.assertNotNull(bigDecimalArray54);
        org.junit.Assert.assertNotNull(bigDecimal58);
        org.junit.Assert.assertNotNull(bigMatrix59);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.lang.String[] strArray5 = new java.lang.String[] { "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}", "", "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}", "", "BigMatrixImpl{}" };
        java.lang.String[] strArray11 = new java.lang.String[] { "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}", "", "BigMatrixImpl{{10,100},{10,100},{10,100},{10,100}}", "", "BigMatrixImpl{}" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray5, strArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        bigMatrixImpl16.setRoundingMode((int) (short) 100);
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl32.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal35 = bigMatrixImpl34.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl16.scalarAdd(bigDecimal35);
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[][] doubleArray49 = new double[][] { doubleArray39, doubleArray42, doubleArray45, doubleArray48 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray49);
        java.math.BigDecimal[][] bigDecimalArray51 = bigMatrixImpl50.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        bigMatrixImpl53.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrixImpl53.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix57 = bigMatrixImpl16.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl53);
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[] doubleArray69 = new double[] { (short) 10, 100L };
        double[][] doubleArray70 = new double[][] { doubleArray60, doubleArray63, doubleArray66, doubleArray69 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray70);
        double[][] doubleArray72 = bigMatrixImpl71.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl74 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl76 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray72);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl77 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray72);
        int int78 = bigMatrixImpl77.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix79 = bigMatrixImpl16.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl77);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray14);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertNotNull(bigDecimalArray33);
        org.junit.Assert.assertNotNull(bigDecimal35);
        org.junit.Assert.assertNotNull(bigMatrix36);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertNotNull(bigDecimalArray51);
        org.junit.Assert.assertNotNull(bigMatrix56);
        org.junit.Assert.assertNotNull(bigMatrix57);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
        org.junit.Assert.assertNotNull(bigMatrix79);
    }
}

