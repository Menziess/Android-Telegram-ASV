package org.telegram.messenger.testing.suite.testing.suite.testing.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import org.telegram.messenger.SendMessagesHelperTest;
import org.telegram.messenger.UtilitiesTest;

/**
 * Created by Stefan on 18-May-17.
 */


// Runs all unit tests.
@RunWith(Suite.class)
@Suite.SuiteClasses({
        SendMessagesHelperTest.class,
        UtilitiesTest.class
})

public class JUnitTestSuite {}