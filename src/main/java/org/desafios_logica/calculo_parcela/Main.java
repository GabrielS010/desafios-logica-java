package org.desafios_logica.calculo_parcela;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        ParcelaService service = new ParcelaService();

        System.out.print("Digite o valor total da compra: R$ ");
        BigDecimal valorCompra = sc.nextBigDecimal();

        System.out.print("Digite a quantidade de parcelas: ");
        int numParcelas = sc.nextInt();

        BigDecimal valorTotalComJuros = service.calcularValorTotal(valorCompra, numParcelas);
        BigDecimal parcelaPadrao = service.calcularParcelaPadrao(valorTotalComJuros, numParcelas);
        BigDecimal ultimaParcela = service.calcularUltimaParcela(valorTotalComJuros, parcelaPadrao, numParcelas);

        System.out.println("\n--- PLANO DE PAGAMENTO ---");
        System.out.println("Valor Original: R$ " + valorCompra.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Valor Total (com juros se aplicável): R$ " + valorTotalComJuros.setScale(2, RoundingMode.HALF_UP));
        System.out.println("Quantidade de parcelas: " + numParcelas);

        for (int i = 1; i < numParcelas; i++) {
            System.out.println("Parcela " + i + ": R$ " + parcelaPadrao);
        }
        System.out.println("Parcela " + numParcelas + " (Última): R$ " + ultimaParcela);

        if (parcelaPadrao.compareTo(ultimaParcela) != 0) {
            BigDecimal diferenca = ultimaParcela.subtract(parcelaPadrao);
            System.out.println("\n* Nota: A última parcela foi ajustada em R$ " + diferenca + " para fechar o valor total.");
        }

        sc.close();
    }
}
