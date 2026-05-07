package org.desafios_logica.descount_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DescontoService {
    public BigDecimal calcularTaxa(BigDecimal percentual) {
        BigDecimal cem = new BigDecimal("100");
        return percentual.divide(cem, 4, RoundingMode.HALF_UP);
    }

    public BigDecimal calcularValorDesconto(BigDecimal valorOriginal, BigDecimal taxaDesconto) {
        return valorOriginal.multiply(taxaDesconto);
    }

    public BigDecimal calcularValorFinal(BigDecimal valorOriginal, BigDecimal valorDoDesconto) {
        return valorOriginal.subtract(valorDoDesconto).setScale(2, RoundingMode.HALF_UP);
    }
}