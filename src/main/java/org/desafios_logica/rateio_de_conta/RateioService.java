package org.desafios_logica.rateio_de_conta;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RateioService {
    public BigDecimal calcularDivisao(BigDecimal valor, BigDecimal pessoas) {
        return valor.divide(pessoas, 2, RoundingMode.HALF_UP);
    }

    public BigDecimal calcularResto(BigDecimal valor, BigDecimal divisaoDinheiro, BigDecimal pessoas) {
        return valor.subtract(divisaoDinheiro.multiply(pessoas));
    }
}