package LiraSparkPay.domain.records;

public sealed interface MetodoPagamento permits Pix, Boleto, CartaoCredito {}
