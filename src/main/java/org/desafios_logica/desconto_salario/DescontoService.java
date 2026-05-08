package org.desafios_logica.desconto_salario;

import java.math.BigDecimal;

public class DescontoService {
    public BigDecimal calcularDesconto(BigDecimal salarioBruto) {
        BigDecimal milEQuinhentos = new BigDecimal("1500");
        BigDecimal taxaDesconto;

        if (salarioBruto.compareTo(milEQuinhentos) <= 0) {
            taxaDesconto = new BigDecimal("0.075");
        } else {
            taxaDesconto = new BigDecimal("0.09");
        }

        BigDecimal valorDesconto = salarioBruto.multiply(taxaDesconto);
        return salarioBruto.subtract(valorDesconto);
    }
}
