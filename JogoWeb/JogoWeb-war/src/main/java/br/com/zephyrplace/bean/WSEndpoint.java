package br.com.zephyrplace.bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.jboss.logging.Logger;

@ServerEndpoint("/batata")
public class WSEndpoint {

	Logger log = Logger.getLogger(this.getClass());

	SessionControler sc = SessionControler.getInstance();
	 

	@OnOpen
	public void open(Session session) throws IOException {
		log.info("Open session:" + session.getId());
		sc.onOpen(session);
		session.getBasicRemote().sendText("sessionID:" + session.getId());
		for (Session s : sc.getLista())
			if (s.isOpen() && !(s.getId().equals(session.getId()))) {
				s.getBasicRemote()
						.sendText("jogadores:" + sc.getLista().size());
				break;
			}
	}

	@OnClose
	public void close(Session session, CloseReason c) {
		log.info("Closing:" + session.getId());
		sc.onClose(session);
	}

	@OnMessage
	public void receiveMessage(String message, Session session)
			throws IOException {
		log.info("Received : " + message + ", session:" + session.getId());

		if (message.equals("")) {
			sc.onMessage(session);

			for (Session s : session.getOpenSessions())
				if (s.isOpen()
						&& s.getId().equals(sc.getLista().get(0).getId())) {
					s.getBasicRemote().sendText(
							"sessionID:" + sc.getLista().get(0).getId());
					s.getBasicRemote()
					.sendText("jogadores:" + sc.getLista().size());
				}
		}else if(message.equals("startGame")){
			for (Session s : sc.getLista())
				if (s.isOpen()
						&& !(s.getId().equals(session.getId()))) {
					s.getBasicRemote().sendText(
							"startGame:" + "true");
				}
		}else if(message.equals("preStartGame")){
			for (Session s : sc.getLista())
				if (s.isOpen()
						&& !(s.getId().equals(session.getId()))) {
					s.getBasicRemote().sendText(
							"preStartGame:" + "true");
				}
		}
	}
}
