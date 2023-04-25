package com.example.enviaMensaje.controller;

import com.example.enviaMensaje.service.ServicioPublicaMensaje;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductorController {
    //esta clase usa REST
    private ServicioPublicaMensaje servicioPublicaMensaje;

    @GetMapping(path = "/envia-pedido/{mensajero}")
    public void enviarMensajero(@PathVariable String mensajero)//cabe de aclarar que aqui envio el mensaje por este metodo. Sin embargo, puedo enviar el mensaje directo desde rabbit en la parte de colas y publicar mensaje
    {
        servicioPublicaMensaje.enviarMensaje(mensajero);
    }
}
