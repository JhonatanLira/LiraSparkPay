package LiraSparkPay.domain.entities;

import LiraSparkPay.domain.records.Boleto;
import LiraSparkPay.domain.records.CartaoCredito;
import LiraSparkPay.domain.records.Pix;
import LiraSparkPay.domain.records.Transacao;

import java.math.BigDecimal;

public class CalculadoraTaxa {

    public BigDecimal calcular(Transacao transacao){
        return switch (transacao.metodoPagamento()){
            case Pix p -> BigDecimal.ZERO;
            case Boleto b -> new BigDecimal("2.50");
            case CartaoCredito c -> transacao.valor().multiply(new BigDecimal("0.03"));
        };
    }
}
