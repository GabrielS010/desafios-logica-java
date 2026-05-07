package org.desafios_logica.aumento_salarial;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalarioService {
    public BigDecimal calcularSalarioFinal(BigDecimal salario) {
        /*
        Jeito mais profissional:

        BigDecimal aumentoAnual = new BigDecimal("1.05");
        BigDecimal aumentoPromocao = new BigDecimal("1.1");
        BigDecimal aumentoDissidio = new BigDecimal("1.02");

        BigDecimal salarioFinal = salario
            .multiply(aumentoAnual)
            .multiply(aumentoPromocao)
            .multiply(aumentoDissidio)
            .setScale(2, RoundingMode.HALF_UP);
            */
        return salario.multiply(new BigDecimal("1.05").multiply(new BigDecimal("1.1").multiply(new BigDecimal("1.02"))));
    }
}