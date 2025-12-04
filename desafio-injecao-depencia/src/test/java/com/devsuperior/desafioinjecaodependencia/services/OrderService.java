package com.devsuperior.desafioinjecaodependencia.services;


import com.devsuperior.desafioinjecaodependencia.entities.Order;
import org.springframework.stereotype.Service;

@Service //também é um tipo de Componente, mais específico para Serviços de Regra

public class OrderService {

    private final ShippingService shippingService;


    //injeção por construtor (recomendo)
    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }


    /*

     */
    public Double total(Order order) {
        // 1. Aplica o Desconto
        double discountedValue = order.getBasic() * (1.0 - order.getDiscount() / 100.0);

        // 2. Obtém o Valor do Frete usando o Serviço Injetado
        double shippingFee = shippingService.shipment(order);

        // 3. Calcula o Valor Total
        return discountedValue + shippingFee;
    }


}
