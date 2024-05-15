package com.santeut.party.common.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Handshake;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.HandshakeInterceptor;

@Slf4j
@RequiredArgsConstructor
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

  private final MyWebSocketHandler myWebSocketHandler;

//  @Override
//  public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//    registry.addHandler(myWebSocketHandler, "/ws/chat").setAllowedOrigins("*");
//  }

  @Override
  public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
    registry.addHandler(myWebSocketHandler, "/ws/chat/room/*").setAllowedOrigins("*")
        .addInterceptors(handShakeInterceptor())
        .setAllowedOrigins("*");
  }

  @Bean
  public HandshakeInterceptor handShakeInterceptor() {
    return new ChattingHandshakeInterceptor();
  }

}
