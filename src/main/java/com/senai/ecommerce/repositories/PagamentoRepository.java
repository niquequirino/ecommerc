package com.senai.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.ecommerce.entities.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
