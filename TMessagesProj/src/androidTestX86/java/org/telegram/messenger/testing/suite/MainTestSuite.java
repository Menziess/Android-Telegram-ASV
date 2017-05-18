package org.telegram.messenger.testing.suite;

import org.telegram.messenger.SendMessagesHelperTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Stefan on 18-May-17.
 */


// Runs all unit tests.
@RunWith(Suite.class)
@Suite.SuiteClasses({
        SendMessagesHelperTest.class
})

public class MainTestSuite {}