/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.socraticgrid.inbox;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tnguyen
 */
public class MsgPushImplTest {
    
    public MsgPushImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sendMessage method, of class MsgPushImpl.
     */
    //@Test
    public void testSendMessage() {
        System.out.println("testSendMessage");
        
        String sendMessageRequest = null;;
        String patientId = "997";

        // STATIC msg to send 
       sendMessageRequest =
            "ALERTS="+patientId+",{"
            +"\"messagesFact\": {"
            +"\"successStatus\": true ,"
            +"\"messageObjects\": ["
            +"{"
            +"  \"messageId\": \"444\","
            +"  \"type\": \"Alert\","
            +"  \"location\": \"INBOX\","
            +"  \"labels\": [],"
            +"  \"messageDate\": \"2013-09-11\","
            +"  \"messageTime\": \"12:30\","
            +"  \"description\": \"This patient was prescribed Demerol that has a metabolite, which in the setting of kidney disease may result in increased seizure risk.   The average Creatinine value over the previous 6 measurements was 1.1 indicating impaired renal function.  If an opioid is needed for pain control, consider hydromorphone or fentanyl as alternatives.\","
            +"  \"from\": \"CDS\","
            +"  \"title\": \"Seizure Risk.\","
            +"  \"status\": \"Unread\","
            +"  \"priority\": \"HIGH\","
            +"  \"tasksCount\": 1,"
            +"  \"tasksComplete\": 0"
            +"}"
            +"]"
            +"}"
            +"} ";
        
        MsgPushImpl instance = new MsgPushImpl();
        String result = instance.sendMessage(sendMessageRequest);
        
        
        
    }
}