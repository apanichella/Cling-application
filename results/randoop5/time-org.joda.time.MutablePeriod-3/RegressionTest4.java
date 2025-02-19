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
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMillis((int) (short) 0);
        int int12 = mutablePeriod4.getYears();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(0L, (long) (short) 1);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMinutes((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        int int17 = mutablePeriod4.indexOf(durationFieldType16);
        mutablePeriod4.addWeeks((int) '4');
        mutablePeriod4.setDays((int) (short) 10);
        int int22 = mutablePeriod4.getMonths();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.Object obj1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(obj1);
        org.joda.time.PeriodType periodType3 = mutablePeriod2.getPeriodType();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) ' ', periodType3, chronology4);
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(periodType3);
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((java.lang.Object) periodType3, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(10L, periodType10, chronology11);
        int int13 = mutablePeriod12.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod12);
        org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod12.getFieldType((int) (short) 1);
        int int17 = mutablePeriod4.get(durationFieldType16);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod22.addMinutes((int) (byte) -1);
        mutablePeriod22.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.Duration duration28 = mutablePeriod22.toDurationFrom(readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod37.setPeriod((long) 100, chronology41);
        mutablePeriod37.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod37.toDurationFrom(readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType53 = null;
        int int54 = mutablePeriod52.indexOf(durationFieldType53);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod59.addHours((-1));
        mutablePeriod52.add((org.joda.time.ReadablePeriod) mutablePeriod59);
        org.joda.time.PeriodType periodType63 = mutablePeriod52.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant47, periodType63);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((long) (short) 10, periodType63);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(0L, 1L, periodType63);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration28, readableInstant29, periodType63);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(periodType63);
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, periodType63);
        int[] intArray70 = mutablePeriod4.getValues();
        int int71 = mutablePeriod4.getWeeks();
        org.joda.time.Chronology chronology74 = null;
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((long) (byte) -1, 0L, chronology74);
        org.joda.time.ReadableInstant readableInstant76 = null;
        org.joda.time.Duration duration77 = mutablePeriod75.toDurationFrom(readableInstant76);
        mutablePeriod4.add((org.joda.time.ReadableDuration) duration77);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(duration77);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant16, readableInstant17, periodType18);
        int int20 = mutablePeriod19.size();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        int int25 = mutablePeriod24.size();
        mutablePeriod19.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        boolean boolean27 = mutablePeriod4.equals((java.lang.Object) mutablePeriod24);
        mutablePeriod24.setMillis((int) '#');
        org.joda.time.ReadableInterval readableInterval30 = null;
        mutablePeriod24.setPeriod(readableInterval30);
        org.joda.time.MutablePeriod mutablePeriod32 = mutablePeriod24.toMutablePeriod();
        mutablePeriod24.addMonths((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod35 = mutablePeriod24.toMutablePeriod();
        int int36 = mutablePeriod35.size();
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(mutablePeriod32);
        org.junit.Assert.assertNotNull(mutablePeriod35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod4.toMutablePeriod();
        int int8 = mutablePeriod7.getYears();
        mutablePeriod7.setPeriod((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = mutablePeriod7.toDurationFrom(readableInstant11);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 1);
        mutablePeriod1.setPeriod((long) (byte) 10, (long) (short) 1);
        int int5 = mutablePeriod1.getHours();
        int int6 = mutablePeriod1.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod1.copy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod7);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = mutablePeriod20.toDurationFrom(readableInstant21);
        mutablePeriod20.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(10L, periodType26, chronology27);
        int int29 = mutablePeriod28.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod28);
        org.joda.time.DurationFieldType durationFieldType32 = mutablePeriod28.getFieldType((int) (short) 1);
        int int33 = mutablePeriod20.get(durationFieldType32);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod38.addMinutes((int) (byte) -1);
        mutablePeriod38.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.Duration duration44 = mutablePeriod38.toDurationFrom(readableInstant43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod53.addHours((-1));
        org.joda.time.Chronology chronology57 = null;
        mutablePeriod53.setPeriod((long) 100, chronology57);
        mutablePeriod53.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant61 = null;
        org.joda.time.Duration duration62 = mutablePeriod53.toDurationFrom(readableInstant61);
        org.joda.time.ReadableInstant readableInstant63 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType69 = null;
        int int70 = mutablePeriod68.indexOf(durationFieldType69);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod75.addHours((-1));
        mutablePeriod68.add((org.joda.time.ReadablePeriod) mutablePeriod75);
        org.joda.time.PeriodType periodType79 = mutablePeriod68.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration62, readableInstant63, periodType79);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) (short) 10, periodType79);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(0L, 1L, periodType79);
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration44, readableInstant45, periodType79);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod(periodType79);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod20, periodType79);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod4, periodType79);
        mutablePeriod86.setPeriod((long) (-98));
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(duration62);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(periodType79);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int5 = mutablePeriod3.getValue((int) (byte) 1);
        int int6 = mutablePeriod3.getDays();
        int int7 = mutablePeriod3.getMonths();
        org.joda.time.MutablePeriod mutablePeriod17 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray18 = mutablePeriod17.getValues();
        int int19 = mutablePeriod17.getHours();
        org.joda.time.MutablePeriod mutablePeriod20 = mutablePeriod17.toMutablePeriod();
        org.joda.time.PeriodType periodType21 = mutablePeriod17.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((-1), 97, (int) (byte) 0, (int) (short) 100, 0, (int) 'a', (int) '4', 1, periodType21);
        org.joda.time.ReadableInterval readableInterval23 = null;
        mutablePeriod22.setPeriod(readableInterval23);
        boolean boolean25 = mutablePeriod3.equals((java.lang.Object) mutablePeriod22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(37, (int) (byte) 10, 4, (int) (short) 10);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        mutablePeriod1.addMonths((int) '4');
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType11 = null;
        int int12 = mutablePeriod10.indexOf(durationFieldType11);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        mutablePeriod10.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.PeriodType periodType21 = mutablePeriod10.getPeriodType();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType21, chronology22);
        int int24 = mutablePeriod23.getYears();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.Duration duration31 = mutablePeriod29.toDurationFrom(readableInstant30);
        mutablePeriod29.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(10L, periodType35, chronology36);
        int int38 = mutablePeriod37.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod37);
        org.joda.time.DurationFieldType durationFieldType41 = mutablePeriod37.getFieldType((int) (short) 1);
        int int42 = mutablePeriod29.get(durationFieldType41);
        int int43 = mutablePeriod23.indexOf(durationFieldType41);
        int int44 = mutablePeriod1.get(durationFieldType41);
        int int45 = mutablePeriod1.getYears();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) '#', chronology47);
        mutablePeriod48.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        mutablePeriod48.setPeriod(readableInstant51, readableInstant52);
        mutablePeriod48.add(97, (int) 'a', 0, (int) (short) 100, (int) (short) 100, (int) (short) 10, (int) ' ', 1);
        int[] intArray63 = mutablePeriod48.getValues();
        boolean boolean64 = mutablePeriod1.equals((java.lang.Object) intArray63);
        org.joda.time.format.PeriodFormatter periodFormatter65 = null;
        java.lang.String str66 = mutablePeriod1.toString(periodFormatter65);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[97, 97, 0, 100, 100, 10, 32, 1]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "P52MT1M0.100S" + "'", str66, "P52MT1M0.100S");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod15.toDurationFrom(readableInstant16);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(readableInstant10, (org.joda.time.ReadableDuration) duration17);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration17);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod24.addHours((-1));
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod24.setPeriod((long) 100, chronology28);
        mutablePeriod24.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Duration duration33 = mutablePeriod24.toDurationFrom(readableInstant32);
        mutablePeriod24.setHours((int) (short) 0);
        mutablePeriod24.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        mutablePeriod24.clear();
        org.joda.time.DurationFieldType durationFieldType46 = null;
        boolean boolean47 = mutablePeriod24.isSupported(durationFieldType46);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) '#', chronology49);
        mutablePeriod50.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.ReadableInstant readableInstant54 = null;
        mutablePeriod50.setPeriod(readableInstant53, readableInstant54);
        org.joda.time.DurationFieldType[] durationFieldTypeArray56 = mutablePeriod50.getFieldTypes();
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(10L, periodType58, chronology59);
        int int61 = mutablePeriod60.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod60);
        org.joda.time.DurationFieldType durationFieldType64 = mutablePeriod60.getFieldType((int) (short) 1);
        mutablePeriod50.set(durationFieldType64, (int) '#');
        boolean boolean67 = mutablePeriod24.isSupported(durationFieldType64);
        mutablePeriod4.set(durationFieldType64, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        int int6 = mutablePeriod3.getHours();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod11.toDurationFrom(readableInstant12);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType29 = null;
        int int30 = mutablePeriod28.indexOf(durationFieldType29);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod35.addHours((-1));
        mutablePeriod28.add((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.PeriodType periodType39 = mutablePeriod28.getPeriodType();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType39, chronology40);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType39);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant6, (org.joda.time.ReadableDuration) duration13, periodType39);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant4, readableInstant5, periodType39);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 197, (long) (-1), periodType39);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) (-41), (long) (byte) 10, periodType39, chronology46);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType13 = mutablePeriod5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        org.joda.time.Chronology chronology22 = null;
        mutablePeriod18.setPeriod((long) 100, chronology22);
        mutablePeriod18.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod18.toDurationFrom(readableInstant26);
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod5.setPeriod((org.joda.time.ReadableDuration) duration27, chronology28);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType39 = null;
        int int40 = mutablePeriod38.indexOf(durationFieldType39);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod45.addHours((-1));
        mutablePeriod38.add((org.joda.time.ReadablePeriod) mutablePeriod45);
        org.joda.time.PeriodType periodType49 = mutablePeriod38.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType49, chronology51);
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(readableInstant0, (org.joda.time.ReadableDuration) duration27, periodType49);
        mutablePeriod53.setSeconds(0);
        mutablePeriod53.add(32, (int) (byte) 100, (int) (short) 0, 52, 34, (-98), 100, (int) '4');
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(periodType49);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (byte) 100, (int) '4', 100, 8, (int) (byte) -1, (int) (short) 0, (-48), 10);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.Duration duration6 = mutablePeriod4.toDurationFrom(readableInstant5);
        mutablePeriod4.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(10L, periodType10, chronology11);
        int int13 = mutablePeriod12.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod12);
        org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod12.getFieldType((int) (short) 1);
        int int17 = mutablePeriod4.get(durationFieldType16);
        mutablePeriod4.addSeconds((int) (byte) 10);
        int int20 = mutablePeriod4.getDays();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        mutablePeriod4.setPeriod(readableInstant21, readableInstant22);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod2.copy();
        mutablePeriod2.addDays((int) (short) 0);
        mutablePeriod2.addDays((int) (short) 10);
        org.junit.Assert.assertNotNull(mutablePeriod8);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(10L, 10L);
        org.joda.time.Chronology chronology4 = null;
        mutablePeriod2.setPeriod((long) 8, chronology4);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray2 = mutablePeriod1.getValues();
        mutablePeriod1.add((int) (short) -1, (int) '4', (int) '4', (int) (byte) 100, 10, 0, (int) ' ', 10);
        int int12 = mutablePeriod1.getMonths();
        int int13 = mutablePeriod1.getMillis();
        mutablePeriod1.setPeriod((long) (short) 10, (long) 35);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 107 + "'", int13 == 107);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        mutablePeriod3.setPeriod((long) (byte) 0, 100L);
        mutablePeriod3.setMonths(97);
        int int9 = mutablePeriod3.getSeconds();
        org.joda.time.ReadableInterval readableInterval10 = null;
        mutablePeriod3.add(readableInterval10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(10L, (long) ' ', chronology5);
        org.joda.time.PeriodType periodType7 = mutablePeriod6.getPeriodType();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (byte) 10, 100L, periodType7, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (short) 10, periodType7, chronology10);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant7, readableInstant8, periodType9);
        int int11 = mutablePeriod10.size();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant12, readableInstant13, periodType14);
        int int16 = mutablePeriod15.size();
        mutablePeriod10.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod15);
        mutablePeriod15.setMonths((int) (byte) 0);
        boolean boolean20 = mutablePeriod4.equals((java.lang.Object) (byte) 0);
        mutablePeriod4.add(8, 10, (int) (short) 10, (-1), (int) ' ', (int) (byte) 1, 100, (int) (short) 100);
        mutablePeriod4.add((long) (byte) -1);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod4.setPeriod(readableDuration32, chronology33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setSeconds(8);
        org.joda.time.PeriodType periodType12 = mutablePeriod4.getPeriodType();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 0, periodType15, chronology16);
        int int18 = mutablePeriod17.getYears();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.Duration duration25 = mutablePeriod23.toDurationFrom(readableInstant24);
        mutablePeriod23.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(10L, periodType29, chronology30);
        int int32 = mutablePeriod31.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod31);
        org.joda.time.DurationFieldType durationFieldType35 = mutablePeriod31.getFieldType((int) (short) 1);
        int int36 = mutablePeriod23.get(durationFieldType35);
        boolean boolean37 = mutablePeriod17.isSupported(durationFieldType35);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod42.addMinutes((int) (byte) -1);
        mutablePeriod42.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Duration duration48 = mutablePeriod42.toDurationFrom(readableInstant47);
        mutablePeriod17.add((org.joda.time.ReadableDuration) duration48);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.Duration duration59 = mutablePeriod57.toDurationTo(readableInstant58);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType70 = null;
        int int71 = mutablePeriod69.indexOf(durationFieldType70);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod76.addHours((-1));
        mutablePeriod69.add((org.joda.time.ReadablePeriod) mutablePeriod76);
        org.joda.time.PeriodType periodType80 = mutablePeriod69.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType80);
        org.joda.time.Chronology chronology82 = null;
        org.joda.time.MutablePeriod mutablePeriod83 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType80, chronology82);
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration59, readableInstant60, periodType80);
        org.joda.time.MutablePeriod mutablePeriod85 = new org.joda.time.MutablePeriod(readableInstant51, readableInstant52, periodType80);
        org.joda.time.MutablePeriod mutablePeriod86 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration48, readableInstant50, periodType80);
        org.joda.time.MutablePeriod mutablePeriod87 = new org.joda.time.MutablePeriod(readableInstant13, (org.joda.time.ReadableDuration) duration48);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration48);
        mutablePeriod4.addMillis(1);
        org.joda.time.Chronology chronology93 = null;
        org.joda.time.MutablePeriod mutablePeriod94 = new org.joda.time.MutablePeriod((long) '4', (long) (byte) -1, chronology93);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod94);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(duration48);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(periodType80);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod4.get(durationFieldType9);
        org.joda.time.ReadableInterval readableInterval11 = null;
        mutablePeriod4.setPeriod(readableInterval11);
        mutablePeriod4.addMonths((int) (byte) -1);
        mutablePeriod4.setYears((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType13 = mutablePeriod5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(periodType13);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) 0, periodType13);
        org.joda.time.ReadableInterval readableInterval16 = null;
        mutablePeriod15.add(readableInterval16);
        java.lang.Object obj18 = mutablePeriod15.clone();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod22 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod27.addHours((-1));
        org.joda.time.Chronology chronology31 = null;
        mutablePeriod27.setPeriod((long) 100, chronology31);
        mutablePeriod27.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = mutablePeriod27.toDurationFrom(readableInstant35);
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType43 = null;
        int int44 = mutablePeriod42.indexOf(durationFieldType43);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod49.addHours((-1));
        mutablePeriod42.add((org.joda.time.ReadablePeriod) mutablePeriod49);
        org.joda.time.PeriodType periodType53 = mutablePeriod42.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration36, readableInstant37, periodType53);
        org.joda.time.Chronology chronology55 = null;
        mutablePeriod22.setPeriod((org.joda.time.ReadableDuration) duration36, chronology55);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod61.addHours((-1));
        org.joda.time.Chronology chronology65 = null;
        mutablePeriod61.setPeriod((long) 100, chronology65);
        mutablePeriod61.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant69 = null;
        org.joda.time.Duration duration70 = mutablePeriod61.toDurationFrom(readableInstant69);
        mutablePeriod61.setHours((int) (short) 0);
        int int73 = mutablePeriod61.getHours();
        mutablePeriod61.setYears(8);
        int int76 = mutablePeriod61.getHours();
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod61.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod81);
        org.joda.time.Chronology chronology84 = null;
        mutablePeriod61.add((long) (short) 0, chronology84);
        mutablePeriod22.add((org.joda.time.ReadablePeriod) mutablePeriod61);
        org.joda.time.DurationFieldType[] durationFieldTypeArray87 = mutablePeriod61.getFieldTypes();
        org.joda.time.Chronology chronology90 = null;
        mutablePeriod61.setPeriod((long) 0, (long) 10, chronology90);
        mutablePeriod61.setPeriod((long) 97);
        org.joda.time.PeriodType periodType94 = mutablePeriod61.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod95 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod20, periodType94);
        mutablePeriod15.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(duration70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray87);
        org.junit.Assert.assertNotNull(periodType94);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        int int6 = mutablePeriod3.getWeeks();
        mutablePeriod3.addMonths(96);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableInstant16, readableInstant17, periodType18);
        int int20 = mutablePeriod19.size();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        int int25 = mutablePeriod24.size();
        mutablePeriod19.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        boolean boolean27 = mutablePeriod4.equals((java.lang.Object) mutablePeriod24);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod32.addHours((-1));
        org.joda.time.Chronology chronology36 = null;
        mutablePeriod32.setPeriod((long) 100, chronology36);
        mutablePeriod32.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Duration duration41 = mutablePeriod32.toDurationFrom(readableInstant40);
        mutablePeriod24.setPeriod((org.joda.time.ReadableDuration) duration41);
        mutablePeriod24.setPeriod((int) (short) 1, (int) (byte) 100, 97, (int) '#', 1, (int) (short) 100, (int) (byte) -1, 97);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.Duration duration58 = mutablePeriod56.toDurationFrom(readableInstant57);
        mutablePeriod56.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(10L, periodType62, chronology63);
        int int65 = mutablePeriod64.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod64);
        org.joda.time.DurationFieldType durationFieldType68 = mutablePeriod64.getFieldType((int) (short) 1);
        int int69 = mutablePeriod56.get(durationFieldType68);
        mutablePeriod24.set(durationFieldType68, (int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod72 = mutablePeriod24.toMutablePeriod();
        org.joda.time.Chronology chronology75 = null;
        mutablePeriod24.setPeriod(0L, (-1L), chronology75);
        mutablePeriod24.addHours((int) (short) 0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod72);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) 0, (long) 'a');
        java.lang.String str3 = mutablePeriod2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0.097S" + "'", str3, "PT0.097S");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        mutablePeriod3.setDays((int) (byte) 1);
        mutablePeriod3.setHours((int) 'a');
        int int12 = mutablePeriod3.getMinutes();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod3.toDurationTo(readableInstant13);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(10, (-1), (int) (byte) -1, (-1));
        mutablePeriod19.addDays(0);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableInstant22, readableInstant23, periodType24);
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod25.setPeriod((long) 8, 100L, chronology28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.Duration duration36 = mutablePeriod34.toDurationFrom(readableInstant35);
        mutablePeriod34.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(10L, periodType40, chronology41);
        int int43 = mutablePeriod42.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod42);
        org.joda.time.DurationFieldType durationFieldType46 = mutablePeriod42.getFieldType((int) (short) 1);
        int int47 = mutablePeriod34.get(durationFieldType46);
        boolean boolean48 = mutablePeriod25.isSupported(durationFieldType46);
        mutablePeriod19.set(durationFieldType46, 0);
        mutablePeriod3.set(durationFieldType46, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 32, (long) (short) 100);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) '4', (long) (byte) -1, chronology2);
        mutablePeriod3.addSeconds((int) (short) 1);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        mutablePeriod4.addSeconds(1);
        int[] intArray9 = mutablePeriod4.getValues();
        mutablePeriod4.addSeconds(4);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 8);
        int int14 = mutablePeriod13.getWeeks();
        boolean boolean15 = mutablePeriod4.equals((java.lang.Object) mutablePeriod13);
        mutablePeriod4.addHours((int) (short) -1);
        mutablePeriod4.addMillis(197);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 97, 1, 1, 97]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(10L, periodType4, chronology5);
        mutablePeriod6.setPeriod((long) (byte) 0, 100L);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod6.toDurationFrom(readableInstant10);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.Duration duration18 = mutablePeriod16.toDurationTo(readableInstant17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType29 = null;
        int int30 = mutablePeriod28.indexOf(durationFieldType29);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod35.addHours((-1));
        mutablePeriod28.add((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.PeriodType periodType39 = mutablePeriod28.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 8, (long) '#', periodType39, chronology41);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration18, readableInstant19, periodType39);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(readableInstant2, (org.joda.time.ReadableDuration) duration11, periodType39);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) '#', 1L, periodType39, chronology45);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((long) 0, periodType48, chronology49);
        int int51 = mutablePeriod50.getYears();
        org.joda.time.Period period52 = mutablePeriod50.toPeriod();
        mutablePeriod46.add((org.joda.time.ReadablePeriod) period52);
        org.joda.time.ReadableInterval readableInterval54 = null;
        mutablePeriod46.add(readableInterval54);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(period52);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        mutablePeriod4.addMinutes((int) (byte) 1);
        org.joda.time.PeriodType periodType16 = mutablePeriod4.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(periodType16);
        java.lang.Object obj18 = mutablePeriod17.clone();
        mutablePeriod17.setHours((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "PT10H");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "PT10H");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "PT10H");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 87, chronology1);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        int int5 = mutablePeriod3.getMillis();
        mutablePeriod3.addMillis((int) (short) 100);
        mutablePeriod3.addMillis((int) (short) 10);
        org.joda.time.format.PeriodFormatter periodFormatter10 = null;
        java.lang.String str11 = mutablePeriod3.toString(periodFormatter10);
        mutablePeriod3.setPeriod(1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0.110S" + "'", str11, "PT0.110S");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        mutablePeriod2.add(1L);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = mutablePeriod2.isSupported(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) 100, 0, (int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(10L, periodType1, chronology2);
        int int4 = mutablePeriod3.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod3);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod3.add((long) 'a', chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((java.lang.Object) chronology7, chronology9);
        mutablePeriod10.setHours((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 0, periodType1, chronology2);
        int int4 = mutablePeriod3.getYears();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod9.toDurationFrom(readableInstant10);
        mutablePeriod9.addMonths((int) (short) 0);
        mutablePeriod9.setYears((int) (byte) 10);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.Duration duration22 = mutablePeriod20.toDurationFrom(readableInstant21);
        mutablePeriod20.setSeconds((int) '4');
        java.lang.String str25 = mutablePeriod20.toString();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) '#', chronology27);
        mutablePeriod28.setMinutes(8);
        mutablePeriod28.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod37.addHours((-1));
        org.joda.time.Chronology chronology41 = null;
        mutablePeriod37.setPeriod((long) 100, chronology41);
        mutablePeriod37.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.Duration duration46 = mutablePeriod37.toDurationFrom(readableInstant45);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration46, readableInstant47);
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod28.setPeriod((org.joda.time.ReadableDuration) duration46, chronology49);
        mutablePeriod28.setHours((int) '4');
        mutablePeriod28.addMillis(8);
        mutablePeriod20.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod28);
        mutablePeriod28.clear();
        int int58 = mutablePeriod28.getValue((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.Duration duration65 = mutablePeriod63.toDurationFrom(readableInstant64);
        mutablePeriod63.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(10L, periodType69, chronology70);
        int int72 = mutablePeriod71.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod71);
        org.joda.time.DurationFieldType durationFieldType75 = mutablePeriod71.getFieldType((int) (short) 1);
        int int76 = mutablePeriod63.get(durationFieldType75);
        mutablePeriod28.add(durationFieldType75, (int) (short) 1);
        mutablePeriod9.add(durationFieldType75, 8);
        int int81 = mutablePeriod3.get(durationFieldType75);
        mutablePeriod3.setPeriod(0L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT97H1M52.097S" + "'", str25, "PT97H1M52.097S");
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(duration65);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(durationFieldType75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        int int1 = mutablePeriod0.getMinutes();
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Duration duration3 = mutablePeriod0.toDurationFrom(readableInstant2);
        mutablePeriod0.addHours(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        mutablePeriod2.add(97, (int) 'a', 0, (int) (short) 100, (int) (short) 100, (int) (short) 10, (int) ' ', 1);
        int[] intArray17 = mutablePeriod2.getValues();
        int int18 = mutablePeriod2.getSeconds();
        mutablePeriod2.setSeconds(4);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 97, 0, 100, 100, 10, 32, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P100M10W1DT10M0.948S");
        int int2 = mutablePeriod1.getMonths();
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType5);
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod6.setPeriod((long) 8, 100L, chronology9);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.Duration duration17 = mutablePeriod15.toDurationFrom(readableInstant16);
        mutablePeriod15.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(10L, periodType21, chronology22);
        int int24 = mutablePeriod23.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod23);
        org.joda.time.DurationFieldType durationFieldType27 = mutablePeriod23.getFieldType((int) (short) 1);
        int int28 = mutablePeriod15.get(durationFieldType27);
        boolean boolean29 = mutablePeriod6.isSupported(durationFieldType27);
        mutablePeriod6.setPeriod(0L);
        mutablePeriod1.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod6);
        org.joda.time.DurationFieldType durationFieldType33 = null;
        int int34 = mutablePeriod6.indexOf(durationFieldType33);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(0L);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.setPeriod((long) (short) 0, chronology3);
        int int5 = mutablePeriod1.getSeconds();
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod1.setPeriod((long) (short) 1, chronology7);
        mutablePeriod1.setMonths((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        int int4 = mutablePeriod3.size();
        mutablePeriod3.addYears(10);
        java.lang.Object obj7 = mutablePeriod3.clone();
        org.joda.time.MutablePeriod mutablePeriod9 = org.joda.time.MutablePeriod.parse("PT97H1M0.097S");
        int[] intArray10 = mutablePeriod9.getValues();
        int int11 = mutablePeriod9.getHours();
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod9.toMutablePeriod();
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        mutablePeriod3.addYears((int) (byte) 100);
        mutablePeriod3.setMinutes(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "P100YT97H10M0.097S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "P100YT97H10M0.097S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "P100YT97H10M0.097S");
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0, 0, 0, 97, 1, 0, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(mutablePeriod12);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(0L, 1L, chronology2);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((-48), 35, 35, 24);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) (short) -1, chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int int4 = mutablePeriod2.indexOf(durationFieldType3);
        mutablePeriod2.addYears((int) (short) 1);
        org.joda.time.PeriodType periodType7 = mutablePeriod2.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(periodType7);
        org.joda.time.Chronology chronology10 = null;
        mutablePeriod8.add((long) (-1), chronology10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.PeriodType periodType0 = null;
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(periodType0);
        org.joda.time.Chronology chronology3 = null;
        mutablePeriod1.add(1L, chronology3);
        int int5 = mutablePeriod1.getDays();
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod1.add((long) ' ', chronology7);
        org.joda.time.DurationFieldType[] durationFieldTypeArray9 = mutablePeriod1.getFieldTypes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationFieldTypeArray9);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setMinutes((int) (short) 100);
        org.joda.time.ReadableInterval readableInterval6 = null;
        mutablePeriod3.setPeriod(readableInterval6);
        int int8 = mutablePeriod3.size();
        int int9 = mutablePeriod3.getMinutes();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) '#', chronology11);
        mutablePeriod12.setMinutes(8);
        mutablePeriod12.setMonths((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod21.addHours((-1));
        org.joda.time.Chronology chronology25 = null;
        mutablePeriod21.setPeriod((long) 100, chronology25);
        mutablePeriod21.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = mutablePeriod21.toDurationFrom(readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration30, readableInstant31);
        org.joda.time.Chronology chronology33 = null;
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration30, chronology33);
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration30);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(10, (-1), (int) (byte) -1, (-1));
        mutablePeriod40.addDays(0);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(readableInstant43, readableInstant44, periodType45);
        org.joda.time.Chronology chronology49 = null;
        mutablePeriod46.setPeriod((long) 8, 100L, chronology49);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.Duration duration57 = mutablePeriod55.toDurationFrom(readableInstant56);
        mutablePeriod55.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod(10L, periodType61, chronology62);
        int int64 = mutablePeriod63.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod63);
        org.joda.time.DurationFieldType durationFieldType67 = mutablePeriod63.getFieldType((int) (short) 1);
        int int68 = mutablePeriod55.get(durationFieldType67);
        boolean boolean69 = mutablePeriod46.isSupported(durationFieldType67);
        mutablePeriod40.set(durationFieldType67, 0);
        boolean boolean72 = mutablePeriod3.isSupported(durationFieldType67);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(duration57);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, (int) (short) 0, (int) (short) 100, (int) 'a');
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        int int6 = mutablePeriod4.indexOf(durationFieldType5);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod11.addHours((-1));
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        mutablePeriod4.setMillis((int) 'a');
        mutablePeriod4.setDays((int) (byte) 100);
        mutablePeriod4.setWeeks((int) (byte) -1);
        int int21 = mutablePeriod4.getSeconds();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        mutablePeriod4.addMonths((int) (byte) -1);
        int int9 = mutablePeriod4.getMinutes();
        mutablePeriod4.add((long) (byte) 10);
        mutablePeriod4.setMonths((int) '4');
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        org.joda.time.Chronology chronology22 = null;
        mutablePeriod18.setPeriod((long) 100, chronology22);
        mutablePeriod18.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod18.toDurationFrom(readableInstant26);
        mutablePeriod18.addMinutes((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType30 = null;
        int int31 = mutablePeriod18.indexOf(durationFieldType30);
        mutablePeriod18.setYears(0);
        mutablePeriod4.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.PeriodType periodType35 = mutablePeriod18.getPeriodType();
        mutablePeriod18.setPeriod((long) (short) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(periodType35);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        mutablePeriod2.setPeriod((int) (byte) 100, 197, (int) '4', 107, (int) (short) 10, (int) (byte) 0, 10, 0);
        int int18 = mutablePeriod2.getValue(0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.Object obj0 = null;
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(obj0, periodType1);
        mutablePeriod2.addDays((int) 'a');
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod2);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        org.joda.time.Chronology chronology21 = null;
        mutablePeriod17.setPeriod((long) 100, chronology21);
        mutablePeriod17.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod17.toDurationFrom(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType33 = null;
        int int34 = mutablePeriod32.indexOf(durationFieldType33);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod39.addHours((-1));
        mutablePeriod32.add((org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.PeriodType periodType43 = mutablePeriod32.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant27, periodType43);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) (short) 10, periodType43);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(0L, 1L, periodType43);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(0, 0, (int) (byte) 100, (int) (byte) 0, (int) '4', (-1), 0, (int) (short) 1, periodType43);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 'a', (long) (short) -1, periodType43, chronology48);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(periodType43);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(periodType43);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.Duration duration13 = mutablePeriod4.toDurationFrom(readableInstant12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType20 = null;
        int int21 = mutablePeriod19.indexOf(durationFieldType20);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod26.addHours((-1));
        mutablePeriod19.add((org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.PeriodType periodType30 = mutablePeriod19.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant14, periodType30);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, readableInstant32);
        mutablePeriod33.add((int) (short) 1, (int) 'a', 0, (int) (byte) 1, (int) (short) 100, (int) (short) 100, (int) (short) 100, (int) (byte) 1);
        org.joda.time.Chronology chronology45 = null;
        mutablePeriod33.setPeriod((long) (short) 0, (long) 'a', chronology45);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(periodType30);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) '4');
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        mutablePeriod1.setPeriod(readableInstant2, readableInstant3);
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType12 = null;
        int int13 = mutablePeriod11.indexOf(durationFieldType12);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod18);
        mutablePeriod6.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod18);
        int int23 = mutablePeriod6.getMinutes();
        org.joda.time.PeriodType periodType24 = mutablePeriod6.getPeriodType();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod1, periodType24, chronology25);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = mutablePeriod10.toDurationFrom(readableInstant11);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod27.indexOf(durationFieldType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        mutablePeriod27.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.PeriodType periodType38 = mutablePeriod27.getPeriodType();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType38, chronology39);
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType38);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(readableInstant5, (org.joda.time.ReadableDuration) duration12, periodType38);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType38);
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) (short) -1, periodType38);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) 8, periodType38, chronology45);
        mutablePeriod46.setMinutes(1);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.Duration duration50 = mutablePeriod46.toDurationTo(readableInstant49);
        org.junit.Assert.assertNotNull(duration12);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(duration50);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(0L, (long) (-48), chronology2);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, readableInstant1);
        java.lang.String str3 = mutablePeriod2.toString();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType9 = null;
        int int10 = mutablePeriod8.indexOf(durationFieldType9);
        mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod8);
        mutablePeriod8.setMillis((int) (short) -1);
        mutablePeriod8.add((long) (short) 100);
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod8.toMutablePeriod();
        mutablePeriod8.setMonths(24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0S" + "'", str3, "PT0S");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(mutablePeriod16);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.PeriodType periodType5 = mutablePeriod4.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod10.addHours((-1));
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod10.setPeriod((long) 100, chronology14);
        mutablePeriod10.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.Duration duration19 = mutablePeriod10.toDurationFrom(readableInstant18);
        mutablePeriod10.addMinutes((int) (byte) 1);
        mutablePeriod4.add((org.joda.time.ReadablePeriod) mutablePeriod10);
        mutablePeriod4.addMillis((int) (short) 100);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        mutablePeriod4.setPeriod(readableInstant25, readableInstant26);
        org.joda.time.PeriodType periodType28 = mutablePeriod4.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod33.addHours((-1));
        org.joda.time.Chronology chronology37 = null;
        mutablePeriod33.setPeriod((long) 100, chronology37);
        mutablePeriod33.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.Duration duration42 = mutablePeriod33.toDurationFrom(readableInstant41);
        mutablePeriod33.setHours((int) (short) 0);
        int int45 = mutablePeriod33.getHours();
        mutablePeriod33.setYears(8);
        mutablePeriod33.addYears((int) 'a');
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) 10, chronology51);
        org.joda.time.MutablePeriod mutablePeriod53 = mutablePeriod52.toMutablePeriod();
        org.joda.time.ReadableInstant readableInstant54 = null;
        org.joda.time.Duration duration55 = mutablePeriod53.toDurationTo(readableInstant54);
        mutablePeriod33.add((org.joda.time.ReadableDuration) duration55);
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration55);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(mutablePeriod53);
        org.junit.Assert.assertNotNull(duration55);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod7.addHours((-1));
        org.joda.time.Chronology chronology11 = null;
        mutablePeriod7.setPeriod((long) 100, chronology11);
        mutablePeriod7.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Duration duration16 = mutablePeriod7.toDurationFrom(readableInstant15);
        mutablePeriod7.addMinutes((int) (byte) 1);
        org.joda.time.format.PeriodFormatter periodFormatter19 = null;
        java.lang.String str20 = mutablePeriod7.toString(periodFormatter19);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType36 = null;
        int int37 = mutablePeriod35.indexOf(durationFieldType36);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod42.addHours((-1));
        mutablePeriod35.add((org.joda.time.ReadablePeriod) mutablePeriod42);
        org.joda.time.PeriodType periodType46 = mutablePeriod35.getPeriodType();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType46, chronology47);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType46);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod7, periodType46, chronology50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) '4', periodType46, chronology52);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType46);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT1M0.100S" + "'", str20, "PT1M0.100S");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(periodType46);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.addHours((int) '#');
        mutablePeriod4.setMillis(97);
        int[] intArray14 = mutablePeriod4.getValues();
        org.joda.time.DurationFieldType durationFieldType16 = mutablePeriod4.getFieldType(1);
        int[] intArray17 = mutablePeriod4.getValues();
        org.joda.time.format.PeriodFormatter periodFormatter18 = null;
        java.lang.String str19 = mutablePeriod4.toString(periodFormatter18);
        int int20 = mutablePeriod4.getYears();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.Duration duration27 = mutablePeriod25.toDurationFrom(readableInstant26);
        org.joda.time.MutablePeriod mutablePeriod28 = mutablePeriod25.toMutablePeriod();
        int int29 = mutablePeriod28.getYears();
        mutablePeriod28.setPeriod((long) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod36.addHours((-1));
        org.joda.time.Chronology chronology40 = null;
        mutablePeriod36.setPeriod((long) 100, chronology40);
        mutablePeriod36.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.Duration duration45 = mutablePeriod36.toDurationFrom(readableInstant44);
        mutablePeriod36.setHours((int) (short) 0);
        mutablePeriod36.setPeriod((int) (short) 0, (int) (byte) 100, (int) (byte) 10, (int) (byte) 1, 0, (int) (byte) 10, (-1), (int) '4');
        mutablePeriod36.clear();
        org.joda.time.DurationFieldType durationFieldType58 = null;
        boolean boolean59 = mutablePeriod36.isSupported(durationFieldType58);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) '#', chronology61);
        mutablePeriod62.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant65 = null;
        org.joda.time.ReadableInstant readableInstant66 = null;
        mutablePeriod62.setPeriod(readableInstant65, readableInstant66);
        org.joda.time.DurationFieldType[] durationFieldTypeArray68 = mutablePeriod62.getFieldTypes();
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod(10L, periodType70, chronology71);
        int int73 = mutablePeriod72.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod72);
        org.joda.time.DurationFieldType durationFieldType76 = mutablePeriod72.getFieldType((int) (short) 1);
        mutablePeriod62.set(durationFieldType76, (int) '#');
        boolean boolean79 = mutablePeriod36.isSupported(durationFieldType76);
        boolean boolean80 = mutablePeriod28.isSupported(durationFieldType76);
        mutablePeriod4.set(durationFieldType76, (int) (short) 1);
        org.joda.time.MutablePeriod mutablePeriod83 = mutablePeriod4.toMutablePeriod();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 35, 0, 0, 97]");
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 35, 0, 0, 97]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT35H0.097S" + "'", str19, "PT35H0.097S");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(mutablePeriod28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(durationFieldTypeArray68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(durationFieldType76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(mutablePeriod83);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant3, readableInstant4, periodType5);
        int int7 = mutablePeriod6.size();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(readableInstant8, readableInstant9, periodType10);
        int int12 = mutablePeriod11.size();
        mutablePeriod6.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.Duration duration15 = mutablePeriod6.toDurationFrom(readableInstant14);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableInstant2, (org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.Duration duration30 = mutablePeriod28.toDurationFrom(readableInstant29);
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType46 = null;
        int int47 = mutablePeriod45.indexOf(durationFieldType46);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod52.addHours((-1));
        mutablePeriod45.add((org.joda.time.ReadablePeriod) mutablePeriod52);
        org.joda.time.PeriodType periodType56 = mutablePeriod45.getPeriodType();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType56, chronology57);
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((int) (short) -1, 0, (int) (short) 0, 0, 100, 0, (int) (short) 0, (int) (byte) -1, periodType56);
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(readableInstant23, (org.joda.time.ReadableDuration) duration30, periodType56);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType56);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) (short) -1, periodType56);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) 8, periodType56, chronology63);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, readableInstant17, periodType56);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType56);
        java.lang.Object obj67 = mutablePeriod66.clone();
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        mutablePeriod66.add(readablePeriod68);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "PT0S");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 10, chronology1);
        java.lang.String str3 = mutablePeriod2.toString();
        mutablePeriod2.setDays(52);
        java.lang.Object obj6 = mutablePeriod2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PT0.010S" + "'", str3, "PT0.010S");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "P52DT0.010S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "P52DT0.010S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "P52DT0.010S");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) (byte) -1, 100, 10, (int) (byte) 0);
        org.joda.time.Chronology chronology6 = null;
        mutablePeriod4.add(1L, chronology6);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) '#', 100L, chronology2);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addHours((-1));
        org.joda.time.Chronology chronology8 = null;
        mutablePeriod4.setPeriod((long) 100, chronology8);
        mutablePeriod4.setMillis((int) (short) 0);
        mutablePeriod4.addMinutes((int) 'a');
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setMillis((int) (short) 0);
        org.joda.time.PeriodType periodType13 = mutablePeriod5.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(periodType13);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) 0, periodType13);
        org.joda.time.ReadableInterval readableInterval16 = null;
        mutablePeriod15.add(readableInterval16);
        org.joda.time.Period period18 = mutablePeriod15.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod23.addHours((-1));
        org.joda.time.Chronology chronology27 = null;
        mutablePeriod23.setPeriod((long) 100, chronology27);
        mutablePeriod23.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Duration duration32 = mutablePeriod23.toDurationFrom(readableInstant31);
        mutablePeriod23.setHours((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(readableInstant35, readableInstant36, periodType37);
        int int39 = mutablePeriod38.size();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(readableInstant40, readableInstant41, periodType42);
        int int44 = mutablePeriod43.size();
        mutablePeriod38.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod43);
        boolean boolean46 = mutablePeriod23.equals((java.lang.Object) mutablePeriod43);
        mutablePeriod43.setMillis((int) '#');
        org.joda.time.ReadableInterval readableInterval49 = null;
        mutablePeriod43.setPeriod(readableInterval49);
        org.joda.time.MutablePeriod mutablePeriod52 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        mutablePeriod52.addMonths((int) '4');
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType62 = null;
        int int63 = mutablePeriod61.indexOf(durationFieldType62);
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod68.addHours((-1));
        mutablePeriod61.add((org.joda.time.ReadablePeriod) mutablePeriod68);
        org.joda.time.PeriodType periodType72 = mutablePeriod61.getPeriodType();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) (short) 0, (long) (short) 0, periodType72, chronology73);
        int int75 = mutablePeriod74.getYears();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.ReadableInstant readableInstant81 = null;
        org.joda.time.Duration duration82 = mutablePeriod80.toDurationFrom(readableInstant81);
        mutablePeriod80.addMonths((int) (short) 0);
        org.joda.time.PeriodType periodType86 = null;
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.MutablePeriod mutablePeriod88 = new org.joda.time.MutablePeriod(10L, periodType86, chronology87);
        int int89 = mutablePeriod88.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod88);
        org.joda.time.DurationFieldType durationFieldType92 = mutablePeriod88.getFieldType((int) (short) 1);
        int int93 = mutablePeriod80.get(durationFieldType92);
        int int94 = mutablePeriod74.indexOf(durationFieldType92);
        int int95 = mutablePeriod52.get(durationFieldType92);
        int int96 = mutablePeriod43.indexOf(durationFieldType92);
        int int97 = mutablePeriod15.indexOf(durationFieldType92);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(mutablePeriod52);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(duration82);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(durationFieldType92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 52 + "'", int95 == 52);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 1 + "'", int97 == 1);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addHours((-1));
        org.joda.time.Chronology chronology9 = null;
        mutablePeriod5.setPeriod((long) 100, chronology9);
        mutablePeriod5.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.Duration duration14 = mutablePeriod5.toDurationFrom(readableInstant13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType21 = null;
        int int22 = mutablePeriod20.indexOf(durationFieldType21);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod27.addHours((-1));
        mutablePeriod20.add((org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.PeriodType periodType31 = mutablePeriod20.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration14, readableInstant15, periodType31);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) (short) 10, periodType31);
        mutablePeriod33.addHours(24);
        org.joda.time.Chronology chronology38 = null;
        mutablePeriod33.setPeriod((long) 107, (long) ' ', chronology38);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(periodType31);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType11 = null;
        int int12 = mutablePeriod10.indexOf(durationFieldType11);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod17.addHours((-1));
        mutablePeriod10.add((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.PeriodType periodType21 = mutablePeriod10.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(readableInstant2, readableInstant3, periodType21);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 8, (long) ' ', periodType21);
        mutablePeriod24.setMillis((int) ' ');
        int int27 = mutablePeriod24.getWeeks();
        org.joda.time.ReadableInterval readableInterval28 = null;
        mutablePeriod24.setPeriod(readableInterval28);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType12 = null;
        int int13 = mutablePeriod11.indexOf(durationFieldType12);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod18.addHours((-1));
        mutablePeriod11.add((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.PeriodType periodType22 = mutablePeriod11.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod2, periodType22);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.Duration duration26 = mutablePeriod2.toDurationTo(readableInstant25);
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant27);
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration26, readableInstant29);
        java.lang.Object obj31 = mutablePeriod30.clone();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "PT1M0.035S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "PT1M0.035S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "PT1M0.035S");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod4.addMinutes((int) (byte) -1);
        int int7 = mutablePeriod4.getSeconds();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        int int9 = mutablePeriod4.indexOf(durationFieldType8);
        int int10 = mutablePeriod4.getHours();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.Duration duration12 = mutablePeriod4.toDurationTo(readableInstant11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration12, readableInstant13);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addHours((-1));
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 100, chronology16);
        mutablePeriod12.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = mutablePeriod12.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod27.indexOf(durationFieldType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        mutablePeriod27.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.PeriodType periodType38 = mutablePeriod27.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant22, periodType38);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) (byte) 0, (int) (byte) -1, (int) (short) 100, (int) (short) -1, 8, (int) (short) 1, 0, (int) (short) 100, periodType38);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutablePeriod40.mergePeriod(readablePeriod41);
        mutablePeriod40.add((long) 'a');
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = org.joda.time.MutablePeriod.parse("PT1M0.100S");
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod52.addHours((-1));
        org.joda.time.Chronology chronology56 = null;
        mutablePeriod52.setPeriod((long) 100, chronology56);
        mutablePeriod52.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.Duration duration61 = mutablePeriod52.toDurationFrom(readableInstant60);
        org.joda.time.ReadableInstant readableInstant62 = null;
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType68 = null;
        int int69 = mutablePeriod67.indexOf(durationFieldType68);
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod74.addHours((-1));
        mutablePeriod67.add((org.joda.time.ReadablePeriod) mutablePeriod74);
        org.joda.time.PeriodType periodType78 = mutablePeriod67.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration61, readableInstant62, periodType78);
        org.joda.time.Chronology chronology80 = null;
        mutablePeriod47.setPeriod((org.joda.time.ReadableDuration) duration61, chronology80);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(readableInstant45, (org.joda.time.ReadableDuration) duration61);
        mutablePeriod40.add((org.joda.time.ReadableDuration) duration61);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(mutablePeriod47);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(periodType78);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod12.addHours((-1));
        org.joda.time.Chronology chronology16 = null;
        mutablePeriod12.setPeriod((long) 100, chronology16);
        mutablePeriod12.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.Duration duration21 = mutablePeriod12.toDurationFrom(readableInstant20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType28 = null;
        int int29 = mutablePeriod27.indexOf(durationFieldType28);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod34.addHours((-1));
        mutablePeriod27.add((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.PeriodType periodType38 = mutablePeriod27.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, readableInstant22, periodType38);
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((int) (byte) 0, (int) (byte) -1, (int) (short) 100, (int) (short) -1, 8, (int) (short) 1, 0, (int) (short) 100, periodType38);
        int int41 = mutablePeriod40.getYears();
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, 1, 52, 8);
        org.joda.time.format.PeriodFormatter periodFormatter5 = null;
        java.lang.String str6 = mutablePeriod4.toString(periodFormatter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT1M52.008S" + "'", str6, "PT1M52.008S");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) '#', chronology1);
        mutablePeriod2.setMinutes(8);
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        mutablePeriod2.setPeriod(readableInstant5, readableInstant6);
        mutablePeriod2.add(97, (int) 'a', 0, (int) (short) 100, (int) (short) 100, (int) (short) 10, (int) ' ', 1);
        int[] intArray17 = mutablePeriod2.getValues();
        int int18 = mutablePeriod2.getYears();
        mutablePeriod2.addHours((int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 97, 0, 100, 100, 10, 32, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PT52M0.003S");
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod5.addMinutes((int) (byte) -1);
        mutablePeriod5.setMinutes((int) 'a');
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.Duration duration11 = mutablePeriod5.toDurationFrom(readableInstant10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod20.addHours((-1));
        org.joda.time.Chronology chronology24 = null;
        mutablePeriod20.setPeriod((long) 100, chronology24);
        mutablePeriod20.setMinutes(0);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Duration duration29 = mutablePeriod20.toDurationFrom(readableInstant28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType36 = null;
        int int37 = mutablePeriod35.indexOf(durationFieldType36);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod42.addHours((-1));
        mutablePeriod35.add((org.joda.time.ReadablePeriod) mutablePeriod42);
        org.joda.time.PeriodType periodType46 = mutablePeriod35.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration29, readableInstant30, periodType46);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) (short) 10, periodType46);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(0L, 1L, periodType46);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration11, readableInstant12, periodType46);
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) '#', chronology55);
        mutablePeriod56.addMinutes(1);
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType66 = null;
        int int67 = mutablePeriod65.indexOf(durationFieldType66);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((int) 'a', (int) (short) 1, 0, (int) 'a');
        mutablePeriod72.addHours((-1));
        mutablePeriod65.add((org.joda.time.ReadablePeriod) mutablePeriod72);
        org.joda.time.PeriodType periodType76 = mutablePeriod65.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) (-1), (long) (byte) -1, periodType76);
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((java.lang.Object) mutablePeriod56, periodType76);
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod(1L, (long) '4', periodType76);
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration11, readableInstant51, periodType76);
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) (byte) 10, periodType76);
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(periodType76);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(duration29);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(periodType76);
    }
}

