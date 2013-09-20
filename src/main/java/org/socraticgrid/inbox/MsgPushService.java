/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.socraticgrid.inbox;

import javax.jws.WebService;

/**
 *
 * @author tnguyen
 */
@WebService(serviceName = "MsgPush", portName = "InboxPushPortSoap11", endpointInterface = "org.socraticgrid.inbox.InboxPushPortType", targetNamespace = "urn:org:socraticgrid:inbox", wsdlLocation = "WEB-INF/wsdl/MsgPush.wsdl")
public class MsgPushService {

    public java.lang.String sendMessage(java.lang.String sendMessageRequest) {
        return new MsgPushImpl().sendMessage(sendMessageRequest);
    }
    
}
