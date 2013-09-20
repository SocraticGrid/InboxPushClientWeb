/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.socraticgrid.inbox;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.socraticgrid.inboxpushclient.PushSessionMgr;

/**
 *
 * @author tnguyen
 */
public class MsgPushImpl extends MsgPushService {

    @Override
    public String sendMessage(String sendMessageRequest) {
        
        String response = null;
        
        //----------------------------------------
        // Push Alerts to Client
        //----------------------------------------
        PushSessionMgr client = new PushSessionMgr();
        try {
            System.out.println("===> MsgPushImpl.sendMessage(): ");
            client.pushMsg(sendMessageRequest);
            response = "Success";

        } catch (Exception ex) {
            Logger.getLogger(MsgPushImpl.class.getName()).log(Level.SEVERE, null, ex);
            response = "PushSessionMgr.pushMsg failure with " + ex.getMessage();
            ex.printStackTrace();
        }
        
        return response;
    }
    
}
