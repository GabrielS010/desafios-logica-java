package org.desafios_logica.descount_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in).useLocale(Locale.US);
                DescontoService service = new DescontoService();

                System.out.println("--- SISTEMA DE DESCONTOS ---");

                System.out.print("Digite o valor do produto: ");
                BigDecimal valorOriginal = sc.nextBigDecimal();

                System.out.print("Digite o percentual de desconto (ex: 10 para 10%): ");
                BigDecimal percentual = sc.nextBigDecimal();

                BigDecimal taxaDesconto = service.calcularTaxa(percentual);
                BigDecimal valorDoDesconto = service.calcularValorDesconto(valorOriginal, taxaDesconto);
                BigDecimal valorFinal = service.calcularValorFinal(valorOriginal, valorDoDesconto);

                System.out.println("\n--- RESUMO DA COMPRA ---");
                System.out.println("Valor bruto: R$ " + valorOriginal);
                System.out.println("Desconto aplicado: R$ " + valorDoDesconto.setScale(2, RoundingMode.HALF_UP));
                System.out.println("Valor final a pagar: R$ " + valorFinal);

                sc.close();
        }
}