package com.example.enviaMensaje.service;

import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
@AllArgsConstructor
public class ServicioPublicaMensaje {
    //esta clase usa rabbit

    private RabbitTemplate rabbitTemplate;

    public void enviarMensaje(String mensajero)
    {
        rabbitTemplate.convertAndSend("adminFila","Cliente",mensajero);//coloco el exchange, la clave y el mensajero como tal
    }
}
