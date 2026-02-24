package com.mariaTest.Loja.services;

import com.mariaTest.Loja.dto.ClientDTO;
import com.mariaTest.Loja.entities.ClientEntity;
import com.mariaTest.Loja.repositories.ClientRepository;
import com.mariaTest.Loja.services.excecoes.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClientService {

    // Injeta automaticamente o Repository (acesso ao banco)
    @Autowired
    private ClientRepository repository;

    //busca por id
    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        ClientEntity entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado"));
        return new ClientDTO(entity);
    }

    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<ClientEntity> list = repository.findAll(pageable);
        return list.map(x -> new ClientDTO(x));
    }

    //busca por id retorna 404 para cliente enexistente
    @Transactional(readOnly = true)
    public ClientDTO insert(ClientDTO dto) {
        ClientEntity entity = new ClientEntity();
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new ClientDTO(entity);
    }

    @Transactional
    public ClientDTO update(Long id, ClientDTO dto) {
        ClientEntity entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado"));

        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new ClientDTO(entity);
    }

    @Transactional
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Cliente não encontrado");
        }
        repository.deleteById(id);
    }

    public void copyDtoToEntity(ClientDTO dto, ClientEntity entity){
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirthDate(dto.getBirthDate());
        entity.setChildren(dto.getChildren());
    }

}

/*
arquitetura em camadas
Controller -> recebe requisição
Service -> regra de negócio
Repository -> acesso ao banco
isso é arquitetura em camadas(Layered Architecture)
 */
