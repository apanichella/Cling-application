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
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.MutableInterval mutableInterval5 = mutableInterval2.toMutableInterval();
        org.joda.time.Period period6 = mutableInterval2.toPeriod();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        mutableInterval10.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableInterval mutableInterval17 = new org.joda.time.MutableInterval(0L, 1L, chronology16);
        org.joda.time.Interval interval18 = mutableInterval17.toInterval();
        java.lang.Object obj19 = mutableInterval17.clone();
        org.joda.time.Interval interval20 = mutableInterval17.toInterval();
        org.joda.time.ReadableInterval readableInterval21 = null;
        boolean boolean22 = mutableInterval17.isBefore(readableInterval21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableInterval mutableInterval26 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology25);
        boolean boolean27 = mutableInterval17.isAfter((org.joda.time.ReadableInterval) mutableInterval26);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(0L, 1L, chronology30);
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.DateTime dateTime33 = mutableInterval31.getStart();
        boolean boolean34 = mutableInterval17.isBefore((org.joda.time.ReadableInstant) dateTime33);
        boolean boolean35 = mutableInterval10.contains((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(0L, 1L, chronology38);
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        java.lang.Object obj41 = mutableInterval39.clone();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(obj41, chronology42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        mutableInterval43.setPeriodAfterStart(readablePeriod44);
        org.joda.time.Period period46 = mutableInterval43.toPeriod();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval(0L, 1L, chronology49);
        org.joda.time.Interval interval51 = mutableInterval50.toInterval();
        java.lang.Object obj52 = mutableInterval50.clone();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval(obj52, chronology53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        mutableInterval54.setPeriodAfterStart(readablePeriod55);
        org.joda.time.Period period57 = mutableInterval54.toPeriod();
        mutableInterval43.setPeriodAfterStart((org.joda.time.ReadablePeriod) period57);
        org.joda.time.MutableInterval mutableInterval59 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadablePeriod) period57);
        boolean boolean60 = mutableInterval2.contains((org.joda.time.ReadableInstant) dateTime33);
        mutableInterval2.setInterval(1606267588436L, 1606267624349L);
        org.junit.Assert.assertNotNull(mutableInterval5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(1606267804242L, 1606267698778L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableInterval mutableInterval10 = new org.joda.time.MutableInterval(0L, 1L, chronology9);
        org.joda.time.Interval interval11 = mutableInterval10.toInterval();
        long long12 = interval11.getEndMillis();
        boolean boolean14 = interval11.isAfter((long) (byte) 100);
        boolean boolean15 = mutableInterval3.overlaps((org.joda.time.ReadableInterval) interval11);
        org.joda.time.Duration duration16 = mutableInterval3.toDuration();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        org.joda.time.DateTime dateTime22 = mutableInterval20.getStart();
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.MutableInterval mutableInterval25 = new org.joda.time.MutableInterval(readableInstant23, readablePeriod24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(0L, 1L, chronology28);
        org.joda.time.Interval interval30 = mutableInterval29.toInterval();
        org.joda.time.DateTime dateTime31 = mutableInterval29.getStart();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableInterval mutableInterval35 = new org.joda.time.MutableInterval(0L, 1L, chronology34);
        org.joda.time.Interval interval36 = mutableInterval35.toInterval();
        org.joda.time.DateTime dateTime37 = mutableInterval35.getStart();
        mutableInterval25.setInterval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.MutableInterval mutableInterval43 = new org.joda.time.MutableInterval(readableInstant41, readablePeriod42);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableInterval mutableInterval47 = new org.joda.time.MutableInterval(0L, 1L, chronology46);
        org.joda.time.Interval interval48 = mutableInterval47.toInterval();
        org.joda.time.DateTime dateTime49 = mutableInterval47.getStart();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableInterval mutableInterval53 = new org.joda.time.MutableInterval(0L, 1L, chronology52);
        org.joda.time.Interval interval54 = mutableInterval53.toInterval();
        org.joda.time.DateTime dateTime55 = mutableInterval53.getStart();
        mutableInterval43.setInterval((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.MutableInterval mutableInterval57 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval(readableInstant58, readablePeriod59);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutableInterval mutableInterval64 = new org.joda.time.MutableInterval(0L, 1L, chronology63);
        org.joda.time.Interval interval65 = mutableInterval64.toInterval();
        org.joda.time.DateTime dateTime66 = mutableInterval64.getStart();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableInterval mutableInterval70 = new org.joda.time.MutableInterval(0L, 1L, chronology69);
        org.joda.time.Interval interval71 = mutableInterval70.toInterval();
        org.joda.time.DateTime dateTime72 = mutableInterval70.getStart();
        mutableInterval60.setInterval((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.MutableInterval mutableInterval74 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateTime72);
        mutableInterval74.setEndMillis((long) ' ');
        mutableInterval74.setDurationBeforeEnd(1606267663851L);
        mutableInterval74.setDurationAfterStart(1606267638661L);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(interval48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(interval65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(interval71);
        org.junit.Assert.assertNotNull(dateTime72);
    }

    @Test
    @Ignore
  public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        mutableInterval3.setDurationAfterStart((long) (byte) 1);
        boolean boolean8 = mutableInterval3.equals((java.lang.Object) 0);
        org.joda.time.Chronology chronology9 = mutableInterval3.getChronology();
        long long10 = mutableInterval3.getStartMillis();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableInterval mutableInterval14 = new org.joda.time.MutableInterval(0L, 1L, chronology13);
        org.joda.time.Interval interval15 = mutableInterval14.toInterval();
        mutableInterval14.setDurationAfterStart((long) (byte) 1);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval(0L, 1L, chronology20);
        org.joda.time.Interval interval22 = mutableInterval21.toInterval();
        long long23 = interval22.getEndMillis();
        boolean boolean25 = interval22.isAfter((long) (byte) 100);
        boolean boolean26 = mutableInterval14.overlaps((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration27 = mutableInterval14.toDuration();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableInterval mutableInterval31 = new org.joda.time.MutableInterval(0L, 1L, chronology30);
        org.joda.time.Interval interval32 = mutableInterval31.toInterval();
        org.joda.time.DateTime dateTime33 = mutableInterval31.getStart();
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(readableInstant34, readablePeriod35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval(0L, 1L, chronology39);
        org.joda.time.Interval interval41 = mutableInterval40.toInterval();
        org.joda.time.DateTime dateTime42 = mutableInterval40.getStart();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval(0L, 1L, chronology45);
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        org.joda.time.DateTime dateTime48 = mutableInterval46.getStart();
        mutableInterval36.setInterval((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.MutableInterval mutableInterval50 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.MutableInterval mutableInterval51 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration27, (org.joda.time.ReadableInstant) dateTime48);
        mutableInterval3.setDurationBeforeEnd((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableInterval mutableInterval56 = new org.joda.time.MutableInterval(0L, 1L, chronology55);
        org.joda.time.Interval interval57 = mutableInterval56.toInterval();
        mutableInterval56.setDurationAfterStart((long) (byte) 1);
        mutableInterval56.setDurationAfterStart((long) '#');
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableInterval mutableInterval65 = new org.joda.time.MutableInterval(0L, 1L, chronology64);
        org.joda.time.Interval interval66 = mutableInterval65.toInterval();
        org.joda.time.DateTime dateTime67 = mutableInterval65.getStart();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutableInterval mutableInterval71 = new org.joda.time.MutableInterval(0L, 1L, chronology70);
        org.joda.time.Interval interval72 = mutableInterval71.toInterval();
        java.lang.Object obj73 = mutableInterval71.clone();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutableInterval mutableInterval75 = new org.joda.time.MutableInterval(obj73, chronology74);
        org.joda.time.ReadablePeriod readablePeriod76 = null;
        mutableInterval75.setPeriodAfterStart(readablePeriod76);
        org.joda.time.Period period78 = mutableInterval75.toPeriod();
        org.joda.time.MutableInterval mutableInterval79 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime67, (org.joda.time.ReadablePeriod) period78);
        boolean boolean80 = mutableInterval56.isBefore((org.joda.time.ReadableInstant) dateTime67);
        org.joda.time.MutableInterval mutableInterval81 = new org.joda.time.MutableInterval((org.joda.time.ReadableDuration) duration27, (org.joda.time.ReadableInstant) dateTime67);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj73), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    @Ignore
  public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval(0L, 1L, chronology2);
        org.joda.time.Interval interval4 = mutableInterval3.toInterval();
        org.joda.time.DateTime dateTime5 = mutableInterval3.getStart();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval(readableInstant6, readablePeriod7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(0L, 1L, chronology11);
        org.joda.time.Interval interval13 = mutableInterval12.toInterval();
        org.joda.time.DateTime dateTime14 = mutableInterval12.getStart();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableInterval mutableInterval18 = new org.joda.time.MutableInterval(0L, 1L, chronology17);
        org.joda.time.Interval interval19 = mutableInterval18.toInterval();
        org.joda.time.DateTime dateTime20 = mutableInterval18.getStart();
        mutableInterval8.setInterval((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableInterval mutableInterval22 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = mutableInterval22.getStart();
        boolean boolean25 = mutableInterval22.isBefore((long) (short) 10);
        org.joda.time.Interval interval26 = mutableInterval22.toInterval();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableInterval mutableInterval30 = new org.joda.time.MutableInterval(0L, 1L, chronology29);
        org.joda.time.Interval interval31 = mutableInterval30.toInterval();
        org.joda.time.DateTime dateTime32 = mutableInterval30.getStart();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableInterval mutableInterval36 = new org.joda.time.MutableInterval(0L, 1L, chronology35);
        org.joda.time.Interval interval37 = mutableInterval36.toInterval();
        java.lang.Object obj38 = mutableInterval36.clone();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableInterval mutableInterval40 = new org.joda.time.MutableInterval(obj38, chronology39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableInterval40.setPeriodAfterStart(readablePeriod41);
        org.joda.time.Period period43 = mutableInterval40.toPeriod();
        org.joda.time.MutableInterval mutableInterval44 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadablePeriod) period43);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableInterval mutableInterval48 = new org.joda.time.MutableInterval(0L, 1L, chronology47);
        org.joda.time.Interval interval49 = mutableInterval48.toInterval();
        java.lang.Object obj50 = mutableInterval48.clone();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableInterval mutableInterval52 = new org.joda.time.MutableInterval(obj50, chronology51);
        org.joda.time.Duration duration53 = mutableInterval52.toDuration();
        org.joda.time.MutableInterval mutableInterval54 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableDuration) duration53);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableInterval mutableInterval58 = new org.joda.time.MutableInterval(0L, 1L, chronology57);
        org.joda.time.Interval interval59 = mutableInterval58.toInterval();
        java.lang.Object obj60 = mutableInterval58.clone();
        mutableInterval58.setStartMillis((long) (short) -1);
        org.joda.time.Chronology chronology63 = mutableInterval58.getChronology();
        org.joda.time.MutableInterval mutableInterval64 = mutableInterval58.toMutableInterval();
        org.joda.time.MutableInterval mutableInterval65 = mutableInterval58.copy();
        org.joda.time.Duration duration66 = mutableInterval58.toDuration();
        org.joda.time.MutableInterval mutableInterval67 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant) dateTime32, (org.joda.time.ReadableDuration) duration66);
        mutableInterval22.setInterval((org.joda.time.ReadableInterval) mutableInterval67);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(mutableInterval64);
        org.junit.Assert.assertNotNull(mutableInterval65);
        org.junit.Assert.assertNotNull(duration66);
    }

    @Test
    @Ignore
  public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval(readableInstant0, readablePeriod1);
        mutableInterval2.setDurationBeforeEnd(1L);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.MutableInterval mutableInterval7 = new org.joda.time.MutableInterval(readableInstant5, readablePeriod6);
        long long8 = mutableInterval7.getEndMillis();
        org.joda.time.MutableInterval mutableInterval9 = mutableInterval7.copy();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval(readableDuration10, readableInstant11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = mutableInterval12.toPeriod(periodType13);
        mutableInterval7.setPeriodBeforeEnd((org.joda.time.ReadablePeriod) period14);
        org.joda.time.DateTime dateTime16 = mutableInterval7.getStart();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableInterval mutableInterval20 = new org.joda.time.MutableInterval(0L, 1L, chronology19);
        org.joda.time.Interval interval21 = mutableInterval20.toInterval();
        java.lang.Object obj22 = mutableInterval20.clone();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableInterval mutableInterval24 = new org.joda.time.MutableInterval(obj22, chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        mutableInterval24.setPeriodBeforeEnd(readablePeriod25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MutableInterval mutableInterval29 = new org.joda.time.MutableInterval(readableInstant27, readablePeriod28);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableInterval mutableInterval33 = new org.joda.time.MutableInterval(0L, 1L, chronology32);
        org.joda.time.Interval interval34 = mutableInterval33.toInterval();
        org.joda.time.DateTime dateTime35 = mutableInterval33.getStart();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableInterval mutableInterval39 = new org.joda.time.MutableInterval(0L, 1L, chronology38);
        org.joda.time.Interval interval40 = mutableInterval39.toInterval();
        org.joda.time.DateTime dateTime41 = mutableInterval39.getStart();
        mutableInterval29.setInterval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableInterval mutableInterval46 = new org.joda.time.MutableInterval(0L, 1L, chronology45);
        org.joda.time.Interval interval47 = mutableInterval46.toInterval();
        java.lang.Object obj48 = mutableInterval46.clone();
        org.joda.time.Interval interval49 = mutableInterval46.toInterval();
        org.joda.time.ReadableInterval readableInterval50 = null;
        boolean boolean51 = mutableInterval46.isBefore(readableInterval50);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableInterval mutableInterval55 = new org.joda.time.MutableInterval(0L, (long) (short) 100, chronology54);
        boolean boolean56 = mutableInterval46.isAfter((org.joda.time.ReadableInterval) mutableInterval55);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableInterval mutableInterval60 = new org.joda.time.MutableInterval(0L, 1L, chronology59);
        org.joda.time.Interval interval61 = mutableInterval60.toInterval();
        org.joda.time.DateTime dateTime62 = mutableInterval60.getStart();
        boolean boolean63 = mutableInterval46.isBefore((org.joda.time.ReadableInstant) dateTime62);
        mutableInterval24.setInterval((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateTime62);
        boolean boolean65 = mutableInterval7.isAfter((org.joda.time.ReadableInstant) dateTime62);
        boolean boolean66 = mutableInterval2.overlaps((org.joda.time.ReadableInterval) mutableInterval7);
        org.joda.time.Period period67 = mutableInterval7.toPeriod();
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1606267831028L + "'", long8 == 1606267831028L);
        org.junit.Assert.assertNotNull(mutableInterval9);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "1970-01-01T00:00:00.000Z/1970-01-01T00:00:00.001Z");
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(period67);
    }
}
