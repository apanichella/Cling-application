import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    @Ignore
  public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        org.joda.time.DateTime dateTime16 = dateTime13.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime13.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime13.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        int int25 = dateTime23.getDayOfMonth();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.toDateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime23.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        org.joda.time.DateTime dateTime31 = dateTime20.toDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime9.toDateTime(dateTimeZone30);
        org.joda.time.DateTime.Property property34 = dateTime33.hourOfDay();
        java.util.Locale locale35 = null;
        java.lang.String str36 = property34.getAsText(locale35);
        org.joda.time.DateTime dateTime37 = property34.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "0" + "'", str36, "0");
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        int int14 = dateTime12.getDayOfMonth();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime12.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime9.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        org.joda.time.DateTime dateTime25 = dateTime22.plusHours((int) (short) 0);
        org.joda.time.Instant instant26 = dateTime22.toInstant();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, chronology28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.toDateTime(chronology30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime34 = dateTime29.withDurationAdded(readableDuration32, 100);
        org.joda.time.DateTime.Property property35 = dateTime34.dayOfYear();
        org.joda.time.DateTime dateTime36 = property35.roundCeilingCopy();
        boolean boolean37 = instant26.isBefore((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 1, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.minus(readableDuration8);
        int int10 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime6.withPeriodAdded(readablePeriod11, 1439);
        org.joda.time.Chronology chronology14 = dateTime6.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) ' ', chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.year();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField18 = property16.getField();
        org.joda.time.DateTime dateTime20 = property16.addToCopy((-1));
        org.joda.time.DateTime.Property property21 = dateTime20.millisOfSecond();
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    @Ignore
  public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime.Property property8 = dateTime5.era();
        org.joda.time.DateTime.Property property9 = dateTime5.minuteOfHour();
        org.joda.time.DateTime dateTime11 = dateTime5.plusDays(36);
        java.lang.String str12 = dateTime5.toString();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.minuteOfDay();
        java.lang.String str17 = property16.getAsText();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTime();
        int int22 = dateTime20.getDayOfMonth();
        long long23 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime24 = property16.withMinimumValue();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.toDateTime(chronology28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.withDurationAdded(readableDuration30, 100);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.withZone(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime35 = dateTime34.toLocalDateTime();
        org.joda.time.DateTime dateTime36 = dateTime24.withFields((org.joda.time.ReadablePartial) localDateTime35);
        int int37 = dateTime24.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime39 = dateTime24.withYear(4);
        org.joda.time.DateTime dateTime41 = dateTime24.withMillis((long) (byte) 10);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 1, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.toDateTime(chronology45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime49 = dateTime44.withDurationAdded(readableDuration47, 100);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = dateTime49.withZone(dateTimeZone50);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.DateTime dateTime53 = dateTime49.plus(readableDuration52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (byte) 1, chronology55);
        org.joda.time.DateTime.Property property57 = dateTime56.minuteOfDay();
        java.lang.String str58 = property57.getAsText();
        org.joda.time.DateTime dateTime59 = property57.roundHalfEvenCopy();
        int int60 = dateTime53.compareTo((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (byte) 1, chronology62);
        org.joda.time.MutableDateTime mutableDateTime64 = dateTime63.toMutableDateTime();
        int int65 = dateTime63.getDayOfMonth();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = dateTime63.toDateTime(chronology66);
        org.joda.time.DateTime dateTime69 = dateTime63.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone70 = dateTime69.getZone();
        org.joda.time.DateTime dateTime71 = dateTime59.toDateTime(dateTimeZone70);
        org.joda.time.DateTime dateTime72 = dateTime24.withZone(dateTimeZone70);
        org.joda.time.DateTime dateTime73 = dateTime72.toDateTimeISO();
        org.joda.time.DateTime dateTime74 = dateTime72.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime76 = dateTime74.withSecondOfMinute(10);
        boolean boolean77 = dateTime5.isBefore((org.joda.time.ReadableInstant) dateTime74);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str12, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "0" + "'", str58, "0");
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        boolean boolean9 = property8.isLeap();
        org.joda.time.DateTime dateTime11 = property8.addToCopy(365);
        int int12 = property8.getMaximumValueOverall();
        org.joda.time.Interval interval13 = property8.toInterval();
        org.joda.time.DurationField durationField14 = property8.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 366 + "'", int12 == 366);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNull(durationField14);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        boolean boolean5 = dateTime2.isEqual((long) (short) -1);
        org.joda.time.DateTime dateTime7 = dateTime2.minusYears(4319);
        int int8 = dateTime7.getYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2349) + "'", int8 == (-2349));
    }

    @Test
    @Ignore
  public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy(100);
        int int11 = dateTime10.getMillisOfSecond();
        java.util.Date date12 = dateTime10.toDate();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, 59);
        org.joda.time.DateTime.Property property16 = dateTime10.year();
        boolean boolean18 = dateTime10.isEqual((long) (byte) 0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Apr 11 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    @Ignore
  public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime9.minusHours(14400);
        int int14 = dateTime13.getWeekOfWeekyear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.minuteOfDay();
        java.lang.String str19 = property18.getAsText();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        int int24 = dateTime22.getDayOfMonth();
        long long25 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime26 = property18.withMinimumValue();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, chronology28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.toDateTime(chronology30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime34 = dateTime29.withDurationAdded(readableDuration32, 100);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.withZone(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime37 = dateTime36.toLocalDateTime();
        org.joda.time.DateTime dateTime38 = dateTime26.withFields((org.joda.time.ReadablePartial) localDateTime37);
        int int39 = dateTime26.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime41 = dateTime26.withYear(4);
        org.joda.time.DateTime dateTime43 = dateTime26.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.withPeriodAdded(readablePeriod44, (int) (byte) 0);
        java.util.GregorianCalendar gregorianCalendar47 = dateTime46.toGregorianCalendar();
        org.joda.time.DateTime.Property property48 = dateTime46.weekOfWeekyear();
        org.joda.time.DateTime dateTime49 = dateTime46.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (byte) 1, chronology51);
        org.joda.time.DateTime.Property property53 = dateTime52.minuteOfDay();
        java.lang.String str54 = property53.getAsText();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (byte) 1, chronology56);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime57.toMutableDateTime();
        int int59 = dateTime57.getDayOfMonth();
        long long60 = property53.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime61 = property53.withMinimumValue();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (byte) 1, chronology63);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = dateTime64.toDateTime(chronology65);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.DateTime dateTime69 = dateTime64.withDurationAdded(readableDuration67, 100);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = dateTime69.withZone(dateTimeZone70);
        org.joda.time.LocalDateTime localDateTime72 = dateTime71.toLocalDateTime();
        org.joda.time.DateTime dateTime73 = dateTime61.withFields((org.joda.time.ReadablePartial) localDateTime72);
        int int74 = dateTime61.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime76 = dateTime61.withYear(4);
        org.joda.time.DateTime dateTime78 = dateTime61.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod79 = null;
        org.joda.time.DateTime dateTime81 = dateTime78.withPeriodAdded(readablePeriod79, (int) (byte) 0);
        org.joda.time.DateTime dateTime83 = dateTime81.plusYears((int) (byte) 0);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime((long) (byte) 1, chronology85);
        org.joda.time.DateTime dateTime87 = dateTime86.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology88 = dateTime86.getChronology();
        org.joda.time.DateTime dateTime89 = org.joda.time.DateTime.now(chronology88);
        org.joda.time.MutableDateTime mutableDateTime90 = dateTime83.toMutableDateTime(chronology88);
        org.joda.time.DateTime dateTime91 = dateTime46.withChronology(chronology88);
        org.joda.time.DateTime dateTime92 = org.joda.time.DateTime.now(chronology88);
        boolean boolean93 = dateTime13.isEqual((org.joda.time.ReadableInstant) dateTime92);
        int int94 = dateTime13.getHourOfDay();
        java.util.GregorianCalendar gregorianCalendar95 = dateTime13.toGregorianCalendar();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(gregorianCalendar47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "0" + "'", str54, "0");
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(localDateTime72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime81);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertNotNull(dateTime89);
        org.junit.Assert.assertNotNull(mutableDateTime90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(gregorianCalendar95);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.plusYears(70);
        org.joda.time.DateTime.Property property13 = dateTime9.era();
        org.joda.time.DateTime.Property property14 = dateTime9.year();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    @Ignore
  public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime6 = dateTime3.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime3.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime12 = dateTime3.plusMonths((int) (short) 0);
        int int13 = dateTime12.getCenturyOfEra();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfDay();
        java.lang.String str18 = property17.getAsText();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        int int23 = dateTime21.getDayOfMonth();
        long long24 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime25 = property17.withMinimumValue();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.toDateTime(chronology29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime33 = dateTime28.withDurationAdded(readableDuration31, 100);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.withZone(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime36 = dateTime35.toLocalDateTime();
        org.joda.time.DateTime dateTime37 = dateTime25.withFields((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 1, chronology39);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime40.toMutableDateTime();
        org.joda.time.DateTime dateTime43 = dateTime40.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime40.toMutableDateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime40.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (byte) 1, chronology49);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime50.toMutableDateTime();
        int int52 = dateTime50.getDayOfMonth();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = dateTime50.toDateTime(chronology53);
        org.joda.time.DateTime dateTime56 = dateTime50.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone57 = dateTime56.getZone();
        org.joda.time.DateTime dateTime58 = dateTime47.toDateTime(dateTimeZone57);
        org.joda.time.DateTime dateTime59 = dateTime37.withZone(dateTimeZone57);
        boolean boolean60 = dateTime12.equals((java.lang.Object) dateTime59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        org.joda.time.DateTime dateTime62 = dateTime59.plus(readablePeriod61);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (byte) 1, chronology64);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = dateTime65.toDateTime(chronology66);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.DateTime dateTime70 = dateTime65.withDurationAdded(readableDuration68, 100);
        org.joda.time.DateTime dateTime73 = dateTime70.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime dateTime74 = dateTime70.withLaterOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.DateTime dateTime76 = dateTime70.minus(readableDuration75);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) (byte) 1, chronology78);
        org.joda.time.DateTime dateTime80 = dateTime79.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology81 = dateTime79.getChronology();
        org.joda.time.DateTime dateTime82 = dateTime70.toDateTime(chronology81);
        org.joda.time.DateTime dateTime83 = dateTime59.toDateTime(chronology81);
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((long) 330, chronology81);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0" + "'", str18, "0");
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTime83);
    }

    @Test
    @Ignore
  public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZone(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.plus(readableDuration20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        java.lang.String str26 = property25.getAsText();
        org.joda.time.DateTime dateTime27 = property25.roundHalfEvenCopy();
        int int28 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        org.joda.time.DateTime dateTime34 = dateTime31.withMillisOfSecond((int) '#');
        boolean boolean35 = dateTime21.equals((java.lang.Object) dateTime34);
        boolean boolean36 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime38 = dateTime34.minusMonths((int) '4');
        boolean boolean40 = dateTime34.isBefore((long) 862);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    @Ignore
  public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.minus(readableDuration5);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime6.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime8 = dateTime6.toLocalDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        int int13 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime11.withYearOfEra(1);
        org.joda.time.DateTime dateTime18 = dateTime11.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime20 = dateTime18.minusYears(4);
        boolean boolean21 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime.Property property22 = dateTime18.hourOfDay();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.toDateTime(chronology27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withDurationAdded(readableDuration29, 100);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withZone(dateTimeZone32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.plus(readableDuration34);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (byte) 1, chronology37);
        org.joda.time.DateTime.Property property39 = dateTime38.minuteOfDay();
        java.lang.String str40 = property39.getAsText();
        org.joda.time.DateTime dateTime41 = property39.roundHalfEvenCopy();
        int int42 = dateTime35.compareTo((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (byte) 1, chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime45.toMutableDateTime();
        int int47 = dateTime45.getDayOfMonth();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = dateTime45.toDateTime(chronology48);
        org.joda.time.DateTime dateTime51 = dateTime45.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTime51.getZone();
        org.joda.time.DateTime dateTime53 = dateTime41.toDateTime(dateTimeZone52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) 9401802, dateTimeZone52);
        org.joda.time.DateTime dateTime56 = dateTime18.withZone(dateTimeZone52);
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(dateTimeZone52);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (byte) 0, dateTimeZone52);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
    }

    @Test
    @Ignore
  public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.DurationField durationField7 = property3.getRangeDurationField();
        long long8 = property3.remainder();
        org.joda.time.DateTime dateTime9 = property3.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) 366);
        int int12 = dateTime11.getSecondOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime2.plusMinutes((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        org.joda.time.DateTime dateTime11 = dateTime10.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    @Ignore
  public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZone(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.plus(readableDuration20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        java.lang.String str26 = property25.getAsText();
        org.joda.time.DateTime dateTime27 = property25.roundHalfEvenCopy();
        int int28 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        org.joda.time.DateTime dateTime34 = dateTime31.withMillisOfSecond((int) '#');
        boolean boolean35 = dateTime21.equals((java.lang.Object) dateTime34);
        boolean boolean36 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime38 = dateTime34.minus((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant39 = null;
        boolean boolean40 = dateTime38.isEqual(readableInstant39);
        org.joda.time.DateTime dateTime42 = dateTime38.plusMillis(3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTime42);
    }

    @Test
    @Ignore
  public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime8 = dateTime2.plusMonths((int) (short) 0);
        java.util.Date date9 = dateTime8.toDate();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    @Ignore
  public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        java.lang.String str11 = property10.getAsText();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        int int16 = dateTime14.getDayOfMonth();
        long long17 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime18 = property10.withMinimumValue();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.toDateTime(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded(readableDuration24, 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withZone(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = dateTime28.toLocalDateTime();
        org.joda.time.DateTime dateTime30 = dateTime18.withFields((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        org.joda.time.DateTime dateTime36 = dateTime33.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime33.toMutableDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime33.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 1, chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime43.toMutableDateTime();
        int int45 = dateTime43.getDayOfMonth();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = dateTime43.toDateTime(chronology46);
        org.joda.time.DateTime dateTime49 = dateTime43.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime49.getZone();
        org.joda.time.DateTime dateTime51 = dateTime40.toDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime52 = dateTime30.withZone(dateTimeZone50);
        org.joda.time.DateTime dateTime54 = dateTime52.plusSeconds((int) (byte) 100);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (byte) 1, chronology56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = dateTime57.toDateTime(chronology58);
        org.joda.time.DateTime dateTime61 = dateTime57.plusMillis(1970);
        org.joda.time.DateTime.Property property62 = dateTime61.monthOfYear();
        org.joda.time.DateTime.Property property63 = dateTime61.dayOfYear();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (byte) 1, chronology65);
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime66.toMutableDateTime();
        org.joda.time.DateTime dateTime69 = dateTime66.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime66.toMutableDateTime(dateTimeZone70);
        org.joda.time.DateTime dateTime73 = dateTime66.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) (byte) 1, chronology75);
        org.joda.time.MutableDateTime mutableDateTime77 = dateTime76.toMutableDateTime();
        int int78 = dateTime76.getDayOfMonth();
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.DateTime dateTime80 = dateTime76.toDateTime(chronology79);
        org.joda.time.DateTime dateTime82 = dateTime76.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone83 = dateTime82.getZone();
        org.joda.time.DateTime dateTime84 = dateTime73.toDateTime(dateTimeZone83);
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime(dateTimeZone83);
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime(dateTimeZone83);
        org.joda.time.MutableDateTime mutableDateTime87 = dateTime61.toMutableDateTime(dateTimeZone83);
        org.joda.time.DateTime dateTime88 = dateTime54.toDateTime(dateTimeZone83);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime89 = new org.joda.time.DateTime(4319, 462, 0, 59, 366, (-26771196), 86399, dateTimeZone83);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(mutableDateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(mutableDateTime77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTimeZone83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(mutableDateTime87);
        org.junit.Assert.assertNotNull(dateTime88);
    }

    @Test
    @Ignore
  public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        int int6 = property3.get();
        java.util.Locale locale7 = null;
        int int8 = property3.getMaximumTextLength(locale7);
        int int9 = property3.get();
        int int10 = property3.get();
        org.joda.time.DateTime dateTime11 = property3.withMaximumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillisOfSecond((int) '#');
        java.lang.String str18 = dateTime17.toString();
        org.joda.time.DateTime dateTime20 = dateTime17.minusDays(10);
        int int21 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property22 = dateTime20.era();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01T00:00:00.035Z" + "'", str18, "1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.withDurationAdded(readableDuration12, 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.withZone(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime17 = dateTime16.toLocalDateTime();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        org.joda.time.DateTime dateTime24 = dateTime21.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime21.toMutableDateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime21.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        int int33 = dateTime31.getDayOfMonth();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.toDateTime(chronology34);
        org.joda.time.DateTime dateTime37 = dateTime31.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime37.getZone();
        org.joda.time.DateTime dateTime39 = dateTime28.toDateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(0L, dateTimeZone38);
        org.joda.time.DateTime dateTime42 = dateTime16.withZone(dateTimeZone38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((-86400000), (-26771196), 0, (-18595), 442, 330, (int) (short) 0, dateTimeZone38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -18595 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime42);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours(100);
        org.joda.time.DateTime dateTime11 = dateTime7.minusWeeks((int) (byte) 100);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime11.minusHours((-51864435));
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    @Ignore
  public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plus((-18591L));
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra((int) ' ');
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        org.joda.time.DateTime dateTime19 = dateTime16.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime16.toMutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime16.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        int int28 = dateTime26.getDayOfMonth();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime26.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime32.getZone();
        org.joda.time.DateTime dateTime34 = dateTime23.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime13.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime38 = dateTime13.withWeekOfWeekyear(19);
        java.util.Date date39 = dateTime38.toDate();
        org.joda.time.DateTime dateTime41 = dateTime38.plusSeconds((int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Tue May 06 23:59:41 UTC 3270");
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        boolean boolean9 = property8.isLeap();
        java.lang.String str10 = property8.getAsString();
        org.joda.time.DateTime dateTime12 = property8.setCopy(1);
        org.joda.time.DateTime dateTime13 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded((long) 9480, 1407);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime11.minus((long) (-1));
        int int14 = dateTime11.getMonthOfYear();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        int int8 = dateTime6.getYear();
        org.joda.time.DateTime.Property property9 = dateTime6.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy((-2349));
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    @Ignore
  public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks(0);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.minus(readableDuration9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime13.withYearOfEra(1);
        org.joda.time.DateTime.Property property18 = dateTime17.monthOfYear();
        org.joda.time.DurationField durationField19 = property18.getDurationField();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded(readableDuration25, 100);
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfYear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.DateTime.Property property32 = dateTime31.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime31.minus(readableDuration33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((java.lang.Object) readableDuration33);
        org.joda.time.DateTime.Property property36 = dateTime35.millisOfSecond();
        long long37 = property28.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalTime localTime38 = dateTime35.toLocalTime();
        boolean boolean39 = property18.equals((java.lang.Object) localTime38);
        org.joda.time.DateTime dateTime40 = dateTime6.withFields((org.joda.time.ReadablePartial) localTime38);
        org.joda.time.DateTime.Property property41 = dateTime6.weekyear();
        org.joda.time.DateTime dateTime42 = property41.roundFloorCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-18591L) + "'", long37 == (-18591L));
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime42);
    }

    @Test
    @Ignore
  public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, (int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.plus(readableDuration32);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    @Ignore
  public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusSeconds(4);
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfSecond();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        org.joda.time.DateTime dateTime14 = dateTime11.withMillisOfSecond((int) '#');
        org.joda.time.DateTime dateTime16 = dateTime11.minus((long) 1);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillisOfSecond((int) (short) 10);
        int int19 = dateTime18.getHourOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded(readableDuration25, 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.withZone(dateTimeZone28);
        java.util.GregorianCalendar gregorianCalendar30 = dateTime29.toGregorianCalendar();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.toDateTime(chronology34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime38 = dateTime33.withDurationAdded(readableDuration36, 100);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.withZone(dateTimeZone39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime38.plus(readableDuration41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (byte) 1, chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.minuteOfDay();
        java.lang.String str47 = property46.getAsText();
        org.joda.time.DateTime dateTime48 = property46.roundHalfEvenCopy();
        int int49 = dateTime42.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (byte) 1, chronology51);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime52.toMutableDateTime();
        org.joda.time.DateTime dateTime55 = dateTime52.withMillisOfSecond((int) '#');
        boolean boolean56 = dateTime42.equals((java.lang.Object) dateTime55);
        org.joda.time.DateTime dateTime58 = dateTime55.withDayOfYear(4);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) (byte) 1, chronology60);
        org.joda.time.DateTime.Property property62 = dateTime61.minuteOfDay();
        java.lang.String str63 = property62.getAsText();
        org.joda.time.DateTime dateTime64 = property62.roundHalfEvenCopy();
        int int65 = property62.get();
        java.util.Locale locale66 = null;
        int int67 = property62.getMaximumTextLength(locale66);
        int int68 = property62.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property62.getFieldType();
        org.joda.time.DateTime.Property property70 = dateTime58.property(dateTimeFieldType69);
        org.joda.time.DateTime dateTime72 = dateTime29.withField(dateTimeFieldType69, 1439);
        org.joda.time.DateTime.Property property73 = dateTime72.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = property73.getFieldType();
        int int75 = dateTime18.get(dateTimeFieldType74);
        boolean boolean76 = dateTime7.isSupported(dateTimeFieldType74);
        java.util.Date date77 = dateTime7.toDate();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(gregorianCalendar30);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0" + "'", str47, "0");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0" + "'", str63, "0");
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 4 + "'", int67 == 4);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(dateTimeFieldType74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Thu Jan 01 00:00:04 UTC 1970");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((-18591L));
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.minus(readableDuration23);
        int int25 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime21.withPeriodAdded(readablePeriod26, 1439);
        org.joda.time.Chronology chronology29 = dateTime21.getChronology();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) ' ', chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.DateTime dateTime34 = dateTime33.toDateTimeISO();
        org.joda.time.Chronology chronology35 = dateTime34.getChronology();
        org.joda.time.DateTime dateTime36 = dateTime30.toDateTime(chronology35);
        org.joda.time.DateTime dateTime37 = dateTime14.toDateTime(chronology35);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(292278993, (int) (short) 10, 19, (int) (short) 1, (int) (short) 0, chronology35);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 12, chronology35);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(949, 25, 37, 19, 9537654, (int) (short) 100, (-292275054), chronology35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9537654 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.DateTime.Property property10 = dateTime9.weekOfWeekyear();
        java.lang.String str11 = property10.getAsString();
        int int12 = property10.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
    }

    @Test
    @Ignore
  public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime11.year();
        org.joda.time.DateTime dateTime16 = dateTime11.withSecondOfMinute((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.DateTime.Property property19 = dateTime18.era();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    @Ignore
  public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.toDateTime(chronology9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime8.withDurationAdded(readableDuration11, 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withZone(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.plus(readableDuration16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        java.lang.String str22 = property21.getAsText();
        org.joda.time.DateTime dateTime23 = property21.roundHalfEvenCopy();
        int int24 = dateTime17.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime27.toMutableDateTime();
        int int29 = dateTime27.getDayOfMonth();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.toDateTime(chronology30);
        org.joda.time.DateTime dateTime33 = dateTime27.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime33.getZone();
        org.joda.time.DateTime dateTime35 = dateTime23.toDateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(3, 12, 59, 365, (-2349), 949, dateTimeZone34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plus((-18591L));
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra((int) ' ');
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        org.joda.time.DateTime dateTime19 = dateTime16.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime16.toMutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime16.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        int int28 = dateTime26.getDayOfMonth();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime26.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime32.getZone();
        org.joda.time.DateTime dateTime34 = dateTime23.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime13.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime38 = dateTime13.withWeekOfWeekyear(19);
        boolean boolean39 = dateTime13.isAfterNow();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    @Ignore
  public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.DateTime dateTime11 = property8.addToCopy(365);
        java.util.Locale locale13 = null;
        org.joda.time.DateTime dateTime14 = property8.setCopy("70", locale13);
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTimeISO();
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekyear(366);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMonths(25562);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        int int24 = dateTime22.getDayOfMonth();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime22.toDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime22.withSecondOfMinute((int) (short) 1);
        java.util.Locale locale29 = null;
        java.util.Calendar calendar30 = dateTime22.toCalendar(locale29);
        java.util.Date date31 = dateTime22.toDate();
        org.joda.time.DateTime dateTime33 = dateTime22.withWeekOfWeekyear(2);
        boolean boolean34 = dateTime17.isEqual((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property35 = dateTime17.monthOfYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(calendar30);
        org.junit.Assert.assertEquals(calendar30.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property35);
    }

    @Test
    @Ignore
  public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.minus(readableDuration13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) readableDuration13);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        long long17 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalTime localTime18 = dateTime15.toLocalTime();
        org.joda.time.DateTime dateTime19 = dateTime15.toDateTime();
        org.joda.time.DateTime.Property property20 = dateTime15.year();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) (short) -1);
        org.joda.time.DateTime dateTime13 = dateTime11.minus(0L);
        java.util.GregorianCalendar gregorianCalendar14 = dateTime13.toGregorianCalendar();
        org.joda.time.DateTime dateTime16 = dateTime13.plusDays(949);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillis((long) 35);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTime dateTime13 = dateTime9.plusMillis(1970);
        org.joda.time.DateTime.Property property14 = dateTime13.monthOfYear();
        org.joda.time.DateTime.Property property15 = dateTime13.dayOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime18.toMutableDateTime();
        org.joda.time.DateTime dateTime21 = dateTime18.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime18.toMutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime18.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime28.toMutableDateTime();
        int int30 = dateTime28.getDayOfMonth();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = dateTime28.toDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime28.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime34.getZone();
        org.joda.time.DateTime dateTime36 = dateTime25.toDateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime13.toMutableDateTime(dateTimeZone35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(365, 0, 20, 4, 9537654, 2819, 365, dateTimeZone35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9537654 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime39);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime4 = property3.roundCeilingCopy();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.plus(readableDuration5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusSeconds(240);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        int int14 = dateTime12.getDayOfMonth();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime12.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime9.toDateTime(dateTimeZone19);
        org.joda.time.LocalDate localDate21 = dateTime9.toLocalDate();
        org.joda.time.DateMidnight dateMidnight22 = dateTime9.toDateMidnight();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.minus(readableDuration30);
        int int32 = dateTime25.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology33 = dateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime9.toMutableDateTime(chronology33);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DateTime dateTime9 = property8.roundCeilingCopy();
        int int10 = property8.get();
        java.lang.String str11 = property8.getAsText();
        org.joda.time.DurationField durationField12 = property8.getRangeDurationField();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    @Ignore
  public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime2.withSecondOfMinute((int) (short) 1);
        java.util.Locale locale9 = null;
        java.util.Calendar calendar10 = dateTime2.toCalendar(locale9);
        java.util.Date date11 = dateTime2.toDate();
        org.joda.time.DateTime.Property property12 = dateTime2.year();
        org.joda.time.DateTime dateTime14 = dateTime2.minusSeconds(335);
        int int15 = dateTime2.getMillisOfSecond();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        boolean boolean5 = dateTime2.isEqual((long) (short) -1);
        org.joda.time.DateTime dateTime7 = dateTime2.withMillisOfSecond(0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        int int10 = property8.getMaximumValue();
        org.joda.time.DateTime dateTime11 = property8.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime12 = dateTime11.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    @Ignore
  public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours(100);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfWeek();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = property10.getDifference((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime.Property property14 = dateTime12.centuryOfEra();
        org.joda.time.DateTime dateTime15 = property14.roundCeilingCopy();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property14.getAsShortText(locale16);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-18595) + "'", int13 == (-18595));
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "20" + "'", str17, "20");
    }

    @Test
    @Ignore
  public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTime2.toString("19", locale5);
        org.joda.time.DateTime dateTime8 = dateTime2.plusDays(31);
        java.util.Locale locale9 = null;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        org.joda.time.DateTime dateTime12 = dateTime8.plusMonths(4);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19" + "'", str6, "19");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=2678400001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=32,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime.Property property8 = dateTime5.era();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        boolean boolean11 = dateTime9.isAfter((long) 1971);
        org.joda.time.DateTime.Property property12 = dateTime9.yearOfCentury();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    @Ignore
  public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTime dateTime6 = property3.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) dateTime6);
        org.joda.time.DateTime dateTime9 = dateTime7.minus((long) 20);
        java.util.Locale locale10 = null;
        java.util.Calendar calendar11 = dateTime9.toCalendar(locale10);
        org.joda.time.DateTime dateTime13 = dateTime9.withYear(9401802);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=-20,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=980,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        org.joda.time.DateTime dateTime10 = property7.addWrapFieldToCopy(949);
        org.joda.time.DateTime dateTime12 = dateTime10.minusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime14 = dateTime10.withYearOfEra(19);
        org.joda.time.DateTime.Property property15 = dateTime10.minuteOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    @Ignore
  public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.DateTime.Property property32 = dateTime31.minuteOfDay();
        java.lang.String str33 = property32.getAsText();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime36.toMutableDateTime();
        int int38 = dateTime36.getDayOfMonth();
        long long39 = property32.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime40 = property32.withMinimumValue();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 1, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.toDateTime(chronology44);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.DateTime dateTime48 = dateTime43.withDurationAdded(readableDuration46, 100);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.withZone(dateTimeZone49);
        org.joda.time.LocalDateTime localDateTime51 = dateTime50.toLocalDateTime();
        org.joda.time.DateTime dateTime52 = dateTime40.withFields((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (byte) 1, chronology54);
        org.joda.time.MutableDateTime mutableDateTime56 = dateTime55.toMutableDateTime();
        org.joda.time.DateTime dateTime58 = dateTime55.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime55.toMutableDateTime(dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime55.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (byte) 1, chronology64);
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime65.toMutableDateTime();
        int int67 = dateTime65.getDayOfMonth();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = dateTime65.toDateTime(chronology68);
        org.joda.time.DateTime dateTime71 = dateTime65.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone72 = dateTime71.getZone();
        org.joda.time.DateTime dateTime73 = dateTime62.toDateTime(dateTimeZone72);
        org.joda.time.DateTime dateTime74 = dateTime52.withZone(dateTimeZone72);
        org.joda.time.DateTime dateTime75 = dateTime28.withZone(dateTimeZone72);
        org.joda.time.DateTime dateTime76 = org.joda.time.DateTime.now(dateTimeZone72);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(mutableDateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime76);
    }

    @Test
    @Ignore
  public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime2.plus(100L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfDay();
        java.lang.String str12 = property11.getAsText();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        int int17 = dateTime15.getDayOfMonth();
        long long18 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = property11.withMinimumValue();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded(readableDuration25, 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.withZone(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime30 = dateTime29.toLocalDateTime();
        org.joda.time.DateTime dateTime31 = dateTime19.withFields((org.joda.time.ReadablePartial) localDateTime30);
        boolean boolean32 = dateTime2.equals((java.lang.Object) dateTime31);
        int int33 = dateTime31.getSecondOfMinute();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(86399, 335, 365, 366, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime11.year();
        org.joda.time.DateTime dateTime16 = dateTime11.withSecondOfMinute((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        org.joda.time.DateTime dateTime20 = dateTime16.withWeekyear((int) '4');
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime16.minus(readablePeriod21);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime11 = dateTime2.plusMonths((int) (short) 0);
        org.joda.time.DateTime.Property property12 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime13 = property12.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    @Ignore
  public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        java.lang.String str14 = property13.getAsText();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime17.toMutableDateTime();
        int int19 = dateTime17.getDayOfMonth();
        long long20 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime21 = property13.withMinimumValue();
        org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks((int) (byte) 10);
        long long24 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime25 = property7.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField26 = property7.getField();
        org.joda.time.DateTime dateTime27 = property7.getDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    @Ignore
  public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime6 = dateTime3.withMillisOfSecond((int) '#');
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        java.lang.String str11 = property10.getAsText();
        org.joda.time.DateTime dateTime12 = property10.roundHalfEvenCopy();
        int int13 = property10.get();
        java.util.Locale locale14 = null;
        int int15 = property10.getMaximumTextLength(locale14);
        int int16 = property10.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property10.getFieldType();
        org.joda.time.DateTime.Property property18 = dateTime3.property(dateTimeFieldType17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.minus(readableDuration26);
        int int28 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology29 = dateTime21.getChronology();
        org.joda.time.DateTime dateTime30 = dateTime3.toDateTime(chronology29);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 0, chronology29);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology29);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes(2);
        org.joda.time.DateTime dateTime36 = dateTime32.minusMinutes(37);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    @Ignore
  public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime.Property property8 = dateTime5.era();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = property8.getLeapAmount();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime19.toMutableDateTime();
        int int21 = dateTime19.getDayOfMonth();
        long long22 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime23 = property15.withMinimumValue();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.toDateTime(chronology27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withDurationAdded(readableDuration29, 100);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.withZone(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime34 = dateTime33.toLocalDateTime();
        org.joda.time.DateTime dateTime35 = dateTime23.withFields((org.joda.time.ReadablePartial) localDateTime34);
        int int36 = dateTime23.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime38 = dateTime23.withYear(4);
        org.joda.time.DateTime dateTime40 = dateTime23.withMillis((long) (byte) 10);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 1, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.toDateTime(chronology44);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.DateTime dateTime48 = dateTime43.withDurationAdded(readableDuration46, 100);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = dateTime48.withZone(dateTimeZone49);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.DateTime dateTime52 = dateTime48.plus(readableDuration51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (byte) 1, chronology54);
        org.joda.time.DateTime.Property property56 = dateTime55.minuteOfDay();
        java.lang.String str57 = property56.getAsText();
        org.joda.time.DateTime dateTime58 = property56.roundHalfEvenCopy();
        int int59 = dateTime52.compareTo((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (byte) 1, chronology61);
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime62.toMutableDateTime();
        int int64 = dateTime62.getDayOfMonth();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = dateTime62.toDateTime(chronology65);
        org.joda.time.DateTime dateTime68 = dateTime62.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone69 = dateTime68.getZone();
        org.joda.time.DateTime dateTime70 = dateTime58.toDateTime(dateTimeZone69);
        org.joda.time.DateTime dateTime71 = dateTime23.withZone(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = dateTime71.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.DateTime dateTime75 = dateTime72.withDurationAdded(readableDuration73, (-26771196));
        // The following exception was thrown during execution in test generation
        try {
            long long76 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime75);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "0" + "'", str57, "0");
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime75);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        org.joda.time.DateTime.Property property8 = dateTime6.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        org.joda.time.DateTime dateTime14 = dateTime11.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime11.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        int int23 = dateTime21.getDayOfMonth();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.toDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime21.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime27.getZone();
        org.joda.time.DateTime dateTime29 = dateTime18.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime6.toMutableDateTime(dateTimeZone28);
        boolean boolean33 = dateTime6.isAfterNow();
        org.joda.time.LocalDateTime localDateTime34 = dateTime6.toLocalDateTime();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    @Ignore
  public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusMillis(0);
        org.joda.time.DateTime dateTime15 = dateTime11.minusMillis(10);
        org.joda.time.DateTime dateTime17 = dateTime11.plusMonths((int) (byte) 0);
        org.joda.time.DateTime dateTime19 = dateTime11.minus(10L);
        org.joda.time.DateTime dateTime21 = dateTime19.withYearOfCentury(99);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        int int8 = dateTime2.getDayOfMonth();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTimeISO();
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime2.toMutableDateTime(chronology13);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(0);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.withDurationAdded(readableDuration20, 0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.plusYears(70);
        org.joda.time.DateTime.Property property13 = dateTime9.era();
        int int14 = dateTime9.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.LocalDate localDate7 = dateTime6.toLocalDate();
        org.joda.time.DateTime.Property property8 = dateTime6.millisOfDay();
        int int9 = dateTime6.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime6.withDayOfMonth(9401802);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9401802 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(60, 9374250, (-1), 1971, 14400, 1, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1971 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    @Ignore
  public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime11.year();
        org.joda.time.DurationField durationField15 = property14.getDurationField();
        org.joda.time.DurationField durationField16 = property14.getLeapDurationField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(chronology4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.withDurationAdded(readableDuration6, 100);
        org.joda.time.DateTime dateTime11 = dateTime8.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        org.joda.time.DateTime dateTime18 = dateTime15.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime15.toMutableDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime15.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        int int27 = dateTime25.getDayOfMonth();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.toDateTime(chronology28);
        org.joda.time.DateTime dateTime31 = dateTime25.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime31.getZone();
        org.joda.time.DateTime dateTime33 = dateTime22.toDateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(0L, dateTimeZone32);
        org.joda.time.DateTime dateTime36 = dateTime8.withZoneRetainFields(dateTimeZone32);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(14399L, dateTimeZone32);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        java.lang.Object obj9 = null;
        boolean boolean10 = property8.equals(obj9);
        org.joda.time.DateTime dateTime11 = property8.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime12.minus((long) 20);
        int int15 = property3.getDifference((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime.Property property16 = dateTime12.secondOfMinute();
        org.joda.time.DateTime.Property property17 = dateTime12.monthOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1439 + "'", int4 == 1439);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    @Ignore
  public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, chronology8);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        org.joda.time.DateTime dateTime12 = dateTime9.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime9.toMutableDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime9.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime19.toMutableDateTime();
        int int21 = dateTime19.getDayOfMonth();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.toDateTime(chronology22);
        org.joda.time.DateTime dateTime25 = dateTime19.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        org.joda.time.DateTime dateTime27 = dateTime16.toDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj6, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime31 = dateTime29.minusWeeks(86398);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 1, chronology33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 1, chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.minus(readableDuration39);
        int int41 = dateTime34.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime44 = dateTime37.withPeriodAdded(readablePeriod42, 1439);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.plus(readableDuration45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (byte) 1, chronology48);
        org.joda.time.DateTime.Property property50 = dateTime49.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.DateTime dateTime52 = dateTime49.minus(readableDuration51);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime52.toMutableDateTime();
        org.joda.time.DateTime.Property property54 = dateTime52.weekyear();
        org.joda.time.DateTime dateTime56 = dateTime52.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property57 = dateTime52.weekOfWeekyear();
        java.lang.String str58 = dateTime52.toString();
        org.joda.time.Chronology chronology59 = dateTime52.getChronology();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology59);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((java.lang.Object) readableDuration45, chronology59);
        org.joda.time.DateTime dateTime62 = dateTime29.toDateTime(chronology59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(3, (-26771196), 72000, 19, 60, 20, chronology59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str58, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTime62);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 1, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.minus(readableDuration8);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        int int11 = property3.getDifference((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.DateTime dateTime12 = property3.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    @Ignore
  public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        java.util.Date date14 = dateTime12.toDate();
        org.joda.time.DateTime.Property property15 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) dateTime12);
        org.joda.time.DateTime dateTime18 = dateTime12.plusMinutes(2922789);
        org.joda.time.DateTime dateTime20 = dateTime18.minusHours(0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Jan 05 04:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    @Ignore
  public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime6 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime7 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime9.withSecondOfMinute(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime9.withDayOfYear(69);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    @Ignore
  public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((-18591L));
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 1, chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.DateTime.Property property34 = dateTime33.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.minus(readableDuration35);
        int int37 = dateTime30.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime40 = dateTime33.withPeriodAdded(readablePeriod38, 1439);
        org.joda.time.Chronology chronology41 = dateTime33.getChronology();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) ' ', chronology41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (byte) 1, chronology44);
        org.joda.time.DateTime dateTime46 = dateTime45.toDateTimeISO();
        org.joda.time.Chronology chronology47 = dateTime46.getChronology();
        org.joda.time.DateTime dateTime48 = dateTime42.toDateTime(chronology47);
        org.joda.time.DateTime dateTime49 = dateTime26.toDateTime(chronology47);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) ' ', chronology47);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime11.toMutableDateTime(chronology47);
        int int52 = dateTime11.getHourOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        int int9 = dateTime2.getMonthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTimeISO();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.minus(readableDuration19);
        int int21 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime24 = dateTime17.withPeriodAdded(readablePeriod22, 1439);
        org.joda.time.Chronology chronology25 = dateTime17.getChronology();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) ' ', chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.year();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime26.getZone();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = dateTime10.withZone(dateTimeZone28);
        org.joda.time.DateTime.Property property31 = dateTime10.monthOfYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    @Ignore
  public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        boolean boolean9 = property8.isLeap();
        org.joda.time.DateTime dateTime11 = property8.addToCopy(365);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        java.lang.Object obj16 = null;
        boolean boolean17 = property15.equals(obj16);
        org.joda.time.DateTime dateTime18 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) dateTime18);
        int int20 = dateTime18.getMinuteOfDay();
        org.joda.time.DateTime dateTime22 = dateTime18.minusYears((int) (short) -1);
        int int23 = property8.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime25 = property8.addWrapFieldToCopy(20);
        org.joda.time.DateTime dateTime27 = dateTime25.minusSeconds(1969);
        java.util.Locale locale28 = null;
        java.util.Calendar calendar29 = dateTime25.toCalendar(locale28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.DateTime dateTime31 = dateTime25.plus(readablePeriod30);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(calendar29);
        org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1728000001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=21,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    @Ignore
  public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime4 = property3.getDateTime();
        java.util.Locale locale5 = null;
        int int6 = property3.getMaximumTextLength(locale5);
        org.joda.time.DurationField durationField7 = property3.getLeapDurationField();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfDay();
        java.lang.String str12 = property11.getAsText();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        int int17 = dateTime15.getDayOfMonth();
        long long18 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = property11.withMinimumValue();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded(readableDuration25, 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.withZone(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime30 = dateTime29.toLocalDateTime();
        org.joda.time.DateTime dateTime31 = dateTime19.withFields((org.joda.time.ReadablePartial) localDateTime30);
        int int32 = dateTime19.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime34 = dateTime19.withYear(4);
        org.joda.time.DateTime dateTime36 = dateTime19.withMillis((long) (byte) 10);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime19.plus(readableDuration37);
        int int39 = property3.compareTo((org.joda.time.ReadableInstant) dateTime19);
        int int40 = property3.getMinimumValue();
        org.joda.time.DateTime dateTime42 = property3.addToCopy(7);
        int int43 = dateTime42.getYear();
        boolean boolean44 = dateTime42.isEqualNow();
        org.joda.time.DateTime.Property property45 = dateTime42.dayOfMonth();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1970 + "'", int43 == 1970);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(property45);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.DateTime dateTime11 = dateTime2.plusMonths((int) (short) 0);
        org.joda.time.DateTime.Property property12 = dateTime11.year();
        org.joda.time.DateTime dateTime14 = dateTime11.plusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime16 = dateTime11.plus(62135596801439L);
        boolean boolean17 = dateTime16.isAfterNow();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.Object obj4 = null;
        boolean boolean5 = property3.equals(obj4);
        org.joda.time.DateTime dateTime6 = property3.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) dateTime6);
        org.joda.time.DateTime.Property property8 = dateTime6.year();
        org.joda.time.DateTime dateTime10 = property8.setCopy((-18595));
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.toDateTime(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withDurationAdded(readableDuration16, 100);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfYear();
        org.joda.time.DurationField durationField20 = property19.getLeapDurationField();
        int int21 = property19.getMaximumValue();
        org.joda.time.DateTime dateTime23 = property19.setCopy((int) (short) 10);
        org.joda.time.DateTime dateTime24 = property19.roundCeilingCopy();
        int int25 = property19.getMaximumValue();
        org.joda.time.Interval interval26 = property19.toInterval();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime29.toMutableDateTime();
        org.joda.time.DateTime dateTime32 = dateTime29.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime29.toMutableDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime29.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, chronology38);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime39.toMutableDateTime();
        int int41 = dateTime39.getDayOfMonth();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = dateTime39.toDateTime(chronology42);
        org.joda.time.DateTime dateTime45 = dateTime39.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime45.getZone();
        org.joda.time.DateTime dateTime47 = dateTime36.toDateTime(dateTimeZone46);
        org.joda.time.DateTime.Property property48 = dateTime36.secondOfMinute();
        int int49 = property19.getDifference((org.joda.time.ReadableInstant) dateTime36);
        long long50 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNull(durationField20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 365 + "'", int21 == 365);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 365 + "'", int25 == 365);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-51864435) + "'", int49 == (-51864435));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-142000L) + "'", long50 == (-142000L));
    }

    @Test
    @Ignore
  public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, (int) (byte) 0);
        org.joda.time.DateTime dateTime33 = dateTime31.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime35 = dateTime33.plusDays(5);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getMillisOfSecond();
        org.joda.time.DateTime dateTime6 = dateTime2.plusHours(5);
        org.joda.time.DateTime.Property property7 = dateTime2.millisOfSecond();
        org.joda.time.DateTime dateTime9 = dateTime2.withMillisOfSecond(462);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        org.joda.time.DateTime dateTime17 = property16.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTime();
        int int22 = dateTime20.getDayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.withYearOfEra(1);
        org.joda.time.DateTime dateTime26 = dateTime20.plusMonths((int) (short) 0);
        org.joda.time.DateTime.Property property27 = dateTime26.yearOfCentury();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.DateTime dateTime30 = property27.addWrapFieldToCopy((int) '#');
        org.joda.time.DateTime dateTime32 = dateTime30.minusDays(9480);
        int int33 = dateTime17.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    @Ignore
  public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZone(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.plus(readableDuration20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        java.lang.String str26 = property25.getAsText();
        org.joda.time.DateTime dateTime27 = property25.roundHalfEvenCopy();
        int int28 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        org.joda.time.DateTime dateTime34 = dateTime31.withMillisOfSecond((int) '#');
        boolean boolean35 = dateTime21.equals((java.lang.Object) dateTime34);
        boolean boolean36 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime38 = dateTime34.minusMonths((int) '4');
        org.joda.time.DateTime dateTime40 = dateTime38.plusMinutes(5);
        int int41 = dateTime38.getHourOfDay();
        org.joda.time.DateTime dateTime44 = dateTime38.withDurationAdded(1612319861329L, 365);
        org.joda.time.DateTime.Property property45 = dateTime44.monthOfYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 1, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.minus(readableDuration8);
        int int10 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime6.withPeriodAdded(readablePeriod11, 1439);
        org.joda.time.Chronology chronology14 = dateTime6.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) ' ', chronology14);
        org.joda.time.DateTime dateTime16 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.LocalTime localTime17 = dateTime16.toLocalTime();
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    @Ignore
  public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusMillis(0);
        org.joda.time.DateTime dateTime15 = dateTime11.minusMillis(10);
        org.joda.time.DateTime dateTime17 = dateTime11.plusMonths((int) (byte) 0);
        org.joda.time.DateTime dateTime19 = dateTime11.minus(10L);
        org.joda.time.DateTime dateTime20 = dateTime11.withTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    @Ignore
  public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        org.joda.time.DateTime dateTime10 = property7.addWrapFieldToCopy(949);
        java.util.Locale locale11 = null;
        java.lang.String str12 = property7.getAsShortText(locale11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = property7.getDifference(readableInstant13);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970" + "'", str12, "1970");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-50) + "'", int14 == (-50));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.minus(readableDuration9);
        int int11 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime7.withPeriodAdded(readablePeriod12, 1439);
        org.joda.time.Chronology chronology15 = dateTime7.getChronology();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) ' ', chronology15);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 6000001, chronology15);
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(chronology15);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology15);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    @Ignore
  public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        org.joda.time.DateTime dateTime29 = dateTime26.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime26.toMutableDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime26.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime36.toMutableDateTime();
        int int38 = dateTime36.getDayOfMonth();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = dateTime36.toDateTime(chronology39);
        org.joda.time.DateTime dateTime42 = dateTime36.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime42.getZone();
        org.joda.time.DateTime dateTime44 = dateTime33.toDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = dateTime23.withZone(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone43);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
    }

    @Test
    @Ignore
  public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfYear(365);
        int int16 = dateTime15.getCenturyOfEra();
        org.joda.time.DateTime.Property property17 = dateTime15.millisOfSecond();
        org.joda.time.DateTime dateTime19 = dateTime15.minusHours(9374250);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime15.minus(readablePeriod20);
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property23 = dateTime21.secondOfMinute();
        org.joda.time.DateTime dateTime25 = dateTime21.minusMonths((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.minus(readablePeriod26);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime dateTime13 = dateTime7.withDurationAdded(0L, 20);
        long long14 = dateTime13.getMillis();
        org.joda.time.LocalDate localDate15 = dateTime13.toLocalDate();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        java.lang.String str10 = property8.getAsText();
        int int11 = property8.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "70" + "'", str10, "70");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime8 = dateTime2.plusHours(0);
        org.joda.time.DateTime.Property property9 = dateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime10 = property9.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTimeISO();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.minus(readableDuration5);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime6.toMutableDateTime();
        org.joda.time.DateTime.Property property8 = dateTime6.weekyear();
        org.joda.time.DateTime dateTime10 = property8.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMonths(20);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.minus(readableDuration21);
        int int23 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime19.withPeriodAdded(readablePeriod24, 1439);
        org.joda.time.Chronology chronology27 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) ' ', chronology27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.DateTime dateTime32 = dateTime31.toDateTimeISO();
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.DateTime dateTime34 = dateTime28.toDateTime(chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((java.lang.Object) dateTime12, chronology33);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 60, chronology33);
        org.joda.time.DateTime dateTime38 = dateTime36.plus((long) 4);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    @Ignore
  public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        boolean boolean6 = dateTime5.isEqualNow();
        int int7 = dateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime8 = dateTime5.toLocalDateTime();
        org.joda.time.DateTime dateTime10 = dateTime5.minusMinutes(292278993);
        org.joda.time.DateTime.Property property11 = dateTime5.centuryOfEra();
        org.joda.time.DateTime.Property property12 = dateTime5.year();
        org.joda.time.DateTime dateTime13 = property12.roundHalfEvenCopy();
        int int14 = dateTime13.getMinuteOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("600070-01-01T00:00:00.001Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime11.year();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.minus(readablePeriod15);
        boolean boolean18 = dateTime11.isBefore((long) 19);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    @Ignore
  public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZone(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.plus(readableDuration20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        java.lang.String str26 = property25.getAsText();
        org.joda.time.DateTime dateTime27 = property25.roundHalfEvenCopy();
        int int28 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        org.joda.time.DateTime dateTime34 = dateTime31.withMillisOfSecond((int) '#');
        boolean boolean35 = dateTime21.equals((java.lang.Object) dateTime34);
        boolean boolean36 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime38 = dateTime34.minus((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant39 = null;
        boolean boolean40 = dateTime38.isEqual(readableInstant39);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(0L);
        org.joda.time.LocalDate localDate43 = dateTime42.toLocalDate();
        java.util.GregorianCalendar gregorianCalendar44 = dateTime42.toGregorianCalendar();
        org.joda.time.DateTime.Property property45 = dateTime42.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property45.getFieldType();
        org.joda.time.DateTime.Property property47 = dateTime38.property(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(gregorianCalendar44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(property47);
    }

    @Test
    @Ignore
  public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.plus((long) 'a');
        org.joda.time.DateTime.Property property9 = dateTime8.secondOfDay();
        org.joda.time.DateTime dateTime11 = property9.addToCopy((long) (byte) 1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DateTime dateTime17 = property15.roundHalfEvenCopy();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        java.lang.String str22 = property21.getAsText();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        int int27 = dateTime25.getDayOfMonth();
        long long28 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        int int29 = property21.get();
        org.joda.time.Interval interval30 = property21.toInterval();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.toDateTime(chronology34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime38 = dateTime33.withDurationAdded(readableDuration36, 100);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.withZone(dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime41 = dateTime38.toLocalDateTime();
        int int42 = property21.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.DateTime dateTime43 = dateTime17.withFields((org.joda.time.ReadablePartial) localDateTime41);
        int int44 = dateTime17.getYear();
        org.joda.time.DateTime dateTime46 = dateTime17.withDayOfYear(365);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (byte) 1, chronology48);
        org.joda.time.DateTime.Property property50 = dateTime49.minuteOfDay();
        java.lang.String str51 = property50.getAsText();
        org.joda.time.DateTime dateTime52 = property50.roundHalfEvenCopy();
        int int53 = property50.get();
        java.util.Locale locale54 = null;
        int int55 = property50.getMaximumTextLength(locale54);
        int int56 = property50.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property50.getFieldType();
        org.joda.time.DateTime dateTime59 = dateTime17.withField(dateTimeFieldType57, 70);
        int int60 = property9.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1970 + "'", int44 == 1970);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "0" + "'", str51, "0");
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(999, 59, 12, 31, 366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime9.withDayOfWeek(1);
        org.joda.time.DateTime dateTime15 = dateTime13.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime localDateTime16 = dateTime15.toLocalDateTime();
        org.joda.time.DateTime.Property property17 = dateTime15.dayOfMonth();
        java.util.Locale locale18 = null;
        int int19 = property17.getMaximumTextLength(locale18);
        org.joda.time.DateTime dateTime21 = property17.setCopy(11);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    @Ignore
  public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime11.plus(readableDuration29);
        org.joda.time.DateTime dateTime32 = dateTime30.withMillisOfSecond((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime30.minus(readableDuration33);
        int int35 = dateTime30.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    @Ignore
  public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime10 = property8.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds((int) 'a');
        java.lang.String str13 = dateTime10.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime10.withYearOfCentury((-18595));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -18595 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T00:00:00.000Z" + "'", str13, "1970-01-01T00:00:00.000Z");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusSeconds(4);
        org.joda.time.DateTime.Property property8 = dateTime5.millisOfDay();
        org.joda.time.DateTime dateTime10 = dateTime5.plusMonths(70);
        int int11 = dateTime5.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        boolean boolean11 = dateTime9.isEqual((long) (short) 10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfWeek();
        org.joda.time.LocalDate localDate13 = dateTime9.toLocalDate();
        boolean boolean14 = dateTime9.isAfterNow();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    @Ignore
  public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        java.util.GregorianCalendar gregorianCalendar10 = dateTime9.toGregorianCalendar();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.toDateTime(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withDurationAdded(readableDuration16, 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withZone(dateTimeZone19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfDay();
        java.lang.String str27 = property26.getAsText();
        org.joda.time.DateTime dateTime28 = property26.roundHalfEvenCopy();
        int int29 = dateTime22.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        org.joda.time.DateTime dateTime35 = dateTime32.withMillisOfSecond((int) '#');
        boolean boolean36 = dateTime22.equals((java.lang.Object) dateTime35);
        org.joda.time.DateTime dateTime38 = dateTime35.withDayOfYear(4);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 1, chronology40);
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfDay();
        java.lang.String str43 = property42.getAsText();
        org.joda.time.DateTime dateTime44 = property42.roundHalfEvenCopy();
        int int45 = property42.get();
        java.util.Locale locale46 = null;
        int int47 = property42.getMaximumTextLength(locale46);
        int int48 = property42.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property42.getFieldType();
        org.joda.time.DateTime.Property property50 = dateTime38.property(dateTimeFieldType49);
        org.joda.time.DateTime dateTime52 = dateTime9.withField(dateTimeFieldType49, 1439);
        org.joda.time.DateTime.Property property53 = dateTime52.dayOfYear();
        org.joda.time.DateTime dateTime55 = dateTime52.withCenturyOfEra(949);
        java.util.Locale locale56 = null;
        java.util.Calendar calendar57 = dateTime55.toCalendar(locale56);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.DateTime dateTime59 = dateTime55.minus(readablePeriod58);
        java.util.GregorianCalendar gregorianCalendar60 = dateTime55.toGregorianCalendar();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(gregorianCalendar10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0" + "'", str43, "0");
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(calendar57);
        org.junit.Assert.assertEquals(calendar57.toString(), "java.util.GregorianCalendar[time=2934796665540001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=94970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(gregorianCalendar60);
    }

    @Test
    @Ignore
  public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.minus(readableDuration13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) readableDuration13);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        long long17 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMillis((int) (short) -1);
        int int20 = dateTime15.getMillisOfDay();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime15.minus(readablePeriod21);
        org.joda.time.DateTime dateTime24 = dateTime15.withMillisOfSecond(180);
        org.joda.time.DateTime.Property property25 = dateTime24.year();
        org.joda.time.DateTime dateTime27 = property25.addWrapFieldToCopy((int) '4');
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9553790 + "'", int20 == 9553790);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.plus((long) 'a');
        org.joda.time.DateTime.Property property9 = dateTime8.secondOfDay();
        org.joda.time.DateTime dateTime11 = property9.addToCopy((int) (byte) -1);
        java.util.Locale locale12 = null;
        int int13 = property9.getMaximumShortTextLength(locale12);
        int int14 = property9.getMinimumValueOverall();
        org.joda.time.DateTime dateTime16 = property9.setCopy((int) 'a');
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateTime16.toString("yearOfEra", locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    @Ignore
  public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        int int6 = property3.getMaximumValue();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, chronology8);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        org.joda.time.DateTime dateTime12 = dateTime9.withMillisOfSecond((int) '#');
        java.lang.String str13 = dateTime12.toString();
        org.joda.time.DateTime dateTime15 = dateTime12.minusDays(10);
        long long16 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime15.toMutableDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1439 + "'", int6 == 1439);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1970-01-01T00:00:00.035Z" + "'", str13, "1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 14399L + "'", long16 == 14399L);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    @Ignore
  public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        org.joda.time.DateTime dateTime29 = dateTime26.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime26.toMutableDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime26.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime36.toMutableDateTime();
        int int38 = dateTime36.getDayOfMonth();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = dateTime36.toDateTime(chronology39);
        org.joda.time.DateTime dateTime42 = dateTime36.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime42.getZone();
        org.joda.time.DateTime dateTime44 = dateTime33.toDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = dateTime23.withZone(dateTimeZone43);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = dateTime45.toString("1970-01-01T00:01:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((-18591L));
        org.joda.time.DateTime.Property property2 = dateTime1.millisOfSecond();
        int int3 = dateTime1.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime10 = property7.getDateTime();
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
    }

    @Test
    @Ignore
  public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DateTime dateTime17 = property15.roundHalfEvenCopy();
        int int18 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime17);
        boolean boolean19 = dateTime17.isEqualNow();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.DateTime.Property property23 = dateTime22.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.minus(readableDuration24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime27 = dateTime25.toLocalDateTime();
        org.joda.time.DateTime dateTime28 = dateTime25.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.toDateTime(chronology32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.withDurationAdded(readableDuration34, 100);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withZone(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime39 = dateTime38.toLocalDateTime();
        org.joda.time.DateTime dateTime40 = dateTime25.withFields((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.DateTime dateTime41 = dateTime17.withFields((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.DateTime dateTime43 = dateTime41.plusSeconds((int) (byte) 10);
        org.joda.time.DateTime dateTime45 = dateTime41.minusMonths(53);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        org.joda.time.DateTime dateTime9 = property7.roundFloorCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    @Ignore
  public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        int int6 = property3.get();
        java.util.Locale locale7 = null;
        int int8 = property3.getMaximumTextLength(locale7);
        int int9 = property3.get();
        int int10 = property3.get();
        int int11 = property3.getMinimumValueOverall();
        org.joda.time.DateTime dateTime12 = property3.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.centuryOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        int int8 = dateTime6.getYear();
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(60);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    @Ignore
  public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.minus(readableDuration7);
        int int9 = dateTime2.compareTo((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime5.withPeriodAdded(readablePeriod10, 1439);
        org.joda.time.Chronology chronology13 = dateTime5.getChronology();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.minus(readableDuration18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime19.toMutableDateTime();
        org.joda.time.DateTime.Property property21 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime23 = property21.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfDay();
        java.lang.String str28 = property27.getAsText();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        int int33 = dateTime31.getDayOfMonth();
        long long34 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime35 = property27.withMinimumValue();
        org.joda.time.DateTime dateTime37 = dateTime35.minusWeeks((int) (byte) 10);
        long long38 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime.Property property39 = dateTime37.centuryOfEra();
        int int40 = dateTime5.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 1, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = dateTime43.toDateTime(chronology44);
        org.joda.time.DateTime dateTime47 = dateTime43.plusMillis(1970);
        org.joda.time.TimeOfDay timeOfDay48 = dateTime43.toTimeOfDay();
        org.joda.time.DateTime dateTime49 = dateTime37.withFields((org.joda.time.ReadablePartial) timeOfDay48);
        org.joda.time.DateTime.Property property50 = dateTime49.minuteOfDay();
        org.joda.time.DateTime dateTime52 = property50.addToCopy((long) 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTime52);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime8 = dateTime2.plusMonths((int) (short) 0);
        org.joda.time.DateTime dateTime10 = dateTime2.minusYears((int) (short) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.withMillis((long) 9416);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMillis((int) (short) 1);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMillis(14400);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        org.joda.time.DateTime dateTime19 = dateTime16.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime16.toMutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime16.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        int int28 = dateTime26.getDayOfMonth();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime26.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime32.getZone();
        org.joda.time.DateTime dateTime34 = dateTime23.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) dateTime11, dateTimeZone33);
        org.joda.time.DateTime dateTime38 = dateTime36.minus((long) 'a');
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        java.util.GregorianCalendar gregorianCalendar10 = dateTime9.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime11 = dateTime9.toLocalDateTime();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(gregorianCalendar10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        int int10 = property8.getMaximumValue();
        org.joda.time.DateTime dateTime11 = property8.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withDayOfMonth(330);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 330 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime dateTime11 = dateTime7.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate12 = dateTime11.toLocalDate();
        org.joda.time.DateTime dateTime14 = dateTime11.minusDays((int) '4');
        int int15 = dateTime14.getMillisOfSecond();
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTimeISO();
        org.joda.time.DateTime.Property property17 = dateTime14.dayOfYear();
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = property17.setCopy("", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    @Ignore
  public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.minus(readableDuration13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) readableDuration13);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        long long17 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMillis((int) (short) -1);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded(readableDuration25, 100);
        org.joda.time.DateTime dateTime29 = dateTime22.plusMillis((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay30 = dateTime22.toTimeOfDay();
        boolean boolean31 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime22);
        int int32 = dateTime22.getDayOfMonth();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 1, chronology36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 1, chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime43 = dateTime40.minus(readableDuration42);
        int int44 = dateTime37.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime47 = dateTime40.withPeriodAdded(readablePeriod45, 1439);
        org.joda.time.Chronology chronology48 = dateTime40.getChronology();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) ' ', chronology48);
        org.joda.time.DateTime.Property property50 = dateTime49.year();
        org.joda.time.DateTimeZone dateTimeZone51 = dateTime49.getZone();
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) 99, dateTimeZone51);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((java.lang.Object) int32, dateTimeZone51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTime52);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime9.withCenturyOfEra(4);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    @Ignore
  public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        java.util.Date date10 = dateTime9.toDate();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    @Ignore
  public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DateTime dateTime17 = property15.roundHalfEvenCopy();
        int int18 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime17);
        boolean boolean19 = dateTime17.isEqualNow();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.DateTime.Property property23 = dateTime22.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.minus(readableDuration24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime27 = dateTime25.toLocalDateTime();
        org.joda.time.DateTime dateTime28 = dateTime25.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.toDateTime(chronology32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.withDurationAdded(readableDuration34, 100);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withZone(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime39 = dateTime38.toLocalDateTime();
        org.joda.time.DateTime dateTime40 = dateTime25.withFields((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.DateTime dateTime41 = dateTime17.withFields((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 1, chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime44.toMutableDateTime();
        int int46 = dateTime44.getDayOfMonth();
        org.joda.time.DateTime dateTime48 = dateTime44.withYearOfEra(1);
        org.joda.time.DateTime dateTime51 = dateTime44.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime53 = dateTime51.withDayOfYear(20);
        boolean boolean54 = dateTime41.isEqual((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = dateTime41.withZoneRetainFields(dateTimeZone55);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (byte) 1, chronology58);
        org.joda.time.DateTime dateTime60 = dateTime59.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology61 = dateTime59.getChronology();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (byte) 1, chronology63);
        org.joda.time.DateTime.Property property65 = dateTime64.minuteOfDay();
        java.lang.String str66 = property65.getAsText();
        org.joda.time.DateTime dateTime67 = property65.roundHalfEvenCopy();
        int int68 = property65.get();
        java.util.Locale locale69 = null;
        int int70 = property65.getMaximumTextLength(locale69);
        int int71 = property65.get();
        int int72 = property65.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property65.getFieldType();
        boolean boolean74 = dateTime59.isSupported(dateTimeFieldType73);
        org.joda.time.DateTime.Property property75 = dateTime56.property(dateTimeFieldType73);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "0" + "'", str66, "0");
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 4 + "'", int70 == 4);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(property75);
    }

    @Test
    @Ignore
  public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.DateTime.Property property24 = dateTime23.weekOfWeekyear();
        org.joda.time.DateTime dateTime25 = property24.roundHalfEvenCopy();
        org.joda.time.DurationField durationField26 = property24.getDurationField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.toDateTime(chronology9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime8.withDurationAdded(readableDuration11, 100);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfYear();
        org.joda.time.DurationField durationField15 = property14.getLeapDurationField();
        int int16 = property14.getMaximumValue();
        org.joda.time.DateTime dateTime18 = property14.setCopy((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readablePeriod19);
        org.joda.time.DateTime dateTime22 = dateTime18.minusDays(0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.minus(readableDuration31);
        int int33 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime36 = dateTime29.withPeriodAdded(readablePeriod34, 1439);
        org.joda.time.Chronology chronology37 = dateTime29.getChronology();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) ' ', chronology37);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 1, chronology40);
        org.joda.time.DateTime dateTime42 = dateTime41.toDateTimeISO();
        org.joda.time.Chronology chronology43 = dateTime42.getChronology();
        org.joda.time.DateTime dateTime44 = dateTime38.toDateTime(chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime22.toMutableDateTime(chronology43);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(chronology43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(3, 949, 25562, 3535, (-86400000), 9553790, chronology43);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3535 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNull(durationField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 365 + "'", int16 == 365);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
    }

    @Test
    @Ignore
  public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property10 = dateTime5.weekOfWeekyear();
        java.lang.String str11 = dateTime5.toString();
        org.joda.time.Chronology chronology12 = dateTime5.getChronology();
        int int13 = dateTime5.getDayOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str11, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    @Ignore
  public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plus((-18591L));
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra((int) ' ');
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        org.joda.time.DateTime dateTime19 = dateTime16.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime16.toMutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime16.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        int int28 = dateTime26.getDayOfMonth();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime26.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime32.getZone();
        org.joda.time.DateTime dateTime34 = dateTime23.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime13.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime38 = dateTime13.withWeekOfWeekyear(19);
        java.util.Date date39 = dateTime38.toDate();
        int int40 = dateTime38.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Tue May 06 23:59:41 UTC 3270");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 23 + "'", int40 == 23);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTime2.toString("19", locale5);
        int int7 = dateTime2.getYear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime2.plus(readablePeriod8);
        org.joda.time.TimeOfDay timeOfDay10 = dateTime9.toTimeOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19" + "'", str6, "19");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(timeOfDay10);
    }

    @Test
    @Ignore
  public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DateTime dateTime11 = property9.roundHalfEvenCopy();
        int int12 = property9.get();
        java.util.Locale locale13 = null;
        int int14 = property9.getMaximumTextLength(locale13);
        int int15 = property9.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property9.getFieldType();
        org.joda.time.DateTime.Property property17 = dateTime2.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.minus(readableDuration25);
        int int27 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Chronology chronology28 = dateTime20.getChronology();
        org.joda.time.DateTime dateTime29 = dateTime2.toDateTime(chronology28);
        java.util.Locale locale30 = null;
        java.util.Calendar calendar31 = dateTime2.toCalendar(locale30);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(calendar31);
        org.junit.Assert.assertEquals(calendar31.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    @Ignore
  public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        int int7 = dateTime6.getYearOfCentury();
        org.joda.time.LocalDate localDate8 = dateTime6.toLocalDate();
        int int9 = dateTime6.getEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    @Ignore
  public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        java.util.Date date14 = dateTime12.toDate();
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfMonth();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime(chronology19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.withDurationAdded(readableDuration21, 100);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfYear();
        org.joda.time.DurationField durationField25 = property24.getLeapDurationField();
        int int26 = property24.getMaximumValue();
        org.joda.time.DateTime dateTime28 = property24.setCopy((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.minus(readablePeriod29);
        org.joda.time.DateTime dateTime32 = dateTime28.minusDays(0);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime39.minus(readableDuration41);
        int int43 = dateTime36.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime46 = dateTime39.withPeriodAdded(readablePeriod44, 1439);
        org.joda.time.Chronology chronology47 = dateTime39.getChronology();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) ' ', chronology47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (byte) 1, chronology50);
        org.joda.time.DateTime dateTime52 = dateTime51.toDateTimeISO();
        org.joda.time.Chronology chronology53 = dateTime52.getChronology();
        org.joda.time.DateTime dateTime54 = dateTime48.toDateTime(chronology53);
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime32.toMutableDateTime(chronology53);
        org.joda.time.DateTime.Property property56 = dateTime32.weekOfWeekyear();
        boolean boolean57 = property15.equals((java.lang.Object) dateTime32);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Jan 05 04:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNull(durationField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 365 + "'", int26 == 365);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    @Ignore
  public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        int int6 = property3.get();
        java.lang.String str7 = property3.toString();
        org.joda.time.DateTime dateTime9 = property3.addToCopy((long) 526);
        int int10 = dateTime9.getYear();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[minuteOfDay]" + "'", str7, "Property[minuteOfDay]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.joda.time.Chronology chronology5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(0, 59, 70, 11, 126, chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 126 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTime(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime12.withDurationAdded(readableDuration15, 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZone(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.plus(readableDuration20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfDay();
        java.lang.String str26 = property25.getAsText();
        org.joda.time.DateTime dateTime27 = property25.roundHalfEvenCopy();
        int int28 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        org.joda.time.DateTime dateTime34 = dateTime31.withMillisOfSecond((int) '#');
        boolean boolean35 = dateTime21.equals((java.lang.Object) dateTime34);
        boolean boolean36 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Chronology chronology37 = dateTime34.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime34.withYearOfEra(526);
        org.joda.time.DateTime dateTime41 = dateTime39.withDayOfYear((int) (short) 10);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    @Ignore
  public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy(100);
        org.joda.time.DateTime.Property property11 = dateTime10.hourOfDay();
        int int12 = property11.getMinimumValue();
        org.joda.time.DateTime dateTime14 = property11.addToCopy(25562);
        java.util.Date date15 = dateTime14.toDate();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.minus(readableDuration23);
        int int25 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Chronology chronology26 = dateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime14.toMutableDateTime(chronology26);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Mar 11 02:00:00 UTC 1973");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.minus(readableDuration14);
        int int16 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.Chronology chronology17 = dateTime9.getChronology();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(7, 69, 0, (-2349), (int) (short) 0, (int) (byte) 0, 9374250, chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2349 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    @Ignore
  public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        boolean boolean14 = dateTime12.isBefore(0L);
        int int15 = dateTime12.getDayOfYear();
        int int16 = dateTime12.getSecondOfDay();
        int int17 = dateTime12.getMonthOfYear();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(0L);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.plus(readableDuration20);
        org.joda.time.DateTime dateTime23 = dateTime19.minusWeeks((int) ' ');
        org.joda.time.DateTime.Property property24 = dateTime19.centuryOfEra();
        boolean boolean25 = dateTime12.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 14400 + "'", int16 == 14400);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    @Ignore
  public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        int int7 = dateTime6.getYearOfCentury();
        org.joda.time.LocalDate localDate8 = dateTime6.toLocalDate();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        java.lang.String str13 = property12.getAsText();
        org.joda.time.DateTime dateTime14 = property12.roundHalfEvenCopy();
        int int15 = property12.get();
        java.util.Locale locale16 = null;
        int int17 = property12.getMaximumTextLength(locale16);
        int int18 = property12.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property12.getFieldType();
        org.joda.time.DateTime.Property property20 = dateTime6.property(dateTimeFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dateTime6.toString("Property[yearOfEra]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    @Ignore
  public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.DateTime dateTime30 = dateTime28.plus(86340001L);
        org.joda.time.DateTime dateTime32 = dateTime28.minusSeconds((-18595));
        org.joda.time.DateTime dateTime34 = dateTime28.plusMonths((int) (byte) -1);
        org.joda.time.DateTime dateTime35 = dateTime28.toDateTime();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    @Ignore
  public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.minus(readableDuration13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) readableDuration13);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        long long17 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime15.plusMonths((-1));
        org.joda.time.DateTime dateTime21 = dateTime19.plusHours(526);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.plus(readableDuration22);
        org.joda.time.DateTime dateTime24 = dateTime23.withLaterOffsetAtOverlap();
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime24.toMutableDateTime();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
    }

    @Test
    @Ignore
  public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(chronology4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.withDurationAdded(readableDuration6, 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.withZone(dateTimeZone9);
        java.util.GregorianCalendar gregorianCalendar11 = dateTime10.toGregorianCalendar();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.plus(readableDuration22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfDay();
        java.lang.String str28 = property27.getAsText();
        org.joda.time.DateTime dateTime29 = property27.roundHalfEvenCopy();
        int int30 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        org.joda.time.DateTime dateTime36 = dateTime33.withMillisOfSecond((int) '#');
        boolean boolean37 = dateTime23.equals((java.lang.Object) dateTime36);
        org.joda.time.DateTime dateTime39 = dateTime36.withDayOfYear(4);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (byte) 1, chronology41);
        org.joda.time.DateTime.Property property43 = dateTime42.minuteOfDay();
        java.lang.String str44 = property43.getAsText();
        org.joda.time.DateTime dateTime45 = property43.roundHalfEvenCopy();
        int int46 = property43.get();
        java.util.Locale locale47 = null;
        int int48 = property43.getMaximumTextLength(locale47);
        int int49 = property43.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property43.getFieldType();
        org.joda.time.DateTime.Property property51 = dateTime39.property(dateTimeFieldType50);
        org.joda.time.DateTime dateTime53 = dateTime10.withField(dateTimeFieldType50, 1439);
        org.joda.time.Chronology chronology54 = dateTime10.getChronology();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (byte) 1, chronology56);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime57.toMutableDateTime();
        org.joda.time.DateTime dateTime60 = dateTime57.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime57.toMutableDateTime(dateTimeZone61);
        org.joda.time.DateTime dateTime64 = dateTime57.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) (byte) 1, chronology66);
        org.joda.time.MutableDateTime mutableDateTime68 = dateTime67.toMutableDateTime();
        int int69 = dateTime67.getDayOfMonth();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTime dateTime71 = dateTime67.toDateTime(chronology70);
        org.joda.time.DateTime dateTime73 = dateTime67.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone74 = dateTime73.getZone();
        org.joda.time.DateTime dateTime75 = dateTime64.toDateTime(dateTimeZone74);
        org.joda.time.DateTime dateTime76 = org.joda.time.DateTime.now(dateTimeZone74);
        org.joda.time.MutableDateTime mutableDateTime77 = dateTime10.toMutableDateTime(dateTimeZone74);
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(dateTimeZone74);
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(62135596801439L, dateTimeZone74);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0" + "'", str28, "0");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "0" + "'", str44, "0");
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(mutableDateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(mutableDateTime68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(dateTimeZone74);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(mutableDateTime77);
    }

    @Test
    @Ignore
  public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.minus(readableDuration13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) readableDuration13);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        long long17 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMillis((int) (short) -1);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded(readableDuration25, 100);
        org.joda.time.DateTime dateTime29 = dateTime22.plusMillis((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay30 = dateTime22.toTimeOfDay();
        boolean boolean31 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime22.minus(readableDuration32);
        org.joda.time.DateTime dateTime35 = dateTime33.withMillisOfDay(9480);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    @Ignore
  public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy(100);
        int int11 = dateTime10.getMillisOfSecond();
        java.util.Date date12 = dateTime10.toDate();
        org.joda.time.DateTime.Property property13 = dateTime10.weekOfWeekyear();
        org.joda.time.DateTime dateTime15 = dateTime10.plusMillis((int) (short) 0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Apr 11 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    @Ignore
  public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.minus(readableDuration13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) readableDuration13);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        long long17 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes(9416954);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readablePeriod20);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime2.withSecondOfMinute((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime8.withDate(4319, (int) (short) 1, 999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    @Ignore
  public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime11.year();
        org.joda.time.DurationField durationField15 = property14.getDurationField();
        org.joda.time.DateTime dateTime16 = property14.getDateTime();
        org.joda.time.DateTime dateTime17 = property14.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    @Ignore
  public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTime dateTime7 = dateTime2.plus(100L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfDay();
        java.lang.String str12 = property11.getAsText();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        int int17 = dateTime15.getDayOfMonth();
        long long18 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = property11.withMinimumValue();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded(readableDuration25, 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.withZone(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime30 = dateTime29.toLocalDateTime();
        org.joda.time.DateTime dateTime31 = dateTime19.withFields((org.joda.time.ReadablePartial) localDateTime30);
        boolean boolean32 = dateTime2.equals((java.lang.Object) dateTime31);
        org.joda.time.DateTime dateTime34 = dateTime2.plusMinutes(1970);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 1, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.toDateTime(chronology38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime42 = dateTime37.withDurationAdded(readableDuration40, 100);
        int int43 = dateTime37.getDayOfMonth();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (byte) 1, chronology45);
        org.joda.time.DateTime dateTime47 = dateTime46.toDateTimeISO();
        org.joda.time.Chronology chronology48 = dateTime47.getChronology();
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(chronology48);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime37.toMutableDateTime(chronology48);
        org.joda.time.DateTime dateTime51 = dateTime2.toDateTime(chronology48);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
    }

    @Test
    @Ignore
  public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime10 = property7.getDateTime();
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillisOfSecond((int) '#');
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        java.lang.String str22 = property21.getAsText();
        org.joda.time.DateTime dateTime23 = property21.roundHalfEvenCopy();
        int int24 = property21.get();
        java.util.Locale locale25 = null;
        int int26 = property21.getMaximumTextLength(locale25);
        int int27 = property21.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property21.getFieldType();
        org.joda.time.DateTime.Property property29 = dateTime14.property(dateTimeFieldType28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.minus(readableDuration37);
        int int39 = dateTime32.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Chronology chronology40 = dateTime32.getChronology();
        org.joda.time.DateTime dateTime41 = dateTime14.toDateTime(chronology40);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(chronology40);
        org.joda.time.DateTime dateTime43 = dateTime10.withChronology(chronology40);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    @Ignore
  public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime7 = dateTime5.toLocalDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        int int12 = dateTime10.getDayOfMonth();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.toDateTime(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime10.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime16.getZone();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime5.toMutableDateTime(dateTimeZone17);
        java.util.Locale locale19 = null;
        java.util.Calendar calendar20 = dateTime5.toCalendar(locale19);
        org.joda.time.DateTime.Property property21 = dateTime5.yearOfEra();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime24.toMutableDateTime();
        int int26 = dateTime24.getDayOfMonth();
        org.joda.time.DateTime dateTime28 = dateTime24.withYearOfEra(1);
        org.joda.time.DateTime.Property property29 = dateTime28.monthOfYear();
        int int30 = dateTime28.getYear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        org.joda.time.DateTime dateTime36 = dateTime33.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime33.toMutableDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime33.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 1, chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime43.toMutableDateTime();
        int int45 = dateTime43.getDayOfMonth();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = dateTime43.toDateTime(chronology46);
        org.joda.time.DateTime dateTime49 = dateTime43.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime49.getZone();
        org.joda.time.DateTime dateTime51 = dateTime40.toDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime28.toMutableDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime54 = dateTime5.withZoneRetainFields(dateTimeZone50);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        int int14 = dateTime12.getDayOfMonth();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime12.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime9.toDateTime(dateTimeZone19);
        org.joda.time.DateTime.Property property21 = dateTime9.secondOfMinute();
        boolean boolean23 = dateTime9.isAfter((long) 19);
        int int24 = dateTime9.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime9.withDayOfYear(25562);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25562 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    @Ignore
  public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) (short) -1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        org.joda.time.DateTime dateTime18 = dateTime15.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime15.toMutableDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime15.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        int int27 = dateTime25.getDayOfMonth();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.toDateTime(chronology28);
        org.joda.time.DateTime dateTime31 = dateTime25.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime31.getZone();
        org.joda.time.DateTime dateTime33 = dateTime22.toDateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(0L, dateTimeZone32);
        org.joda.time.DateTime dateTime36 = dateTime9.withZoneRetainFields(dateTimeZone32);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = dateTime39.toDateTime(chronology40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime44 = dateTime39.withDurationAdded(readableDuration42, 100);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.withZone(dateTimeZone45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime48 = dateTime44.plus(readableDuration47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (byte) 1, chronology50);
        org.joda.time.DateTime.Property property52 = dateTime51.minuteOfDay();
        java.lang.String str53 = property52.getAsText();
        org.joda.time.DateTime dateTime54 = property52.roundHalfEvenCopy();
        int int55 = dateTime48.compareTo((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 1, chronology57);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime58.toMutableDateTime();
        int int60 = dateTime58.getDayOfMonth();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = dateTime58.toDateTime(chronology61);
        org.joda.time.DateTime dateTime64 = dateTime58.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone65 = dateTime64.getZone();
        org.joda.time.DateTime dateTime66 = dateTime54.toDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = dateTime36.toDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime70 = dateTime36.withCenturyOfEra((int) '#');
        org.joda.time.DateTime dateTime72 = dateTime36.minus((long) 23);
        org.joda.time.DateTime dateTime74 = dateTime72.withSecondOfMinute(9);
        org.joda.time.DateTime.Property property75 = dateTime72.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0" + "'", str53, "0");
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(property75);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime8 = dateTime2.plusHours(0);
        org.joda.time.DateTime dateTime10 = dateTime2.plusMillis(7);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime14.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime14.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime24.toMutableDateTime();
        int int26 = dateTime24.getDayOfMonth();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.toDateTime(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime24.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime30.getZone();
        org.joda.time.DateTime dateTime32 = dateTime21.toDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(0L, dateTimeZone31);
        org.joda.time.DateTime dateTime35 = dateTime7.withZoneRetainFields(dateTimeZone31);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfEra();
        long long37 = dateTime35.getMillis();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime40 = dateTime35.withPeriodAdded(readablePeriod38, 9374250);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNotNull(dateTime40);
    }

    @Test
    @Ignore
  public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfYear(365);
        int int16 = dateTime15.getCenturyOfEra();
        org.joda.time.DateTime.Property property17 = dateTime15.millisOfSecond();
        org.joda.time.DateTime.Property property18 = dateTime15.millisOfSecond();
        org.joda.time.DateTime dateTime20 = dateTime15.minusMinutes(52);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        int int14 = dateTime12.getDayOfMonth();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime12.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime9.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTime.Property property22 = dateTime21.weekOfWeekyear();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours(100);
        org.joda.time.DateTime dateTime11 = dateTime7.minusWeeks((int) (byte) 100);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime11.withDayOfYear(20);
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears(526);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.minus(readableDuration21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((java.lang.Object) readableDuration21);
        org.joda.time.DateTime dateTime25 = dateTime23.plusWeeks(0);
        boolean boolean27 = dateTime23.isBefore((long) (byte) 0);
        int int28 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateTime23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = dateTime16.withEra(126);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 126 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.plusMillis(1970);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readablePeriod7);
        org.joda.time.DateTime dateTime10 = dateTime8.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTime dateTime12 = dateTime8.plusMillis(1970);
        int int13 = dateTime12.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    @Ignore
  public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(0L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.joda.time.DateTime.Property property4 = dateTime1.minuteOfDay();
        int int5 = property4.get();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.minusYears((int) ' ');
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    @Ignore
  public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusMillis(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((-18591L));
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.minus(readableDuration30);
        int int32 = dateTime25.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime35 = dateTime28.withPeriodAdded(readablePeriod33, 1439);
        org.joda.time.Chronology chronology36 = dateTime28.getChronology();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) ' ', chronology36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 1, chronology39);
        org.joda.time.DateTime dateTime41 = dateTime40.toDateTimeISO();
        org.joda.time.Chronology chronology42 = dateTime41.getChronology();
        org.joda.time.DateTime dateTime43 = dateTime37.toDateTime(chronology42);
        org.joda.time.DateTime dateTime44 = dateTime21.toDateTime(chronology42);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(292278993, (int) (short) 10, 19, (int) (short) 1, (int) (short) 0, chronology42);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 12, chronology42);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology42);
        org.joda.time.DateTime dateTime48 = dateTime11.withChronology(chronology42);
        org.joda.time.Instant instant49 = dateTime11.toInstant();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(instant49);
    }

    @Test
    @Ignore
  public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime6 = dateTime3.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime3.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.toDateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime13.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime19.getZone();
        org.joda.time.DateTime dateTime21 = dateTime10.toDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj0, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.DateTime dateTime25 = dateTime23.minusWeeks(86398);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.DateTime.Property property32 = dateTime31.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime31.minus(readableDuration33);
        int int35 = dateTime28.compareTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime31.withPeriodAdded(readablePeriod36, 1439);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.plus(readableDuration39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 1, chronology42);
        org.joda.time.DateTime.Property property44 = dateTime43.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.minus(readableDuration45);
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime46.toMutableDateTime();
        org.joda.time.DateTime.Property property48 = dateTime46.weekyear();
        org.joda.time.DateTime dateTime50 = dateTime46.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property51 = dateTime46.weekOfWeekyear();
        java.lang.String str52 = dateTime46.toString();
        org.joda.time.Chronology chronology53 = dateTime46.getChronology();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((java.lang.Object) readableDuration39, chronology53);
        org.joda.time.DateTime dateTime56 = dateTime23.toDateTime(chronology53);
        boolean boolean57 = dateTime56.isEqualNow();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970-01-01T00:00:00.001Z" + "'", str52, "1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    @Ignore
  public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        boolean boolean6 = dateTime5.isEqualNow();
        int int7 = dateTime5.getWeekyear();
        org.joda.time.DateTime dateTime9 = dateTime5.withDayOfMonth((int) (short) 10);
        org.joda.time.DateTime dateTime11 = dateTime9.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusYears(3535);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    @Ignore
  public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime2.plusMinutes((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime2.withPeriodAdded(readablePeriod9, (int) (byte) 100);
        org.joda.time.DateTime dateTime13 = dateTime2.minusMonths(10);
        org.joda.time.DateTime.Property property14 = dateTime2.hourOfDay();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.parse("2");
        int int17 = dateTime16.getMillisOfSecond();
        int int18 = property14.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTimeField dateTimeField19 = property14.getField();
        org.joda.time.DurationField durationField20 = property14.getLeapDurationField();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNull(durationField20);
    }

    @Test
    @Ignore
  public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime7 = dateTime5.toLocalDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property9 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy(949);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTime dateTime21 = dateTime14.plusMillis((int) (short) 1);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (byte) 1, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.toDateTime(chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime24.withDurationAdded(readableDuration27, 100);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = dateTime29.withZone(dateTimeZone30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.plus(readableDuration32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.minuteOfDay();
        java.lang.String str38 = property37.getAsText();
        org.joda.time.DateTime dateTime39 = property37.roundHalfEvenCopy();
        int int40 = dateTime33.compareTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 1, chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime43.toMutableDateTime();
        org.joda.time.DateTime dateTime46 = dateTime43.withMillisOfSecond((int) '#');
        boolean boolean47 = dateTime33.equals((java.lang.Object) dateTime46);
        boolean boolean48 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime50 = dateTime46.minusMonths((int) '4');
        org.joda.time.DateTime dateTime52 = dateTime50.plusMinutes(5);
        org.joda.time.DateTime dateTime54 = dateTime52.minusMinutes(86398);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 1, chronology57);
        org.joda.time.DateTime.Property property59 = dateTime58.minuteOfDay();
        java.lang.String str60 = property59.getAsText();
        org.joda.time.DateTime dateTime61 = property59.getDateTime();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (byte) 1, chronology63);
        org.joda.time.DateTime dateTime65 = dateTime64.toDateTimeISO();
        org.joda.time.Chronology chronology66 = dateTime65.getChronology();
        org.joda.time.DateTime dateTime67 = org.joda.time.DateTime.now(chronology66);
        org.joda.time.DateTime dateTime68 = dateTime61.withChronology(chronology66);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) 35, chronology66);
        org.joda.time.DateTime dateTime70 = dateTime52.withChronology(chronology66);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime11.toMutableDateTime(chronology66);
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) (byte) 1, chronology74);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.DateTime dateTime77 = dateTime75.toDateTime(chronology76);
        org.joda.time.ReadableDuration readableDuration78 = null;
        org.joda.time.DateTime dateTime80 = dateTime75.withDurationAdded(readableDuration78, 100);
        org.joda.time.DateTime.Property property81 = dateTime80.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone82 = dateTime80.getZone();
        org.joda.time.DateTime dateTime83 = new org.joda.time.DateTime(1612319678878L, dateTimeZone82);
        org.joda.time.DateTime dateTime84 = dateTime11.toDateTime(dateTimeZone82);
        org.joda.time.ReadablePeriod readablePeriod85 = null;
        org.joda.time.DateTime dateTime87 = dateTime84.withPeriodAdded(readablePeriod85, 330);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "0" + "'", str60, "0");
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(mutableDateTime71);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(dateTimeZone82);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(dateTime87);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        int int8 = dateTime6.getYear();
        org.joda.time.DateTime.Property property9 = dateTime6.yearOfCentury();
        java.lang.String str10 = property9.getAsString();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime2.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        int int14 = dateTime12.getDayOfMonth();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime12.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime9.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime9.withDayOfMonth(23);
        org.joda.time.DateTime dateTime23 = dateTime22.toDateTimeISO();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillis((long) (byte) -1);
        org.joda.time.DateTime dateTime6 = dateTime2.plusSeconds(19);
        int int7 = dateTime2.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        boolean boolean9 = property8.isLeap();
        org.joda.time.DateTime dateTime11 = property8.addToCopy(365);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis(1970);
        org.joda.time.DateTime.Property property19 = dateTime18.monthOfYear();
        org.joda.time.DateTime.Property property20 = dateTime18.dayOfYear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        org.joda.time.DateTime dateTime26 = dateTime23.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime23.toMutableDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime23.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.toDateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime33.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime39.getZone();
        org.joda.time.DateTime dateTime41 = dateTime30.toDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime18.toMutableDateTime(dateTimeZone40);
        boolean boolean45 = dateTime18.isAfterNow();
        boolean boolean46 = dateTime11.isBefore((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime.Property property47 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime49 = property47.addToCopy((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime49.toMutableDateTimeISO();
        int int51 = mutableDateTime50.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumShortTextLength(locale8);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    @Ignore
  public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusSeconds(4);
        org.joda.time.DateTime.Property property8 = dateTime5.millisOfDay();
        org.joda.time.DateTime dateTime10 = dateTime5.plusMonths(70);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.minus(readableDuration15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime18 = dateTime16.toLocalDateTime();
        org.joda.time.DateTime dateTime19 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded(readableDuration25, 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.withZone(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime30 = dateTime29.toLocalDateTime();
        org.joda.time.DateTime dateTime31 = dateTime16.withFields((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.DateTime dateTime34 = dateTime16.withDurationAdded((long) (short) -1, 1439);
        java.util.Date date35 = dateTime34.toDate();
        org.joda.time.DateTime.Property property36 = dateTime34.dayOfYear();
        org.joda.time.DateTime dateTime37 = property36.roundFloorCopy();
        int int38 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed Dec 31 23:59:58 UTC 1969");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((-18591L));
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.minus(readableDuration16);
        int int18 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime14.withPeriodAdded(readablePeriod19, 1439);
        org.joda.time.Chronology chronology22 = dateTime14.getChronology();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) ' ', chronology22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.DateTime dateTime27 = dateTime26.toDateTimeISO();
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTime dateTime29 = dateTime23.toDateTime(chronology28);
        org.joda.time.DateTime dateTime30 = dateTime7.toDateTime(chronology28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(292278993, (int) (short) 10, 19, (int) (short) 1, (int) (short) 0, chronology28);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 12, chronology28);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology28);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology28);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (byte) 1, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.toDateTime(chronology38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime42 = dateTime37.withDurationAdded(readableDuration40, 100);
        org.joda.time.DateTime.Property property43 = dateTime42.dayOfYear();
        org.joda.time.DateTime dateTime44 = property43.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        boolean boolean46 = dateTime44.isSupported(dateTimeFieldType45);
        org.joda.time.DateTime.Property property47 = dateTime44.centuryOfEra();
        boolean boolean48 = dateTime34.equals((java.lang.Object) property47);
        org.joda.time.DateTime dateTime50 = property47.addWrapFieldToCopy(25);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTime50);
    }

    @Test
    @Ignore
  public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.getDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, chronology7);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology10);
        org.joda.time.DateTime dateTime12 = dateTime5.withChronology(chronology10);
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology10);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        org.joda.time.DateTime dateTime15 = property14.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    @Ignore
  public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        int int12 = dateTime7.getDayOfYear();
        org.joda.time.DateTime dateTime14 = dateTime7.minusMonths(100);
        org.joda.time.DateTime dateTime16 = dateTime7.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime18 = dateTime7.minusYears(126);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.toDateTime(chronology22);
        org.joda.time.DateTime dateTime25 = dateTime21.plusMillis(1970);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.minus(readablePeriod26);
        org.joda.time.DateTime dateTime29 = dateTime27.withDayOfMonth((int) (byte) 1);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        org.joda.time.DateTime dateTime35 = dateTime32.withMillisOfSecond((int) '#');
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (byte) 1, chronology37);
        org.joda.time.DateTime.Property property39 = dateTime38.minuteOfDay();
        java.lang.String str40 = property39.getAsText();
        org.joda.time.DateTime dateTime41 = property39.roundHalfEvenCopy();
        int int42 = property39.get();
        java.util.Locale locale43 = null;
        int int44 = property39.getMaximumTextLength(locale43);
        int int45 = property39.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = property39.getFieldType();
        org.joda.time.DateTime.Property property47 = dateTime32.property(dateTimeFieldType46);
        int int48 = dateTime29.get(dateTimeFieldType46);
        boolean boolean49 = dateTime18.isSupported(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        long long14 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime16 = dateTime12.plusDays((int) (short) 0);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime(chronology20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime24 = dateTime19.withDurationAdded(readableDuration22, 100);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfYear();
        org.joda.time.DurationField durationField26 = property25.getLeapDurationField();
        int int27 = property25.getMaximumValue();
        org.joda.time.DateTime dateTime28 = property25.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime29 = dateTime28.toLocalDateTime();
        org.joda.time.DateTime dateTime30 = dateTime12.withFields((org.joda.time.ReadablePartial) localDateTime29);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNull(durationField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 365 + "'", int27 == 365);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    @Ignore
  public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        long long6 = dateTime5.getMillis();
        org.joda.time.DateTime.Property property7 = dateTime5.centuryOfEra();
        boolean boolean9 = dateTime5.isAfter((long) 9416);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 86340001L + "'", long6 == 86340001L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime.Property property8 = dateTime5.era();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy(292278993);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMonths(365);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears(292278993);
        org.joda.time.DateTime dateTime16 = dateTime14.plus((long) 37);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime6 = dateTime3.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime3.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.toDateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime13.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime19.getZone();
        org.joda.time.DateTime dateTime21 = dateTime10.toDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(0L, dateTimeZone20);
        org.joda.time.DateTime.Property property24 = dateTime23.millisOfDay();
        org.joda.time.DateTime dateTime26 = dateTime23.withMinuteOfHour(59);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    @Ignore
  public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime6 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime7 = dateTime6.withLaterOffsetAtOverlap();
        long long8 = dateTime7.getMillis();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.withPeriodAdded(readablePeriod9, 35);
        int int12 = dateTime7.getHourOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 1, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.minus(readableDuration8);
        int int10 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime6.withPeriodAdded(readablePeriod11, 1439);
        org.joda.time.Chronology chronology14 = dateTime6.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) ' ', chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.year();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.withDurationAdded(readableDuration18, 7);
        int int21 = dateTime20.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate22 = dateTime20.toLocalDate();
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    @Ignore
  public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime dateTime8 = dateTime5.plus((long) 'a');
        org.joda.time.DateTime.Property property9 = dateTime8.secondOfDay();
        org.joda.time.DateTime dateTime11 = property9.addToCopy((int) (byte) -1);
        java.util.Locale locale12 = null;
        int int13 = property9.getMaximumShortTextLength(locale12);
        int int14 = property9.getMinimumValueOverall();
        org.joda.time.DurationField durationField15 = property9.getLeapDurationField();
        java.lang.String str16 = property9.getAsShortText();
        org.joda.time.DateTime dateTime17 = property9.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(durationField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plus((-18591L));
        org.joda.time.DateTime.Property property12 = dateTime11.era();
        org.joda.time.DateTime dateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.DateTime dateTime15 = dateTime13.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.minus(readableDuration14);
        int int16 = dateTime9.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime18 = dateTime12.withSecondOfMinute(23);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.minus(readableDuration23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime24.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime26 = dateTime24.toLocalDateTime();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, chronology28);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime29.toMutableDateTime();
        int int31 = dateTime29.getDayOfMonth();
        org.joda.time.DateTime dateTime33 = dateTime29.withYearOfEra(1);
        org.joda.time.DateTime dateTime36 = dateTime29.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime38 = dateTime36.minusYears(4);
        boolean boolean39 = dateTime24.isAfter((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 1, chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime43.toMutableDateTime();
        org.joda.time.DateTime dateTime46 = dateTime43.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime43.toMutableDateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime43.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (byte) 1, chronology52);
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime53.toMutableDateTime();
        int int55 = dateTime53.getDayOfMonth();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = dateTime53.toDateTime(chronology56);
        org.joda.time.DateTime dateTime59 = dateTime53.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone60 = dateTime59.getZone();
        org.joda.time.DateTime dateTime61 = dateTime50.toDateTime(dateTimeZone60);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (short) 0, dateTimeZone60);
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime24.toMutableDateTime(dateTimeZone60);
        org.joda.time.DateTime dateTime64 = dateTime18.withZoneRetainFields(dateTimeZone60);
        org.joda.time.DateTime dateTime66 = dateTime18.plusSeconds(1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        int int7 = dateTime6.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
    }

    @Test
    @Ignore
  public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        boolean boolean6 = dateTime5.isEqualNow();
        int int7 = dateTime5.getWeekyear();
        org.joda.time.DateTime dateTime9 = dateTime5.withDayOfMonth((int) (short) 10);
        org.joda.time.DateTime dateTime11 = dateTime9.withMillisOfSecond((int) (byte) 100);
        org.joda.time.TimeOfDay timeOfDay12 = dateTime11.toTimeOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(timeOfDay12);
    }

    @Test
    @Ignore
  public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        java.util.GregorianCalendar gregorianCalendar10 = dateTime9.toGregorianCalendar();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.toDateTime(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withDurationAdded(readableDuration16, 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.withZone(dateTimeZone19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.plus(readableDuration21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfDay();
        java.lang.String str27 = property26.getAsText();
        org.joda.time.DateTime dateTime28 = property26.roundHalfEvenCopy();
        int int29 = dateTime22.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        org.joda.time.DateTime dateTime35 = dateTime32.withMillisOfSecond((int) '#');
        boolean boolean36 = dateTime22.equals((java.lang.Object) dateTime35);
        org.joda.time.DateTime dateTime38 = dateTime35.withDayOfYear(4);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (byte) 1, chronology40);
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfDay();
        java.lang.String str43 = property42.getAsText();
        org.joda.time.DateTime dateTime44 = property42.roundHalfEvenCopy();
        int int45 = property42.get();
        java.util.Locale locale46 = null;
        int int47 = property42.getMaximumTextLength(locale46);
        int int48 = property42.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property42.getFieldType();
        org.joda.time.DateTime.Property property50 = dateTime38.property(dateTimeFieldType49);
        org.joda.time.DateTime dateTime52 = dateTime9.withField(dateTimeFieldType49, 1439);
        org.joda.time.DateTime.Property property53 = dateTime52.dayOfYear();
        org.joda.time.DateTime dateTime55 = dateTime52.withCenturyOfEra(949);
        org.joda.time.DateTime dateTime57 = dateTime52.minusMinutes(999);
        org.joda.time.DateTime.Property property58 = dateTime52.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(gregorianCalendar10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0" + "'", str27, "0");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "0" + "'", str43, "0");
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property58);
    }

    @Test
    @Ignore
  public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        java.util.Date date14 = dateTime12.toDate();
        org.joda.time.DateTime.Property property15 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) dateTime12);
        org.joda.time.DateTime dateTime18 = dateTime12.plusMinutes(2922789);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTimeISO();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Jan 05 04:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    @Ignore
  public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DateTime dateTime17 = property15.roundHalfEvenCopy();
        int int18 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        org.joda.time.DateTime dateTime24 = dateTime21.withMillisOfSecond((int) '#');
        boolean boolean25 = dateTime11.equals((java.lang.Object) dateTime24);
        org.joda.time.DateTime dateTime27 = dateTime24.withDayOfYear(4);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 1, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.minuteOfDay();
        java.lang.String str32 = property31.getAsText();
        org.joda.time.DateTime dateTime33 = property31.roundHalfEvenCopy();
        int int34 = property31.get();
        java.util.Locale locale35 = null;
        int int36 = property31.getMaximumTextLength(locale35);
        int int37 = property31.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property31.getFieldType();
        org.joda.time.DateTime.Property property39 = dateTime27.property(dateTimeFieldType38);
        java.util.Locale locale40 = null;
        int int41 = property39.getMaximumTextLength(locale40);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(0L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.joda.time.DateTime dateTime5 = dateTime1.minusHours(365);
        long long6 = dateTime1.getMillis();
        org.joda.time.LocalTime localTime7 = dateTime1.toLocalTime();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    @Ignore
  public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        int int6 = property3.get();
        java.lang.String str7 = property3.toString();
        org.joda.time.DateTime dateTime9 = property3.addToCopy((long) 526);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[minuteOfDay]" + "'", str7, "Property[minuteOfDay]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        int int4 = property3.getMaximumValueOverall();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        java.lang.Object obj9 = null;
        boolean boolean10 = property8.equals(obj9);
        org.joda.time.DateTime dateTime11 = property8.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime12.minus((long) 20);
        int int15 = property3.getDifference((org.joda.time.ReadableInstant) dateTime12);
        int int16 = property3.getMinimumValue();
        int int17 = property3.getLeapAmount();
        long long18 = property3.remainder();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1439 + "'", int4 == 1439);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        int int10 = property8.getMaximumValue();
        org.joda.time.DateTime dateTime12 = property8.setCopy((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readablePeriod13);
        org.joda.time.DateTime dateTime16 = dateTime12.minusDays(0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.minus(readableDuration25);
        int int27 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime23.withPeriodAdded(readablePeriod28, 1439);
        org.joda.time.Chronology chronology31 = dateTime23.getChronology();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) ' ', chronology31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, chronology34);
        org.joda.time.DateTime dateTime36 = dateTime35.toDateTimeISO();
        org.joda.time.Chronology chronology37 = dateTime36.getChronology();
        org.joda.time.DateTime dateTime38 = dateTime32.toDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime16.toMutableDateTime(chronology37);
        org.joda.time.DateTime.Property property40 = dateTime16.weekOfWeekyear();
        org.joda.time.DateTime dateTime41 = property40.withMinimumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    @Ignore
  public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        int int12 = property3.get();
        org.joda.time.DateTime dateTime13 = property3.roundFloorCopy();
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    @Ignore
  public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime2.plusMinutes((int) (byte) -1);
        org.joda.time.DateTime.Property property9 = dateTime2.millisOfSecond();
        java.util.Locale locale10 = null;
        java.util.Calendar calendar11 = dateTime2.toCalendar(locale10);
        org.joda.time.DateTime.Property property12 = dateTime2.millisOfSecond();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    @Ignore
  public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime2.withSecondOfMinute((int) (short) 1);
        java.util.Locale locale9 = null;
        java.util.Calendar calendar10 = dateTime2.toCalendar(locale9);
        org.joda.time.DateTime dateTime12 = dateTime2.minusMonths((int) (short) 0);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withPeriodAdded(readablePeriod15, 142);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 1, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.minus(readableDuration8);
        int int10 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime6.withPeriodAdded(readablePeriod11, 1439);
        org.joda.time.Chronology chronology14 = dateTime6.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) ' ', chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.year();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.withDurationAdded(readableDuration18, 7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTime20.withTime((int) (byte) 0, (int) (short) -1, 9, 142);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = property7.setCopy((-18595));
        java.util.Locale locale12 = null;
        int int13 = property7.getMaximumShortTextLength(locale12);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    @Ignore
  public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime11.plus(readableDuration29);
        org.joda.time.DateTime dateTime32 = dateTime30.withMillisOfSecond((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime30.minus(readableDuration33);
        org.joda.time.DateTime.Property property35 = dateTime30.yearOfCentury();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime.Property property12 = dateTime9.millisOfDay();
        org.joda.time.DateTime dateTime13 = property12.roundCeilingCopy();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime10 = property7.getDateTime();
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        int int12 = property11.get();
        org.joda.time.DateTime dateTime13 = property11.withMaximumValue();
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfHour();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("600070-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(0, 862, (-18595), 126, 25562);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 126 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime6 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime7 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.DateTime.Property property9 = dateTime7.millisOfSecond();
        org.joda.time.DateTime dateTime10 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays(6000001);
        org.joda.time.DateTime.Property property13 = dateTime10.yearOfEra();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.minus(readableDuration14);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        org.joda.time.DateTime dateTime18 = property16.addWrapFieldToCopy((-1));
        int int19 = property16.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-292275054) + "'", int19 == (-292275054));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks(0);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.minus(readableDuration9);
        int int11 = dateTime10.getMillisOfSecond();
        org.joda.time.DateTime.Property property12 = dateTime10.yearOfCentury();
        java.lang.String str13 = property12.getName();
        org.joda.time.DateTime dateTime14 = property12.roundHalfFloorCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 410 + "'", int11 == 410);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "yearOfCentury" + "'", str13, "yearOfCentury");
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    @Ignore
  public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DateTime dateTime17 = property15.roundHalfEvenCopy();
        int int18 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime17);
        boolean boolean19 = dateTime17.isEqualNow();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.DateTime.Property property23 = dateTime22.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.minus(readableDuration24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime25.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime27 = dateTime25.toLocalDateTime();
        org.joda.time.DateTime dateTime28 = dateTime25.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.toDateTime(chronology32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime31.withDurationAdded(readableDuration34, 100);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withZone(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime39 = dateTime38.toLocalDateTime();
        org.joda.time.DateTime dateTime40 = dateTime25.withFields((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.DateTime dateTime41 = dateTime17.withFields((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 1, chronology43);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime44.toMutableDateTime();
        int int46 = dateTime44.getDayOfMonth();
        org.joda.time.DateTime dateTime48 = dateTime44.withYearOfEra(1);
        org.joda.time.DateTime dateTime51 = dateTime44.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime53 = dateTime51.withDayOfYear(20);
        boolean boolean54 = dateTime41.isEqual((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime.Property property55 = dateTime53.minuteOfHour();
        int int56 = property55.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 59 + "'", int56 == 59);
    }

    @Test
    @Ignore
  public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        org.joda.time.DateTime dateTime6 = property3.getDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        org.joda.time.DateTime dateTime13 = dateTime10.withMillisOfSecond((int) '#');
        org.joda.time.DateTime dateTime15 = dateTime10.minus((long) 1);
        org.joda.time.DateTime dateTime17 = dateTime15.withMillisOfSecond((int) (short) 10);
        int int18 = dateTime17.getHourOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.toDateTime(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded(readableDuration24, 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withZone(dateTimeZone27);
        java.util.GregorianCalendar gregorianCalendar29 = dateTime28.toGregorianCalendar();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, chronology31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.toDateTime(chronology33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime37 = dateTime32.withDurationAdded(readableDuration35, 100);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = dateTime37.withZone(dateTimeZone38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.plus(readableDuration40);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 1, chronology43);
        org.joda.time.DateTime.Property property45 = dateTime44.minuteOfDay();
        java.lang.String str46 = property45.getAsText();
        org.joda.time.DateTime dateTime47 = property45.roundHalfEvenCopy();
        int int48 = dateTime41.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (byte) 1, chronology50);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime51.toMutableDateTime();
        org.joda.time.DateTime dateTime54 = dateTime51.withMillisOfSecond((int) '#');
        boolean boolean55 = dateTime41.equals((java.lang.Object) dateTime54);
        org.joda.time.DateTime dateTime57 = dateTime54.withDayOfYear(4);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) (byte) 1, chronology59);
        org.joda.time.DateTime.Property property61 = dateTime60.minuteOfDay();
        java.lang.String str62 = property61.getAsText();
        org.joda.time.DateTime dateTime63 = property61.roundHalfEvenCopy();
        int int64 = property61.get();
        java.util.Locale locale65 = null;
        int int66 = property61.getMaximumTextLength(locale65);
        int int67 = property61.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = property61.getFieldType();
        org.joda.time.DateTime.Property property69 = dateTime57.property(dateTimeFieldType68);
        org.joda.time.DateTime dateTime71 = dateTime28.withField(dateTimeFieldType68, 1439);
        org.joda.time.DateTime.Property property72 = dateTime71.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = property72.getFieldType();
        int int74 = dateTime17.get(dateTimeFieldType73);
        int int75 = dateTime6.get(dateTimeFieldType73);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(gregorianCalendar29);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0" + "'", str46, "0");
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "0" + "'", str62, "0");
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 4 + "'", int66 == 4);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTimeFieldType73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
    }

    @Test
    @Ignore
  public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        int int11 = property3.get();
        org.joda.time.Interval interval12 = property3.toInterval();
        long long13 = property3.remainder();
        java.lang.String str14 = property3.toString();
        org.joda.time.DateTime dateTime15 = property3.roundHalfFloorCopy();
        java.lang.String str16 = property3.getAsText();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Property[minuteOfDay]" + "'", str14, "Property[minuteOfDay]");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        boolean boolean9 = property8.isLeap();
        org.joda.time.DateTime dateTime11 = property8.addToCopy(365);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis(1970);
        org.joda.time.DateTime.Property property19 = dateTime18.monthOfYear();
        org.joda.time.DateTime.Property property20 = dateTime18.dayOfYear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        org.joda.time.DateTime dateTime26 = dateTime23.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime23.toMutableDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime23.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        int int35 = dateTime33.getDayOfMonth();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.toDateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime33.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime39.getZone();
        org.joda.time.DateTime dateTime41 = dateTime30.toDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime18.toMutableDateTime(dateTimeZone40);
        boolean boolean45 = dateTime18.isAfterNow();
        boolean boolean46 = dateTime11.isBefore((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime.Property property47 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime49 = property47.addToCopy((long) (short) 0);
        org.joda.time.DateTime dateTime51 = dateTime49.minus((long) 0);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((java.lang.Object) dateTime49);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime2.toGregorianCalendar();
        org.joda.time.DateTime.Property property5 = dateTime2.monthOfYear();
        org.joda.time.DateTime.Property property6 = dateTime2.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(gregorianCalendar4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) (short) -1);
        org.joda.time.DateTime dateTime13 = dateTime11.minus(0L);
        java.util.GregorianCalendar gregorianCalendar14 = dateTime13.toGregorianCalendar();
        org.joda.time.DateTime dateTime16 = dateTime13.plusDays(949);
        org.joda.time.DateTime dateTime18 = dateTime13.withYear((int) (short) 10);
        org.joda.time.DateTime dateTime19 = dateTime18.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(gregorianCalendar14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plus((-18591L));
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra((int) ' ');
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        org.joda.time.DateTime dateTime19 = dateTime16.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime16.toMutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime16.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        int int28 = dateTime26.getDayOfMonth();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime26.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime32.getZone();
        org.joda.time.DateTime dateTime34 = dateTime23.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime13.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime37 = dateTime36.withTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    @Ignore
  public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks(0);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.minus(readableDuration9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        int int15 = dateTime13.getDayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime13.withYearOfEra(1);
        org.joda.time.DateTime.Property property18 = dateTime17.monthOfYear();
        org.joda.time.DurationField durationField19 = property18.getDurationField();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded(readableDuration25, 100);
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfYear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.DateTime.Property property32 = dateTime31.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime31.minus(readableDuration33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((java.lang.Object) readableDuration33);
        org.joda.time.DateTime.Property property36 = dateTime35.millisOfSecond();
        long long37 = property28.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalTime localTime38 = dateTime35.toLocalTime();
        boolean boolean39 = property18.equals((java.lang.Object) localTime38);
        org.joda.time.DateTime dateTime40 = dateTime6.withFields((org.joda.time.ReadablePartial) localTime38);
        org.joda.time.DateTime.Property property41 = dateTime6.weekyear();
        org.joda.time.DateTime dateTime43 = dateTime6.withWeekyear(60);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-18591L) + "'", long37 == (-18591L));
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    @Ignore
  public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime6 = property3.withMinimumValue();
        int int7 = property3.get();
        org.joda.time.DateTime dateTime8 = property3.withMaximumValue();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) ' ', 0, (-86400000), 9551886, (int) (short) 1, 9374250, 2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9551886 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        int int10 = property8.getMaximumValue();
        org.joda.time.DateTime dateTime12 = property8.setCopy((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readablePeriod13);
        org.joda.time.DateTime dateTime16 = dateTime12.minusDays(0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.minus(readableDuration25);
        int int27 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime23.withPeriodAdded(readablePeriod28, 1439);
        org.joda.time.Chronology chronology31 = dateTime23.getChronology();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) ' ', chronology31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 1, chronology34);
        org.joda.time.DateTime dateTime36 = dateTime35.toDateTimeISO();
        org.joda.time.Chronology chronology37 = dateTime36.getChronology();
        org.joda.time.DateTime dateTime38 = dateTime32.toDateTime(chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime16.toMutableDateTime(chronology37);
        org.joda.time.DateTime dateTime41 = dateTime16.minusYears(1439);
        org.joda.time.DateTime.Property property42 = dateTime16.minuteOfHour();
        java.lang.String str43 = property42.getName();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 365 + "'", int10 == 365);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "minuteOfHour" + "'", str43, "minuteOfHour");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks(0);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.minus(readableDuration9);
        org.joda.time.DateTime dateTime12 = dateTime10.withHourOfDay(0);
        org.joda.time.DateTime.Property property13 = dateTime10.millisOfSecond();
        org.joda.time.DateTime.Property property14 = dateTime10.yearOfCentury();
        org.joda.time.DateTime dateTime16 = dateTime10.withWeekyear(240);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.joda.time.DateTime dateTime11 = property8.addToCopy(365);
        java.util.Locale locale13 = null;
        org.joda.time.DateTime dateTime14 = property8.setCopy("70", locale13);
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTimeISO();
        int int16 = dateTime14.getMinuteOfHour();
        int int17 = dateTime14.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    @Ignore
  public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMinutes(126);
        int int14 = dateTime11.getMinuteOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        org.joda.time.DurationField durationField8 = property7.getDurationField();
        int int9 = property7.getMinimumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = property7.setCopy("1970-01-10T00:00:00.001Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-10T00:00:00.001Z\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    @Ignore
  public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        int int6 = property3.get();
        java.lang.String str7 = property3.toString();
        org.joda.time.DateTime dateTime9 = property3.addWrapFieldToCopy((int) (byte) 100);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfWeek();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[minuteOfDay]" + "'", str7, "Property[minuteOfDay]");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime8 = dateTime2.plusMonths((int) (short) 0);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.DateTime dateTime12 = property9.addWrapFieldToCopy((int) '#');
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((-142000L));
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.minus(readablePeriod6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.withPeriodAdded(readablePeriod8, (int) (byte) 100);
        org.joda.time.DateTime.Property property11 = dateTime7.year();
        org.joda.time.DateTime dateTime13 = dateTime7.withEra((int) (byte) 1);
        int int14 = dateTime7.getCenturyOfEra();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
    }

    @Test
    @Ignore
  public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime9.withDurationAdded(readableDuration12, 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.withZone(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime17 = dateTime16.toLocalDateTime();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        org.joda.time.DateTime dateTime24 = dateTime21.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime21.toMutableDateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime21.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, chronology30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        int int33 = dateTime31.getDayOfMonth();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.toDateTime(chronology34);
        org.joda.time.DateTime dateTime37 = dateTime31.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime37.getZone();
        org.joda.time.DateTime dateTime39 = dateTime28.toDateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(0L, dateTimeZone38);
        org.joda.time.DateTime dateTime42 = dateTime16.withZone(dateTimeZone38);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (byte) 1, chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.minuteOfDay();
        java.lang.String str47 = property46.getAsText();
        org.joda.time.DateTime dateTime48 = property46.roundHalfEvenCopy();
        int int49 = property46.get();
        java.util.Locale locale50 = null;
        int int51 = property46.getMaximumTextLength(locale50);
        int int52 = property46.get();
        int int53 = property46.get();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property46.getFieldType();
        org.joda.time.DateTime.Property property55 = dateTime42.property(dateTimeFieldType54);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 1, chronology57);
        org.joda.time.DateTime dateTime59 = dateTime58.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology60 = dateTime58.getChronology();
        org.joda.time.DateTime dateTime61 = dateTime42.toDateTime(chronology60);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(330, 3, (int) (byte) 1, 1407, (int) 'a', 9401802, 9551886, chronology60);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1407 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "0" + "'", str47, "0");
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTime61);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.withLaterOffsetAtOverlap();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTime2.toString("19", locale5);
        org.joda.time.DateTime dateTime8 = dateTime2.minusWeeks(10);
        int int9 = dateTime2.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = dateTime2.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "19" + "'", str6, "19");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    @Ignore
  public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        java.util.Date date14 = dateTime12.toDate();
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime12.plusDays(10);
        org.joda.time.DateTime dateTime19 = dateTime17.withYear(7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime17.withMonthOfYear(142);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 142 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Jan 05 04:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        boolean boolean14 = dateTime12.isBefore(0L);
        org.joda.time.DateTime.Property property15 = dateTime12.weekOfWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime12.plusSeconds(99);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) (short) -1);
        org.joda.time.DateTime dateTime13 = dateTime11.minus(0L);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.plus(readablePeriod14);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime11.withFieldAdded(durationFieldType16, 436);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    @Ignore
  public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime6 = property3.withMinimumValue();
        boolean boolean7 = dateTime6.isAfterNow();
        org.joda.time.DateTime dateTime9 = dateTime6.withWeekyear(23);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    @Ignore
  public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        java.util.Date date14 = dateTime12.toDate();
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime12.plusDays(10);
        org.joda.time.DateTime dateTime19 = dateTime17.withYear(7);
        boolean boolean21 = dateTime19.isAfter(14399L);
        org.joda.time.DateTime.Property property22 = dateTime19.weekOfWeekyear();
        org.joda.time.DurationField durationField23 = property22.getLeapDurationField();
        java.lang.String str24 = property22.getAsShortText();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Jan 05 04:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNull(durationField23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "3" + "'", str24, "3");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime.Property property8 = dateTime5.era();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy(292278993);
        org.joda.time.DateTime dateTime11 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra((int) (byte) 10);
        org.joda.time.DateTime dateTime15 = dateTime11.minusDays(42);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime.Property property8 = dateTime5.era();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy(292278993);
        int int11 = dateTime10.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.minus(readablePeriod6);
        boolean boolean9 = dateTime7.isEqual((long) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfEra();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.toDateTime(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withDurationAdded(readableDuration16, 100);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.DateTime dateTime22 = dateTime18.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate23 = dateTime22.toLocalDate();
        org.joda.time.DateTime dateTime24 = dateTime7.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.DateTime dateTime26 = dateTime7.plusYears(1439);
        org.joda.time.DateTime dateTime28 = dateTime7.minusSeconds((int) (byte) 0);
        java.util.Locale locale30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = dateTime7.toString("hourOfDay", locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        int int9 = property8.getMinimumValue();
        org.joda.time.DateTime dateTime10 = property8.withMinimumValue();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.minus(readableDuration11);
        org.joda.time.DateTime.Property property13 = dateTime12.weekyear();
        int int14 = property13.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-292275054) + "'", int14 == (-292275054));
    }

    @Test
    @Ignore
  public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        int int11 = property3.get();
        org.joda.time.Interval interval12 = property3.toInterval();
        long long13 = property3.remainder();
        java.lang.String str14 = property3.toString();
        java.util.Locale locale16 = null;
        org.joda.time.DateTime dateTime17 = property3.setCopy("878", locale16);
        java.util.Locale locale18 = null;
        java.lang.String str19 = property3.getAsText(locale18);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Property[minuteOfDay]" + "'", str14, "Property[minuteOfDay]");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
    }

    @Test
    @Ignore
  public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime6 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime7 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTime dateTime11 = dateTime9.withSecondOfMinute(10);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = null;
        java.lang.String str14 = dateTime11.toString(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:10.001Z" + "'", str14, "1970-01-01T00:00:10.001Z");
    }

    @Test
    @Ignore
  public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        java.util.Date date14 = dateTime12.toDate();
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime12.plusDays(10);
        org.joda.time.DateTime.Property property18 = dateTime17.secondOfMinute();
        org.joda.time.DateTime.Property property19 = dateTime17.dayOfMonth();
        org.joda.time.DurationFieldType durationFieldType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime17.withFieldAdded(durationFieldType20, 2922789);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Mon Jan 05 04:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    @Ignore
  public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (byte) 1, chronology25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        org.joda.time.DateTime dateTime29 = dateTime26.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime26.toMutableDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime26.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, chronology35);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime36.toMutableDateTime();
        int int38 = dateTime36.getDayOfMonth();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = dateTime36.toDateTime(chronology39);
        org.joda.time.DateTime dateTime42 = dateTime36.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime42.getZone();
        org.joda.time.DateTime dateTime44 = dateTime33.toDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = dateTime23.withZone(dateTimeZone43);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (byte) 1, chronology47);
        org.joda.time.DateTime.Property property49 = dateTime48.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime51 = dateTime48.minus(readableDuration50);
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime51.toMutableDateTime();
        org.joda.time.DateTime.Property property53 = dateTime51.weekyear();
        org.joda.time.DateTime dateTime55 = property53.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (byte) 1, chronology57);
        org.joda.time.DateTime.Property property59 = dateTime58.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.DateTime dateTime61 = dateTime58.minus(readableDuration60);
        int int62 = dateTime55.compareTo((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime64 = dateTime55.plusHours(5);
        boolean boolean65 = dateTime23.isEqual((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) (byte) 1, chronology68);
        org.joda.time.MutableDateTime mutableDateTime70 = dateTime69.toMutableDateTime();
        org.joda.time.DateTime dateTime72 = dateTime69.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = dateTime69.toMutableDateTime(dateTimeZone73);
        org.joda.time.DateTime dateTime76 = dateTime69.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) (byte) 1, chronology78);
        org.joda.time.MutableDateTime mutableDateTime80 = dateTime79.toMutableDateTime();
        int int81 = dateTime79.getDayOfMonth();
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.DateTime dateTime83 = dateTime79.toDateTime(chronology82);
        org.joda.time.DateTime dateTime85 = dateTime79.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone86 = dateTime85.getZone();
        org.joda.time.DateTime dateTime87 = dateTime76.toDateTime(dateTimeZone86);
        org.joda.time.DateTime dateTime88 = new org.joda.time.DateTime(dateTimeZone86);
        org.joda.time.DateTime dateTime89 = new org.joda.time.DateTime(dateTimeZone86);
        org.joda.time.DateTime dateTime90 = new org.joda.time.DateTime((long) 12, dateTimeZone86);
        org.joda.time.DateTime dateTime91 = dateTime55.withZone(dateTimeZone86);
        org.joda.time.DateTime dateTime92 = org.joda.time.DateTime.now(dateTimeZone86);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(mutableDateTime70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertNotNull(mutableDateTime80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(dateTimeZone86);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(dateTime92);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.DateTime.Property property6 = dateTime5.centuryOfEra();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    @Ignore
  public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime7 = property3.setCopy((int) (byte) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime.Property property10 = dateTime7.weekyear();
        org.joda.time.DateTime dateTime11 = property10.getDateTime();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.minus(readableDuration16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) readableDuration16);
        org.joda.time.DateTime dateTime20 = dateTime18.plusWeeks(0);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.minus(readableDuration21);
        org.joda.time.DateTime dateTime24 = dateTime22.withHourOfDay(0);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, chronology26);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfDay();
        java.lang.String str29 = property28.getAsText();
        org.joda.time.DateTime dateTime30 = property28.roundHalfEvenCopy();
        int int31 = property28.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property28.getFieldType();
        org.joda.time.DateTime.Property property33 = dateTime22.property(dateTimeFieldType32);
        org.joda.time.DateTime.Property property34 = dateTime11.property(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime9.withCenturyOfEra(4);
        boolean boolean14 = dateTime13.isEqualNow();
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    @Ignore
  public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        java.lang.String str14 = property13.getAsText();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, chronology16);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime17.toMutableDateTime();
        int int19 = dateTime17.getDayOfMonth();
        long long20 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime21 = property13.withMinimumValue();
        org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks((int) (byte) 10);
        long long24 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime25 = property7.roundFloorCopy();
        org.joda.time.DurationField durationField26 = property7.getLeapDurationField();
        java.lang.String str27 = property7.getAsShortText();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0" + "'", str14, "0");
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970" + "'", str27, "1970");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        boolean boolean14 = dateTime12.isBefore(0L);
        org.joda.time.DateTime dateTime16 = dateTime12.withYearOfCentury(0);
        org.joda.time.DateTime dateTime18 = dateTime16.withDayOfYear((int) (byte) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMonths(0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime dateTime9 = dateTime7.minusHours(100);
        org.joda.time.DateTime dateTime11 = dateTime7.minusWeeks((int) (byte) 100);
        org.joda.time.DateTime.Property property12 = dateTime7.centuryOfEra();
        org.joda.time.DateTime dateTime13 = dateTime7.toDateTime();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    @Ignore
  public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime6 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime7 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.DateTime.Property property9 = dateTime7.millisOfSecond();
        org.joda.time.DateTime dateTime10 = dateTime7.withEarlierOffsetAtOverlap();
        boolean boolean12 = dateTime7.isBefore(1L);
        org.joda.time.DateTime dateTime14 = dateTime7.withMillisOfDay(4319);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes(335);
        org.joda.time.DateTime.Property property17 = dateTime14.year();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    @Ignore
  public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.DateTime.Property property24 = dateTime23.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime23.getZone();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        org.joda.time.DateTime.Property property12 = dateTime7.millisOfSecond();
        int int13 = property12.getMinimumValueOverall();
        org.joda.time.DateTime dateTime14 = property12.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime14.withTime(100, 59, 9480, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfSecond((int) '#');
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.minus(readablePeriod6);
        boolean boolean9 = dateTime7.isEqual((long) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfEra();
        org.joda.time.DateTime dateTime12 = property10.addToCopy(52);
        java.lang.String str13 = property10.toString();
        int int14 = property10.getLeapAmount();
        org.joda.time.DateTime dateTime16 = property10.addToCopy(42);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Property[yearOfEra]" + "'", str13, "Property[yearOfEra]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    @Ignore
  public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.roundHalfEvenCopy();
        boolean boolean6 = dateTime5.isEqualNow();
        int int7 = dateTime5.getWeekyear();
        org.joda.time.DateTime dateTime9 = dateTime5.withDayOfMonth((int) (short) 10);
        org.joda.time.DateTime dateTime11 = dateTime5.minusMonths((int) 'a');
        org.joda.time.DateTime dateTime13 = dateTime5.withWeekOfWeekyear((int) (short) 1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.minus(readableDuration18);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime19.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime21 = dateTime19.toLocalDateTime();
        org.joda.time.DateTime dateTime22 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.toDateTime(chronology26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.withDurationAdded(readableDuration28, 100);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.withZone(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime33 = dateTime32.toLocalDateTime();
        org.joda.time.DateTime dateTime34 = dateTime19.withFields((org.joda.time.ReadablePartial) localDateTime33);
        boolean boolean35 = dateTime5.isAfter((org.joda.time.ReadableInstant) dateTime19);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime2.plusMinutes((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime2.withPeriodAdded(readablePeriod9, (int) (byte) 100);
        org.joda.time.DateTime dateTime13 = dateTime2.minusMonths(10);
        org.joda.time.DateTime dateTime15 = dateTime13.withYear((int) (short) 100);
        boolean boolean16 = dateTime13.isBeforeNow();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    @Ignore
  public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime(chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        org.joda.time.DateTime dateTime23 = dateTime11.withFields((org.joda.time.ReadablePartial) localDateTime22);
        int int24 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime11.withYear(4);
        org.joda.time.DateTime dateTime28 = dateTime11.withMillis((long) (byte) 10);
        org.joda.time.DateTime dateTime30 = dateTime28.plus(86340001L);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, chronology32);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        org.joda.time.DateTime dateTime36 = dateTime33.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime33.toMutableDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime33.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (byte) 1, chronology42);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime43.toMutableDateTime();
        int int45 = dateTime43.getDayOfMonth();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = dateTime43.toDateTime(chronology46);
        org.joda.time.DateTime dateTime49 = dateTime43.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime49.getZone();
        org.joda.time.DateTime dateTime51 = dateTime40.toDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime54 = dateTime30.withZone(dateTimeZone50);
        java.lang.String str55 = dateTime54.toString();
        int int56 = dateTime54.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "1970-01-01T23:59:00.011Z" + "'", str55, "1970-01-01T23:59:00.011Z");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    @Ignore
  public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfDay();
        java.lang.String str15 = property14.getAsText();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime18.toMutableDateTime();
        int int20 = dateTime18.getDayOfMonth();
        long long21 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime22 = property14.withMinimumValue();
        org.joda.time.DateTime dateTime24 = dateTime22.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime.Property property25 = dateTime22.year();
        org.joda.time.DateTime dateTime27 = dateTime22.withSecondOfMinute((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.minus(readablePeriod28);
        org.joda.time.DateTime dateTime31 = dateTime27.withWeekyear((int) '4');
        boolean boolean32 = property10.equals((java.lang.Object) '4');
        java.lang.String str33 = property10.getAsString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1" + "'", str33, "1");
    }

    @Test
    @Ignore
  public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) readableDuration4);
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfSecond();
        boolean boolean8 = dateTime6.isEqualNow();
        int int9 = dateTime6.getDayOfMonth();
        org.joda.time.DateTime dateTime11 = dateTime6.plusHours(292278993);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime6.withDayOfMonth(366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1L);
    }

    @Test
    @Ignore
  public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.minus(readableDuration13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) readableDuration13);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfSecond();
        long long17 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = dateTime15.plusMonths((-1));
        org.joda.time.DateTime dateTime21 = dateTime19.plusHours(526);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.plus(readableDuration22);
        org.joda.time.DateTime dateTime24 = dateTime23.withLaterOffsetAtOverlap();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readableDuration25);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-18591L) + "'", long17 == (-18591L));
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfYear();
        org.joda.time.DateTime dateTime9 = property8.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        boolean boolean11 = dateTime9.isSupported(dateTimeFieldType10);
        org.joda.time.DateTime.Property property12 = dateTime9.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime15 = dateTime9.withDurationAdded(readableDuration13, (int) (byte) 100);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.toDateTime(chronology8);
        org.joda.time.DateTime dateTime11 = dateTime7.plusMillis(1970);
        org.joda.time.DateTime.Property property12 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime(chronology17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withDurationAdded(readableDuration19, 100);
        org.joda.time.DateTime dateTime24 = dateTime21.withDurationAdded((long) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, chronology27);
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime28.toMutableDateTime();
        org.joda.time.DateTime dateTime31 = dateTime28.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime28.toMutableDateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime28.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (byte) 1, chronology37);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime38.toMutableDateTime();
        int int40 = dateTime38.getDayOfMonth();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = dateTime38.toDateTime(chronology41);
        org.joda.time.DateTime dateTime44 = dateTime38.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTime44.getZone();
        org.joda.time.DateTime dateTime46 = dateTime35.toDateTime(dateTimeZone45);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone45);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(0L, dateTimeZone45);
        org.joda.time.DateTime dateTime49 = dateTime21.withZoneRetainFields(dateTimeZone45);
        org.joda.time.DateTime dateTime50 = dateTime13.toDateTime(dateTimeZone45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(9480, 0, (-86400000), 1407, 36, dateTimeZone45);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1407 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMillis((int) (short) 1);
        boolean boolean12 = dateTime9.isAfterNow();
        org.joda.time.DateTime dateTime14 = dateTime9.withYearOfEra(20);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        int int12 = dateTime7.getDayOfYear();
        org.joda.time.DateTime dateTime14 = dateTime7.minusMonths(100);
        org.joda.time.DateTime dateTime16 = dateTime7.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime18 = dateTime7.withMonthOfYear(2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = dateTime9.plus((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.minus(readableDuration13);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime9.withDayOfWeek(1);
        org.joda.time.DateTime.Property property14 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(0L);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.plus(readableDuration17);
        org.joda.time.DateTime dateTime20 = dateTime16.minusWeeks((int) ' ');
        int int21 = dateTime20.getDayOfYear();
        boolean boolean22 = property14.equals((java.lang.Object) int21);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 142 + "'", int21 == 142);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    @Ignore
  public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfHour();
        org.joda.time.DateTime dateTime13 = dateTime11.withTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime13.withHourOfDay(2819);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2819 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = property7.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(0);
        org.joda.time.DateTime.Property property12 = dateTime11.centuryOfEra();
        org.joda.time.DateTime dateTime14 = property12.addToCopy((long) 25562);
        org.joda.time.DateTime dateTime15 = dateTime14.withTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DurationField durationField8 = property7.getLeapDurationField();
        org.joda.time.DateTime dateTime10 = property7.addWrapFieldToCopy(949);
        org.joda.time.DateTime dateTime12 = dateTime10.minusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime14 = dateTime10.withYearOfEra(19);
        boolean boolean15 = dateTime14.isEqualNow();
        org.joda.time.DateMidnight dateMidnight16 = dateTime14.toDateMidnight();
        org.joda.time.DateTime.Property property17 = dateTime14.dayOfYear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    @Ignore
  public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        org.joda.time.DateTime dateTime6 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime7 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.DateTime.Property property9 = dateTime7.millisOfSecond();
        org.joda.time.DateTime dateTime10 = dateTime7.withEarlierOffsetAtOverlap();
        boolean boolean12 = dateTime7.isBefore(1L);
        org.joda.time.DateTime dateTime14 = dateTime7.withMillisOfDay(4319);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes(335);
        org.joda.time.DateTime dateTime18 = dateTime14.minus((long) (-86400000));
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime18.getZone();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    @Ignore
  public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.toDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime2.withSecondOfMinute((int) (short) 1);
        java.util.Locale locale9 = null;
        java.util.Calendar calendar10 = dateTime2.toCalendar(locale9);
        org.joda.time.LocalDate localDate11 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime13 = dateTime2.plusWeeks((int) (byte) 1);
        org.joda.time.DateTime dateTime15 = dateTime2.plusWeeks(1439);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    @Ignore
  public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.DateTime dateTime5 = property3.withMaximumValue();
        int int6 = property3.getMaximumValue();
        org.joda.time.DateTime dateTime7 = property3.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) dateTime7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, chronology10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        int int13 = dateTime11.getDayOfMonth();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime11.withSecondOfMinute((int) (short) 1);
        java.util.Locale locale18 = null;
        java.util.Calendar calendar19 = dateTime11.toCalendar(locale18);
        java.util.Date date20 = dateTime11.toDate();
        org.joda.time.DateTime.Property property21 = dateTime11.year();
        org.joda.time.DateTime dateTime23 = dateTime11.minusSeconds(335);
        boolean boolean24 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1439 + "'", int6 == 1439);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.toDateTime(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime7 = dateTime2.withDurationAdded(readableDuration5, 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZone(dateTimeZone8);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.plusHours((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        org.joda.time.DateTime dateTime17 = property16.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTime();
        org.joda.time.DateTime dateTime23 = dateTime20.withMillisOfSecond((int) '#');
        org.joda.time.YearMonthDay yearMonthDay24 = dateTime20.toYearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = property16.compareTo((org.joda.time.ReadablePartial) yearMonthDay24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(yearMonthDay24);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((-18591L));
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.minus(readableDuration15);
        int int17 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime20 = dateTime13.withPeriodAdded(readablePeriod18, 1439);
        org.joda.time.Chronology chronology21 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) ' ', chronology21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, chronology24);
        org.joda.time.DateTime dateTime26 = dateTime25.toDateTimeISO();
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.DateTime dateTime28 = dateTime22.toDateTime(chronology27);
        org.joda.time.DateTime dateTime29 = dateTime6.toDateTime(chronology27);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(292278993, (int) (short) 10, 19, (int) (short) 1, (int) (short) 0, chronology27);
        org.joda.time.DateTime.Property property31 = dateTime30.secondOfMinute();
        org.joda.time.DurationField durationField32 = property31.getLeapDurationField();
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNull(durationField32);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getDayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime9 = dateTime2.withDurationAdded((long) (short) 1, 1439);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(4);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMonths((-1));
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    @Ignore
  public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime4 = property3.getDateTime();
        java.util.Locale locale5 = null;
        int int6 = property3.getMaximumTextLength(locale5);
        org.joda.time.DurationField durationField7 = property3.getLeapDurationField();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfDay();
        java.lang.String str12 = property11.getAsText();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        int int17 = dateTime15.getDayOfMonth();
        long long18 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime19 = property11.withMinimumValue();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded(readableDuration25, 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.withZone(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime30 = dateTime29.toLocalDateTime();
        org.joda.time.DateTime dateTime31 = dateTime19.withFields((org.joda.time.ReadablePartial) localDateTime30);
        int int32 = dateTime19.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime34 = dateTime19.withYear(4);
        org.joda.time.DateTime dateTime36 = dateTime19.withMillis((long) (byte) 10);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime19.plus(readableDuration37);
        int int39 = property3.compareTo((org.joda.time.ReadableInstant) dateTime19);
        int int40 = property3.getMinimumValue();
        org.joda.time.DateTime dateTime42 = property3.addToCopy(7);
        int int43 = dateTime42.getYear();
        boolean boolean44 = dateTime42.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone45 = dateTime42.getZone();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1970 + "'", int43 == 1970);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTimeZone45);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.minus(readableDuration9);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime12 = dateTime10.toLocalDateTime();
        org.joda.time.DateTime dateTime13 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime(chronology17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withDurationAdded(readableDuration19, 100);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.withZone(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = dateTime23.toLocalDateTime();
        org.joda.time.DateTime dateTime25 = dateTime10.withFields((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.DateTime dateTime27 = dateTime10.minusYears((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime27.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((-86400000), 0, 949, 9416954, 1970, dateTimeZone28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9416954 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    @Ignore
  public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        java.lang.String str4 = property3.getAsText();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        int int9 = dateTime7.getDayOfMonth();
        long long10 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime11 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int) (byte) 10);
        org.joda.time.DateTime dateTime14 = dateTime13.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime16 = dateTime13.withCenturyOfEra(126);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMillis((int) (short) 1);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime11.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime11.withYearOfCentury((int) '4');
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = property17.setCopy("yearOfCentury");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"yearOfCentury\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (byte) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.DateTime.Property property7 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime9 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        org.joda.time.DateTime dateTime16 = dateTime13.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime13.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime13.withCenturyOfEra(1439);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, chronology22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        int int25 = dateTime23.getDayOfMonth();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.toDateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime23.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        org.joda.time.DateTime dateTime31 = dateTime20.toDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime9.toDateTime(dateTimeZone30);
        org.joda.time.DateTime.Property property34 = dateTime9.era();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
    }
}
