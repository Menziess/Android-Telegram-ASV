package org.telegram.messenger;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.telegram.tgnet.TLRPC;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

/**
 * Created by stefa on 23-May-17.
 */
public class SendMessagesHelperTest {

    SendMessagesHelper sendMessagesHelper;

    @Before
    public void setUp() {
        this.sendMessagesHelper = new SendMessagesHelper();
    }

    @Test
    public void testSendMessage() throws Exception {

        ArrayList<MessageObject> messages = new ArrayList<>();
        MessageObject m = mock(MessageObject.class);
        messages.add(
                m
        );

//        SendMessagesHelper messagesHelper = new SendMessagesHelper();
//        sendMessagesHelper.sendMessage(messages, 1);

//        assertEquals(messages.get(0).isSent(), true);
    }

}