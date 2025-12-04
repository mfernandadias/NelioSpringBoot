package com.devsuperior.desafioinjecaodependencia.services;


import com.devsuperior.desafioinjecaodependencia.entities.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    /*
    responsáel por calcular o valor do frete com base no valor
    básico do pedido(sem desconto), seguindo a regra:
    * abaixo de R$100,00
    * de R$100,00 até R$200,00
    * R$200,00 ou mais: **Grátis (R$0,0)
     */

    public Double shipment(Order order) {
        double basicValue = order.getBasic();

        if (basicValue < 100.00) {
            return 20.00; // Frete: R$ 20,00
        } else if (basicValue >= 100.00 && basicValue < 200.00) {
            return 12.00; // Frete: R$ 12,00
        } else { // basicValue >= 200.00
            return 0.00; // Frete Grátis
        }
    }

}
