package org.desafios_logica.calculo_parcela;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ParcelaService {

    private static final BigDecimal JUROS_TAXA = new BigDecimal("1.05");
    private static final int LIMITE_SEM_JUROS = 3;

    public BigDecimal calcularValorTotal(BigDecimal valorCompra, int numParcelas) {
        if (numParcelas > LIMITE_SEM_JUROS) {
            return valorCompra.multiply(JUROS_TAXA);
        }
        return valorCompra;
    }

    public BigDecimal calcularParcelaPadrao(BigDecimal valorTotal, int numParcelas) {
        return valorTotal.divide(new BigDecimal(numParcelas), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal calcularUltimaParcela(BigDecimal valorTotal, BigDecimal parcelaPadrao, int numParcelas) {
        BigDecimal totalPagoAtePenultima = parcelaPadrao.multiply(new BigDecimal(numParcelas - 1));
        return valorTotal.subtract(totalPagoAtePenultima);
    }
}
