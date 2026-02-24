package com.mariaTest.Loja.dto;

import com.mariaTest.Loja.entities.ClientEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public class ClientDTO {
    //serve para enviar dados para o Controller sem expor a entidade diretamente

    private Long id;
    @NotBlank(message = "Nome não poser ser vazio")
    private String name;

    private String cpf;
    private Double income;
    @PastOrPresent(message = "Data de nascimento não pode ser futura")
    private LocalDate BirthDate;
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(ClientEntity entity) {
        id = entity.getId();
        BirthDate = entity.getBirthDate();
        income = entity.getIncome();
        cpf = entity.getCpf();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @PastOrPresent(message = "Data de nascimento não pode ser futura") LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(@PastOrPresent(message = "Data de nascimento não pode ser futura") LocalDate birthDate) {
        BirthDate = birthDate;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public @NotBlank(message = "Nome não poser ser vazio") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Nome não poser ser vazio") String name) {
        this.name = name;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }
}
