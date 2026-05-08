package org.desafios_logica.juros_compostos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class JurosService {

    public BigDecimal calcularJuros(BigDecimal valorOriginal, BigDecimal taxaJuros, int meses){
        BigDecimal cem =  new BigDecimal("100");
        BigDecimal taxa = BigDecimal.ONE.add(taxaJuros.divide(cem, 4, RoundingMode.HALF_UP)).pow(meses);
        return valorOriginal.multiply(taxa);
    }
}
