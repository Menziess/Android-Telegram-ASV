package org.telegram.messenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MediaActivity;

import static junit.framework.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class SendMessagesTest {

    @Rule
    public ActivityTestRule<LaunchActivity> launchActivityRule =
            new ActivityTestRule<LaunchActivity>(LaunchActivity.class);

    @Test
    public void test() {
        launchActivityRule.launchActivity(new Intent());
        launchActivityRule.getActivity().presentFragment(new ChatActivity(new Bundle()));

        assertTrue(true);
    }

}
