package io.alfredux.websocket.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectEvent;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;
import org.springframework.web.socket.messaging.SessionSubscribeEvent;
import org.springframework.web.socket.messaging.SessionUnsubscribeEvent;

@Component
public class WebSocketEventListener {

    private static final Logger logger = LoggerFactory.getLogger(WebSocketEventListener.class);

    @EventListener
    public void handleWebSocketSessionConnectedListener(SessionConnectedEvent event) {
        logger.info("Received SessionConnectedEvent {}",event);
    }

    @EventListener
    public void handleWebSocketSessionDisconnectListener(SessionDisconnectEvent event) {
        logger.info("Received SessionDisconnectEvent {}",event);
    }
    
    @EventListener
    public void handleWebSocketSessionConnectListener(SessionConnectEvent event) {
    	logger.info("Received SessionConnectEvent {}",event);
    }
    
    @EventListener
    public void handleWebSessionSuscribeListener(SessionSubscribeEvent event) {
    	logger.info("Received SessionSuscribeEvent {}",event);
    }
    
    @EventListener
    public void handleWebSessionUnSuscribeListener(SessionUnsubscribeEvent event) {
    	logger.info("Received SessionUnsubscribeEvent {}",event);
    }

}
