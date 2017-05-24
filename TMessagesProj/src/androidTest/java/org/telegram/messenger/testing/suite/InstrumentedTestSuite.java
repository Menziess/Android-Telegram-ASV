package org.telegram.messenger.testing.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import org.telegram.messenger.InstrumentedTest;

/**
 * Created by Stefan on 18-May-17.
 */


// Runs all unit tests.
@RunWith(Suite.class)
@Suite.SuiteClasses({
        InstrumentedTest.class
})

public class InstrumentedTestSuite {}