package com.devsuperior.desafioinjecaodependencia.entities;


public class Order {

    //variavéis
    private Integer code;
    private Double basic; //valor básico do pedido (sem desconto)
    private Double discount; //porcentagem de desconto (ex: 20.0 -> 20%)

    public Order() {
    }

    //construtor
    public Order(Integer code, Double discount, Double basic) {
        this.code = code;
        this.discount = discount;
        this.basic = basic;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }
}
