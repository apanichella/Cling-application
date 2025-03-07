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
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) (short) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder6.appendTimeZoneName(strMap13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendLiteral("");
        boolean boolean19 = dateTimeFormatterBuilder16.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder16.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendLiteral("hi!");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder22.appendDayOfYear(10);
        org.joda.time.format.DateTimeParser dateTimeParser27 = dateTimeFormatterBuilder22.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder15.append(dateTimeParser27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder15.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder29.appendFractionOfMinute((int) '#', 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder32.appendMinuteOfDay((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatterBuilder32.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder32.appendYearOfCentury((int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeParser27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) (short) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder6.appendTimeZoneName(strMap13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendMonthOfYearShortText();
        boolean boolean16 = dateTimeFormatterBuilder14.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendHourOfHalfday((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendLiteral("");
        boolean boolean22 = dateTimeFormatterBuilder19.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder19.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder25.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = dateTimeFormatterBuilder28.toPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = dateTimeFormatterBuilder28.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendLiteral("");
        boolean boolean34 = dateTimeFormatterBuilder31.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder31.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder37.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap41 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder40.appendTimeZoneName(strMap41);
        org.joda.time.format.DateTimeParser dateTimeParser43 = dateTimeFormatterBuilder42.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder18.append(dateTimePrinter30, dateTimeParser43);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder44.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder44.appendMonthOfYear((int) (short) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap48 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder44.appendTimeZoneName(strMap48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimePrinter29);
        org.junit.Assert.assertNotNull(dateTimePrinter30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeParser43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder49);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap10 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendTimeZoneName(strMap10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatterBuilder12.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder12.appendTwoDigitYear((int) (short) 1, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder12.appendTwoDigitYear((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendLiteral("");
        boolean boolean22 = dateTimeFormatterBuilder19.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder19.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder25.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder25.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder25.appendMinuteOfHour((int) (short) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap32 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder25.appendTimeZoneName(strMap32);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder33.appendMonthOfYearShortText();
        boolean boolean35 = dateTimeFormatterBuilder33.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder33.appendDayOfYear((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder37.appendDayOfYear(1);
        org.joda.time.format.DateTimePrinter dateTimePrinter40 = dateTimeFormatterBuilder39.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder12.append(dateTimePrinter40);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap42 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder41.appendTimeZoneShortName(strMap42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimePrinter40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYearOfEra(10, 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = dateTimeFormatterBuilder9.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder9.appendDayOfWeek((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendLiteral("");
        boolean boolean19 = dateTimeFormatterBuilder16.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder16.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendLiteral("hi!");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatterBuilder22.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder15.append(dateTimeFormatter25);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder26.appendYearOfEra((int) '#', (int) (short) 10);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap30 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendTimeZoneShortName(strMap30);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendMinuteOfHour((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimePrinter13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder6.appendEraText();
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap14 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder6.appendTimeZoneShortName(strMap14);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder15.appendDayOfMonth((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder15.appendDayOfMonth((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendHourOfHalfday((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder21.appendTwoDigitYear(10, true);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder21.appendText(dateTimeFieldType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap10 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendTimeZoneName(strMap10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendTimeZoneShortName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendLiteral("hi!");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap15 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder9.appendTimeZoneName(strMap15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder9.appendMinuteOfHour((int) (byte) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder9.appendDayOfYear(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder9.appendTwoDigitWeekyear((int) (short) 1, false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendDayOfWeek((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendLiteral("");
        boolean boolean16 = dateTimeFormatterBuilder13.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder22.appendYearOfEra(10, 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatterBuilder22.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendLiteral("");
        boolean boolean30 = dateTimeFormatterBuilder27.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder27.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder33.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap37 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendTimeZoneName(strMap37);
        org.joda.time.format.DateTimeParser dateTimeParser39 = dateTimeFormatterBuilder38.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder12.append(dateTimePrinter26, dateTimeParser39);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder40.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder42.appendLiteral("");
        boolean boolean45 = dateTimeFormatterBuilder42.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder42.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder48.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap52 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder51.appendTimeZoneName(strMap52);
        org.joda.time.format.DateTimeParser dateTimeParser54 = dateTimeFormatterBuilder53.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder40.append(dateTimeParser54);
        org.joda.time.format.DateTimeParser dateTimeParser56 = dateTimeFormatterBuilder55.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder55.appendYearOfEra((int) '4', (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder60.appendTwoDigitWeekyear(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder62.appendTwoDigitYear((int) (short) -1, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder67 = dateTimeFormatterBuilder65.appendPattern("");
        org.joda.time.format.DateTimeParser dateTimeParser68 = dateTimeFormatterBuilder65.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = dateTimeFormatterBuilder55.appendOptional(dateTimeParser68);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder55.appendWeekOfWeekyear(10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimePrinter26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeParser39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeParser54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeParser56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder67);
        org.junit.Assert.assertNotNull(dateTimeParser68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder69);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder71);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) (short) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder6.appendTimeZoneName(strMap13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendLiteral("");
        boolean boolean19 = dateTimeFormatterBuilder16.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder16.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder22.appendLiteral("hi!");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder22.appendDayOfYear(10);
        org.joda.time.format.DateTimeParser dateTimeParser27 = dateTimeFormatterBuilder22.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder15.append(dateTimeParser27);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder15.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendTwoDigitYear((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder31.appendClockhourOfHalfday((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder31.appendYear((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeParser27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendDayOfWeek((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendLiteral("");
        boolean boolean16 = dateTimeFormatterBuilder13.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder22.appendYearOfEra(10, 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatterBuilder22.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendLiteral("");
        boolean boolean30 = dateTimeFormatterBuilder27.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder27.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder33.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap37 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendTimeZoneName(strMap37);
        org.joda.time.format.DateTimeParser dateTimeParser39 = dateTimeFormatterBuilder38.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder12.append(dateTimePrinter26, dateTimeParser39);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder40.appendFractionOfHour((int) (byte) 0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendWeekOfWeekyear((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder43.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder43.appendDayOfWeek((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder43.appendTwoDigitYear((int) (byte) 0, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder51.appendCenturyOfEra((int) (byte) 10, (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder51.appendTimeZoneOffset("hi!", false, (int) (byte) 10, (int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder51.appendDayOfMonth((int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimePrinter26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeParser39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder13.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder13.appendDayOfYear(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendTwoDigitWeekyear((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendSecondOfDay((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder18.appendDayOfMonth((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder18.appendFractionOfDay(1, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder18.appendTwoDigitYear((int) (short) 0, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder30.appendLiteral(' ');
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap10 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendTimeZoneName(strMap10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder9.appendClockhourOfHalfday((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendWeekOfWeekyear((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder13.appendPattern("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendLiteral("");
        boolean boolean21 = dateTimeFormatterBuilder18.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder18.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder24.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder24.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder24.appendMinuteOfHour((int) (short) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap31 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder24.appendTimeZoneName(strMap31);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder32.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder32.appendFractionOfDay((int) '4', (int) (short) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendSecondOfDay((int) (short) 1);
        org.joda.time.format.DateTimeParser dateTimeParser39 = dateTimeFormatterBuilder38.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder13.appendOptional(dateTimeParser39);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder40.appendSecondOfMinute((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder40.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder40.appendDayOfYear(0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder40.appendSecondOfDay((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeParser39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder6.appendCenturyOfEra((int) '4', 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder6.appendFractionOfDay((int) (short) 100, 0);
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatterBuilder18.toParser();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeParser19);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendWeekyear((int) (byte) 10, (int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder6.appendTwoDigitYear((int) (short) 0, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendLiteral("");
        boolean boolean19 = dateTimeFormatterBuilder16.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder16.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder22.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap26 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = dateTimeFormatterBuilder25.appendTimeZoneName(strMap26);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatterBuilder27.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder6.append(dateTimeParser28);
        boolean boolean30 = dateTimeFormatterBuilder6.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder6.appendDayOfWeek((int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder32.appendDayOfWeek((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder34.appendTimeZoneOffset("", true, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder27);
        org.junit.Assert.assertNotNull(dateTimeParser28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap10 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendTimeZoneName(strMap10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatterBuilder12.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendTwoDigitYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder12.appendFractionOfMinute((int) (short) 100, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendDayOfWeek((int) 'a');
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap10 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder6.appendTimeZoneShortName(strMap10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder6.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder6.appendSecondOfDay(1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder6.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendWeekOfWeekyear((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder18.appendFractionOfDay((int) (byte) 10, (int) (byte) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder21.appendTwoDigitWeekyear((int) (short) 0, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder24.appendDayOfWeekText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) (short) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder6.appendTimeZoneName(strMap13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder14.appendMonthOfYearShortText();
        boolean boolean16 = dateTimeFormatterBuilder14.canBuildPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder14.appendHourOfHalfday((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder18.appendLiteral('#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder20.appendTimeZoneOffset("", "", false, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendWeekyear((int) (byte) 10, (int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder12.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendWeekOfWeekyear((int) (byte) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder16.appendMillisOfSecond((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder16.appendYearOfEra((int) ' ', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder16.appendFractionOfMinute(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder8 = dateTimeFormatterBuilder6.appendLiteral("hi!");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendDayOfYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder10.appendHourOfHalfday(100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatterBuilder12.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder12.appendYearOfEra(0, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder16.appendHourOfHalfday((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder18.appendSignedDecimal(dateTimeFieldType19, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder8);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendDayOfWeek((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendLiteral("");
        boolean boolean16 = dateTimeFormatterBuilder13.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder22.appendYearOfEra(10, 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatterBuilder22.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendLiteral("");
        boolean boolean30 = dateTimeFormatterBuilder27.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder27.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder33.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap37 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendTimeZoneName(strMap37);
        org.joda.time.format.DateTimeParser dateTimeParser39 = dateTimeFormatterBuilder38.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder12.append(dateTimePrinter26, dateTimeParser39);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder40.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder40.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder40.appendWeekyear((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimePrinter26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeParser39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendWeekyear((int) (byte) 10, (int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder6.appendTwoDigitYear((int) (short) 0, true);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder6.appendHalfdayOfDayText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder16.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder16.appendTwoDigitYear(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder19.appendMonthOfYearText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder16);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendDayOfWeek((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendLiteral("");
        boolean boolean16 = dateTimeFormatterBuilder13.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder22.appendYearOfEra(10, 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatterBuilder22.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendLiteral("");
        boolean boolean30 = dateTimeFormatterBuilder27.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder27.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder33.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap37 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendTimeZoneName(strMap37);
        org.joda.time.format.DateTimeParser dateTimeParser39 = dateTimeFormatterBuilder38.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder12.append(dateTimePrinter26, dateTimeParser39);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder40.appendFractionOfHour((int) (byte) 0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendWeekOfWeekyear((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder43.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder43.appendDayOfWeek((int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder48.appendFractionOfHour(1, (int) ' ');
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap52 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder48.appendTimeZoneName(strMap52);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder56 = dateTimeFormatterBuilder53.appendFractionOfHour(100, (int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder53.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder58 = dateTimeFormatterBuilder53.appendDayOfWeekText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder53.appendTimeZoneName();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimePrinter26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeParser39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder56);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendDayOfWeek(10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder12.appendFractionOfSecond(10, (int) (byte) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder15.appendFractionOfDay((int) (byte) 10, 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder19.appendLiteral("");
        boolean boolean22 = dateTimeFormatterBuilder19.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder19.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder25.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder25.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder25.appendMinuteOfHour((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder31.appendCenturyOfEra(0, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendLiteral("");
        boolean boolean38 = dateTimeFormatterBuilder35.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder35.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder41.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimePrinter dateTimePrinter45 = dateTimeFormatterBuilder44.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder46.appendLiteral("");
        boolean boolean49 = dateTimeFormatterBuilder46.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder46.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder52.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap56 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder55.appendTimeZoneName(strMap56);
        org.joda.time.format.DateTimeParser dateTimeParser58 = dateTimeFormatterBuilder57.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder34.append(dateTimePrinter45, dateTimeParser58);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder60 = dateTimeFormatterBuilder18.append(dateTimePrinter45);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder60.appendFractionOfSecond((int) (short) 0, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder66 = dateTimeFormatterBuilder60.appendYear((int) (short) 100, 0);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder41);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimePrinter45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertNotNull(dateTimeParser58);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder60);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder66);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendDayOfWeek((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendLiteral("");
        boolean boolean16 = dateTimeFormatterBuilder13.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder22.appendYearOfEra(10, 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatterBuilder22.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendLiteral("");
        boolean boolean30 = dateTimeFormatterBuilder27.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder27.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder33.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap37 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendTimeZoneName(strMap37);
        org.joda.time.format.DateTimeParser dateTimeParser39 = dateTimeFormatterBuilder38.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder12.append(dateTimePrinter26, dateTimeParser39);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder40.appendFractionOfHour((int) (byte) 0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendWeekOfWeekyear((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder43.appendMonthOfYearText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder46.appendMillisOfSecond((int) (byte) 10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder50 = dateTimeFormatterBuilder46.appendMinuteOfDay(100);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimePrinter26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeParser39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder50);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendMinuteOfHour((int) (short) 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder6.appendCenturyOfEra((int) '4', 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder18 = dateTimeFormatterBuilder6.appendFractionOfDay((int) (short) 100, 0);
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatterBuilder6.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = dateTimeFormatterBuilder6.appendTimeZoneId();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder6.appendYearOfCentury((int) (byte) 10, (int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder24 = dateTimeFormatterBuilder6.appendMonthOfYearText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder6.appendDayOfYear((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder18);
        org.junit.Assert.assertNotNull(dateTimeParser19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder20);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder23);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder24);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder10 = dateTimeFormatterBuilder6.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder6.appendDayOfWeek((int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendLiteral("");
        boolean boolean16 = dateTimeFormatterBuilder13.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder22.appendYearOfEra(10, 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatterBuilder22.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder27 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder27.appendLiteral("");
        boolean boolean30 = dateTimeFormatterBuilder27.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder33 = dateTimeFormatterBuilder27.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = dateTimeFormatterBuilder33.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap37 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendTimeZoneName(strMap37);
        org.joda.time.format.DateTimeParser dateTimeParser39 = dateTimeFormatterBuilder38.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder12.append(dateTimePrinter26, dateTimeParser39);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder40.appendFractionOfHour((int) (byte) 0, (int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder43.appendWeekOfWeekyear((int) ' ');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder45.appendTimeZoneOffset("", "", false, (int) '#', (int) '#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder51.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = dateTimeFormatterBuilder52.appendDayOfWeekShortText();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimePrinter26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder33);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder36);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertNotNull(dateTimeParser39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder43);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder45);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder53);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder9.appendYearOfEra(10, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder12.appendHourOfDay(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder12.appendYear((int) ' ', (int) (short) 1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder17.appendMinuteOfDay((int) '4');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder20 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder20.appendLiteral("");
        boolean boolean23 = dateTimeFormatterBuilder20.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder26 = dateTimeFormatterBuilder20.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = dateTimeFormatterBuilder26.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder30 = dateTimeFormatterBuilder26.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder32 = dateTimeFormatterBuilder26.appendMinuteOfHour((int) (short) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap33 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder34 = dateTimeFormatterBuilder26.appendTimeZoneName(strMap33);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder34.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder36 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder38 = dateTimeFormatterBuilder36.appendLiteral("");
        boolean boolean39 = dateTimeFormatterBuilder36.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder36.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder42.appendLiteral("hi!");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder46 = dateTimeFormatterBuilder42.appendDayOfYear(10);
        org.joda.time.format.DateTimeParser dateTimeParser47 = dateTimeFormatterBuilder42.toParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder35.append(dateTimeParser47);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder48.appendTwoDigitWeekyear(1, false);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder48.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder53 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder53.appendLiteral("");
        boolean boolean56 = dateTimeFormatterBuilder53.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = dateTimeFormatterBuilder53.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = dateTimeFormatterBuilder59.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder63 = dateTimeFormatterBuilder59.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder59.appendMinuteOfHour((int) (short) 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder65.appendCenturyOfEra(0, 100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder69.appendLiteral("");
        boolean boolean72 = dateTimeFormatterBuilder69.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder75 = dateTimeFormatterBuilder69.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder78 = dateTimeFormatterBuilder75.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder81 = dateTimeFormatterBuilder78.appendYearOfEra(10, 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter82 = dateTimeFormatterBuilder78.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder83 = dateTimeFormatterBuilder68.append(dateTimePrinter82);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder84 = dateTimeFormatterBuilder48.append(dateTimePrinter82);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder85 = dateTimeFormatterBuilder17.append(dateTimePrinter82);
        java.lang.Class<?> wildcardClass86 = dateTimePrinter82.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder14);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder17);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder29);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder30);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder32);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder34);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder46);
        org.junit.Assert.assertNotNull(dateTimeParser47);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder48);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder52);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder59);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder62);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder63);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder75);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder78);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder81);
        org.junit.Assert.assertNotNull(dateTimePrinter82);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder83);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder84);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder85);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder2 = dateTimeFormatterBuilder0.appendLiteral("");
        boolean boolean3 = dateTimeFormatterBuilder0.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder6 = dateTimeFormatterBuilder0.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder6.appendWeekyear(10, (int) (short) -1);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap10 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendTimeZoneName(strMap10);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder11.appendTimeZoneName();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder15 = dateTimeFormatterBuilder13.appendLiteral("");
        boolean boolean16 = dateTimeFormatterBuilder13.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder13.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder22 = dateTimeFormatterBuilder19.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder22.appendYearOfEra(10, 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatterBuilder22.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder28 = dateTimeFormatterBuilder22.appendDayOfWeek((int) 'a');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder29 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder29.appendLiteral("");
        boolean boolean32 = dateTimeFormatterBuilder29.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder35 = dateTimeFormatterBuilder29.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder37 = dateTimeFormatterBuilder35.appendLiteral("hi!");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatterBuilder35.toFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder28.append(dateTimeFormatter38);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder11.append(dateTimeFormatter38);
        boolean boolean41 = dateTimeFormatterBuilder40.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder40.appendMonthOfYearShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder44 = dateTimeFormatterBuilder42.appendLiteral('#');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder47 = dateTimeFormatterBuilder45.appendLiteral("");
        boolean boolean48 = dateTimeFormatterBuilder45.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder51 = dateTimeFormatterBuilder45.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder54 = dateTimeFormatterBuilder51.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder55 = dateTimeFormatterBuilder51.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder57 = dateTimeFormatterBuilder51.appendDayOfWeek((int) '#');
        boolean boolean58 = dateTimeFormatterBuilder57.canBuildParser();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder59 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder61 = dateTimeFormatterBuilder59.appendLiteral("");
        boolean boolean62 = dateTimeFormatterBuilder59.canBuildFormatter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder65 = dateTimeFormatterBuilder59.appendWeekyear(100, 0);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder68 = dateTimeFormatterBuilder65.appendWeekyear(10, (int) (short) -1);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder68.appendYearOfEra(10, 0);
        org.joda.time.format.DateTimePrinter dateTimePrinter72 = dateTimeFormatterBuilder68.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder57.append(dateTimePrinter72);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder74 = dateTimeFormatterBuilder44.append(dateTimePrinter72);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder77 = dateTimeFormatterBuilder74.appendFractionOfDay(0, (int) (byte) 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter78 = dateTimeFormatterBuilder77.toPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder80 = dateTimeFormatterBuilder77.appendDayOfYear((int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder6);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder9);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder11);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder12);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder19);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder22);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder25);
        org.junit.Assert.assertNotNull(dateTimePrinter26);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder28);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder35);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder37);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder39);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder42);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder44);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder51);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder54);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder55);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder65);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder68);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder71);
        org.junit.Assert.assertNotNull(dateTimePrinter72);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder73);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder74);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder77);
        org.junit.Assert.assertNotNull(dateTimePrinter78);
        org.junit.Assert.assertNotNull(dateTimeFormatterBuilder80);
    }
}

