package org.telegram.messenger.testing.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import org.telegram.messenger.SendMessagesTest;
import org.telegram.messenger.ChatActivityTest;

/**
 * Created by Stefan on 18-May-17.
 */


// Runs all unit tests.
@RunWith(Suite.class)
@Suite.SuiteClasses({
//        SendMessagesTest.class,
//        ChatActivityTest.class
})

public class InstrumentedTestSuite {}