package com.senai.ecommerce.dto;

import java.time.Instant;

import com.senai.ecommerce.enums.StatusdoPedido;

public record PedidoDTO(Instant momento, StatusdoPedido status) {

}
