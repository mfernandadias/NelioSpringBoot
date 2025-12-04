package com.devsuperior.desafioinjecaodependencia;


import com.devsuperior.desafioinjecaodependencia.entities.Order;
import com.devsuperior.desafioinjecaodependencia.services.OrderService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DesafioInjecaoDependenciaApplication implements CommandLineRunner  {


    private final OrderService orderService;

    public DesafioInjecaoDependenciaApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args){
        SpringApplication.run(DesafioInjecaoDependenciaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Order order = new Order(1034, 20.0, 150.0);
        System.out.println("----");
        System.out.println("Pedido código " + order.getCode());
        System.out.println("Valor total: R$ " + orderService.total(order));
    }




}
