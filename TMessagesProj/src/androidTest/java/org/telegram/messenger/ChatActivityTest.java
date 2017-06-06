package org.telegram.messenger;

import android.widget.TextView;
import static junit.framework.Assert.assertTrue;

import org.telegram.ui.ChatActivity;

/**
 * Created by stefa on 02-Jun-17.
 */

public class ChatActivityTest {
    private ChatActivity chatActivity;

    public ChatActivityTest() {
        TextView textView = (TextView) chatActivity.getFragmentView().findViewById(R.id.label_title);
        assertTrue("title".equals(textView.getText().toString()));
    }
}
