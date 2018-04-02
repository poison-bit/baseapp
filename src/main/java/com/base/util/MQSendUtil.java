package com.base.util;

import javax.jms.Destination;

import org.springframework.jms.core.JmsTemplate;

public class MQSendUtil {
	public static void sendMessage(JmsTemplate jmsTemplate,Destination destination, final Object message){
		jmsTemplate.convertAndSend(destination, message);
		/*jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }  
        });*/
	}
}
