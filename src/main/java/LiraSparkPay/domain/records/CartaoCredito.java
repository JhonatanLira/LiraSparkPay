package LiraSparkPay.domain.records;

public record CartaoCredito(String numeroMascarado, String bandeira) implements MetodoPagamento {
}
