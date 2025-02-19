import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone10, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3);
        boolean boolean18 = fastDateFormat17.getTimeZoneOverridesCalendar();
        java.util.Locale locale19 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 0, timeZone10, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (short) 1);
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm a", timeZone10, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone10);
        java.lang.Class<?> wildcardClass29 = fastDateFormat28.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean7 = fastDateFormat5.equals((java.lang.Object) 100.0f);
        java.lang.String str9 = fastDateFormat5.format(0L);
        java.lang.String str10 = fastDateFormat5.getPattern();
        java.util.TimeZone timeZone11 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 3, timeZone11);
        java.lang.String str13 = fastDateFormat12.toString();
        java.util.TimeZone timeZone14 = fastDateFormat12.getTimeZone();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale23);
        java.util.TimeZone timeZone25 = fastDateFormat24.getTimeZone();
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone25, locale26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale29 = fastDateFormat28.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone25, locale29);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone25);
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale36);
        java.util.TimeZone timeZone38 = fastDateFormat37.getTimeZone();
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone38, locale39);
        java.util.Locale locale45 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale45);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        java.util.Locale locale48 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone47, locale48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale51 = fastDateFormat50.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone47, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone38, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone25, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone25);
        java.util.Locale locale56 = fastDateFormat55.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 100, (int) ' ', timeZone14, locale56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FastDateFormat[MMMM d, yyyy h:mm a]" + "'", str13, "FastDateFormat[MMMM d, yyyy h:mm a]");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.lang.Class<?> wildcardClass5 = fastDateFormat3.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone10, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone23, locale24);
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale30);
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone32, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone32, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone23, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone10, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, locale36);
        java.lang.String str41 = fastDateFormat40.getPattern();
        java.lang.String str43 = fastDateFormat40.format(0L);
        java.text.ParsePosition parsePosition45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = fastDateFormat40.parseObject("1/1/70 12:00:00 AM UTC", parsePosition45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "h:mm:ss a z" + "'", str41, "h:mm:ss a z");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "12:00:00 AM UTC" + "'", str43, "12:00:00 AM UTC");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.lang.String str7 = fastDateFormat5.format((long) (short) 0);
        boolean boolean8 = fastDateFormat5.getTimeZoneOverridesCalendar();
        java.util.Locale locale9 = fastDateFormat5.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(31, (int) (short) -1, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thursday, January 1, 1970" + "'", str7, "Thursday, January 1, 1970");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone10, locale12);
        int int14 = fastDateFormat13.getMaxLengthEstimate();
        java.util.Locale locale15 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 0, locale15);
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm a", timeZone19);
        java.util.TimeZone timeZone24 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale31);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone33, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone33, locale37);
        java.util.Locale locale44 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale44);
        java.util.TimeZone timeZone46 = fastDateFormat45.getTimeZone();
        java.util.Locale locale47 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone46, locale47);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale50 = fastDateFormat49.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone46, locale50);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone46);
        int int53 = fastDateFormat52.getMaxLengthEstimate();
        java.util.Locale locale54 = fastDateFormat52.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone33, locale54);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale54);
        java.util.Locale locale57 = fastDateFormat56.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 0, timeZone24, locale57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale57);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(100, timeZone19, locale57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 13 + "'", int53 == 13);
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar4 = null;
        java.lang.String str5 = fastDateFormat3.format(calendar4);
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat3.format((long) 'a', stringBuffer7);
        boolean boolean9 = fastDateFormat3.getTimeZoneOverridesCalendar();
        java.lang.String str10 = fastDateFormat3.toString();
        java.util.TimeZone timeZone11 = fastDateFormat3.getTimeZone();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale18);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone20, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale24 = fastDateFormat23.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone20, locale24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone20);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale32);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone34, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone34, locale38);
        java.util.Locale locale45 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale45);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        java.util.Locale locale48 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone47, locale48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale51 = fastDateFormat50.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone47, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone47);
        int int54 = fastDateFormat53.getMaxLengthEstimate();
        java.util.Locale locale55 = fastDateFormat53.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone34, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone20, locale55);
        java.util.Locale locale58 = fastDateFormat57.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale58);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((-1), timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "FastDateFormat[]" + "'", str10, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 13 + "'", int54 == 13);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat59);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale15);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone17, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone17, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone17);
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale28);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone30, locale31);
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale37);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        java.util.Locale locale40 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone39, locale40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone39, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone30, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone17, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale48 = fastDateFormat47.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone17, locale48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone6, locale48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone6);
        java.text.ParsePosition parsePosition54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = fastDateFormat52.parseObject("hi!", parsePosition54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.util.TimeZone timeZone5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone5, locale6);
        int int8 = fastDateFormat7.getMaxLengthEstimate();
        java.util.Locale locale9 = fastDateFormat7.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70", locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(20, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean3 = fastDateFormat1.equals((java.lang.Object) 100.0f);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat1.format((long) (short) 0, stringBuffer5);
        java.util.Calendar calendar7 = null;
        java.lang.String str8 = fastDateFormat1.format(calendar7);
        java.util.Calendar calendar9 = null;
        java.lang.String str10 = fastDateFormat1.format(calendar9);
        java.util.Date date11 = null;
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = fastDateFormat1.format(date11, stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 2, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0);
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale16);
        boolean boolean18 = fastDateFormat14.equals((java.lang.Object) locale16);
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale27);
        java.util.TimeZone timeZone29 = fastDateFormat28.getTimeZone();
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone29, locale30);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale33 = fastDateFormat32.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone29, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone29);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone29);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone29, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale38);
        java.lang.Object obj41 = fastDateFormat40.clone();
        boolean boolean42 = fastDateFormat14.equals(obj41);
        java.util.Locale locale43 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone8, locale43);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[EEEE, MMMM d, yyyy h:mm a]", locale43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale12);
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone11, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3);
        boolean boolean19 = fastDateFormat18.getTimeZoneOverridesCalendar();
        java.util.Locale locale20 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 0, timeZone11, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        boolean boolean27 = fastDateFormat25.getTimeZoneOverridesCalendar();
        java.util.Locale locale28 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a", locale28);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = fastDateFormat30.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(49, (int) (short) 0, timeZone11, locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 49");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.util.TimeZone timeZone1 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone1);
        boolean boolean4 = fastDateFormat2.equals((java.lang.Object) "FastDateFormat[]");
        java.lang.Object obj5 = fastDateFormat2.clone();
        int int6 = fastDateFormat2.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = fastDateFormat2.parseObject("EEEE, MMMM d, yyyy");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7, locale8);
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7, locale10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone7);
        java.lang.String str15 = fastDateFormat13.format((long) 'a');
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale18);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale22 = fastDateFormat21.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone20, locale22);
        java.util.TimeZone timeZone25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone25);
        boolean boolean28 = fastDateFormat26.equals((java.lang.Object) "FastDateFormat[]");
        boolean boolean29 = fastDateFormat26.getTimeZoneOverridesCalendar();
        java.lang.Object obj30 = fastDateFormat26.clone();
        boolean boolean31 = fastDateFormat23.equals((java.lang.Object) fastDateFormat26);
        boolean boolean32 = fastDateFormat23.getTimeZoneOverridesCalendar();
        java.util.Locale locale33 = fastDateFormat23.getLocale();
        java.lang.StringBuffer stringBuffer34 = null;
        java.text.FieldPosition fieldPosition35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer36 = fastDateFormat13.format((java.lang.Object) locale33, stringBuffer34, fieldPosition35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "12:00:00 AM UTC" + "'", str15, "12:00:00 AM UTC");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.util.TimeZone timeZone3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone3);
        java.lang.String str5 = fastDateFormat4.getPattern();
        java.util.TimeZone timeZone6 = fastDateFormat4.getTimeZone();
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale15);
        java.util.TimeZone timeZone17 = fastDateFormat16.getTimeZone();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone17, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone17, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone17);
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale29);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone31, locale32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale35 = fastDateFormat34.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone31, locale35);
        java.util.Locale locale42 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale42);
        java.util.TimeZone timeZone44 = fastDateFormat43.getTimeZone();
        java.util.Locale locale45 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone44, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale48 = fastDateFormat47.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone44, locale48);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone44);
        int int51 = fastDateFormat50.getMaxLengthEstimate();
        java.util.Locale locale52 = fastDateFormat50.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone31, locale52);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone17, locale52);
        java.util.Locale locale55 = fastDateFormat54.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69", locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy", locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", timeZone6, locale55);
        java.util.Locale locale61 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale61);
        java.util.TimeZone timeZone63 = fastDateFormat62.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale65 = fastDateFormat64.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone63, locale65);
        boolean boolean67 = fastDateFormat66.getTimeZoneOverridesCalendar();
        java.lang.String str69 = fastDateFormat66.format((long) '#');
        java.util.Locale locale70 = fastDateFormat66.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) 'a', timeZone6, locale70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h:mm:ss a z" + "'", str5, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 13 + "'", int51 == 13);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(timeZone63);
        org.junit.Assert.assertEquals(timeZone63.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone10, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone10);
        java.util.Calendar calendar20 = null;
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = fastDateFormat19.format(calendar20, stringBuffer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) 100.0f);
        boolean boolean6 = fastDateFormat3.getTimeZoneOverridesCalendar();
        java.lang.String str8 = fastDateFormat3.format((long) (byte) 100);
        java.util.TimeZone timeZone9 = fastDateFormat3.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale13);
        java.util.TimeZone timeZone15 = fastDateFormat14.getTimeZone();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale23);
        java.util.TimeZone timeZone25 = fastDateFormat24.getTimeZone();
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone25, locale26);
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone25, locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        int int36 = fastDateFormat35.getMaxLengthEstimate();
        boolean boolean37 = fastDateFormat33.equals((java.lang.Object) int36);
        java.util.TimeZone timeZone38 = fastDateFormat33.getTimeZone();
        java.lang.Object obj39 = fastDateFormat33.clone();
        java.util.Locale locale40 = fastDateFormat33.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone15, locale40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, locale40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm a", timeZone9, locale40);
        java.util.Locale locale47 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale47);
        java.util.TimeZone timeZone49 = fastDateFormat48.getTimeZone();
        java.util.Locale locale57 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale57);
        java.util.TimeZone timeZone59 = fastDateFormat58.getTimeZone();
        java.util.Locale locale60 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone59, locale60);
        java.util.Locale locale62 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone59, locale62);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone59);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone59);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone59);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone59);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        int int70 = fastDateFormat69.getMaxLengthEstimate();
        boolean boolean71 = fastDateFormat67.equals((java.lang.Object) int70);
        java.util.TimeZone timeZone72 = fastDateFormat67.getTimeZone();
        java.lang.Object obj73 = fastDateFormat67.clone();
        java.util.Locale locale74 = fastDateFormat67.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone49, locale74);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat76 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, locale74);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(18, timeZone9, locale74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 18");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 18 + "'", int36 == 18);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(timeZone59);
        org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 18 + "'", int70 == 18);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(timeZone72);
        org.junit.Assert.assertEquals(timeZone72.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj73), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(fastDateFormat76);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format(calendar2, stringBuffer3);
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format(calendar5, stringBuffer6);
        java.lang.String str8 = fastDateFormat1.toString();
        boolean boolean9 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat1.format((long) 21, stringBuffer11);
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale20);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone22, locale23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone22, locale26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm a", timeZone22, locale32);
        boolean boolean35 = fastDateFormat1.equals((java.lang.Object) "h:mm a");
        java.lang.String str36 = fastDateFormat1.getPattern();
        java.util.Calendar calendar37 = null;
        java.lang.String str38 = fastDateFormat1.format(calendar37);
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNull(stringBuffer4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[]" + "'", str8, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(stringBuffer12);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone9, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone9);
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        int int19 = fastDateFormat17.getMaxLengthEstimate();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = fastDateFormat17.format((java.lang.Object) fastDateFormat21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17 + "'", int19 == 17);
        org.junit.Assert.assertNotNull(fastDateFormat21);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone13, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone13, locale17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone13);
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale24);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone26, locale27);
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale33);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone35, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone35, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone26, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone13, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone13, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale44);
        java.util.Locale locale47 = fastDateFormat46.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", locale47);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, locale47);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7, locale8);
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale14);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone16, locale17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone16, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone7, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone7);
        java.lang.String str25 = fastDateFormat24.getPattern();
        java.util.Calendar calendar26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = fastDateFormat24.format(calendar26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h:mm:ss a z" + "'", str25, "h:mm:ss a z");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        boolean boolean3 = fastDateFormat1.getTimeZoneOverridesCalendar();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.String str7 = fastDateFormat5.format(calendar6);
        java.lang.Object obj8 = fastDateFormat5.clone();
        int int9 = fastDateFormat5.getMaxLengthEstimate();
        boolean boolean10 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.StringBuffer stringBuffer13 = fastDateFormat5.format(0L, stringBuffer12);
        java.util.Locale locale14 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) ' ', locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(stringBuffer13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale2);
        int int4 = fastDateFormat3.getMaxLengthEstimate();
        boolean boolean6 = fastDateFormat3.equals((java.lang.Object) 1.0f);
        java.lang.String str8 = fastDateFormat3.format((long) (byte) 0);
        java.lang.String str9 = fastDateFormat3.getPattern();
        int int10 = fastDateFormat3.getMaxLengthEstimate();
        boolean boolean11 = fastDateFormat3.getTimeZoneOverridesCalendar();
        java.util.Locale locale12 = fastDateFormat3.getLocale();
        java.lang.Object obj13 = fastDateFormat3.clone();
        java.lang.String str14 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone15 = fastDateFormat3.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) 100.0f);
        java.lang.String str7 = fastDateFormat3.format(0L);
        java.lang.String str8 = fastDateFormat3.getPattern();
        java.util.TimeZone timeZone9 = fastDateFormat3.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 3, timeZone9);
        java.util.Calendar calendar11 = null;
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = fastDateFormat10.format(calendar11, stringBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone12, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale21 = fastDateFormat20.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone12, locale21);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale26);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone28, locale30);
        int int32 = fastDateFormat31.getMaxLengthEstimate();
        java.util.Locale locale33 = fastDateFormat31.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone12, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", timeZone12);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone11, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale32);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        java.util.Locale locale35 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone34, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale38 = fastDateFormat37.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone34, locale38);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone34);
        java.util.Locale locale45 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale45);
        java.util.TimeZone timeZone47 = fastDateFormat46.getTimeZone();
        java.util.Locale locale48 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone47, locale48);
        java.util.Locale locale54 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale54);
        java.util.TimeZone timeZone56 = fastDateFormat55.getTimeZone();
        java.util.Locale locale57 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone56, locale57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale60 = fastDateFormat59.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone56, locale60);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone47, locale60);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone34, locale60);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale65 = fastDateFormat64.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone34, locale65);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone23, locale65);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, timeZone11, locale65);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(13, timeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 13");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.StringBuffer stringBuffer3 = null;
        java.lang.StringBuffer stringBuffer4 = fastDateFormat1.format(calendar2, stringBuffer3);
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat1.format(calendar5, stringBuffer6);
        java.lang.String str8 = fastDateFormat1.toString();
        java.lang.Object obj9 = fastDateFormat1.clone();
        java.lang.Object obj10 = fastDateFormat1.clone();
        java.lang.String str12 = fastDateFormat1.format(10L);
        java.lang.Object obj13 = fastDateFormat1.clone();
        java.lang.StringBuffer stringBuffer15 = null;
        java.lang.StringBuffer stringBuffer16 = fastDateFormat1.format((long) (byte) 100, stringBuffer15);
        java.lang.Object obj17 = fastDateFormat1.clone();
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNull(stringBuffer4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[]" + "'", str8, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "FastDateFormat[]");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.String str3 = fastDateFormat1.format(calendar2);
        java.lang.String str4 = fastDateFormat1.toString();
        boolean boolean5 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat1.format(calendar6, stringBuffer7);
        java.util.TimeZone timeZone9 = fastDateFormat1.getTimeZone();
        int int10 = fastDateFormat1.getMaxLengthEstimate();
        java.util.Calendar calendar11 = null;
        java.lang.String str12 = fastDateFormat1.format(calendar11);
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FastDateFormat[]" + "'", str4, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(calendar6, stringBuffer7);
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat5.format(calendar9, stringBuffer10);
        java.util.Calendar calendar12 = null;
        java.lang.StringBuffer stringBuffer13 = null;
        java.lang.StringBuffer stringBuffer14 = fastDateFormat5.format(calendar12, stringBuffer13);
        int int15 = fastDateFormat5.getMaxLengthEstimate();
        java.lang.String str16 = fastDateFormat5.toString();
        boolean boolean17 = fastDateFormat3.equals((java.lang.Object) fastDateFormat5);
        int int18 = fastDateFormat3.getMaxLengthEstimate();
        java.util.Locale locale19 = fastDateFormat3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (byte) 10, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNull(stringBuffer11);
        org.junit.Assert.assertNull(stringBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "FastDateFormat[]" + "'", str16, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone1, locale2);
        java.util.Calendar calendar4 = null;
        java.lang.String str5 = fastDateFormat3.format(calendar4);
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat3.format(calendar6, stringBuffer7);
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(stringBuffer8);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        java.lang.String str7 = fastDateFormat4.format((long) 18);
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12:00:00 AM UTC" + "'", str7, "12:00:00 AM UTC");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone9, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm a", timeZone9, locale19);
        int int22 = fastDateFormat21.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale9 = fastDateFormat8.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7, locale9);
        int int11 = fastDateFormat10.getMaxLengthEstimate();
        java.util.Locale locale12 = fastDateFormat10.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale12);
        java.util.TimeZone timeZone14 = fastDateFormat13.getTimeZone();
        java.util.TimeZone timeZone16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone16, locale17);
        java.util.Calendar calendar19 = null;
        java.lang.StringBuffer stringBuffer20 = null;
        java.lang.StringBuffer stringBuffer21 = fastDateFormat18.format(calendar19, stringBuffer20);
        java.lang.StringBuffer stringBuffer23 = null;
        java.lang.StringBuffer stringBuffer24 = fastDateFormat18.format(10L, stringBuffer23);
        java.util.Locale locale25 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone14, locale25);
        java.lang.String str27 = fastDateFormat26.getPattern();
        boolean boolean28 = fastDateFormat26.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone29 = fastDateFormat26.getTimeZone();
        java.util.TimeZone timeZone30 = fastDateFormat26.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance("FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a]", timeZone30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNull(stringBuffer21);
        org.junit.Assert.assertNull(stringBuffer24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "MMMM d, yyyy" + "'", str27, "MMMM d, yyyy");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale2 = fastDateFormat1.getLocale();
        boolean boolean3 = fastDateFormat1.getTimeZoneOverridesCalendar();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.String str7 = fastDateFormat5.format(calendar6);
        java.lang.Object obj8 = fastDateFormat5.clone();
        int int9 = fastDateFormat5.getMaxLengthEstimate();
        boolean boolean10 = fastDateFormat1.equals((java.lang.Object) fastDateFormat5);
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.StringBuffer stringBuffer13 = fastDateFormat5.format(0L, stringBuffer12);
        java.util.Locale locale14 = fastDateFormat5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '#', locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(stringBuffer13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7, locale8);
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale14);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone16, locale17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone16, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone7, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone7);
        java.lang.String str25 = fastDateFormat24.getPattern();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar28 = null;
        java.lang.String str29 = fastDateFormat27.format(calendar28);
        java.lang.StringBuffer stringBuffer31 = null;
        java.lang.StringBuffer stringBuffer32 = fastDateFormat27.format((long) 'a', stringBuffer31);
        boolean boolean33 = fastDateFormat27.getTimeZoneOverridesCalendar();
        java.lang.String str34 = fastDateFormat27.toString();
        java.util.TimeZone timeZone35 = fastDateFormat27.getTimeZone();
        java.lang.StringBuffer stringBuffer37 = null;
        java.lang.StringBuffer stringBuffer38 = fastDateFormat27.format(0L, stringBuffer37);
        java.lang.String str40 = fastDateFormat27.format((long) (short) 100);
        java.util.Locale locale41 = fastDateFormat27.getLocale();
        java.lang.String str42 = fastDateFormat27.toString();
        boolean boolean43 = fastDateFormat24.equals((java.lang.Object) str42);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h:mm:ss a z" + "'", str25, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(stringBuffer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "FastDateFormat[]" + "'", str34, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNull(stringBuffer38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "FastDateFormat[]" + "'", str42, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone10, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale19 = fastDateFormat18.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone10, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone10);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0);
        java.util.TimeZone timeZone3 = fastDateFormat2.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat7.format(calendar8, stringBuffer9);
        java.util.Calendar calendar11 = null;
        java.lang.StringBuffer stringBuffer12 = null;
        java.lang.StringBuffer stringBuffer13 = fastDateFormat7.format(calendar11, stringBuffer12);
        java.lang.String str14 = fastDateFormat7.toString();
        java.lang.Object obj15 = fastDateFormat7.clone();
        java.lang.Object obj16 = fastDateFormat7.clone();
        java.lang.String str18 = fastDateFormat7.format(10L);
        int int19 = fastDateFormat7.getMaxLengthEstimate();
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        boolean boolean24 = fastDateFormat7.equals((java.lang.Object) timeZone23);
        java.util.TimeZone timeZone27 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone27, locale28);
        int int30 = fastDateFormat29.getMaxLengthEstimate();
        java.util.Locale locale31 = fastDateFormat29.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 0, timeZone23, locale31);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'a', timeZone3, locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertNull(stringBuffer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FastDateFormat[]" + "'", str14, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone13, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale17 = fastDateFormat16.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone13, locale17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone13);
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale24);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone26, locale27);
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale33);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone35, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone35, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone26, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone13, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone13, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (byte) 0, timeZone13);
        java.util.Locale locale52 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale52);
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale56 = fastDateFormat55.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone54, locale56);
        int int58 = fastDateFormat57.getMaxLengthEstimate();
        java.util.Locale locale59 = fastDateFormat57.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale59);
        java.util.TimeZone timeZone61 = fastDateFormat60.getTimeZone();
        java.util.TimeZone timeZone63 = null;
        java.util.Locale locale64 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone63, locale64);
        java.util.Calendar calendar66 = null;
        java.lang.StringBuffer stringBuffer67 = null;
        java.lang.StringBuffer stringBuffer68 = fastDateFormat65.format(calendar66, stringBuffer67);
        java.lang.StringBuffer stringBuffer70 = null;
        java.lang.StringBuffer stringBuffer71 = fastDateFormat65.format(10L, stringBuffer70);
        java.util.Locale locale72 = fastDateFormat65.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone61, locale72);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale72);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang3.time.FastDateFormat.getInstance("Thursday, January 1, 1970 12:00:00 AM UTC", timeZone13, locale72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNull(stringBuffer68);
        org.junit.Assert.assertNull(stringBuffer71);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone9, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone9);
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale24);
        java.util.TimeZone timeZone26 = fastDateFormat25.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone26, locale28);
        int int30 = fastDateFormat29.getMaxLengthEstimate();
        java.util.Locale locale31 = fastDateFormat29.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, locale31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (byte) 0, locale31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone9, locale31);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone8, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone8);
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale20);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone22, locale23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone22, locale26);
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale33);
        java.util.TimeZone timeZone35 = fastDateFormat34.getTimeZone();
        java.util.Locale locale36 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone35, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale39 = fastDateFormat38.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone35, locale39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone35);
        int int42 = fastDateFormat41.getMaxLengthEstimate();
        java.util.Locale locale43 = fastDateFormat41.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone22, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone8, locale43);
        java.lang.String str46 = fastDateFormat45.getPattern();
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 13 + "'", int42 == 13);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "h:mm:ss a z" + "'", str46, "h:mm:ss a z");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone10, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean18 = fastDateFormat17.getTimeZoneOverridesCalendar();
        java.util.Locale locale19 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone10, locale19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale19);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale24);
        java.lang.String str27 = fastDateFormat25.format((long) (short) 0);
        boolean boolean28 = fastDateFormat25.getTimeZoneOverridesCalendar();
        java.util.Locale locale29 = fastDateFormat25.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(39, timeZone22, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 39");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Thursday, January 1, 1970" + "'", str27, "Thursday, January 1, 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.util.TimeZone timeZone2 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone2, locale3);
        java.util.TimeZone timeZone5 = fastDateFormat4.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) '#', timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone9, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone9);
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, (int) (byte) 1, locale16);
        boolean boolean18 = fastDateFormat17.getTimeZoneOverridesCalendar();
        int int19 = fastDateFormat17.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 39 + "'", int19 == 39);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone8, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8);
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale19);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        java.util.Locale locale29 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale29);
        java.util.TimeZone timeZone31 = fastDateFormat30.getTimeZone();
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone31, locale32);
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone31, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z");
        int int42 = fastDateFormat41.getMaxLengthEstimate();
        boolean boolean43 = fastDateFormat39.equals((java.lang.Object) int42);
        java.util.TimeZone timeZone44 = fastDateFormat39.getTimeZone();
        java.lang.Object obj45 = fastDateFormat39.clone();
        java.util.Locale locale46 = fastDateFormat39.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone21, locale46);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(1, locale46);
        boolean boolean49 = fastDateFormat15.equals((java.lang.Object) fastDateFormat48);
        java.lang.String str51 = fastDateFormat15.format((long) 39);
        java.util.TimeZone timeZone52 = fastDateFormat15.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 18 + "'", int42 == 18);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "FastDateFormat[EEEE, MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Thursday, January 1, 1970" + "'", str51, "Thursday, January 1, 1970");
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale7);
        java.util.TimeZone timeZone9 = fastDateFormat8.getTimeZone();
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone9, locale10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale13 = fastDateFormat12.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone9, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale18 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone9, locale18);
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        java.util.TimeZone timeZone21 = fastDateFormat19.getTimeZone();
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1);
        java.lang.Object obj2 = fastDateFormat1.clone();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        java.lang.String str4 = fastDateFormat1.toString();
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale14);
        java.util.TimeZone timeZone16 = fastDateFormat15.getTimeZone();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone16, locale17);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale20 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone16, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone16);
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale26);
        java.util.TimeZone timeZone28 = fastDateFormat27.getTimeZone();
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale37);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        java.util.Locale locale40 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone39, locale40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale43 = fastDateFormat42.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone39, locale43);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone39);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone39);
        java.util.Locale locale50 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale50);
        java.util.TimeZone timeZone52 = fastDateFormat51.getTimeZone();
        java.util.Locale locale53 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone52, locale53);
        java.util.Locale locale59 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale59);
        java.util.TimeZone timeZone61 = fastDateFormat60.getTimeZone();
        java.util.Locale locale62 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone61, locale62);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale65 = fastDateFormat64.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone61, locale65);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone52, locale65);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone39, locale65);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale70 = fastDateFormat69.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone39, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone28, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, timeZone16, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, locale70);
        int int75 = fastDateFormat74.getMaxLengthEstimate();
        int int76 = fastDateFormat74.getMaxLengthEstimate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str77 = fastDateFormat1.format((java.lang.Object) fastDateFormat74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FastDateFormat[MMMM d, yyyy]" + "'", str4, "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 18 + "'", int75 == 18);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 18 + "'", int76 == 18);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone8, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone8);
        boolean boolean17 = fastDateFormat15.equals((java.lang.Object) 100);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone23);
        java.lang.String str28 = fastDateFormat27.getPattern();
        boolean boolean29 = fastDateFormat15.equals((java.lang.Object) fastDateFormat27);
        java.util.TimeZone timeZone30 = fastDateFormat27.getTimeZone();
        java.util.Locale locale38 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale38);
        java.util.TimeZone timeZone40 = fastDateFormat39.getTimeZone();
        java.util.Locale locale41 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone40, locale41);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone40, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone40, locale49);
        int int51 = fastDateFormat50.getMaxLengthEstimate();
        java.lang.String str53 = fastDateFormat50.format((long) (byte) 0);
        java.util.Locale locale58 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale58);
        java.util.TimeZone timeZone60 = fastDateFormat59.getTimeZone();
        java.util.Locale locale61 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone60, locale61);
        java.util.Locale locale63 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone60, locale63);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone60);
        boolean boolean66 = fastDateFormat50.equals((java.lang.Object) timeZone60);
        java.lang.StringBuffer stringBuffer67 = null;
        java.text.FieldPosition fieldPosition68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer69 = fastDateFormat27.format((java.lang.Object) boolean66, stringBuffer67, fieldPosition68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h:mm a" + "'", str28, "h:mm a");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 17 + "'", int51 == 17);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "12:00:00 AM UTC" + "'", str53, "12:00:00 AM UTC");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar6 = null;
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format(calendar6, stringBuffer7);
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat5.format(calendar9, stringBuffer10);
        java.lang.String str12 = fastDateFormat5.toString();
        java.lang.Object obj13 = fastDateFormat5.clone();
        java.lang.Object obj14 = fastDateFormat5.clone();
        java.lang.String str16 = fastDateFormat5.format(10L);
        int int17 = fastDateFormat5.getMaxLengthEstimate();
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale19);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        boolean boolean22 = fastDateFormat5.equals((java.lang.Object) timeZone21);
        java.util.TimeZone timeZone25 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone25, locale26);
        int int28 = fastDateFormat27.getMaxLengthEstimate();
        java.util.Locale locale29 = fastDateFormat27.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale29);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 0, timeZone21, locale29);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getInstance("M/d/yy", timeZone21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone21);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNull(stringBuffer8);
        org.junit.Assert.assertNull(stringBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "FastDateFormat[]" + "'", str12, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone12, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone12);
        java.util.TimeZone timeZone23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23, locale24);
        java.util.Calendar calendar26 = null;
        java.lang.StringBuffer stringBuffer27 = null;
        java.lang.StringBuffer stringBuffer28 = fastDateFormat25.format(calendar26, stringBuffer27);
        java.lang.StringBuffer stringBuffer30 = null;
        java.lang.StringBuffer stringBuffer31 = fastDateFormat25.format(10L, stringBuffer30);
        java.util.Locale locale32 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69", timeZone12, locale32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale32);
        java.lang.Class<?> wildcardClass35 = locale32.getClass();
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNull(stringBuffer28);
        org.junit.Assert.assertNull(stringBuffer31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone8, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy");
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone8, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean23 = fastDateFormat21.equals((java.lang.Object) 100.0f);
        boolean boolean24 = fastDateFormat21.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone25 = fastDateFormat21.getTimeZone();
        java.util.Locale locale27 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale27);
        java.lang.String str30 = fastDateFormat28.format((long) (short) 0);
        boolean boolean31 = fastDateFormat28.getTimeZoneOverridesCalendar();
        java.util.Locale locale32 = fastDateFormat28.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone25, locale32);
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale39);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        java.util.Locale locale42 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone41, locale42);
        java.util.Locale locale44 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone41, locale44);
        java.util.TimeZone timeZone46 = fastDateFormat45.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str50 = fastDateFormat48.format(0L);
        java.util.Locale locale51 = fastDateFormat48.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone46, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, locale51);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm:ss a z", timeZone25, locale51);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat55 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 10, timeZone8, locale51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Thursday, January 1, 1970" + "'", str30, "Thursday, January 1, 1970");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "12:00:00 AM" + "'", str50, "12:00:00 AM");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(fastDateFormat54);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) 'a', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale17 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale17);
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone19, locale20);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale23 = fastDateFormat22.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone19, locale23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone19);
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale30);
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone32, locale33);
        java.util.Locale locale39 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale39);
        java.util.TimeZone timeZone41 = fastDateFormat40.getTimeZone();
        java.util.Locale locale42 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone41, locale42);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale45 = fastDateFormat44.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone41, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone32, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone19, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale50 = fastDateFormat49.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone19, locale50);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone8, locale50);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale55 = fastDateFormat54.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy", timeZone8, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone8);
        java.util.Locale locale65 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale65);
        java.util.TimeZone timeZone67 = fastDateFormat66.getTimeZone();
        java.util.Locale locale68 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone67, locale68);
        java.util.Locale locale70 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat71 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone67, locale70);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone67);
        java.util.Locale locale76 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale76);
        java.util.TimeZone timeZone78 = fastDateFormat77.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale80 = fastDateFormat79.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone78, locale80);
        int int82 = fastDateFormat81.getMaxLengthEstimate();
        java.util.Locale locale83 = fastDateFormat81.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale83);
        java.util.Locale locale85 = fastDateFormat84.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone67, locale85);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(17, timeZone8, locale85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(fastDateFormat49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(timeZone67);
        org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat71);
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(timeZone78);
        org.junit.Assert.assertEquals(timeZone78.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat86);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6, locale7);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 2, timeZone6);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = fastDateFormat9.format(date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7, locale8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale11 = fastDateFormat10.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone7, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, timeZone7);
        java.lang.String str14 = fastDateFormat13.getPattern();
        boolean boolean15 = fastDateFormat13.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h:mm:ss a" + "'", str14, "h:mm:ss a");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean1 = fastDateFormat0.getTimeZoneOverridesCalendar();
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = fastDateFormat0.format(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12, locale13);
        java.util.Locale locale15 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone12, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3);
        boolean boolean20 = fastDateFormat19.getTimeZoneOverridesCalendar();
        java.util.Locale locale21 = fastDateFormat19.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (byte) 1, 0, timeZone12, locale21);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(1, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm a", timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0);
        java.lang.Class<?> wildcardClass29 = fastDateFormat28.getClass();
        boolean boolean30 = fastDateFormat26.equals((java.lang.Object) wildcardClass29);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone11, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone11);
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale22);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone24, locale25);
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale31);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone33, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone33, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone24, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone11, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0);
        java.util.Locale locale44 = fastDateFormat43.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone11, locale44);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMMM d, yyyy", timeZone11);
        java.util.TimeZone timeZone48 = fastDateFormat47.getTimeZone();
        java.util.TimeZone timeZone50 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone50);
        boolean boolean53 = fastDateFormat51.equals((java.lang.Object) "FastDateFormat[]");
        boolean boolean54 = fastDateFormat51.getTimeZoneOverridesCalendar();
        java.lang.String str56 = fastDateFormat51.format((java.lang.Object) 1L);
        java.lang.String str57 = fastDateFormat51.getPattern();
        boolean boolean58 = fastDateFormat47.equals((java.lang.Object) fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "12:00:00 AM UTC" + "'", str56, "12:00:00 AM UTC");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "h:mm:ss a z" + "'", str57, "h:mm:ss a z");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale15 = fastDateFormat14.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone11, locale15);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone11);
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale22);
        java.util.TimeZone timeZone24 = fastDateFormat23.getTimeZone();
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone24, locale25);
        java.util.Locale locale31 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale31);
        java.util.TimeZone timeZone33 = fastDateFormat32.getTimeZone();
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone33, locale34);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale37 = fastDateFormat36.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone33, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone24, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone11, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale42 = fastDateFormat41.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone11, locale42);
        java.util.Locale locale55 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale55);
        java.util.TimeZone timeZone57 = fastDateFormat56.getTimeZone();
        java.util.Locale locale58 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone57, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale61 = fastDateFormat60.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone57, locale61);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone57);
        java.util.Locale locale68 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale68);
        java.util.TimeZone timeZone70 = fastDateFormat69.getTimeZone();
        java.util.Locale locale71 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone70, locale71);
        java.util.Locale locale77 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale77);
        java.util.TimeZone timeZone79 = fastDateFormat78.getTimeZone();
        java.util.Locale locale80 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone79, locale80);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat82 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale83 = fastDateFormat82.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone79, locale83);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat85 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone70, locale83);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat86 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone57, locale83);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat87 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale88 = fastDateFormat87.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat89 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone57, locale88);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat90 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale88);
        java.util.Locale locale91 = fastDateFormat90.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat92 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, (int) (byte) 0, locale91);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat93 = org.apache.commons.lang3.time.FastDateFormat.getInstance("EEEE, MMMM d, yyyy h:mm a", timeZone11, locale91);
        java.util.Date date94 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str95 = fastDateFormat93.format(date94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
        org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(timeZone79);
        org.junit.Assert.assertEquals(timeZone79.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertNotNull(fastDateFormat82);
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat84);
        org.junit.Assert.assertNotNull(fastDateFormat85);
        org.junit.Assert.assertNotNull(fastDateFormat86);
        org.junit.Assert.assertNotNull(fastDateFormat87);
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat89);
        org.junit.Assert.assertNotNull(fastDateFormat90);
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat92);
        org.junit.Assert.assertNotNull(fastDateFormat93);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str5 = fastDateFormat3.format(0L);
        java.util.Locale locale6 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale6);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone10 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale20);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone22, locale23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone22, locale26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone22);
        java.util.Locale locale32 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale32);
        java.util.TimeZone timeZone34 = fastDateFormat33.getTimeZone();
        java.util.Locale locale43 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale43);
        java.util.TimeZone timeZone45 = fastDateFormat44.getTimeZone();
        java.util.Locale locale46 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone45, locale46);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale49 = fastDateFormat48.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone45, locale49);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat51 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat52 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone45);
        java.util.Locale locale56 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale56);
        java.util.TimeZone timeZone58 = fastDateFormat57.getTimeZone();
        java.util.Locale locale59 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone58, locale59);
        java.util.Locale locale65 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale65);
        java.util.TimeZone timeZone67 = fastDateFormat66.getTimeZone();
        java.util.Locale locale68 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone67, locale68);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat70 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale71 = fastDateFormat70.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat72 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone67, locale71);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat73 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone58, locale71);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat74 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone45, locale71);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale76 = fastDateFormat75.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat77 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone45, locale76);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone34, locale76);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(0, 0, timeZone22, locale76);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat80 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, locale76);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone10, locale76);
        boolean boolean82 = fastDateFormat8.equals((java.lang.Object) timeZone10);
        int int83 = fastDateFormat8.getMaxLengthEstimate();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12:00:00 AM" + "'", str5, "12:00:00 AM");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat50);
        org.junit.Assert.assertNotNull(fastDateFormat51);
        org.junit.Assert.assertNotNull(fastDateFormat52);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(timeZone58);
        org.junit.Assert.assertEquals(timeZone58.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(timeZone67);
        org.junit.Assert.assertEquals(timeZone67.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat70);
        org.junit.Assert.assertNotNull(locale71);
        org.junit.Assert.assertEquals(locale71.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat72);
        org.junit.Assert.assertNotNull(fastDateFormat73);
        org.junit.Assert.assertNotNull(fastDateFormat74);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(locale76);
        org.junit.Assert.assertEquals(locale76.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat77);
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(fastDateFormat80);
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 31 + "'", int83 == 31);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale12 = fastDateFormat11.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone8, locale12);
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale19);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        java.util.Locale locale22 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat23 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone21, locale22);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale25 = fastDateFormat24.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone21, locale25);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone21);
        java.util.Locale locale28 = fastDateFormat27.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, timeZone8, locale28);
        java.lang.Object obj30 = fastDateFormat29.clone();
        boolean boolean31 = fastDateFormat29.getTimeZoneOverridesCalendar();
        java.lang.String str32 = fastDateFormat29.toString();
        java.util.Date date33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = fastDateFormat29.format(date33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat23);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]" + "'", str32, "FastDateFormat[EEEE, MMMM d, yyyy h:mm:ss a z]");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(2, (int) (byte) 0);
        java.util.Calendar calendar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = fastDateFormat2.format(calendar3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat2);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone10, locale14);
        java.util.Locale locale21 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat22 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale21);
        java.util.TimeZone timeZone23 = fastDateFormat22.getTimeZone();
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone23, locale24);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale27 = fastDateFormat26.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone23, locale27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone23);
        java.util.Locale locale30 = fastDateFormat29.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, (int) (byte) 1, timeZone10, locale30);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone10);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone10);
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone8, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone8);
        java.lang.String str14 = fastDateFormat13.getPattern();
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale20);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone22, locale23);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale26 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat27 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone22, locale26);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat28 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone22);
        boolean boolean29 = fastDateFormat13.equals((java.lang.Object) timeZone22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(49, (int) (short) 1, timeZone22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 49");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EEEE, MMMM d, yyyy" + "'", str14, "EEEE, MMMM d, yyyy");
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat27);
        org.junit.Assert.assertNotNull(fastDateFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        boolean boolean2 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.util.Locale locale3 = fastDateFormat1.getLocale();
        java.util.TimeZone timeZone4 = fastDateFormat1.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone4);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer8 = fastDateFormat5.format((long) 45, stringBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat5);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        java.util.Locale locale7 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6, locale7);
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale9);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone6);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat11);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.util.Locale locale10 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat11 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale10);
        java.util.TimeZone timeZone12 = fastDateFormat11.getTimeZone();
        java.util.Locale locale13 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12, locale13);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale16 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone12, locale16);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone12);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone12);
        java.util.TimeZone timeZone23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone23, locale24);
        java.util.Calendar calendar26 = null;
        java.lang.StringBuffer stringBuffer27 = null;
        java.lang.StringBuffer stringBuffer28 = fastDateFormat25.format(calendar26, stringBuffer27);
        java.lang.StringBuffer stringBuffer30 = null;
        java.lang.StringBuffer stringBuffer31 = fastDateFormat25.format(10L, stringBuffer30);
        java.util.Locale locale32 = fastDateFormat25.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance("12/31/69", timeZone12, locale32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", locale32);
        boolean boolean35 = fastDateFormat34.getTimeZoneOverridesCalendar();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar39 = null;
        java.lang.String str40 = fastDateFormat38.format(calendar39);
        java.lang.StringBuffer stringBuffer42 = null;
        java.lang.StringBuffer stringBuffer43 = fastDateFormat38.format((long) 'a', stringBuffer42);
        boolean boolean44 = fastDateFormat38.getTimeZoneOverridesCalendar();
        java.lang.String str45 = fastDateFormat38.toString();
        boolean boolean46 = fastDateFormat38.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone47 = fastDateFormat38.getTimeZone();
        java.util.Locale locale53 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat54 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale53);
        java.util.TimeZone timeZone55 = fastDateFormat54.getTimeZone();
        java.util.Locale locale56 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone55, locale56);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat58 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale59 = fastDateFormat58.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone55, locale59);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone55);
        java.util.Locale locale62 = fastDateFormat61.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone47, locale62);
        java.lang.Class<?> wildcardClass64 = fastDateFormat63.getClass();
        java.lang.StringBuffer stringBuffer65 = null;
        java.text.FieldPosition fieldPosition66 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer67 = fastDateFormat34.format((java.lang.Object) fastDateFormat63, stringBuffer65, fieldPosition66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown class: org.apache.commons.lang3.time.FastDateFormat");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertNull(stringBuffer28);
        org.junit.Assert.assertNull(stringBuffer31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(stringBuffer43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "FastDateFormat[]" + "'", str45, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(fastDateFormat58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone7, locale8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale11 = fastDateFormat10.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone7, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone7);
        java.lang.String str14 = fastDateFormat13.toString();
        java.lang.String str15 = fastDateFormat13.getPattern();
        boolean boolean16 = fastDateFormat13.getTimeZoneOverridesCalendar();
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FastDateFormat[h:mm a]" + "'", str14, "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h:mm a" + "'", str15, "h:mm a");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 20");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar5 = null;
        java.lang.String str6 = fastDateFormat4.format(calendar5);
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.StringBuffer stringBuffer9 = fastDateFormat4.format((long) 'a', stringBuffer8);
        boolean boolean10 = fastDateFormat4.getTimeZoneOverridesCalendar();
        java.lang.String str11 = fastDateFormat4.toString();
        boolean boolean12 = fastDateFormat4.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone13 = fastDateFormat4.getTimeZone();
        boolean boolean14 = fastDateFormat4.getTimeZoneOverridesCalendar();
        java.util.TimeZone timeZone15 = fastDateFormat4.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getInstance("MMM d, yyyy", timeZone15);
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale25);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone27, locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone27, locale31);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar37 = null;
        java.lang.String str38 = fastDateFormat36.format(calendar37);
        java.lang.String str39 = fastDateFormat36.toString();
        java.lang.StringBuffer stringBuffer41 = null;
        java.lang.StringBuffer stringBuffer42 = fastDateFormat36.format((long) (byte) 0, stringBuffer41);
        java.lang.String str44 = fastDateFormat36.format((long) (byte) 10);
        java.util.Locale locale45 = fastDateFormat36.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat46 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 0, timeZone27, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale45);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat48 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 1, (int) (short) 0, timeZone15, locale45);
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(stringBuffer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FastDateFormat[]" + "'", str11, "FastDateFormat[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat32);
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "FastDateFormat[]" + "'", str39, "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat46);
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat48);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.util.Locale locale6 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale6);
        java.util.TimeZone timeZone8 = fastDateFormat7.getTimeZone();
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone8, locale9);
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone8, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone8);
        java.util.Locale locale20 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale20);
        java.util.TimeZone timeZone22 = fastDateFormat21.getTimeZone();
        java.util.Locale locale23 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone22, locale23);
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone22, locale25);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str31 = fastDateFormat29.format(0L);
        java.util.Locale locale32 = fastDateFormat29.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone27, locale32);
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale37);
        java.util.TimeZone timeZone39 = fastDateFormat38.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat40 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale41 = fastDateFormat40.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone39, locale41);
        int int43 = fastDateFormat42.getMaxLengthEstimate();
        java.util.Locale locale44 = fastDateFormat42.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale44);
        java.util.Locale locale46 = fastDateFormat45.getLocale();
        java.lang.Object obj47 = fastDateFormat45.clone();
        java.util.Locale locale48 = fastDateFormat45.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat49 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone27, locale48);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat50 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(45, timeZone8, locale48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 45");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat14);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "12:00:00 AM" + "'", str31, "12:00:00 AM");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "FastDateFormat[h:mm a]");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat49);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.String str3 = fastDateFormat1.format(calendar2);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat1.format((long) 'a', stringBuffer5);
        int int7 = fastDateFormat1.getMaxLengthEstimate();
        boolean boolean8 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.util.Calendar calendar9 = null;
        java.lang.StringBuffer stringBuffer10 = null;
        java.lang.StringBuffer stringBuffer11 = fastDateFormat1.format(calendar9, stringBuffer10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = stringBuffer11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(stringBuffer11);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.util.Locale locale9 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale9);
        java.util.TimeZone timeZone11 = fastDateFormat10.getTimeZone();
        java.util.Locale locale12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone11, locale12);
        java.util.Locale locale14 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone11, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat18 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone11);
        java.util.TimeZone timeZone19 = fastDateFormat18.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone19);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone19);
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale28);
        java.util.TimeZone timeZone30 = fastDateFormat29.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale32 = fastDateFormat31.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat33 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone30, locale32);
        int int34 = fastDateFormat33.getMaxLengthEstimate();
        java.util.Locale locale35 = fastDateFormat33.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat36 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale35);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, 0, locale35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(10, timeZone19, locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNotNull(fastDateFormat18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat36);
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.util.Locale locale5 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale5);
        java.util.TimeZone timeZone7 = fastDateFormat6.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat8 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale9 = fastDateFormat8.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone7, locale9);
        java.util.TimeZone timeZone12 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone12);
        boolean boolean15 = fastDateFormat13.equals((java.lang.Object) "FastDateFormat[]");
        boolean boolean16 = fastDateFormat13.getTimeZoneOverridesCalendar();
        java.lang.Object obj17 = fastDateFormat13.clone();
        boolean boolean18 = fastDateFormat10.equals((java.lang.Object) fastDateFormat13);
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale25);
        java.util.TimeZone timeZone27 = fastDateFormat26.getTimeZone();
        java.util.Locale locale28 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone27, locale28);
        java.util.Locale locale34 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale34);
        java.util.TimeZone timeZone36 = fastDateFormat35.getTimeZone();
        java.util.Locale locale37 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone36, locale37);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale40 = fastDateFormat39.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat41 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone36, locale40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat42 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone27, locale40);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat43 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone27);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat45 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone27);
        boolean boolean46 = fastDateFormat10.equals((java.lang.Object) timeZone27);
        java.util.Locale locale55 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale55);
        java.util.TimeZone timeZone57 = fastDateFormat56.getTimeZone();
        java.util.Locale locale58 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone57, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale61 = fastDateFormat60.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone57, locale61);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat63 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone57);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale66 = fastDateFormat65.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat67 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm:ss a z", timeZone57, locale66);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", locale66);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat69 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 1, timeZone27, locale66);
        java.util.Locale locale74 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat75 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale74);
        java.util.TimeZone timeZone76 = fastDateFormat75.getTimeZone();
        java.util.Locale locale77 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat78 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone76, locale77);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat79 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale80 = fastDateFormat79.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat81 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone76, locale80);
        java.util.Locale locale82 = fastDateFormat81.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat83 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, timeZone27, locale82);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat84 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(0, timeZone27);
        org.junit.Assert.assertNotNull(fastDateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat10);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "FastDateFormat[h:mm:ss a z]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat41);
        org.junit.Assert.assertNotNull(fastDateFormat42);
        org.junit.Assert.assertNotNull(fastDateFormat43);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(fastDateFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(fastDateFormat63);
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat67);
        org.junit.Assert.assertNotNull(fastDateFormat68);
        org.junit.Assert.assertNotNull(fastDateFormat69);
        org.junit.Assert.assertNotNull(fastDateFormat75);
        org.junit.Assert.assertNotNull(timeZone76);
        org.junit.Assert.assertEquals(timeZone76.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat78);
        org.junit.Assert.assertNotNull(fastDateFormat79);
        org.junit.Assert.assertNotNull(locale80);
        org.junit.Assert.assertEquals(locale80.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat81);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat83);
        org.junit.Assert.assertNotNull(fastDateFormat84);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone1, locale2);
        java.lang.String str4 = fastDateFormat3.getPattern();
        java.util.Locale locale5 = fastDateFormat3.getLocale();
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h:mm:ss a z" + "'", str4, "h:mm:ss a z");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean7 = fastDateFormat5.equals((java.lang.Object) 100.0f);
        boolean boolean8 = fastDateFormat5.getTimeZoneOverridesCalendar();
        java.lang.String str10 = fastDateFormat5.format((long) (byte) 100);
        java.util.TimeZone timeZone11 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getInstance("h:mm a", timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2);
        java.lang.String str17 = fastDateFormat15.format(0L);
        java.util.Locale locale18 = fastDateFormat15.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(2, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone11, locale18);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat21 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 0, timeZone11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat24 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar25 = null;
        java.lang.StringBuffer stringBuffer26 = null;
        java.lang.StringBuffer stringBuffer27 = fastDateFormat24.format(calendar25, stringBuffer26);
        java.util.Calendar calendar28 = null;
        java.lang.StringBuffer stringBuffer29 = null;
        java.lang.StringBuffer stringBuffer30 = fastDateFormat24.format(calendar28, stringBuffer29);
        java.lang.StringBuffer stringBuffer32 = null;
        java.lang.StringBuffer stringBuffer33 = fastDateFormat24.format((long) (byte) 100, stringBuffer32);
        java.lang.String str34 = fastDateFormat24.toString();
        java.lang.Object obj35 = fastDateFormat24.clone();
        java.util.Locale locale36 = fastDateFormat24.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(3, locale36);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) -1, timeZone11, locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "12:00:00 AM" + "'", str17, "12:00:00 AM");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(fastDateFormat21);
        org.junit.Assert.assertNotNull(fastDateFormat24);
        org.junit.Assert.assertNull(stringBuffer27);
        org.junit.Assert.assertNull(stringBuffer30);
        org.junit.Assert.assertNull(stringBuffer33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "FastDateFormat[]" + "'", str34, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat37);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.util.Locale locale4 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat5 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale4);
        java.util.TimeZone timeZone6 = fastDateFormat5.getTimeZone();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat7 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale8 = fastDateFormat7.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone6, locale8);
        int int10 = fastDateFormat9.getMaxLengthEstimate();
        java.util.Locale locale11 = fastDateFormat9.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, locale11);
        java.util.TimeZone timeZone13 = fastDateFormat12.getTimeZone();
        java.util.TimeZone timeZone15 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat17 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone15, locale16);
        java.util.Calendar calendar18 = null;
        java.lang.StringBuffer stringBuffer19 = null;
        java.lang.StringBuffer stringBuffer20 = fastDateFormat17.format(calendar18, stringBuffer19);
        java.lang.StringBuffer stringBuffer22 = null;
        java.lang.StringBuffer stringBuffer23 = fastDateFormat17.format(10L, stringBuffer22);
        java.util.Locale locale24 = fastDateFormat17.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat25 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (byte) 1, timeZone13, locale24);
        java.lang.String str26 = fastDateFormat25.getPattern();
        int int27 = fastDateFormat25.getMaxLengthEstimate();
        java.lang.Object obj28 = fastDateFormat25.clone();
        java.lang.String str30 = fastDateFormat25.format((long) (short) 0);
        org.junit.Assert.assertNotNull(fastDateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat17);
        org.junit.Assert.assertNull(stringBuffer20);
        org.junit.Assert.assertNull(stringBuffer23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "MMMM d, yyyy" + "'", str26, "MMMM d, yyyy");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "FastDateFormat[MMMM d, yyyy]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "January 1, 1970" + "'", str30, "January 1, 1970");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat3 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        boolean boolean5 = fastDateFormat3.equals((java.lang.Object) 100.0f);
        boolean boolean6 = fastDateFormat3.getTimeZoneOverridesCalendar();
        java.util.Locale locale7 = fastDateFormat3.getLocale();
        java.util.Locale locale8 = fastDateFormat3.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale8);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat10 = org.apache.commons.lang3.time.FastDateFormat.getInstance("1/1/70", locale8);
        org.junit.Assert.assertNotNull(fastDateFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(fastDateFormat10);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat1 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar2 = null;
        java.lang.String str3 = fastDateFormat1.format(calendar2);
        java.lang.StringBuffer stringBuffer5 = null;
        java.lang.StringBuffer stringBuffer6 = fastDateFormat1.format((long) 'a', stringBuffer5);
        boolean boolean7 = fastDateFormat1.getTimeZoneOverridesCalendar();
        java.lang.String str8 = fastDateFormat1.toString();
        java.lang.Object obj9 = fastDateFormat1.clone();
        java.lang.StringBuffer stringBuffer11 = null;
        java.lang.StringBuffer stringBuffer12 = fastDateFormat1.format(0L, stringBuffer11);
        org.junit.Assert.assertNotNull(fastDateFormat1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(stringBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FastDateFormat[]" + "'", str8, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "FastDateFormat[]");
        org.junit.Assert.assertNull(stringBuffer12);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat4 = org.apache.commons.lang3.time.FastDateFormat.getInstance("");
        java.util.Calendar calendar5 = null;
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.StringBuffer stringBuffer7 = fastDateFormat4.format(calendar5, stringBuffer6);
        java.util.Calendar calendar8 = null;
        java.lang.StringBuffer stringBuffer9 = null;
        java.lang.StringBuffer stringBuffer10 = fastDateFormat4.format(calendar8, stringBuffer9);
        java.lang.String str11 = fastDateFormat4.toString();
        java.lang.Object obj12 = fastDateFormat4.clone();
        java.lang.Object obj13 = fastDateFormat4.clone();
        java.lang.String str15 = fastDateFormat4.format(10L);
        int int16 = fastDateFormat4.getMaxLengthEstimate();
        java.util.Locale locale18 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(2, locale18);
        java.util.TimeZone timeZone20 = fastDateFormat19.getTimeZone();
        boolean boolean21 = fastDateFormat4.equals((java.lang.Object) timeZone20);
        java.util.TimeZone timeZone24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat26 = org.apache.commons.lang3.time.FastDateFormat.getInstance("", timeZone24, locale25);
        int int27 = fastDateFormat26.getMaxLengthEstimate();
        java.util.Locale locale28 = fastDateFormat26.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat29 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, locale28);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat30 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(1, 0, timeZone20, locale28);
        java.util.Locale locale31 = fastDateFormat30.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDateFormat fastDateFormat32 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(21, locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 21");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat4);
        org.junit.Assert.assertNull(stringBuffer7);
        org.junit.Assert.assertNull(stringBuffer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "FastDateFormat[]" + "'", str11, "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "FastDateFormat[]");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "FastDateFormat[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "FastDateFormat[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(fastDateFormat19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(fastDateFormat26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat29);
        org.junit.Assert.assertNotNull(fastDateFormat30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.util.Locale locale8 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat9 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale8);
        java.util.TimeZone timeZone10 = fastDateFormat9.getTimeZone();
        java.util.Locale locale11 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone10, locale11);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat13 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale14 = fastDateFormat13.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone10, locale14);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat16 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone10);
        java.util.Locale locale19 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat20 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale19);
        java.util.TimeZone timeZone21 = fastDateFormat20.getTimeZone();
        java.util.Locale locale30 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat31 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale30);
        java.util.TimeZone timeZone32 = fastDateFormat31.getTimeZone();
        java.util.Locale locale33 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat34 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone32, locale33);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat35 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale36 = fastDateFormat35.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat37 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone32, locale36);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat38 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone32);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat39 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((int) (short) 0, timeZone32);
        java.util.Locale locale43 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat44 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale43);
        java.util.TimeZone timeZone45 = fastDateFormat44.getTimeZone();
        java.util.Locale locale46 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat47 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone45, locale46);
        java.util.Locale locale52 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat53 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, locale52);
        java.util.TimeZone timeZone54 = fastDateFormat53.getTimeZone();
        java.util.Locale locale55 = null;
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat56 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance(0, timeZone54, locale55);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat57 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale58 = fastDateFormat57.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat59 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((int) (short) 0, 3, timeZone54, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat60 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (short) 1, timeZone45, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat61 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance(3, timeZone32, locale58);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat62 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
        java.util.Locale locale63 = fastDateFormat62.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat64 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone32, locale63);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat65 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 0, timeZone21, locale63);
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat66 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((int) (byte) 1, timeZone10, locale63);
        java.util.Locale locale67 = fastDateFormat66.getLocale();
        org.apache.commons.lang3.time.FastDateFormat fastDateFormat68 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance(3, (int) (short) 1, locale67);
        java.lang.StringBuffer stringBuffer70 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer71 = fastDateFormat68.format((long) (byte) 0, stringBuffer70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fastDateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat12);
        org.junit.Assert.assertNotNull(fastDateFormat13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat15);
        org.junit.Assert.assertNotNull(fastDateFormat16);
        org.junit.Assert.assertNotNull(fastDateFormat20);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat31);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat34);
        org.junit.Assert.assertNotNull(fastDateFormat35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat37);
        org.junit.Assert.assertNotNull(fastDateFormat38);
        org.junit.Assert.assertNotNull(fastDateFormat39);
        org.junit.Assert.assertNotNull(fastDateFormat44);
        org.junit.Assert.assertNotNull(timeZone45);
        org.junit.Assert.assertEquals(timeZone45.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat47);
        org.junit.Assert.assertNotNull(fastDateFormat53);
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(fastDateFormat56);
        org.junit.Assert.assertNotNull(fastDateFormat57);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat59);
        org.junit.Assert.assertNotNull(fastDateFormat60);
        org.junit.Assert.assertNotNull(fastDateFormat61);
        org.junit.Assert.assertNotNull(fastDateFormat62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat64);
        org.junit.Assert.assertNotNull(fastDateFormat65);
        org.junit.Assert.assertNotNull(fastDateFormat66);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "en_US");
        org.junit.Assert.assertNotNull(fastDateFormat68);
    }
}

