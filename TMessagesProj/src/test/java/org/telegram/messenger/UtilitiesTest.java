package org.telegram.messenger;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by stefa on 23-May-17.
 */
public class UtilitiesTest {

    @Test
    public void testParseIntEmptyString() throws Exception {

        assertTrue(Utilities.parseInt("") == 0);

    }

    @Test
    public void testParseIntNumberStrings() throws Exception {

        assertTrue(Utilities.parseInt("123") == 123);
        assertTrue(Utilities.parseInt("321") == 321);
        assertTrue(Utilities.parseInt("1") == 1);
        assertTrue(Utilities.parseInt("1000.00") == 1000);
        assertTrue(Utilities.parseInt("1,000") == 1);

    }

    @Test
    public void testArrayNotEquals() throws Exception {

        byte[] array1 = {0, 3, 6, 9};
        byte[] array2 = {1, 3, 6, 9};

        assertFalse(Utilities.arraysEquals(array1, 0, array2, 0) == true);

    }

    @Test
    public void testArrayEquals() throws Exception {

        byte[] array1 = {1, 3, 6, 9};
        byte[] array2 = {1, 3, 6, 9};

        assertTrue(Utilities.arraysEquals(array1, 0, array2, 0) == true);

    }
}