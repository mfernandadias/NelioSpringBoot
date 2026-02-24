package com.devsuperior.dscommerce.service;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.entities.Product;
import com.devsuperior.dscommerce.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    /*@Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Optional<Product> result = repository.findById(id);
        Product product = result.get();
        ProductDTO dto = new ProductDTO();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll(){
        List<Product> result = repository.findAll();
        return result.stream().map(x -> new ProductDTO(x).toList());
    } */
}
/*
inserindo novo produto com POST
CUSTOMIZANDO RESPOSTA COM RESPONSEeNTITY
ATUALIZANDO PRODUTO COM DELETE
DELETANDO PRODUTO COM DELETE
CRIANDO EXCEÇÕES DE SERVICE CUSTOMIZADAS
TRATANDO EXCEÇÃO COM RESPOSTAS CUSTOMIZADA
IMPLEMENTANDO OUTRAS EXCEÇÕES
VALIDAÇÃO COM BEAN VALIDATION
CUSTOMIZANDO A RESPOSTA DA VALIDAÇÃO
DESAFIO CRUD DE CLIENTES
 */

/*
API REST, camadas, CRUD, exceções, validações
busca paginada de produtos
inserindo novo produto com POST
customizando produto com PUT
deletando produto com DELETE
criando exceçoes de servico customizadas
tratamento outras exceções
validação com Bean Validation
Customizando a resposta da calidação

 */