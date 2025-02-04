package com.senai.ecommerce.entities;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "/tb_pagamento")
public class Pagamento {
	
	private Long id;
	private Instant momento;

}
