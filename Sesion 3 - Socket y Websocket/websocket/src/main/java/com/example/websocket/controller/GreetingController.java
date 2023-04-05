package com.example.websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import com.example.websocket.model.Mensaje;

public class GreetingController {
    
    @MessageMapping("/saludo")
    @SendTo("/destino/mensaje")
    public Mensaje greeting(Mensaje mensaje) throws Exception {
        Thread.sleep(100); // simulated delay
        return mensaje;
    }

}
