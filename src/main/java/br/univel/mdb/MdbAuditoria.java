package br.univel.mdb;

import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;


import br.univel.classes.Venda;

@MessageDriven(name = "MdbAuditoria", activationConfig = {
	    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/TopicVenda"),
	    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class MdbAuditoria implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(MdbAuditoria.class.toString());

	@Override
	public void onMessage(Message rcvMessage){
		ObjectMessage msg = null;
		try{
			if(rcvMessage instanceof TextMessage) {
			msg = (ObjectMessage) rcvMessage;
			Venda venda = (Venda) msg.getObject();
		}else {
			LOGGER.warning("Message of wrong type; " + rcvMessage);
		}
		}catch (JMSException e){
			throw new RuntimeException(e);
		}

}
}
