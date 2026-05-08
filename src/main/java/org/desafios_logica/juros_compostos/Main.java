package org.desafios_logica.juros_compostos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        JurosService jurosService = new JurosService();

        System.out.print("Digite o valor do produto: ");
        BigDecimal valorOriginal = sc.nextBigDecimal();

        System.out.print("Digite a taxa de juros mensal (ex: 1 para 1%): ");
        BigDecimal taxaJuros = sc.nextBigDecimal();

        System.out.print("Digite a quantidade de meses: ");
        int meses = sc.nextInt();

        BigDecimal valorFinal = jurosService.calcularJuros(valorOriginal, taxaJuros, meses);
        System.out.println("O valor final aplicando juros compostos será de: R$" + valorFinal.setScale(2, RoundingMode.HALF_UP));
    }
}
