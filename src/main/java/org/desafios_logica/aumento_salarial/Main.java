package org.desafios_logica.aumento_salarial;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor do salário: ");
        BigDecimal salario = scanner.nextBigDecimal();

        BigDecimal salarioFinal = salario.multiply(new BigDecimal("1.05").multiply(new BigDecimal("1.1").multiply(new BigDecimal("1.02"))));

        System.out.println(salarioFinal.setScale(2, RoundingMode.HALF_UP));

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

        scanner.close();
    }
}
