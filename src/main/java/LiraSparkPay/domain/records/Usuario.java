package LiraSparkPay.domain.records;

import LiraSparkPay.domain.enumation.TipoCliente;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record Usuario(UUID id, String nome, String email, TipoCliente tipoCliente) {}


