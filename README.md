# arquitecturaEventos
#Primer ejercicio de arquitectura basado en eventos.
#Se debe de correr docker con rabbitmq:
#docker pull rabbitmq:3.11.13-management
#docker run -d -p 15672:15672 -p 5672:5672 rabbitmq:3.11.13-management
#un puerto es de admi y otro de aplicación.
#la carpeta "colas" solo usa rabbit ya que solo escucha
#la carpeta "enviaMensaje" usa rest (HTTP) como rabbit(AMQP), ya que por medio del navegador el usuario envia el mensaje y este es recibido por medio de rabbit.

