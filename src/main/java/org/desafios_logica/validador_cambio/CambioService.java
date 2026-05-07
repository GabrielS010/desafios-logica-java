package org.desafios_logica.validador_cambio;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CambioService {
    public BigDecimal calcularDolar(BigDecimal valorReais, BigDecimal cotacao) {
        return valorReais.divide(cotacao, 8, RoundingMode.HALF_UP);
    }

    public BigDecimal calcularReaisConvertidos(BigDecimal valorDolar, BigDecimal cotacao) {
        return valorDolar.multiply(cotacao);
    }
}