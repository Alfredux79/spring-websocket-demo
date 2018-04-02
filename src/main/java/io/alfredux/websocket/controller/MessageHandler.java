package io.alfredux.websocket.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MessageHandler extends TextWebSocketHandler {

	Logger log = LoggerFactory.getLogger(MessageHandler.class);
	
	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message) {
		log.info("recevied message {}",message);
	}

}