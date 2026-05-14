package LiraSparkPay.domain.records;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record Transacao(UUID id, UUID usuarioId, BigDecimal valor, MetodoPagamento metodoPagamento, LocalDate data) {
}
