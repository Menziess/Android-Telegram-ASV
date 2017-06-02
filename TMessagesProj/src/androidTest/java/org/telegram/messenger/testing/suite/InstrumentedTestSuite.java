package org.telegram.messenger.testing.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import org.telegram.messenger.SendMessagesTest;

/**
 * Created by Stefan on 18-May-17.
 */


// Runs all unit tests.
@RunWith(Suite.class)
@Suite.SuiteClasses({
        SendMessagesTest.class
})

public class InstrumentedTestSuite {}