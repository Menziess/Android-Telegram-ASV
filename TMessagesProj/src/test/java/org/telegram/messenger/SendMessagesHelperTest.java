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
    ArrayList<MessageObject> messages;

    @Before
    public void setUp() {
        this.sendMessagesHelper = mock(SendMessagesHelper.class);
    }

    @Test
    public void testSendMessage() throws Exception {

        this.messages = new ArrayList<>();
        this.messages.add(
            mock(MessageObject.class)
        );

        sendMessagesHelper.sendMessage(messages, 1);

        assertTrue(true);
    }

    @Test
    public void editMessage() throws Exception {

    }

    @Test
    public void isSendingMessage() throws Exception {

    }

}