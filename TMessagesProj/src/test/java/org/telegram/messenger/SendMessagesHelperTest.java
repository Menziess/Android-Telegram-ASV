package org.telegram.messenger;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

/**
 * Created by stefa on 23-May-17.
 */
public class SendMessagesHelperTest {

    SendMessagesHelper sendMessagesHelper;

    @Before
    public void setUp() {
        this.sendMessagesHelper = mock(SendMessagesHelper.class);
    }

    @Test
    public void testSendMessage() throws Exception {

        ArrayList<MessageObject> messages = new ArrayList<>();
        messages.add(
            mock(MessageObject.class)
        );
        sendMessagesHelper.sendMessage(messages, 1);
        assertTrue(messages.size() == 1);
    }

    @Test
    public void editMessage() throws Exception {


    }

    @Test
    public void isSendingMessage() throws Exception {

    }

}