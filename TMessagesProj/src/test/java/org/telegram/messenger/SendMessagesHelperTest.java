package org.telegram.messenger;

import org.junit.Before;
import org.junit.Test;
import org.telegram.messenger.SendMessagesHelper;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by stefa on 23-May-17.
 */
public class SendMessagesHelperTest {

    SendMessagesHelper sendMessagesHelper;
    ArrayList<MessageObject> messages;

    @Before
    public void setUp() {
        this.sendMessagesHelper = new SendMessagesHelper();
    }

    @Test
    public void testSendMessage() throws Exception {
        this.messages = new ArrayList<>();
        MessageObject message = mock(MessageObject.class);
        this.messages.add(message);

        sendMessagesHelper.sendMessage(messages, 1);

        assertTrue(this.messages.size() == 0);
    }

    @Test
    public void editMessage() throws Exception {

    }

    @Test
    public void isSendingMessage() throws Exception {

    }

}