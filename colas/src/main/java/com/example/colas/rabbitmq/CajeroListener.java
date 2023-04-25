package com.example.colas.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

//como si fuera un "controlador"
@Component
public class CajeroListener {
    //esta aplicación no necesita un puerto, se usa un puerto solo se usa cuando esta recibiendo información,en lugar de usar un puerto rest esta recibe por rabbit en este caso.
    //pero se puede combinar rest con rabbit.
    @RabbitListener(queues = {"filaClientes"})//indico la cola que quiero escuchar
    public void atenderCliente(String nombre)//va a imprimir eso cada vez que llegue un cliente
    {
        System.out.println("Estoy atendiendo al cliente " + nombre);
    }
}
